package DAO;

import Model.Empleado;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO extends ConexionBD implements OperacionesBD<Empleado> {
    private static ConexionBD conexionBD;
    public EmpleadoDAO(){conexionBD = new ConexionBD();}
    private static final String tabla = "empleado";
    private static final String idCol = "idempleado";
    private static final String nomEmpleadoCol = "nombreempleado";
    private static final String aPaternoCol="apaterno";
    private static final String aMaternoCol = "amaterno";
    @Override
    public Boolean insert(Empleado empleado) {
        StringBuilder strFields = new StringBuilder();
        StringBuilder strValues = new StringBuilder();

        strFields.append(nomEmpleadoCol + ",").append(aPaternoCol + ",").append(aMaternoCol);

        strValues.append("'" + empleado.getNombreEmpleado() + "',");
        strValues.append("'" + empleado.getaPaterno() + "',");
        strValues.append("'" + empleado.getaMaterno() + "'");

        try {
            // Asegúrate de que conexionBD no sea null antes de usarlo
            if (conexionBD != null) {
                conexionBD.insertTabla(empleado.getTable(), strFields, strValues);
            } else {
                // Manejar el caso donde conexionBD es null
                System.err.println("Error: La conexión a la base de datos no está disponible.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }



    @Override
    public Boolean update(Empleado empleado, int id) {

        return null;
    }

    @Override
    public Boolean delete(int id) {
        StringBuilder strDelete = new StringBuilder();
        strDelete.append(" where " + idCol + " = " + id);

        try {
            conexionBD.deleteTabla(tabla,strDelete);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<Empleado> getAllEmpleados() {
        ArrayList<Empleado> empleados = new ArrayList<>();

        try {
            String query = "SELECT * FROM " + tabla;
            ResultSet resultSet = conexionBD.executeQuery(query);

            while (resultSet.next()) {
                String nombre = resultSet.getString(nomEmpleadoCol);
                String apellidoPaterno = resultSet.getString(aPaternoCol);
                String apellidoMaterno = resultSet.getString(aMaternoCol);

                Empleado empleado = new Empleado(nombre, apellidoPaterno, apellidoMaterno);
                empleados.add(empleado);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejar la excepción según tus necesidades
        }

        return empleados;
    }

    @Override
    public Boolean selectByName(String name) {
        return null;
    }

    @Override
    public void selectAll() {

    }

    @Override
    public int getKeyValueByName(String name) {
        return 0;
    }

    @Override
    public Empleado getValueByKey(int key) {
        return null;
    }
}