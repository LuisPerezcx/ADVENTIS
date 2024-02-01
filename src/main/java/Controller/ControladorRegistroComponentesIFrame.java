package Controller;

import Views.RegistroComponentesIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorRegistroComponentesIFrame implements MouseListener {

    private final RegistroComponentesIFrame registroComponentesIFrame;

    public ControladorRegistroComponentesIFrame(RegistroComponentesIFrame registroComponentesIFrame){
        this.registroComponentesIFrame = registroComponentesIFrame;
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

        if (event == registroComponentesIFrame.btnGuardar){
            registroComponentesIFrame.btnGuardar.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else if (event == registroComponentesIFrame.btnBuscar){
            registroComponentesIFrame.btnBuscar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();

        if (event == registroComponentesIFrame.btnGuardar){
            registroComponentesIFrame.btnGuardar.setBorder(null);
        }else if (event == registroComponentesIFrame.btnBuscar){
            registroComponentesIFrame.btnBuscar.setBorder(null);
        }
    }
}
