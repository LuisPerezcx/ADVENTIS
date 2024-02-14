package Views.celdaAcciones;

import javax.swing.*;
import java.awt.*;

public class TableAccionCellEditor extends DefaultCellEditor {
    public PanelAcciones panelAcciones;
    public TableAccionCellEditor(JTable table) {
        super(new JCheckBox());
        panelAcciones = new PanelAcciones(table);
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        panelAcciones.setBackground(table.getSelectionBackground());
        return panelAcciones;
    }
}
