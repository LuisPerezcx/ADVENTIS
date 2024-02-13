package Controller;

import Views.HerramientasMenuIFrame;
import Views.VentanaPrincipal;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static Util.CreacionIFrames.*;

public class ControladorHerramientasMenuIFrame implements MouseListener {
    private final HerramientasMenuIFrame herramientasMenuIFrame;
    private final VentanaPrincipal ventanaPrincipal;

    public ControladorHerramientasMenuIFrame(HerramientasMenuIFrame herramientasMenuIFrame, VentanaPrincipal ventanaPrincipal) {
        this.herramientasMenuIFrame = herramientasMenuIFrame;
        this.ventanaPrincipal = ventanaPrincipal;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        Object event = e.getSource();
        if (event == herramientasMenuIFrame.prestarHerramientas){
            ventanaPrincipal.dibujarVista(solicitudesHerramientasIFrame);
        } else if (event == herramientasMenuIFrame.solicitarHerramientas) {
            ventanaPrincipal.dibujarVista(solicitarHerramientasIFrame);
        } else if (event == herramientasMenuIFrame.registrarTComponente) {
            ventanaPrincipal.dibujarVista(registroComponentesIFrame);
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
        if (event == herramientasMenuIFrame.prestarHerramientas){
            herramientasMenuIFrame.prestarHerramientas.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else if (event == herramientasMenuIFrame.solicitarHerramientas) {
            herramientasMenuIFrame.solicitarHerramientas.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else if (event == herramientasMenuIFrame.rHerramientas) {
            herramientasMenuIFrame.rHerramientas.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else if (event == herramientasMenuIFrame.verHerramientas) {
            herramientasMenuIFrame.verHerramientas.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else if (event == herramientasMenuIFrame.registrarTHerramienta) {
            herramientasMenuIFrame.registrarTHerramienta.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else if (event == herramientasMenuIFrame.registrarTComponente) {
            herramientasMenuIFrame.registrarTComponente.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();
        if (event == herramientasMenuIFrame.prestarHerramientas){
            herramientasMenuIFrame.prestarHerramientas.setBorder(null);
        } else if (event == herramientasMenuIFrame.solicitarHerramientas) {
            herramientasMenuIFrame.solicitarHerramientas.setBorder(null);
        } else if (event == herramientasMenuIFrame.rHerramientas) {
                herramientasMenuIFrame.rHerramientas.setBorder(null);
        } else if (event == herramientasMenuIFrame.verHerramientas) {
            herramientasMenuIFrame.verHerramientas.setBorder(null);
        }else if (event == herramientasMenuIFrame.registrarTHerramienta) {
            herramientasMenuIFrame.registrarTHerramienta.setBorder(null);
        } else if (event == herramientasMenuIFrame.registrarTComponente) {
            herramientasMenuIFrame.registrarTComponente.setBorder(null);
        }
    }
}
