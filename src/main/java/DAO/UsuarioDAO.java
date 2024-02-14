package DAO;

import Model.Usuario;

import java.sql.SQLException;

public class UsuarioDAO extends ConexionBD implements OperacionesBD<Usuario> {

    final String idUsuario = "idUsuario";
    final String columnaEmail = "Email";
    final String columnaContrasena = "contrasena";
    final String columnaIdEmpleado = "idEmpleado";
    final String columnaIdTipoUsuario = "idTipoUsuario";
    final String tabla = "usuario";


    @Override
    public Boolean insert(Usuario usuario) {
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
            this.insertTabla(tabla,stringFields.toString(), stringValues.toString());
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
            this.updateTabla(tabla,stringFields,stringFields );
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