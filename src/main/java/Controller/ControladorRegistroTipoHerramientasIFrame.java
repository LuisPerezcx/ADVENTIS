package Controller;

import Views.RegistroTipoHerramientasIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorRegistroTipoHerramientasIFrame implements MouseListener {

    private final RegistroTipoHerramientasIFrame registroTipoHerramientasIFrame;

    public ControladorRegistroTipoHerramientasIFrame(RegistroTipoHerramientasIFrame registroTipoHerramientasIFrame1){
        this.registroTipoHerramientasIFrame = registroTipoHerramientasIFrame1;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

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

        if (event == registroTipoHerramientasIFrame.btnGuardarTipo){
            registroTipoHerramientasIFrame.btnGuardarTipo.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else if (event == registroTipoHerramientasIFrame.btnBuscarTipo) {
            registroTipoHerramientasIFrame.btnBuscarTipo.setBorder(new BevelBorder(BevelBorder.RAISED
            ));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();

        if (event == registroTipoHerramientasIFrame.btnGuardarTipo){
            registroTipoHerramientasIFrame.btnGuardarTipo.setBorder(null);
        } else if (event == registroTipoHerramientasIFrame.btnBuscarTipo) {
            registroTipoHerramientasIFrame.btnBuscarTipo.setBorder(null);
        }
    }
}
