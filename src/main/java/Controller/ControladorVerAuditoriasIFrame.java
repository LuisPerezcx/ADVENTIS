package Controller;

import Views.VerAuditoriasIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorVerAuditoriasIFrame implements MouseListener {

    private final VerAuditoriasIFrame verAuditoriasIFrame;

    public ControladorVerAuditoriasIFrame(VerAuditoriasIFrame verAuditoriasIFrame){
        this.verAuditoriasIFrame = verAuditoriasIFrame;
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

        if (event == verAuditoriasIFrame.btnBuscar){
            verAuditoriasIFrame.btnBuscar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();

        if (event == verAuditoriasIFrame.btnBuscar){
            verAuditoriasIFrame.btnBuscar.setBorder(null);
        }
    }
}
