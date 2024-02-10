package Views;

import Controller.ControladorVerEmpleadosIFrame;
import Views.celdaAcciones.TableAccionCellEditor;
import Views.celdaAcciones.TableActionCellRender;



/**
 *
 * @author david
 */
public class VerEmpleadosIFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form VerEmpleadosIFrame
     */
    public VerEmpleadosIFrame() {
        initComponents();
        tablaEstilo();
        addListeners();
    }

    private void tablaEstilo(){
        TableActionCellRender tableActionCellRender = new TableActionCellRender();
        TableAccionCellEditor tableAccionCellEditor = new TableAccionCellEditor();
        tableAccionCellEditor.panelAcciones.pdfBtnTable.setVisible(false);
        tableActionCellRender.panelAcciones.pdfBtnTable.setVisible(false);
        tableActionCellRender.panelAcciones.agregarBtnTable.setVisible(false);
        tableAccionCellEditor.panelAcciones.agregarBtnTable.setVisible(false);
        tableActionCellRender.panelAcciones.abrirBtnTable.setVisible(false);
        tableAccionCellEditor.panelAcciones.abrirBtnTable.setVisible(false);
        tablaEmpleados.getColumnModel().getColumn(1).setCellRenderer(tableActionCellRender);
        tablaEmpleados.getColumnModel().getColumn(1).setCellEditor(tableAccionCellEditor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        buscar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();

        setClosable(true);
        setTitle("Ver empleados");

        titulo.setFont(new java.awt.Font("Axia", 3, 48)); // NOI18N
        titulo.setText("Ver empleados");

        jTextField1.setBackground(new java.awt.Color(238, 238, 238));
        jTextField1.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        jTextField1.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        buscar.setBackground(new java.awt.Color(96, 133, 188));
        buscar.setFont(new java.awt.Font("Axia", 3, 24)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscar.setText("Buscar");
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buscar.setOpaque(true);

        tablaEmpleados.setAutoCreateRowSorter(true);
        tablaEmpleados.setFont(new java.awt.Font("Axia", 0, 18)); // NOI18N
        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre empleado", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaEmpleados.setRowHeight(50);
        tablaEmpleados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaEmpleados.setShowGrid(true);
        jScrollPane1.setViewportView(tablaEmpleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(388, 388, 388))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addGap(18, 18, 18)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel buscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
    private void addListeners(){
        ControladorVerEmpleadosIFrame controladorVerEmpleadosIFrame = new ControladorVerEmpleadosIFrame(this);
        buscar.addMouseListener(controladorVerEmpleadosIFrame);
    }
}
