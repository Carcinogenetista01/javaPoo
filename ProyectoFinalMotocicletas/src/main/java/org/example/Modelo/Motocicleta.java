package org.example.Modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Motocicleta {
    private int id;
    private String imagenURL;
    private String modelo;
    private int anio;
    private String color;
    private double costo;
    public Motocicleta() {

    }

    public Motocicleta(int id, String imagenURL, String modelo, int anio, String color, double costo) {
        this.id = id;
        this.imagenURL = imagenURL;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.costo = costo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagenURL() {
        return imagenURL;
    }

    public void setImagenURL(String imagenURL) {
        this.imagenURL = imagenURL;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "id=" + id +
                ", imagenURL='" + imagenURL + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", color='" + color + '\'' +
                ", costo=" + costo +
                '}';
    }
    public ImageIcon getImagen() throws MalformedURLException {
        URL urlimagen = new URL(this.imagenURL);
        return new ImageIcon(urlimagen);
    }
}
