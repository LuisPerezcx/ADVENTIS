package Views;


import Controller.ControladorCrearCatalogoIFrame;
import Views.celdaAcciones.TableAccionCellEditor;
import Views.celdaAcciones.TableActionCellRender;

/**
 *
 * @author david
 */
public class CrearCatalogoIFrame extends javax.swing.JInternalFrame {

    private final VentanaPrincipal ventanaPrincipal;

    /**
     * Creates new form VerEmpleadosIFrame
     */
    public CrearCatalogoIFrame(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        initComponents();
        addListeners();
        tablaEstilo();
    }


    private void tablaEstilo(){
        TableActionCellRender tableActionCellRender = new TableActionCellRender(ventanaPrincipal,tblAuditorias);
        TableAccionCellEditor tableAccionCellEditor = new TableAccionCellEditor(ventanaPrincipal,tblAuditorias);
        tableAccionCellEditor.panelAcciones.agregarBtnTable.setVisible(false);
        tableActionCellRender.panelAcciones.agregarBtnTable.setVisible(false);
        tableActionCellRender.panelAcciones.abrirBtnTable.setVisible(false);
        tableAccionCellEditor.panelAcciones.abrirBtnTable.setVisible(false);

        tableActionCellRender.panelAcciones.excelBtnTable.setVisible(false);
        tableAccionCellEditor.panelAcciones.excelBtnTable.setVisible(false);
        tableActionCellRender.panelAcciones.pdfBtnTable.setVisible(false);
        tableAccionCellEditor.panelAcciones.pdfBtnTable.setVisible(false);
        tblAuditorias.getColumnModel().getColumn(2).setCellRenderer(tableActionCellRender);
        tblAuditorias.getColumnModel().getColumn(2).setCellEditor(tableAccionCellEditor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblImagenEjemplo = new javax.swing.JLabel();
        lblCriterio = new javax.swing.JLabel();
        lblIndice = new javax.swing.JLabel();
        txtCriterio = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtIndice = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAuditorias = new javax.swing.JTable();
        btnAceptar = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Crear auditoria");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        lblTitulo.setFont(new java.awt.Font("Axia", 3, 48)); // NOI18N
        lblTitulo.setText("Crear auditoria");

        lblImagenEjemplo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ej22.png"))); // NOI18N

        lblCriterio.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblCriterio.setText("Criterio");

        lblIndice.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblIndice.setText("Indice");

        txtCriterio.setBackground(new java.awt.Color(238, 238, 238));
        txtCriterio.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        txtCriterio.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        txtIndice.setBackground(new java.awt.Color(238, 238, 238));
        txtIndice.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        txtIndice.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_add_25px.png"))); // NOI18N

        tblAuditorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Indice", "Criterio", "Accion"
            }
        ));
        tblAuditorias.setRowHeight(50);
        jScrollPane1.setViewportView(tblAuditorias);

        btnAceptar.setBackground(new java.awt.Color(96, 133, 188));
        btnAceptar.setFont(new java.awt.Font("Axia", 3, 24)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAceptar.setText("Aceptar");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblImagenEjemplo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(lblIndice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCriterio))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(txtCriterio, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
                        .addGap(72, 72, 72)
                        .addComponent(btnAgregar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(528, 528, 528)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(392, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblImagenEjemplo)
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCriterio)
                            .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIndice)))
                    .addComponent(btnAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(btnAceptar)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1177, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1113, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btnAceptar;
    public javax.swing.JLabel btnAgregar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCriterio;
    private javax.swing.JLabel lblImagenEjemplo;
    private javax.swing.JLabel lblIndice;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblAuditorias;
    private javax.swing.JTextField txtCriterio;
    private javax.swing.JTextField txtIndice;
    // End of variables declaration//GEN-END:variables

    private void addListeners(){
        ControladorCrearCatalogoIFrame controladorCrearCatalogoIFrame = new ControladorCrearCatalogoIFrame(this,ventanaPrincipal);
        btnAceptar.addMouseListener(controladorCrearCatalogoIFrame);
        btnAgregar.addMouseListener(controladorCrearCatalogoIFrame);
    }
}
