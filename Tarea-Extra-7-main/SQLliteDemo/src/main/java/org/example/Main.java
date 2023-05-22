package org.example;

import org.example.modelo.Libro;
import org.example.persistencia.LibroDAO;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args){
        LibroDAO ldao=new LibroDAO();
        Libro libro=new Libro(0,"Piensa en Java","Bruce Eckel");
        try {
            if(ldao.insertar(libro)){
                System.out.println("Se inseerto correctamente");
            }
            else {
                System.out.println("Error al insertar");
            }
        }catch (SQLException sqle){
            System.out.println("Error al insertar");
        }


    }
}