package Controller;

import Views.RegistroUsuariosIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorRegistroUsuariosIFrame implements MouseListener {
    private final RegistroUsuariosIFrame registroUsuariosIFrame;

    public ControladorRegistroUsuariosIFrame(RegistroUsuariosIFrame registroUsuariosIFrame) {
        this.registroUsuariosIFrame = registroUsuariosIFrame;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object event = e.getSource();
        if (event == registroUsuariosIFrame.mostrarContrasena){
            registroUsuariosIFrame.ocultarContrasena.setVisible(true);
            registroUsuariosIFrame.mostrarContrasena.setVisible(false);
            registroUsuariosIFrame.contrasena.setEchoChar((char)0);
        } else if (event == registroUsuariosIFrame.ocultarContrasena) {
            registroUsuariosIFrame.mostrarContrasena.setVisible(true);
            registroUsuariosIFrame.ocultarContrasena.setVisible(false);
            registroUsuariosIFrame.contrasena.setEchoChar('•');
        } else if (event == registroUsuariosIFrame.mostrarConfirmarContrasena) {
            registroUsuariosIFrame.ocultarConfirmarContrasena.setVisible(true);
            registroUsuariosIFrame.mostrarConfirmarContrasena.setVisible(false);
            registroUsuariosIFrame.contrasenaConfirmar.setEchoChar((char)0);
        } else if (event == registroUsuariosIFrame.ocultarConfirmarContrasena) {
            registroUsuariosIFrame.mostrarConfirmarContrasena.setVisible(true);
            registroUsuariosIFrame.ocultarConfirmarContrasena.setVisible(false);
            registroUsuariosIFrame.contrasenaConfirmar.setEchoChar('•');
        } else if (event == registroUsuariosIFrame.guardar) {
            System.out.println("codigo para aceptar");
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
        if (event == registroUsuariosIFrame.guardar){
            registroUsuariosIFrame.guardar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();
        if (event == registroUsuariosIFrame.guardar){
            registroUsuariosIFrame.guardar.setBorder(null);
        }
    }
}
