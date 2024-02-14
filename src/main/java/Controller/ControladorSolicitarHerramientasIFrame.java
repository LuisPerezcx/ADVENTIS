package Controller;

import Util.Regex;
import Views.Notificaciones;
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
        Object event = e.getSource();
        if (event == solicitarHerramientasIFrame.buscar){
            validarBusqueda();
        }
    }

    private void validarBusqueda(){
        if(Regex.validaHerramientas(solicitarHerramientasIFrame.buscar.getText())){
            System.out.println("nombreValido");
        }else {
            Notificaciones.mensajeError(solicitarHerramientasIFrame,"Nombre invalido","Error en la verificacion del nombre");
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
