package org.example.Controlador;

import org.example.Vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;

public class Controlador extends MouseAdapter {
    private Ventana view;

    public Controlador(Ventana view) {
        this.view = view;
        this.view.getBtnMensaje().addMouseListener(this);
        this.view.getBtnEntrada().addMouseListener(this);
        this.view.getBtnOpcion().addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()== view.getBtnMensaje()){
            // System.out.println("Mensaje");
            ImageIcon jake = new ImageIcon("jake.png");
            JOptionPane.showMessageDialog(view, "ola","a",JOptionPane.ERROR_MESSAGE,jake);
        }
        if (e.getSource()== view.getBtnEntrada()){
            // System.out.println("Entrada");
            String datos= JOptionPane.showInputDialog(view, "a","aaaa",JOptionPane.QUESTION_MESSAGE);
            this.view.getLblResultado().setText(datos);
        }
        if (e.getSource()== view.getBtnOpcion()){
            // System.out.println("Opcion");
            JOptionPane.showConfirmDialog(view,"sss","n",JOptionPane.YES_NO_OPTION);

        }
    }
}
