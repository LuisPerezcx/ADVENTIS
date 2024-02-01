package Controller;

import Views.RegistroHerramientasIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorRegistroHerramientasIFrame implements MouseListener {

    private final RegistroHerramientasIFrame registroHerramientasIFrame;

    public ControladorRegistroHerramientasIFrame(RegistroHerramientasIFrame registroHerramientasIFrame) {
        this.registroHerramientasIFrame = registroHerramientasIFrame;
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

        if (event == registroHerramientasIFrame.btnGuardar){
            registroHerramientasIFrame.btnGuardar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();

        if (event == registroHerramientasIFrame.btnGuardar){
            registroHerramientasIFrame.btnGuardar.setBorder(null);
        }
    }
}