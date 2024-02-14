package DAO;

import Arreglos.Arreglos;
import Model.TipoComponente;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TipoComponenteDAO implements OperacionesBD<TipoComponenteDAO>{
    private static ConexionBD conexionBD;
    private final String tabla = "tipocomponente";
    private final String colID = "idtipocomponente";
    private final String colNombreComponente = "nombrecomponente";
    private final String colFabricante = "fabricante";
    private final String colDescripcion = "descripcion";
    private StringBuilder strFields,strWhere;

    public TipoComponenteDAO() {
        conexionBD = new ConexionBD();
    }

    @Override
    public Boolean insert(TipoComponenteDAO tipoComponenteDAO) {
        return null;
    }

    @Override
    public Boolean update(TipoComponenteDAO tipoComponenteDAO, int id) {
        return null;
    }

    @Override
    public Boolean delete(int id) {
        return null;
    }

    @Override
    public Boolean selectByName(String name) {
        return null;
    }

    @Override
    public void selectAll() {
        strWhere = new StringBuilder();
        strWhere.append("");
        ResultSet resultado = conexionBD.selectTabla(tabla,"*",strWhere,colID,"");

        Arreglos.tipoComponenteArrayList = new ArrayList<>();

        try {
            while (resultado.next()){
                String nombreComponente = resultado.getString(2);
                String fabricante = resultado.getString(3);
                String descripcion = resultado.getString(4);
                Arreglos.tipoComponenteArrayList.add(new TipoComponente(nombreComponente,fabricante,descripcion));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        conexionBD.close();
    }

    @Override
    public int getKeyValueByName(String name) {
        return 0;
    }

    @Override
    public TipoComponenteDAO getValueByKey(int key) {
        return null;
    }
}
