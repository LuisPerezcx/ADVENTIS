package Controller;

import Util.Regex;
import Views.Notificaciones;
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
        Object event = e.getSource();
        if (event == verEmpleadosIFrame.buscar){
            validarBusqueda();
        }
    }

    private void validarBusqueda(){
        if(Regex.validarNombreCompleto(verEmpleadosIFrame.txtNombre.getText())){
            System.out.println("Busqueda exitosa");
        }else {
            Notificaciones.mensajeError(verEmpleadosIFrame,"No se puede realizar la busqueda, verifique sus datos","Error al intentar buscar");
        }
        // if false
        //Notificaciones.mensajeError(login,"Usuario o contraseña incorrectos","Credenciales invalidas");
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
