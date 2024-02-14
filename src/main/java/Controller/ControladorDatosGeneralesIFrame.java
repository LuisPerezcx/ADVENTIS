package Controller;

import Util.CreacionIFrames;
import Views.DatosGeneralesIFrame;
import Views.Notificaciones;
import Views.VentanaPrincipal;

import javax.swing.border.BevelBorder;
import javax.swing.text.Utilities;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static Util.CreacionIFrames.*;

public class ControladorDatosGeneralesIFrame implements MouseListener {

    private final DatosGeneralesIFrame datosGeneralesIFrame;
    private final VentanaPrincipal ventanaPrincipal;

    public ControladorDatosGeneralesIFrame(DatosGeneralesIFrame datosGeneralesIFrame, VentanaPrincipal ventanaPrincipal) {
        this.datosGeneralesIFrame = datosGeneralesIFrame;
        this.ventanaPrincipal = ventanaPrincipal;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        Object event = e.getSource();
        if (event == datosGeneralesIFrame.btnSiguiente){
            ventanaPrincipal.dibujarVista(crearCatalogoIFrame);
        } else if (event == datosGeneralesIFrame.btnAgregar) {
            Notificaciones.mensajeOK(datosGeneralesIFrame,"Registro exitoso","Dato registrado");
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

        if (event == datosGeneralesIFrame.btnAgregar){
            datosGeneralesIFrame.btnAgregar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();

        if (event == datosGeneralesIFrame.btnAgregar){
            datosGeneralesIFrame.btnAgregar.setBorder(null);
        }
    }
}
