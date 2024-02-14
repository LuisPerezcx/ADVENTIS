package DAO;

import Model.Computadora;

import java.sql.SQLException;

public class ComputadoraDAO extends ConexionBD implements OperacionesBD<Computadora> {
    private static ConexionBD conexionBD;
    private static final String tabla = "Computadora";
    private static final String idModel = "idComputadoras";
    private static final String sefe = "softwaresefe";
    private static final String sealpath = "softwaresealpath";
    private static final String smp = "softwaresmp";
    private static final String comentar = "comentarios";

    @Override
    public Boolean insert(Computadora computadora) {
        StringBuilder strFields = new StringBuilder();
        StringBuilder strValues = new StringBuilder();

        strFields.append(sefe+",").append(sealpath+",").append(smp+",").append(comentar);

        strValues.append("'"+computadora.getModelomarca()+"',");
        strValues.append("'"+computadora.getSoftwaresefe()+"',");
        strValues.append("'"+computadora.getSoftwarealphat()+"'");
        strValues.append("'"+computadora.getSoftwaresmp()+"'");
        strValues.append("'"+computadora.getComentarios()+"'");

        try {
            conexionBD.insertTabla(computadora.getTable(),strFields.toString(),strValues.toString());
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Boolean update(Computadora computadora, int id) {
        return null;
    }
    @Override
    public Boolean delete(int id) {
        StringBuilder strDelete = new StringBuilder();
        strDelete.append(" where " + idModel + " = " + id);
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
    public Computadora getValueByKey(int key) {
        return null;
    }
}