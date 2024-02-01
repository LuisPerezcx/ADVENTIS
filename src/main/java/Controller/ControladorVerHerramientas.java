package Controller;

import Views.VerHerramientasIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorVerHerramientas implements MouseListener {
    private final VerHerramientasIFrame verHerramientasIFrame;

    public ControladorVerHerramientas(VerHerramientasIFrame verHerramientasIFrame) {
        this.verHerramientasIFrame = verHerramientasIFrame;
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
        if (event == verHerramientasIFrame.buscar){
            verHerramientasIFrame.buscar.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else if (event == verHerramientasIFrame.verSolicitudes) {
            verHerramientasIFrame.verSolicitudes.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();
        if (event == verHerramientasIFrame.buscar){
            verHerramientasIFrame.buscar.setBorder(null);
        } else if (event == verHerramientasIFrame.verSolicitudes) {
            verHerramientasIFrame.verSolicitudes.setBorder(null);
        }
    }
}
