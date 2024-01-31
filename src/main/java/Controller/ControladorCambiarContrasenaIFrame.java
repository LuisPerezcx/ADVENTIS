package Controller;

import Views.CambiarContrasenaIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorCambiarContrasenaIFrame implements MouseListener {
    private final CambiarContrasenaIFrame cambiarContrasenaIFrame;

    public ControladorCambiarContrasenaIFrame(CambiarContrasenaIFrame cambiarContrasenaIFrame) {
        this.cambiarContrasenaIFrame = cambiarContrasenaIFrame;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object event = e.getSource();
        if (event == cambiarContrasenaIFrame.mostrarContrasenaActual){
            cambiarContrasenaIFrame.mostrarContrasenaActual.setVisible(false);
            cambiarContrasenaIFrame.ocultarContrasenaActual.setVisible(true);
            cambiarContrasenaIFrame.contrasenaActual.setEchoChar((char)0);
        } else if (event == cambiarContrasenaIFrame.ocultarContrasenaActual) {
            cambiarContrasenaIFrame.ocultarContrasenaActual.setVisible(false);
            cambiarContrasenaIFrame.mostrarContrasenaActual.setVisible(true);
            cambiarContrasenaIFrame.contrasenaActual.setEchoChar('•');
        } else if (event == cambiarContrasenaIFrame.mostrarContrasenaNueva) {
            cambiarContrasenaIFrame.mostrarContrasenaNueva.setVisible(false);
            cambiarContrasenaIFrame.ocultarContrasenaNueva.setVisible(true);
            cambiarContrasenaIFrame.contrasenaNueva.setEchoChar((char)0);
        } else if (event == cambiarContrasenaIFrame.ocultarContrasenaNueva) {
            cambiarContrasenaIFrame.ocultarContrasenaNueva.setVisible(false);
            cambiarContrasenaIFrame.mostrarContrasenaNueva.setVisible(true);
            cambiarContrasenaIFrame.contrasenaNueva.setEchoChar('•');
        } else if (event == cambiarContrasenaIFrame.mostrarContrasenaConfirmar) {
            cambiarContrasenaIFrame.mostrarContrasenaConfirmar.setVisible(false);
            cambiarContrasenaIFrame.ocultarContrasenaConfirmar.setVisible(true);
            cambiarContrasenaIFrame.contrasenaConfirmar.setEchoChar((char)0);
        } else if (event == cambiarContrasenaIFrame.ocultarContrasenaConfirmar) {
            cambiarContrasenaIFrame.ocultarContrasenaConfirmar.setVisible(false);
            cambiarContrasenaIFrame.mostrarContrasenaConfirmar.setVisible(true);
            cambiarContrasenaIFrame.contrasenaConfirmar.setEchoChar('•');
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
        if (event == cambiarContrasenaIFrame.aceptar){
            cambiarContrasenaIFrame.aceptar.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else if (event == cambiarContrasenaIFrame.cancelar) {
            cambiarContrasenaIFrame.cancelar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();
        if (event == cambiarContrasenaIFrame.aceptar){
            cambiarContrasenaIFrame.aceptar.setBorder(null);
        } else if (event == cambiarContrasenaIFrame.cancelar) {
            cambiarContrasenaIFrame.cancelar.setBorder(null);
        }
    }
}
