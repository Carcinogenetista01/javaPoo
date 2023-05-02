package org.example;

public class Comida {
    private String Nombre;
    private boolean procesada;

    public Comida(String nombre, boolean procesada) {
        Nombre = nombre;
        this.procesada = procesada;
    }

    public Comida() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public boolean isProcesada() {
        return procesada;
    }

    public void setProcesada(boolean procesada) {
        this.procesada = procesada;
    }

    @Override
    public String toString() {
        return "Comida{" +
                "Nombre='" + Nombre + '\'' +
                ", procesada=" + procesada +
                '}';
    }

}
