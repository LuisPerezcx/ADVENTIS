package DAO;

public class TipoComponenteDAO implements OperacionesBD<TipoComponenteDAO>{
    private final String tabla = "tipocomponente";
    private final String colID = "idtipocomponente";
    private final String colNombreComponente = "nombrecomponente";
    private final String colFabricante = "fabricante";
    private final String colDescripcion = "descripcion";


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
