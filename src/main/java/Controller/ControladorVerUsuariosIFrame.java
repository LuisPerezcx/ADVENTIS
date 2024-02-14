package Controller;

import Util.Regex;
import Views.Notificaciones;
import Views.VerUsuariosIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorVerUsuariosIFrame implements MouseListener{
    private final VerUsuariosIFrame verUsuariosIFrame;

    public ControladorVerUsuariosIFrame(VerUsuariosIFrame verUsuariosIFrame) {
        this.verUsuariosIFrame = verUsuariosIFrame;
    }




    @Override
    public void mouseClicked(MouseEvent e) {
        Object event = e.getSource();
        if (event == verUsuariosIFrame.buscar){
            validarBusqueda();
        }
    }
    private void validarBusqueda(){
        if(Regex.validarNombreCompleto(verUsuariosIFrame.txtBusqueda.getText())){
            System.out.println("Busqueda exitosa");
        }else {
            Notificaciones.mensajeError(verUsuariosIFrame,"No se puede realizar la busqueda, verifique sus datos","Error al intentar buscar");
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
