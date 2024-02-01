package Controller;

import Views.VerUsuariosIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorVerUsuariosIFrame implements MouseListener {
    private final VerUsuariosIFrame verUsuariosIFrame;

    public ControladorVerUsuariosIFrame(VerUsuariosIFrame verUsuariosIFrame) {
        this.verUsuariosIFrame = verUsuariosIFrame;
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
        if (event == verUsuariosIFrame.buscar){
            verUsuariosIFrame.buscar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();
        if (event == verUsuariosIFrame.buscar){
            verUsuariosIFrame.buscar.setBorder(null);
        }
    }
}
