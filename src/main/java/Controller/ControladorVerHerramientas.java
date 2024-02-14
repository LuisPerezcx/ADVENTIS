package Controller;

import Util.Regex;
import Views.Notificaciones;
import Views.VerHerramientasIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorVerHerramientas implements MouseListener {
    private final VerHerramientasIFrame verHerramientasIFrame;

    public ControladorVerHerramientas(VerHerramientasIFrame verHerramientasIFrame) {
        this.verHerramientasIFrame = verHerramientasIFrame;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object event = e.getSource();
        if(event == verHerramientasIFrame.buscar){
            validaNombre();
        }
    }

    private void validaNombre(){
        if(Regex.validaHerramientas(verHerramientasIFrame.buscar.getText())){
            System.out.println("nombreValido");
        }else {
            Notificaciones.mensajeError(verHerramientasIFrame,"Nombre invalido","Error en la verificacion del nombre");
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
        if (event == verHerramientasIFrame.buscar){
            verHerramientasIFrame.buscar.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else if (event == verHerramientasIFrame.verSolicitudes) {
            verHerramientasIFrame.verSolicitudes.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();
        if (event == verHerramientasIFrame.buscar){
            verHerramientasIFrame.buscar.setBorder(null);
        } else if (event == verHerramientasIFrame.verSolicitudes) {
            verHerramientasIFrame.verSolicitudes.setBorder(null);
        }
    }
}
