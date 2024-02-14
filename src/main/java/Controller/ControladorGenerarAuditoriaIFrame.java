package Controller;

import Arreglos.Arreglos;
import DAO.CentroSAPDAO;
import DAO.ComponenteDAO;
import Views.GenerarAuditoriaIFrame;
import Views.VentanaPrincipal;

import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorGenerarAuditoriaIFrame implements MouseListener, ActionListener {

    private final GenerarAuditoriaIFrame generarAuditoriaIFrame;
    private final VentanaPrincipal ventanaPrincipal;
    private final CentroSAPDAO centroSAPDAO = new CentroSAPDAO();
    private final ComponenteDAO componenteDAO = new ComponenteDAO();

    public ControladorGenerarAuditoriaIFrame(GenerarAuditoriaIFrame generarAuditoriaIFrame, VentanaPrincipal ventanaPrincipal){
        this.generarAuditoriaIFrame = generarAuditoriaIFrame;
        this.ventanaPrincipal = ventanaPrincipal;
        llenarComboSAP();
    }

    private void llenarComboSAP(){
        generarAuditoriaIFrame.comboComponente.removeAllItems();
        generarAuditoriaIFrame.comboCentroSAP.removeAllItems();
        centroSAPDAO.selectAll();
        for(String item : Arreglos.centroSAParrayList){
            generarAuditoriaIFrame.comboCentroSAP.addItem(item);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if(event == generarAuditoriaIFrame.comboCentroSAP){
            int idCentroSAP = generarAuditoriaIFrame.comboCentroSAP.getSelectedIndex()+1;
            componenteDAO.selectByCentroSAP(idCentroSAP);
            generarAuditoriaIFrame.comboComponente.removeAllItems();
            for (String item : Arreglos.nombreComponenteArrayList){
                generarAuditoriaIFrame.comboComponente.addItem(item);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {


    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object event = e.getSource();

        if (event == generarAuditoriaIFrame.btnGenerar){
            generarAuditoriaIFrame.btnGenerar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();

        if (event == generarAuditoriaIFrame.btnGenerar){
            generarAuditoriaIFrame.btnGenerar.setBorder(null);
        }
    }
}
