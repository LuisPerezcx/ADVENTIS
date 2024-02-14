package Model;

public class Usuario {
    private String email;
    private String contrasena;
    private int idEmpleado;
    private int idTipoUsuario;


    public Usuario(String email, String contrasena, int idEmpleado, int idTipoUsuario) {
        this.email = email;
        this.contrasena = contrasena;
        this.idEmpleado = idEmpleado;
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getEmail() {
        return email;
    }
    public String getContrasena() {
        return contrasena;
    }
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }


}