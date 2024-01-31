package Controller;

import Views.CambiarContrasenaIFrame;
import Views.PerfilMenuIFrame;
import Views.VentanaPrincipal;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorPerfilMenuIFrame implements MouseListener {
    private final PerfilMenuIFrame perfilMenuIFrame;
    private final VentanaPrincipal ventanaPrincipal;
    private final CambiarContrasenaIFrame cambiarContrasenaIFrame = new CambiarContrasenaIFrame();

    public ControladorPerfilMenuIFrame(PerfilMenuIFrame perfilMenuIFrame, VentanaPrincipal ventanaPrincipal) {
        this.perfilMenuIFrame = perfilMenuIFrame;
        this.ventanaPrincipal = ventanaPrincipal;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object event = e.getSource();
        if (event == perfilMenuIFrame.cambiarContrasena){
            ventanaPrincipal.dibujarVista(cambiarContrasenaIFrame);
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
        if (event == perfilMenuIFrame.cambiarContrasena){
            perfilMenuIFrame.cambiarContrasena.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();
        if (event == perfilMenuIFrame.cambiarContrasena){
            perfilMenuIFrame.cambiarContrasena.setBorder(null);
        }
    }
}
