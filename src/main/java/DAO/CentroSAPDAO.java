package DAO;

import Arreglos.Arreglos;
import Model.TipoComponente;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CentroSAPDAO implements OperacionesBD<String>{
    private static ConexionBD conexionBD = new ConexionBD();
    private final String tabla = "centrosap";
    private final String colID = "centrosapid";
    private final String colNombre = "nombre";
    private StringBuilder strFields,strWhere;

    @Override
    public Boolean insert(String s) {
        return null;
    }

    @Override
    public Boolean update(String s, int id) {
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

        Arreglos.centroSAParrayList = new ArrayList<>();

        try {
            while (resultado.next()){
                String nombreCentro = resultado.getString(2);
                Arreglos.centroSAParrayList.add(nombreCentro);
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
    public String getValueByKey(int key) {
        return null;
    }
}
