package Controller;

import Views.GenerarAuditoriaIFrame;

import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorGenerarAuditoriaIFrame implements MouseListener {

    private GenerarAuditoriaIFrame generarAuditoriaIFrame;

    public ControladorGenerarAuditoriaIFrame(GenerarAuditoriaIFrame generarAuditoriaIFrame){
        this.generarAuditoriaIFrame = generarAuditoriaIFrame;

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

        if (event == generarAuditoriaIFrame.btnGenerar){
            generarAuditoriaIFrame.btnGenerar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();

        if (event == generarAuditoriaIFrame.btnGenerar){
            generarAuditoriaIFrame.btnGenerar.setBorder(null);
        }
    }
}
