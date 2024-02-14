package DAO;

import Model.Empleado;

import java.sql.SQLException;

public class EmpleadoDAO extends ConexionBD implements OperacionesBD<Empleado> {
    private static ConexionBD conexionBD;
    private static final String tabla = "empleado";
    private static final String idCol = "idempleado";
    private static final String nomEmpleadoCol = "nombreempleado";
    private static final String aPaternoCol="apaterno";
    private static final String aMaternoCol = "amaterno";
    @Override
    public Boolean insert(Empleado empleado) {
        StringBuilder strFields = new StringBuilder();
        StringBuilder strValues = new StringBuilder();


        strFields.append(nomEmpleadoCol+",").append(aPaternoCol+",").append(aMaternoCol);

        strValues.append("'"+empleado.getNombreEmpleado()+"',");
        strValues.append("'"+empleado.getaPaterno()+"',");
        strValues.append("'"+empleado.getaMaterno()+"'");

        try {
            conexionBD.insertTabla(empleado.getTable(),strFields,strValues);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }



    @Override
    public Boolean update(Empleado empleado, int id) {
        System.out.println("Nada");
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
