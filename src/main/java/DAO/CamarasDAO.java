package DAO;

import Model.CamarasDigitales;

import java.sql.SQLException;

public class CamarasDAO extends ConexionBD implements OperacionesBD<CamarasDigitales>{
    private static ConexionBD conexionBD;

    private static final String tabla = "CamarasDigitales";
    private static final String idColum = "idCamarasDigitales";
    private static final String modeloMarcaColum = "modeloMarca";
    private static final String numSerieColum = "numSerie";
    private static final String comentariosColum = "comentarios";
    private static final String idUbicacionColum = "idUbicacion";
    private static final String idEmpleadoColum = "idEmpleado";
    @Override
    public Boolean insert(CamarasDigitales camarasDigitales) {
        StringBuilder stringFields = new StringBuilder();
        StringBuilder stringValues = new StringBuilder();

        stringFields.append(modeloMarcaColum + ",");
        stringFields.append(numSerieColum + ",");
        stringFields.append(comentariosColum + ",");
        stringFields.append(idUbicacionColum + ",");
        stringFields.append(idEmpleadoColum);

        stringValues.append("'" + camarasDigitales.getModeloMarca() + ",");
        stringValues.append("'" + camarasDigitales.getNumSerie() + ",");
        stringValues.append("'" + camarasDigitales.getComentarios() + ",");
        stringValues.append(camarasDigitales.getIdUbicacion() + ",");
        stringValues.append(camarasDigitales.getIdEmpleado());

        String query ="insert into" + tabla + "(" + stringFields.toString() + ") values (" + stringValues.toString() + ");";
        System.out.println("Insercion camara digital: " + query);
        try {
            conexionBD.insertTabla(camarasDigitales.getTable(),stringFields,stringValues);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Boolean update(CamarasDigitales camarasDigitales, int id) {
        StringBuilder stringFields = new StringBuilder();
        StringBuilder stringWhere = new StringBuilder();

        stringFields.append(modeloMarcaColum + "=" + "'" + camarasDigitales.getModeloMarca() + "',");
        stringFields.append(numSerieColum + "=" + "'" + camarasDigitales.getNumSerie() + "',");
        stringFields.append(comentariosColum + "=" + "'" + camarasDigitales.getComentarios() + "',");
        stringFields.append(idUbicacionColum + "=" + camarasDigitales.getModeloMarca() + "',");
        stringFields.append(idEmpleadoColum + "="  + camarasDigitales.getModeloMarca());

        stringWhere.append("Where" + idColum + "=" + id);
        System.out.println("campos para update:    " + stringFields.toString());
        String stringQuery = " update " + tabla + " set " + stringFields.toString() + " " + stringWhere.toString() + ";";

        System.out.println("CamarasDAO/update:\n" + stringQuery);
        try {
            this.updateTabla(tabla,stringFields,stringFields);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Boolean delete(int id) {
        StringBuilder stringDelete = new StringBuilder();

        stringDelete.append(" where " + idColum + "=" + id);

        String stringQuery =" delete from " + tabla +stringDelete.toString() +";";

        System.out.println("Eliminar Camaras digitales: " + stringQuery);

        try {
            this.deleteTabla(tabla,stringDelete);
        } catch (SQLException e) {
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
    public CamarasDigitales getValueByKey(int key) {
        return null;
    }
}
