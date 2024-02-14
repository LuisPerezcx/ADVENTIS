package Views.celdaAcciones;

import Views.VentanaPrincipal;

import javax.swing.*;
import java.awt.*;

public class TableAccionCellEditor extends DefaultCellEditor {
    public PanelAcciones panelAcciones;
    public TableAccionCellEditor(VentanaPrincipal ventanaPrincipal, JTable table) {
        super(new JCheckBox());
        panelAcciones = new PanelAcciones(ventanaPrincipal, table);
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        panelAcciones.setBackground(table.getSelectionBackground());
        return panelAcciones;
    }
}
