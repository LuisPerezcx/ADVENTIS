package Controller;

import Views.AuditoriasMenuIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorAuditoriasMenuIFrame implements MouseListener {
    private final AuditoriasMenuIFrame auditoriasMenuIFrame;

    public ControladorAuditoriasMenuIFrame(AuditoriasMenuIFrame auditoriasMenuIFrame) {
        this.auditoriasMenuIFrame = auditoriasMenuIFrame;
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
