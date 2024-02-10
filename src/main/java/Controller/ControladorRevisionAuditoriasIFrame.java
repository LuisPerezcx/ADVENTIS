package Controller;

import Views.RevisionAuditoriasIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorRevisionAuditoriasIFrame implements MouseListener {

    private final RevisionAuditoriasIFrame revisionAuditoriasIFrame;

    public ControladorRevisionAuditoriasIFrame(RevisionAuditoriasIFrame revisionAuditoriasIFrame){
        this.revisionAuditoriasIFrame = revisionAuditoriasIFrame;
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

        if (event == revisionAuditoriasIFrame.btnRevisar){
            revisionAuditoriasIFrame.btnRevisar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();

        if (event == revisionAuditoriasIFrame.btnRevisar){
            revisionAuditoriasIFrame.btnRevisar.setBorder(null);
        }
    }
}
