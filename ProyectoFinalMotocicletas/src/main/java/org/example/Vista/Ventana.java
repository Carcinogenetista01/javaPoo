package org.example.Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class Ventana extends JFrame {
    private JLabel lblid;
    private JLabel lblurl;
    private JLabel lblmodelo;
    private JLabel lblanio;
    private JLabel lblcolor;
    private JLabel lblcosto;
    private JLabel lblimagen;
    private JTextField txtid;
    private JTextField txturl;
    private JTextField txtmodelo;
    private JTextField txtanio;
    private JTextField txtcolor;
    private JTextField txtcosto;
    private JButton btnagregar;
    private JButton btncargar;
    private JLabel lblmid;
    private JLabel lblmurl;
    private JLabel lblmmodelo;
    private JLabel lblmanio;
    private JLabel lblmcolor;
    private JLabel lblmcosto;
    private JTextField txtmid;
    private JTextField txtmurl;
    private JTextField txtmmodelo;
    private JTextField txtmanio;
    private JTextField txtmcolor;
    private JTextField txtmcosto;
    private JButton btneliminar;
    private JButton btnactualizar;
    private JButton btnmodificar;
    private JTable tblmotocicleta;
    private JScrollPane scrollPane;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private GridLayout layout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(1200,800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);



        // 1
        panel1= new JPanel(new FlowLayout());
        this.getContentPane().add(panel1,0);
        panel1.setBackground(new Color(254, 158, 246));
        this.getContentPane().add(panel1, 0);

        lblid  = new JLabel("Id:");
        lblurl = new JLabel("Url de la imagen: ");
        lblmodelo = new JLabel("Modelo:");
        lblanio = new JLabel("Año: ");
        lblcolor = new JLabel("Color: ");
        lblcosto = new JLabel("Costo: ");
        txtid = new JTextField(2);
        txtid.setText("0");
        txturl = new JTextField(10);
        txtmodelo = new JTextField(13);
        txtanio = new JTextField(4);
        txtcolor = new JTextField(10);
        txtcosto = new JTextField(8);
        btnagregar = new JButton("Agregar");
        btncargar = new JButton("Cargar");
        panel1.add(lblid);
        panel1.add(txtid);
        panel1.add(lblanio);
        panel1.add(txtanio);
        panel1.add(lblmodelo);
        panel1.add(txtmodelo);
        panel1.add(lblcolor);
        panel1.add(txtcolor);
        panel1.add(lblcosto);
        panel1.add(txtcosto);
        panel1.add(lblurl);
        panel1.add(txturl);
        panel1.add(btnagregar);


        //2
        panel2= new JPanel();
        panel2.add(btncargar);
        this.getContentPane().add(panel2,1);
        panel2.setBackground(new Color(254, 158, 246));
        tblmotocicleta = new JTable();
        scrollPane = new JScrollPane(tblmotocicleta);
        panel2.add(scrollPane);

        //3
        panel3= new JPanel(new FlowLayout());
        this.getContentPane().add(panel3,2);
        panel3.setBackground(new Color(254, 158, 246));
        lblimagen = new JLabel(" ");
        panel3.add(lblimagen);

        //4
        panel4= new JPanel();
        this.getContentPane().add(panel4,3);
        panel4.setBackground(new Color(254, 158, 246));
        btneliminar = new JButton("Eliminar");
        btnactualizar = new JButton("Actualizar");
        btnmodificar = new JButton("Modificar");
        panel4.add(btneliminar);
        panel4.add(btnactualizar);
        lblmid = new JLabel("Id:");
        lblmurl = new JLabel("Url de la imagen: ");
        lblmmodelo = new JLabel("Modelo:");
        lblmanio = new JLabel("Año: ");
        lblmcolor = new JLabel("Color: ");
        lblmcosto = new JLabel("Costo: ");
        txtmid = new JTextField(2);
        txtmid.setText("0");
        txtmurl = new JTextField(10);
        txtmmodelo = new JTextField(13);
        txtmanio = new JTextField(4);
        txtmcolor = new JTextField(10);
        txtmcosto = new JTextField(8);
        txtmurl = new JTextField(8);
        panel4.add(lblmid);
        panel4.add(txtmid);
        panel4.add(lblmanio);
        panel4.add(txtmanio);
        panel4.add(lblmmodelo);
        panel4.add(txtmmodelo);
        panel4.add(lblmcolor);
        panel4.add(txtmcolor);
        panel4.add(lblmcosto);
        panel4.add(txtmcosto);
        panel4.add(lblmurl);
        panel4.add(txtmurl);
        panel4.add(btnmodificar);





        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public JLabel getLblid() {
        return lblid;

    }
    private void cargarGif(JPanel panel, String gifPath) {
        ImageIcon gifIcon = new ImageIcon(gifPath);
        JLabel gifLabel = new JLabel(gifIcon);
        panel.add(gifLabel);
    }


    public void setLblid(JLabel lblid) {
        this.lblid = lblid;
    }

    public JLabel getLblurl() {
        return lblurl;
    }

    public void setLblurl(JLabel lblurl) {
        this.lblurl = lblurl;
    }

    public JLabel getLblmodelo() {
        return lblmodelo;
    }

    public void setLblmodelo(JLabel lblmodelo) {
        this.lblmodelo = lblmodelo;
    }

    public JLabel getLblanio() {
        return lblanio;
    }

    public void setLblanio(JLabel lblanio) {
        this.lblanio = lblanio;
    }

    public JLabel getLblcolor() {
        return lblcolor;
    }

    public void setLblcolor(JLabel lblcolor) {
        this.lblcolor = lblcolor;
    }

    public JLabel getLblcosto() {
        return lblcosto;
    }

    public void setLblcosto(JLabel lblcosto) {
        this.lblcosto = lblcosto;
    }

    public JTextField getTxtid() {
        return txtid;
    }

    public void setTxtid(JTextField txtid) {
        this.txtid = txtid;
    }

    public JTextField getTxturl() {
        return txturl;
    }

    public void setTxturl(JTextField txturl) {
        this.txturl = txturl;
    }

    public JTextField getTxtmodelo() {
        return txtmodelo;
    }

    public void setTxtmodelo(JTextField txtmodelo) {
        this.txtmodelo = txtmodelo;
    }

    public JTextField getTxtanio() {
        return txtanio;
    }

    public void setTxtanio(JTextField txtanio) {
        this.txtanio = txtanio;
    }

    public JTextField getTxtcolor() {
        return txtcolor;
    }

    public void setTxtcolor(JTextField txtcolor) {
        this.txtcolor = txtcolor;
    }

    public JTextField getTxtcosto() {
        return txtcosto;
    }

    public void setTxtcosto(JTextField txtcosto) {
        this.txtcosto = txtcosto;
    }

    public JButton getBtnagregar() {
        return btnagregar;
    }

    public void setBtnagregar(JButton btnagregar) {
        this.btnagregar = btnagregar;
    }

    public JButton getBtneliminar() {
        return btneliminar;
    }

    public void setBtneliminar(JButton btneliminar) {
        this.btneliminar = btneliminar;
    }

    public JButton getBtnactualizar() {
        return btnactualizar;
    }

    public void setBtnactualizar(JButton btnactualizar) {
        this.btnactualizar = btnactualizar;
    }

    public JTable getTblmotocicleta() {
        return tblmotocicleta;
    }

    public void setTblmotocicleta(JTable tblmotocicleta) {
        this.tblmotocicleta = tblmotocicleta;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JButton getBtncargar() {
        return btncargar;
    }

    public void setBtncargar(JButton btncargar) {
        this.btncargar = btncargar;
    }

    public JLabel getLblimagen() {
        return lblimagen;
    }

    public void setLblimagen(JLabel lblimagen) {
        this.lblimagen = lblimagen;
    }

    public JButton getBtnmodificar() {
        return btnmodificar;
    }

    public void setBtnmodificar(JButton btnmodificar) {
        this.btnmodificar = btnmodificar;
    }

    public JLabel getLblmid() {
        return lblmid;
    }

    public void setLblmid(JLabel lblmid) {
        this.lblmid = lblmid;
    }

    public JLabel getLblmurl() {
        return lblmurl;
    }

    public void setLblmurl(JLabel lblmurl) {
        this.lblmurl = lblmurl;
    }

    public JLabel getLblmmodelo() {
        return lblmmodelo;
    }

    public void setLblmmodelo(JLabel lblmmodelo) {
        this.lblmmodelo = lblmmodelo;
    }

    public JLabel getLblmanio() {
        return lblmanio;
    }

    public void setLblmanio(JLabel lblmanio) {
        this.lblmanio = lblmanio;
    }

    public JLabel getLblmcolor() {
        return lblmcolor;
    }

    public void setLblmcolor(JLabel lblmcolor) {
        this.lblmcolor = lblmcolor;
    }

    public JLabel getLblmcosto() {
        return lblmcosto;
    }

    public void setLblmcosto(JLabel lblmcosto) {
        this.lblmcosto = lblmcosto;
    }

    public JTextField getTxtmid() {
        return txtmid;
    }

    public void setTxtmid(JTextField txtmid) {
        this.txtmid = txtmid;
    }

    public JTextField getTxtmurl() {
        return txtmurl;
    }

    public void setTxtmurl(JTextField txtmurl) {
        this.txtmurl = txtmurl;
    }

    public JTextField getTxtmmodelo() {
        return txtmmodelo;
    }

    public void setTxtmmodelo(JTextField txtmmodelo) {
        this.txtmmodelo = txtmmodelo;
    }

    public JTextField getTxtmanio() {
        return txtmanio;
    }

    public void setTxtmanio(JTextField txtmanio) {
        this.txtmanio = txtmanio;
    }

    public JTextField getTxtmcolor() {
        return txtmcolor;
    }

    public void setTxtmcolor(JTextField txtmcolor) {
        this.txtmcolor = txtmcolor;
    }

    public JTextField getTxtmcosto() {
        return txtmcosto;
    }

    public void setTxtmcosto(JTextField txtmcosto) {
        this.txtmcosto = txtmcosto;
    }

    public void limpiar(){
        txtmodelo.setText("");
        txtcosto.setText("");
        txtcolor.setText("");
        txtanio.setText("");
        txturl.setText("");
    }
}
