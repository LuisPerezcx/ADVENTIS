package Controller;

import Views.ReportesMenuIFrame;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorReportesMenuIFrame implements MouseListener {
    private final ReportesMenuIFrame reportesMenuIFrame;

    public ControladorReportesMenuIFrame(ReportesMenuIFrame reportesMenuIFrame) {
        this.reportesMenuIFrame = reportesMenuIFrame;
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
        if (event == reportesMenuIFrame.generarPDF){
            reportesMenuIFrame.generarPDF.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else if (event == reportesMenuIFrame.verReportes) {
            reportesMenuIFrame.verReportes.setBorder(new BevelBorder(BevelBorder.RAISED));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object event = e.getSource();
        if (event == reportesMenuIFrame.generarPDF){
            reportesMenuIFrame.generarPDF.setBorder(null);
        } else if (event == reportesMenuIFrame.verReportes) {
            reportesMenuIFrame.verReportes.setBorder(null);
        }
    }
}
