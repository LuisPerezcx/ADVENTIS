package Model;

public class Computadora {
    private String modelomarca;
    private String softwaresefe;
    private String getSoftwarealphat;
    private String softwaresmp;
    private String comentarios;

    public Computadora(String modelomarca, String softwaresefe, String getSoftwarealphat, String softwaresmp, String comentarios) {
        this.modelomarca = modelomarca;
        this.softwaresefe = softwaresefe;
        this.getSoftwarealphat = getSoftwarealphat;
        this.softwaresmp = softwaresmp;
        this.comentarios = comentarios;
    }

    public String getModelomarca() {
        return modelomarca;
    }

    public String getSoftwaresefe() {
        return softwaresefe;
    }

    public String getSoftwarealphat() {
        return getSoftwarealphat;
    }

    public String getSoftwaresmp() {
        return softwaresmp;
    }

    public String getComentarios() {
        return comentarios;
    }

    public String getTable(){
        return "categoria";
    }
}