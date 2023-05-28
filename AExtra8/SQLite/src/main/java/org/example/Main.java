package org.example;

import org.example.controlador.Controlador;
import org.example.modelo.Libro;
import org.example.persistencia.LibroDAO;
import org.example.vista.VentanaLibro;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        VentanaLibro view  = new VentanaLibro("MVC y JDBC");
        Controlador controller = new Controlador(view);
    }
}