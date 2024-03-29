/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views.celdaAcciones;

import Views.VentanaPrincipal;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

/**
 *
 * @author david
 */
public class TableActionCellRender extends DefaultTableCellRenderer {
    public PanelAcciones panelAcciones;

    public TableActionCellRender(VentanaPrincipal ventanaPrincipal, JTable table) {
        panelAcciones = new PanelAcciones(ventanaPrincipal,table);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component comp =  super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if(!isSelected && row % 2 == 0){
            panelAcciones.setBackground(Color.WHITE);
        }else{
            panelAcciones.setBackground(comp.getBackground());
        }
        return  panelAcciones;
    }
}
