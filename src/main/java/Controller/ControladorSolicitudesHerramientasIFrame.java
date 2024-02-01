package Controller;

import Views.SolicitudesHerramientasIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorSolicitudesHerramientasIFrame implements MouseListener {
    private final SolicitudesHerramientasIFrame solicitudesHerramientasIFrame;

    public ControladorSolicitudesHerramientasIFrame(SolicitudesHerramientasIFrame solicitudesHerramientasIFrame) {
        this.solicitudesHerramientasIFrame = solicitudesHerramientasIFrame;
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
        if (event == solicitudesHerramientasIFrame.buscar){
            solicitudesHerramientasIFrame.buscar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();
        if (event == solicitudesHerramientasIFrame.buscar){
            solicitudesHerramientasIFrame.buscar.setBorder(null);
        }
    }
}
