package Model;

public class Empleado {
    private String nombreEmpleado;
    private String aPaterno;
    private String aMaterno;

    public Empleado(String nombreEmpleado, String aPaterno, String aMaterno) {
        this.nombreEmpleado = nombreEmpleado;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public String getTable() {return "Empleado";}
}
