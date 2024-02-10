package Views;


import Controller.ControladorRevisionAuditoriasIFrame;
import Views.celdaAcciones.TableAccionCellEditor;
import Views.celdaAcciones.TableActionCellRender;

/**
 *
 * @author david
 */
public class RevisionAuditoriasIFrame extends javax.swing.JInternalFrame {

    private final VentanaPrincipal ventanaPrincipal;

    /**
     * Creates new form VerEmpleadosIFrame
     */
    public RevisionAuditoriasIFrame(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        initComponents();
        addListeners();
        tablaEstilo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloRevision = new javax.swing.JLabel();
        btnRevisar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaAuditorias = new javax.swing.JTable();
        lblLista = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Ver empleados");

        lblTituloRevision.setFont(new java.awt.Font("Axia", 3, 48)); // NOI18N
        lblTituloRevision.setText("Revision auditorias");

        btnRevisar.setBackground(new java.awt.Color(96, 133, 188));
        btnRevisar.setFont(new java.awt.Font("Axia", 3, 24)); // NOI18N
        btnRevisar.setForeground(new java.awt.Color(255, 255, 255));
        btnRevisar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRevisar.setText("Revisar");
        btnRevisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRevisar.setOpaque(true);

        tblListaAuditorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Numero", "Fecha", "Accion"
            }
        ));
        tblListaAuditorias.setRowHeight(50);
        jScrollPane1.setViewportView(tblListaAuditorias);

        lblLista.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblLista.setText("Lista de auditorias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(lblTituloRevision))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRevisar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(557, 557, 557))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblLista)
                        .addGap(534, 534, 534))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTituloRevision)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(lblLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnRevisar)
                .addGap(129, 129, 129))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaEstilo(){
        TableActionCellRender tableActionCellRender = new TableActionCellRender();
        TableAccionCellEditor tableAccionCellEditor = new TableAccionCellEditor();
        tableAccionCellEditor.panelAcciones.agregarBtnTable.setVisible(false);
        tableActionCellRender.panelAcciones.agregarBtnTable.setVisible(false);
        tableActionCellRender.panelAcciones.abrirBtnTable.setVisible(false);
        tableAccionCellEditor.panelAcciones.abrirBtnTable.setVisible(false);
        tableAccionCellEditor.panelAcciones.editarBtnTable1.setVisible(false);
        
        tableActionCellRender.panelAcciones.editarBtnTable1.setVisible(false);
        tableActionCellRender.panelAcciones.eliminarBtnTable.setVisible(false);
        tableAccionCellEditor.panelAcciones.eliminarBtnTable.setVisible(false);
        tblListaAuditorias.getColumnModel().getColumn(3).setCellRenderer(tableActionCellRender);
        tblListaAuditorias.getColumnModel().getColumn(3).setCellEditor(tableAccionCellEditor);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btnRevisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLista;
    private javax.swing.JLabel lblTituloRevision;
    private javax.swing.JTable tblListaAuditorias;
    // End of variables declaration//GEN-END:variables

    private void addListeners(){
        ControladorRevisionAuditoriasIFrame controladorRevisionAuditoriasIFrame = new ControladorRevisionAuditoriasIFrame(this);
        btnRevisar.addMouseListener(controladorRevisionAuditoriasIFrame);
    }
}
