package DAO;

import Arreglos.Arreglos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UbicacionesDAO {
    public void obtenerUbicaciones() {
        ConexionBD conexionBD = new ConexionBD();
        Arreglos.ubicacionArray = new ArrayList<>();

        try {
            // Realizamos una consulta para obtener todos los registros de la tabla "ubicacion"
            ResultSet resultSet = conexionBD.selectTabla("ubicacion", "idubicacion, nombreubicacion", new StringBuilder(), "idubicacion", "");

            // Iteramos sobre el ResultSet para obtener los datos y almacenarlos en un ArrayList
            while (resultSet.next()) {
                String ubicacion = resultSet.getString("nombreubicacion");
                Arreglos.ubicacionArray.add(ubicacion);
            }

            // Cerramos la conexión
            conexionBD.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
