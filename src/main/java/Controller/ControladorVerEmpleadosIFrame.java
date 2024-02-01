package Controller;

import Views.VerEmpleadosIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorVerEmpleadosIFrame implements MouseListener {
    private final VerEmpleadosIFrame verEmpleadosIFrame;

    public ControladorVerEmpleadosIFrame(VerEmpleadosIFrame verEmpleadosIFrame) {
        this.verEmpleadosIFrame = verEmpleadosIFrame;
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
        if (event == verEmpleadosIFrame.buscar){
            verEmpleadosIFrame.buscar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();
        if (event == verEmpleadosIFrame.buscar){
            verEmpleadosIFrame.buscar.setBorder(null);
        }
    }
}
