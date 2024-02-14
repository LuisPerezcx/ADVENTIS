package Model;

public class CamarasDigitales {
    private String modeloMarca;
    private String numSerie;
    private String comentarios;
    private int idUbicacion;
    private int idEmpleado;

    public CamarasDigitales(String modeloMarca, String numSerie, String comentarios, int idUbicacion, int idEmpleado) {
        this.modeloMarca = modeloMarca;
        this.numSerie = numSerie;
        this.comentarios = comentarios;
        this.idUbicacion = idUbicacion;
        this.idEmpleado = idEmpleado;
    }

    public String getModeloMarca() {
        return modeloMarca;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public String getComentarios() {
        return comentarios;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }
    public String getTable() {return "CamarasDigitales";}
}
