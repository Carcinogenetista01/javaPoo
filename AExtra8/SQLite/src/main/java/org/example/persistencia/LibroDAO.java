package org.example.persistencia;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class LibroDAO implements InterfazDAO{

    @Override
    public boolean insertar(Object obj) throws SQLException {
        return false;
    }

    public LibroDAO() {
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM libros WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("librosDB.db").getConnection()
                pstm.setInt(1,Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        return null;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String slq = "SELECT * FROM Libros WHERE id = ? ;" ;
        Libro libro = null;

        PreparedStatement pstm = ConexionSingleton.getInstance("librosDB.db").getConnection()
                pstm.setInt(1,Integer.parseInt(id));
        return null;
    }
}
