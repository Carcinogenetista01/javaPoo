package org.example.Driver;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;

import org.example.Modelo.Motocicleta;
import org.example.Modelo.TablaMotocicleta;
import org.example.Vista.Ventana;

public class ControladorMotocicleta extends MouseAdapter {
    private Ventana view;
    private TablaMotocicleta tabla;

    public ControladorMotocicleta(Ventana view) {
        this.view = view;
        this.view.getTblmotocicleta().addMouseListener(this);
        this.view.getBtncargar().addMouseListener(this);
        this.view.getBtnagregar().addMouseListener(this);
        this.view.getBtneliminar().addMouseListener(this);
        this.view.getBtnactualizar().addMouseListener(this);
        this.view.getBtnmodificar().addMouseListener(this);
        tabla = new TablaMotocicleta();
        tabla.setConnection(ConexionSingleton.getInstance("Motocicletadb.DB").getConnection());
        this.view.getTblmotocicleta().setModel(tabla);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnagregar()) {
            Motocicleta moto = new Motocicleta();
            moto.setModelo(this.view.getTxtmodelo().getText());
            moto.setAnio(Integer.parseInt(this.view.getTxtanio().getText()));
            moto.setColor(this.view.getTxtcolor().getText());
            moto.setCosto(Double.parseDouble(this.view.getTxtcosto().getText()));
            moto.setImagenURL(this.view.getTxturl().getText());


            if (tabla.agregarMotocicleta(moto)) {
                JOptionPane.showMessageDialog(view, "Motocicleta agregada correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                tabla.cargarDatos();
                this.view.getTblmotocicleta().setModel(tabla);
                this.view.getTblmotocicleta().updateUI();
            } else {
                JOptionPane.showMessageDialog(view, "No se pudo agregar la motocicleta", "Error", JOptionPane.ERROR_MESSAGE);
            }

            this.view.limpiar();
        }

        if (e.getSource() == view.getTblmotocicleta()) {
            if (e.getSource() == view.getTblmotocicleta()) {
                int filaSeleccionada = view.getTblmotocicleta().getSelectedRow();
                if (filaSeleccionada != -1) {

                    String id = String.valueOf(view.getTblmotocicleta().getValueAt(filaSeleccionada, 0));
                    String modelo = String.valueOf(view.getTblmotocicleta().getValueAt(filaSeleccionada, 1));
                    int anio = Integer.parseInt(String.valueOf(view.getTblmotocicleta().getValueAt(filaSeleccionada, 2)));
                    String color = String.valueOf(view.getTblmotocicleta().getValueAt(filaSeleccionada, 3));
                    double costo = Double.parseDouble(String.valueOf(view.getTblmotocicleta().getValueAt(filaSeleccionada, 4)));
                    String imagenURL = String.valueOf(view.getTblmotocicleta().getValueAt(filaSeleccionada, 5));


                    view.getTxtmodelo().setText(modelo);
                    view.getTxtanio().setText(String.valueOf(anio));
                    view.getTxtcolor().setText(color);
                    view.getTxtcosto().setText(String.valueOf(costo));
                    view.getTxturl().setText(imagenURL);


                    try {
                        ImageIcon imagen = new ImageIcon(new URL(imagenURL));
                        view.getLblimagen().setIcon(imagen);
                    } catch (MalformedURLException ex) {
                        view.getLblimagen().setIcon(null);
                        JOptionPane.showMessageDialog(view, "URL de imagen inválida", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }

        if (e.getSource() == this.view.getBtncargar()) {
            try {
                System.out.println("Cargar datos...");
                if (tabla.getConnection().isClosed()) {
                    System.out.println("Conexión cerrada, volviendo a establecer...");
                    tabla.setConnection(ConexionSingleton.getInstance("Motocicletadb.DB").getConnection());
                }
                tabla.cargarDatos();
                this.view.getTblmotocicleta().updateUI();
                System.out.println("Tabla actualizada");
                this.view.limpiar();
            } catch (SQLException ex) {
                System.out.println("Error al cargar datos: " + ex.getMessage());
                throw new RuntimeException(ex);
            }
        }

        if (e.getSource() == view.getBtneliminar()) {
            int filaSeleccionada = view.getTblmotocicleta().getSelectedRow();
            if (filaSeleccionada != -1) {
                String id = String.valueOf(view.getTblmotocicleta().getValueAt(filaSeleccionada, 0));
                TablaMotocicleta tabla = (TablaMotocicleta) view.getTblmotocicleta().getModel();
                if (tabla.delete(id)) {
                    JOptionPane.showMessageDialog(view, "Motocicleta eliminada correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    tabla.cargarDatos();
                    view.getTblmotocicleta().updateUI();
                } else {
                    JOptionPane.showMessageDialog(view, "No se pudo eliminar la motocicleta", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(view, "Seleccione una motocicleta para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource() == view.getBtnmodificar()) {
            int renglon = view.getTblmotocicleta().getSelectedRow();
            Motocicleta perMod = tabla.getMotoAtIndex(renglon);

            perMod.setModelo(this.view.getTxtmmodelo().getText());
            perMod.setCosto(Double.parseDouble(this.view.getTxtmcosto().getText()));
            perMod.setImagenURL(this.view.getTxtmurl().getText());
            perMod.setAnio(Integer.parseInt(this.view.getTxtmanio().getText()));
            perMod.setColor(this.view.getTxtmcolor().getText());

            if (tabla.modPer(perMod)) {
                JOptionPane.showMessageDialog(view, "Se modifico correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                tabla.cargarDatos();
                view.getTblmotocicleta().updateUI();
            } else {
                JOptionPane.showMessageDialog(view, "No se ha modificado correctamente", "Aviso", JOptionPane.ERROR_MESSAGE);
            }

            this.view.getTxtmmodelo().setText("");
            this.view.getTxtmurl().setText("");
            this.view.getTxtmanio().setText("");
            this.view.getTxtmcosto().setText("");
            this.view.getTxtmcolor().setText("");
        }


        this.view.getTxtmmodelo().setText("");
        this.view.getTxtmurl().setText("");
        this.view.getTxtmanio().setText("");
        this.view.getTxtmcosto().setText("");
        this.view.getTxtmcolor().setText("");


        if (e.getSource() == view.getBtnactualizar()) {
            tabla.cargarDatos();
            view.getTblmotocicleta().updateUI();
            view.limpiar();
        }
    }
}


