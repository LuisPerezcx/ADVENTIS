package DAO;

public interface OperacionesBD <T>{
    Boolean insert (T t);
    Boolean update (T t, int id) ;
    Boolean delete(int id);
    //buscar x nombre
    Boolean selectByName(String name);
    //mostrar toda la info
    void selectAll();
    int getKeyValueByName(String name);
    T getValueByKey(int key);
}
