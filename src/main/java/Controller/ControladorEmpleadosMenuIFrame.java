package Controller;

import Views.EmpleadosMenuIFrame;
import Views.VentanaPrincipal;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static Util.CreacionIFrames.*;

public class ControladorEmpleadosMenuIFrame implements MouseListener {
    private final EmpleadosMenuIFrame empleadosMenuIFrame;
    private final VentanaPrincipal ventanaPrincipal;
    public ControladorEmpleadosMenuIFrame(EmpleadosMenuIFrame empleadosMenuIFrame,VentanaPrincipal ventanaPrincipal) {
        this.empleadosMenuIFrame = empleadosMenuIFrame;
        this.ventanaPrincipal = ventanaPrincipal;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object event = e.getSource();
        if (event == empleadosMenuIFrame.rEmpleados){
            ventanaPrincipal.dibujarVista(registroEmpleadosIFrame);
        } else if (event == empleadosMenuIFrame.verEmpleados) {
            ventanaPrincipal.dibujarVista(verEmpleadosIFrame);
        } else if (event == empleadosMenuIFrame.rUsuarios) {
            ventanaPrincipal.dibujarVista(registroUsuariosIFrame);
        } else if (event == empleadosMenuIFrame.verUsuarios) {
            ventanaPrincipal.dibujarVista(verUsuarios);
        }
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
        if (event == empleadosMenuIFrame.rEmpleados){
            empleadosMenuIFrame.rEmpleados.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else if (event == empleadosMenuIFrame.verEmpleados) {
            empleadosMenuIFrame.verEmpleados.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else if (event == empleadosMenuIFrame.rUsuarios) {
            empleadosMenuIFrame.rUsuarios.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else if (event == empleadosMenuIFrame.verUsuarios) {
            empleadosMenuIFrame.verUsuarios.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();
        if (event == empleadosMenuIFrame.rEmpleados){
            empleadosMenuIFrame.rEmpleados.setBorder(null);
        } else if (event == empleadosMenuIFrame.verEmpleados) {
            empleadosMenuIFrame.verEmpleados.setBorder(null);
        } else if (event == empleadosMenuIFrame.rUsuarios) {
            empleadosMenuIFrame.rUsuarios.setBorder(null);
        } else if (event == empleadosMenuIFrame.verUsuarios) {
            empleadosMenuIFrame.verUsuarios.setBorder(null);
        }
    }
}
