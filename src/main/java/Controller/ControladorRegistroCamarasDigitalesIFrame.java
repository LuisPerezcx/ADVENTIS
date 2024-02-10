package Controller;

import Views.RegistroCamarasDigitalesIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorRegistroCamarasDigitalesIFrame implements MouseListener {

    private final RegistroCamarasDigitalesIFrame registroCamarasDigitalesIFrame;

    public ControladorRegistroCamarasDigitalesIFrame(RegistroCamarasDigitalesIFrame registroCamarasDigitalesIFrame1){
        this.registroCamarasDigitalesIFrame = registroCamarasDigitalesIFrame1;
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

        if (event == registroCamarasDigitalesIFrame.guardar){
            registroCamarasDigitalesIFrame.guardar.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();

        if (event == registroCamarasDigitalesIFrame.guardar){
            registroCamarasDigitalesIFrame.guardar.setBorder(null);
        }
    }
}
