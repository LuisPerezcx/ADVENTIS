package DAO;

import Model.Empleado;
import Model.Usuario;
import org.w3c.dom.ls.LSOutput;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAO extends ConexionBD implements OperacionesBD<Usuario> {


    final String idUsuario = "idUsuario";
    final String columnaEmail = "Email";
    final String columnaContrasena = "contrasena";
    final String columnaIdEmpleado = "idEmpleado";
    final String columnaIdTipoUsuario = "idTipoUsuario";
    final String tabla = "usuario";

    @Override
    public Boolean insert(Usuario usuario) {
        System.out.printf("Hola ");
        StringBuilder stringFields = new StringBuilder();
        StringBuilder stringValues = new StringBuilder();

        stringFields.append(columnaEmail + ",");
        stringFields.append(columnaContrasena + ",");
        stringFields.append(columnaIdEmpleado + ",");
        stringFields.append(columnaIdTipoUsuario);

        stringValues.append("'" + usuario.getEmail() + "',");
        stringValues.append("'" + usuario.getContrasena() + "',");
        stringValues.append(usuario.getIdEmpleado() + ",");
        stringValues.append(usuario.getIdTipoUsuario());

        String query ="insert into" + tabla + "(" + stringFields.toString() + ") values (" + stringValues.toString() + ");";
        System.out.println("Insercion usuario: " + query);

        try {
            this.insertTabla(tabla,stringFields, stringValues);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Boolean update(Usuario usuario, int id) {
        StringBuilder stringFields = new StringBuilder();
        StringBuilder stringWhere = new StringBuilder();

        stringFields.append(columnaEmail + "=" + "'" + usuario.getEmail() + "',");
        stringFields.append(columnaContrasena + "=" + "'" + usuario.getContrasena() + "',");
        stringFields.append(columnaIdEmpleado + "=" + usuario.getIdEmpleado() + ",");
        stringFields.append(columnaIdTipoUsuario + "=" + usuario.getIdTipoUsuario());

        stringWhere.append(" where " + idUsuario + "=" + id);
        System.out.println("campos para update:    " + stringFields.toString());
        String stringQuery = " update " + tabla + " set " + stringFields.toString() + " " + stringWhere.toString() + ";";

        System.out.println("UsuarioDAO/update:\n" + stringQuery);

        try {
            this.updateTabla(tabla,stringFields,stringFields);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Boolean delete(int id) {
        StringBuilder stringDelete = new StringBuilder();

        stringDelete.append(" where " + idUsuario + "=" + id);

        String stringQuery =" delete from " + tabla +stringDelete.toString() +";";

        System.out.println("Elimina Usuario: " + stringQuery);

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

    public ArrayList<Usuario> getAllUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try {
            String query = "SELECT * FROM " + tabla;
            ResultSet resultSet = executeQuery(query);

            while (resultSet.next()) {
                String email = resultSet.getString("email");
                String contrasena = resultSet.getString("Contrasenia");
                int tipoUsuario = Integer.parseInt(resultSet.getString("idTipoUsuario"));
                int empleado = Integer.parseInt(resultSet.getString("idEmpleado"));

                Usuario usuario = new Usuario(email,contrasena,tipoUsuario,empleado);
                usuarios.add(usuario);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejar la excepción según tus necesidades
        }

        return usuarios;
    }

    @Override
    public void selectAll() {
    }

    @Override
    public int getKeyValueByName(String name) {
        return 0;
    }

    @Override
    public Usuario getValueByKey(int key) {
        return null;
    }
}