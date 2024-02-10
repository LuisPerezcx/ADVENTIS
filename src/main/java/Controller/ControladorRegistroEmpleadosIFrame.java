package Controller;

import Views.Notificaciones;
import Views.RegistroEmpleadosIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorRegistroEmpleadosIFrame implements MouseListener {
    private final RegistroEmpleadosIFrame registroEmpleadosIFrame;

    public ControladorRegistroEmpleadosIFrame(RegistroEmpleadosIFrame registroEmpleadosIFrame) {
        this.registroEmpleadosIFrame = registroEmpleadosIFrame;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object event = e.getSource();
        if(event == registroEmpleadosIFrame.guardar){
            registrarEmpleado();
        }
    }

    private void registrarEmpleado(){
        Notificaciones.mensajeOK(registroEmpleadosIFrame,"Registro exitoso","Empleado registrado");
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
        if (event == registroEmpleadosIFrame.guardar){
            registroEmpleadosIFrame.guardar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();
        if (event == registroEmpleadosIFrame.guardar){
            registroEmpleadosIFrame.guardar.setBorder(null);
        }
    }
}
