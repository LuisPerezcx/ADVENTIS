package Views;


import Controller.ControladorRegistroComponentesIFrame;

/**
 *
 * @author david
 */
public class RegistroComponentesIFrame extends javax.swing.JInternalFrame {

    private final VentanaPrincipal ventanaPrincipal;
    /**
     * Creates new form VerEmpleadosIFrame
     */
    public RegistroComponentesIFrame(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        initComponents();
        addListeners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDescripcionComponentes = new javax.swing.JLabel();
        lblFabricanteComponentes = new javax.swing.JLabel();
        txtDescripcionComponentes = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNombreComponentes = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtFabricanteComponente = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(700, 0), new java.awt.Dimension(700, 0), new java.awt.Dimension(700, 32767));
        txtBuscarComponente = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Registro de tipo de componentes ");

        lblTitulo.setFont(new java.awt.Font("Axia", 3, 48)); // NOI18N
        lblTitulo.setText("Registro de tipo de componentes");

        lblNombre.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblNombre.setText("Nombre:");

        lblDescripcionComponentes.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblDescripcionComponentes.setText("Descripcion:");

        lblFabricanteComponentes.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblFabricanteComponentes.setText("Fabricante:");

        txtDescripcionComponentes.setBackground(new java.awt.Color(238, 238, 238));
        txtDescripcionComponentes.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        txtDescripcionComponentes.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        txtNombreComponentes.setBackground(new java.awt.Color(238, 238, 238));
        txtNombreComponentes.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        txtNombreComponentes.setBorder(null);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        txtFabricanteComponente.setBackground(new java.awt.Color(238, 238, 238));
        txtFabricanteComponente.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        txtFabricanteComponente.setBorder(null);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        btnGuardar.setBackground(new java.awt.Color(96, 133, 188));
        btnGuardar.setFont(new java.awt.Font("Axia", 3, 36)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        jLabel4.setText("Lista de tipo de componentes");

        jTable1.setFont(new java.awt.Font("Axia", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Fabricante", "Descripción"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        txtBuscarComponente.setBackground(new java.awt.Color(238, 238, 238));
        txtBuscarComponente.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        txtBuscarComponente.setBorder(null);

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        btnBuscar.setBackground(new java.awt.Color(96, 133, 188));
        btnBuscar.setFont(new java.awt.Font("Axia", 3, 24)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(582, 582, 582))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFabricanteComponentes)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblDescripcionComponentes))
                                .addGap(121, 121, 121)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator3)
                                    .addComponent(txtDescripcionComponentes, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(jSeparator2)
                                    .addComponent(txtFabricanteComponente, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(txtNombreComponentes)
                                    .addComponent(jSeparator1))))
                        .addGap(454, 454, 454))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(499, 499, 499))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(572, 572, 572))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtBuscarComponente, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(lblTitulo)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitulo)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFabricanteComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFabricanteComponentes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcionComponentes)
                    .addComponent(txtDescripcionComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtBuscarComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btnBuscar;
    public javax.swing.JLabel btnGuardar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDescripcionComponentes;
    private javax.swing.JLabel lblFabricanteComponentes;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JTextField txtBuscarComponente;
    public javax.swing.JTextField txtDescripcionComponentes;
    public javax.swing.JTextField txtFabricanteComponente;
    public javax.swing.JTextField txtNombreComponentes;
    // End of variables declaration//GEN-END:variables

    private void addListeners(){
        ControladorRegistroComponentesIFrame controladorRegistroComponentesIFrame = new ControladorRegistroComponentesIFrame(this);
        btnGuardar.addMouseListener(controladorRegistroComponentesIFrame);
        btnBuscar.addMouseListener(controladorRegistroComponentesIFrame);
    }
}
