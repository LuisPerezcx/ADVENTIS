package Controller;

import Views.celdaAcciones.PanelAcciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorPanelAcciones implements MouseListener {
    private final PanelAcciones panelAcciones;
    private final JTable tablaAccion;
    public ControladorPanelAcciones(PanelAcciones panelAcciones,JTable table){
        this.panelAcciones = panelAcciones;
        this.tablaAccion = table;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(tablaAccion);
        String iFrameTitulo = tituloIFrame(tablaAccion);
        System.out.println(iFrameTitulo);

        Object event = e.getSource();
        if (event == panelAcciones.editarBtnTable1){
            switch (iFrameTitulo){
                case "Ver empleados"-> System.out.println("editar accion  desde ver empleados");
            }
        } else if (event == panelAcciones.eliminarBtnTable) {
            switch (iFrameTitulo){
                case "Ver empleados"-> System.out.println("eliminar accion  desde ver empleados");
            }
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

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    public String tituloIFrame(Component comp) {
        Container parent = SwingUtilities.getAncestorOfClass(JInternalFrame.class, comp);
        if (parent != null) {
            JInternalFrame internalFrame = (JInternalFrame) parent;
            return internalFrame.getTitle();
        }
        System.out.println("ERROR NO SE ENCONTRO EL IFRAME");
        return null;
    }
}
