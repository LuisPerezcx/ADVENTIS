package Controller;

import Views.HerramientasMenuIFrame;
import Views.ReportesMenuIFrame;
import Views.VentanaPrincipal;
import Views.VistaReporteIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static Util.CreacionIFrames.*;

public class ControladorReportesMenuIFrame implements MouseListener, ActionListener {
    private final ReportesMenuIFrame reportesMenuIFrame;
    private final VentanaPrincipal ventanaPrincipal;

    public ControladorReportesMenuIFrame(ReportesMenuIFrame reportesMenuIFrame, VentanaPrincipal ventanaPrincipal) {
        this.reportesMenuIFrame = reportesMenuIFrame;

        this.ventanaPrincipal = ventanaPrincipal;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }


    @Override
    public void mouseClicked(MouseEvent e) {
        Object event = e.getSource();
        if (event == reportesMenuIFrame.verReportes) {
            ventanaPrincipal.dibujarVista(vistaReporteIFrame);
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
        if (event == reportesMenuIFrame.verReportes){
            reportesMenuIFrame.verReportes.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();
        if (event == reportesMenuIFrame.verReportes){
            reportesMenuIFrame.verReportes.setBorder(null);
        }
    }
}
