package Model;

public class Componente {
    private int idTipoComponente;
    private int idCentroSAP;

    public Componente(int idTipoComponente, int idCentroSAP) {
        this.idTipoComponente = idTipoComponente;
        this.idCentroSAP = idCentroSAP;
    }

    public int getIdTipoComponente() {
        return idTipoComponente;
    }

    public int getIdCentroSAP() {
        return idCentroSAP;
    }
}
