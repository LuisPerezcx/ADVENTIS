package Views;

import Controller.ControladorSolicitarHerramientasIFrame;
import Controller.ControladorSolicitudesHerramientasIFrame;
import Controller.ControladorVerHerramientas;
import Views.celdaAcciones.TableAccionCellEditor;
import Views.celdaAcciones.TableActionCellRender;



/**
 *
 * @author david
 */
public class SolicitudesHerramientasIFrame extends javax.swing.JInternalFrame {
    private final VentanaPrincipal ventanaPrincipal;
    public SolicitudesHerramientasIFrame(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        initComponents();
        tablaEstilo();
        addListeners();
    }

    private void tablaEstilo(){
        TableActionCellRender tableActionCellRender = new TableActionCellRender();
        TableAccionCellEditor tableAccionCellEditor = new TableAccionCellEditor();
        tableActionCellRender.panelAcciones.agregarBtnTable.setVisible(false);
        tableAccionCellEditor.panelAcciones.agregarBtnTable.setVisible(false);
        tableActionCellRender.panelAcciones.eliminarBtnTable.setVisible(false);
        tableAccionCellEditor.panelAcciones.eliminarBtnTable.setVisible(false);
        tableAccionCellEditor.panelAcciones.editarBtnTable.setVisible(false);
        tableActionCellRender.panelAcciones.editarBtnTable.setVisible(false);
        tablaHerramientas.getColumnModel().getColumn(3).setCellRenderer(tableActionCellRender);
        tablaHerramientas.getColumnModel().getColumn(3).setCellEditor(tableAccionCellEditor);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHerramientas = new javax.swing.JTable();
        buscar = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Ver empleados");

        titulo.setFont(new java.awt.Font("Axia", 3, 48)); // NOI18N
        titulo.setText("Solicitudes de herramientas");

        jTextField1.setBackground(new java.awt.Color(238, 238, 238));
        jTextField1.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        jTextField1.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        tablaHerramientas.setAutoCreateRowSorter(true);
        tablaHerramientas.setFont(new java.awt.Font("Axia", 0, 18)); // NOI18N
        tablaHerramientas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Folio", "Fecha", "Nombre solicitante", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaHerramientas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaHerramientas.setRowHeight(50);
        tablaHerramientas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaHerramientas.setShowGrid(true);
        jScrollPane1.setViewportView(tablaHerramientas);

        buscar.setBackground(new java.awt.Color(96, 133, 188));
        buscar.setFont(new java.awt.Font("Axia", 3, 24)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscar.setText("Buscar");
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                        .addComponent(jSeparator1)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(476, 476, 476)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(647, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(154, 154, 154)
                    .addComponent(buscar)
                    .addContainerGap(706, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel buscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablaHerramientas;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
    private void addListeners(){
        ControladorSolicitudesHerramientasIFrame controladorSolicitudesHerramientasIFrame = new ControladorSolicitudesHerramientasIFrame(this);
        buscar.addMouseListener(controladorSolicitudesHerramientasIFrame);
    }
}