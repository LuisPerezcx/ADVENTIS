package Controller;

import Views.SolicitarHerramientasIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorSolicitarHerramientasIFrame implements MouseListener {
    private final SolicitarHerramientasIFrame solicitarHerramientasIFrame;

    public ControladorSolicitarHerramientasIFrame(SolicitarHerramientasIFrame solicitarHerramientasIFrame) {
        this.solicitarHerramientasIFrame = solicitarHerramientasIFrame;
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
        if (event == solicitarHerramientasIFrame.solicitar){
            solicitarHerramientasIFrame.solicitar.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else if (event == solicitarHerramientasIFrame.buscar) {
            solicitarHerramientasIFrame.buscar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();
        if (event == solicitarHerramientasIFrame.solicitar){
            solicitarHerramientasIFrame.solicitar.setBorder(null);
        } else if (event == solicitarHerramientasIFrame.buscar) {
            solicitarHerramientasIFrame.buscar.setBorder(null);
        }
    }
}
