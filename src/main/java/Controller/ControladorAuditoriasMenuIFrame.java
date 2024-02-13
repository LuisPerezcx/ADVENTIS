package Controller;

import Views.AuditoriasMenuIFrame;
import Views.GenerarAuditoriaIFrame;
import Views.VentanaPrincipal;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static Util.CreacionIFrames.generarAuditoriaIFrame;

public class ControladorAuditoriasMenuIFrame implements MouseListener {
    private final AuditoriasMenuIFrame auditoriasMenuIFrame;

    private final VentanaPrincipal ventanaPrincipal;

    public ControladorAuditoriasMenuIFrame(AuditoriasMenuIFrame auditoriasMenuIFrame, VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal =ventanaPrincipal;
        this.auditoriasMenuIFrame = auditoriasMenuIFrame;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object event= e.getSource();

        if(event == auditoriasMenuIFrame.generarAuditorias){
            ventanaPrincipal.dibujarVista(generarAuditoriaIFrame);
        }

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
        if (event == auditoriasMenuIFrame.generarAuditorias){
            auditoriasMenuIFrame.generarAuditorias.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else if (event == auditoriasMenuIFrame.verAuditorias) {
            auditoriasMenuIFrame.verAuditorias.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();
        if (event == auditoriasMenuIFrame.generarAuditorias){
            auditoriasMenuIFrame.generarAuditorias.setBorder(null);
        } else if (event == auditoriasMenuIFrame.verAuditorias) {
            auditoriasMenuIFrame.verAuditorias.setBorder(null);
        }
    }
}
