package Controller;

import Views.VistaReporteIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorVistaReporteIFrame implements MouseListener {

    private final VistaReporteIFrame vistaReporteIFrame;

    public ControladorVistaReporteIFrame(VistaReporteIFrame revisionAuditoriasIFrame){
        this.vistaReporteIFrame = revisionAuditoriasIFrame;
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

        if (event == vistaReporteIFrame.btnRevisar){
            vistaReporteIFrame.btnRevisar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();

        if (event == vistaReporteIFrame.btnRevisar){
            vistaReporteIFrame.btnRevisar.setBorder(null);
        }
    }
}
