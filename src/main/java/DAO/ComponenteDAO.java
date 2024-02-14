package DAO;

import Arreglos.Arreglos;
import Model.Componente;
import Model.TipoComponente;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ComponenteDAO implements OperacionesBD<Componente>{
    private static ConexionBD conexionBD = new ConexionBD();
    private final String tabla = "componente";
    private final String colID = "idcomponente";
    private final String colIDtipoComponente = "idtipocomponente";
    private final String colIDCentroSAP = "idcentrosap";
    private StringBuilder strFields,strWhere;
    public void selectByCentroSAP(int idCentroSAP){
        strWhere = new StringBuilder();
        strWhere.append(colIDCentroSAP).append(" = '").append(idCentroSAP).append("'");
        String join = " tipocomponente on componente.idtipocomponente = tipocomponente.idtipocomponente ";
        ResultSet resultado = conexionBD.selectTabla(tabla,"*",strWhere,colID,join);

        Arreglos.componenteArrayList = new ArrayList<>();
        Arreglos.nombreComponenteArrayList = new ArrayList<>();

        try {
            while (resultado.next()){
                String nombreComponente = resultado.getString(2);
                String fabricante = resultado.getString(3);
                String descripcion = resultado.getString(4);
                String nombreComponenteS = resultado.getString(5);
                String fabricanteComponenteS =resultado.getString(6);
                Arreglos.tipoComponenteArrayList.add(new TipoComponente(nombreComponente,fabricante,descripcion));
                Arreglos.nombreComponenteArrayList.add(nombreComponenteS+" - "+fabricanteComponenteS);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        conexionBD.close();
    }
    @Override
    public Boolean insert(Componente componente) {
        return null;
    }

    @Override
    public Boolean update(Componente componente, int id) {
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

        Arreglos.componenteArrayList = new ArrayList<>();

        try {
            while (resultado.next()){
                int idTipoComponente = resultado.getInt(2);
                int idCentroSAP = resultado.getInt(3);
                Arreglos.componenteArrayList.add(new Componente(idTipoComponente,idCentroSAP));
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
    public Componente getValueByKey(int key) {
        return null;
    }
}
