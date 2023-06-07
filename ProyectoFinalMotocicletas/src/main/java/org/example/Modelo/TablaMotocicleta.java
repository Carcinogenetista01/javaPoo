package org.example.Modelo;
import org.example.Driver.ConexionSingleton;
import org.example.interfaz.MotocicletaDAO;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class TablaMotocicleta implements TableModel {
    public static final int COLUMNS = 6;
    private ArrayList<Motocicleta> baseDatos;
    private MotocicletaDAO ldao;
    private Connection connection;

    public TablaMotocicleta() {
        ldao = new MotocicletaDAO();
        baseDatos = new ArrayList<>();
    }

    public TablaMotocicleta(ArrayList<Motocicleta> baseDatos) {
        this.baseDatos = baseDatos;
        ldao = new MotocicletaDAO();
    }

    @Override
    public int getRowCount() {
        return baseDatos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex) {
            case 0:
                return "Id";
            case 1:
                return "Modelo";
            case 2:
                return "Anio";
            case 3:
                return "Color";
            case 4:
                return "Costo";
            case 5:
                return "Url";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch (rowIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return Integer.class;
            case 3:
                return String.class;
            case 4:
                return Integer.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Motocicleta tmp = baseDatos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getModelo();
            case 2:
                return tmp.getAnio();
            case 3:
                return tmp.getColor();
            case 4:
                return tmp.getCosto();
            case 5:
                return tmp.getImagenURL();

        }

        return null;
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int colIndex) {
        switch (colIndex) {
            case 0:
                break;
            case 1:
                baseDatos.get(rowIndex).setModelo((String) o);
                break;
            case 2:
                baseDatos.get(rowIndex).setAnio((Integer) o);
                break;
            case 3:
                baseDatos.get(rowIndex).setColor((String) o);
                break;
            case 4:
                baseDatos.get(rowIndex).setCosto((Integer) o);
                break;
            case 5:
                baseDatos.get(rowIndex).setImagenURL((String) o);
                break;
            default:
                System.out.println("No se modifica");

        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void agregarMoto(Motocicleta moto) {
        baseDatos.add(moto);
    }

    public Motocicleta getMotoAtIndex(int idx) {
        return baseDatos.get(idx);
    }

    public void cargarDatos() {
        try {
            baseDatos = ldao.obtenerTodo();
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
    }
    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    public Connection getConnection() {
        if (connection == null) {
            connection = ConexionSingleton.getInstance("MotocicletaDB.db").getConnection();
        }
        return connection;
    }
    public boolean modPer (Motocicleta per){
        boolean res = false;
        try {
            if (ldao.update(per)){
                res = true;
            }else{
                res = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return res;
    }

    public boolean agregarMotocicleta(Motocicleta motocicleta) {
        boolean resultado = false;
        try {
            if (ldao.insertar(motocicleta)) {
                baseDatos.add(motocicleta);
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    public boolean delete(String id) {
        String sqlDelete = "DELETE FROM motocicleta WHERE id = ?";
        try (PreparedStatement statement = getConnection().prepareStatement(sqlDelete)) {
            statement.setInt(1, Integer.parseInt(id));
            int rowCount = statement.executeUpdate();
            return rowCount > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    }


