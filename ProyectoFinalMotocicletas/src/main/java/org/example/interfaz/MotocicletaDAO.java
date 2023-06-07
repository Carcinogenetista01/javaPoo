package org.example.interfaz;

import org.example.Driver.ConexionSingleton;
import org.example.Modelo.Motocicleta;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MotocicletaDAO implements interfazDAO {

    public MotocicletaDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO motocicleta(imagenURL,modelo,anio,color,costo) VALUES(?,?,?,?,?)";
        int rowCount = 0;
        PreparedStatement pstm = null;
        try {
            pstm = ConexionSingleton.getInstance("MotocicletaDB.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1, ((Motocicleta) obj).getImagenURL());
            pstm.setString(2, ((Motocicleta) obj).getModelo());
            pstm.setInt(3, ((Motocicleta) obj).getAnio());
            pstm.setString(4, ((Motocicleta) obj).getColor());
            pstm.setDouble(5, ((Motocicleta) obj).getCosto());

            rowCount = pstm.executeUpdate();
            return rowCount > 0;
        } finally {
            if (pstm != null) {
                try {
                    pstm.close();
                } catch (SQLException e) {

                }
            }
        }
    }



    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE motocicleta SET imagenURL=?, modelo=?, anio=?, color=?, costo=? WHERE id=?";
        int rowCount = 0;
        PreparedStatement pstm = null;
        try {
            pstm = ConexionSingleton.getInstance("MotocicletaDB.db").getConnection().prepareStatement(sqlUpdate);
            pstm.setString(1, ((Motocicleta) obj).getImagenURL());
            pstm.setString(2, ((Motocicleta) obj).getModelo());
            pstm.setInt(3, ((Motocicleta) obj).getAnio());
            pstm.setString(4, ((Motocicleta) obj).getColor());
            pstm.setDouble(5, ((Motocicleta) obj).getCosto());
            pstm.setInt(6, ((Motocicleta) obj).getId());
            rowCount = pstm.executeUpdate();
            return rowCount > 0;
        } finally {
            if (pstm != null) {
                try {
                    pstm.close();
                } catch (SQLException e) {
                }
            }
        }
    }


    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM motocicleta WHERE id=?";
        int rowCount = 0;
        PreparedStatement pstm = null;
        try {
            pstm = ConexionSingleton.getInstance("MotocicletaDB.db").getConnection().prepareStatement(sqlDelete);
            pstm.setInt(1, Integer.parseInt(id));
            rowCount = pstm.executeUpdate();
            return rowCount > 0;
        } finally {
            if (pstm != null) {
                try {
                    pstm.close();
                } catch (SQLException e) {

                }
            }
        }
    }



    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql= "SELECT * FROM motocicleta";
        ArrayList<Motocicleta> resultado=new ArrayList<>();
        Statement stm= ConexionSingleton.getInstance("MotocicletaDB.db").getConnection().createStatement();
        ResultSet rst= stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new Motocicleta(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4), rst.getString(5), rst.getDouble(6)));
        }
        return resultado;
    }
    @Override
    public Object BuscarPorId(String id) throws SQLException {
        String sql= "SELECT * FROM motocicleta WHERE id=?;";
        Motocicleta motocicleta=null;
        PreparedStatement pstm= ConexionSingleton.getInstance("MotocicletaDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1,Integer.parseInt(id));
        ResultSet rst=pstm.executeQuery();
        if (rst.next()){
            motocicleta =new Motocicleta(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4), rst.getString(5), rst.getDouble(6));
            return motocicleta;
        }
        return null;
    }
}
