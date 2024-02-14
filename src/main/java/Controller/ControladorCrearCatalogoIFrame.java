package Controller;

import Views.CrearCatalogoIFrame;
import Views.Notificaciones;
import Views.VentanaPrincipal;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorCrearCatalogoIFrame implements MouseListener {

    private final CrearCatalogoIFrame crearCatalogoIFrame;
    private final VentanaPrincipal ventanaPrincipal;

    public ControladorCrearCatalogoIFrame(CrearCatalogoIFrame crearCatalogoIFrame, VentanaPrincipal ventanaPrincipal){

        this.crearCatalogoIFrame = crearCatalogoIFrame;
        this.ventanaPrincipal = ventanaPrincipal;
    }



    @Override
    public void mouseClicked(MouseEvent e) {
        Object event = e.getSource();
         if (event == crearCatalogoIFrame.btnAgregar) {
            Notificaciones.mensajeOK(crearCatalogoIFrame,"Registro exitoso","Dato guardado");
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

        if (event == crearCatalogoIFrame.btnAceptar){
            crearCatalogoIFrame.btnAceptar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();

        if (event == crearCatalogoIFrame.btnAceptar){
            crearCatalogoIFrame.btnAceptar.setBorder(null);
        }
    }
}
