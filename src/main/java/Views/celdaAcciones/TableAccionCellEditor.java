package Views.celdaAcciones;

import javax.swing.*;
import java.awt.*;

public class TableAccionCellEditor extends DefaultCellEditor {
    public PanelAcciones panelAcciones;

    public TableAccionCellEditor() {
        super(new JCheckBox());
        panelAcciones = new PanelAcciones();
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        panelAcciones.setBackground(table.getSelectionBackground());
        return panelAcciones;
    }
}
