package Model;

public class TipoComponente {
    private String nombreComponente;
    private String fabricante;
    private String descripcion;

    public TipoComponente(String nombreComponente, String fabricante, String descripcion) {
        this.nombreComponente = nombreComponente;
        this.fabricante = fabricante;
        this.descripcion = descripcion;
    }

    public String getNombreComponente() {
        return nombreComponente;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
