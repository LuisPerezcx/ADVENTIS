package Views;


import Controller.ControladorGenerarAuditoriaIFrame;
import Controller.ControladorRegistroHerramientasIFrame;

/**
 *
 * @author david
 */
public class GenerarAuditoriaIFrame extends javax.swing.JInternalFrame {

    private VentanaPrincipal ventanaPrincipal;

    /**
     * Creates new form VerEmpleadosIFrame
     */
    public GenerarAuditoriaIFrame(VentanaPrincipal ventanaPrincipal) {
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

        titulo = new javax.swing.JLabel();
        lblComponente = new javax.swing.JLabel();
        lblCentroSAP = new javax.swing.JLabel();
        comboComponente = new javax.swing.JComboBox<>();
        comboCentroSAP = new javax.swing.JComboBox<>();
        btnGenerar = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Ver empleados");

        titulo.setFont(new java.awt.Font("Axia", 3, 48)); // NOI18N
        titulo.setText("Generar auditoria");

        lblComponente.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblComponente.setText("Componente:");

        lblCentroSAP.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblCentroSAP.setText("Centro SAP:");

        comboComponente.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        comboComponente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboCentroSAP.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        comboCentroSAP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnGenerar.setBackground(new java.awt.Color(96, 133, 188));
        btnGenerar.setFont(new java.awt.Font("Axia", 3, 36)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGenerar.setText("Generar");
        btnGenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerar.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComponente)
                            .addComponent(lblCentroSAP))
                        .addGap(246, 246, 246)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboCentroSAP, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboComponente, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(449, 449, 449)
                        .addComponent(titulo)))
                .addContainerGap(292, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(536, 536, 536))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(titulo)
                .addGap(167, 167, 167)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCentroSAP)
                    .addComponent(comboCentroSAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComponente)
                    .addComponent(comboComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(154, 154, 154)
                .addComponent(btnGenerar)
                .addGap(115, 115, 115))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btnGenerar;
    public javax.swing.JComboBox<String> comboCentroSAP;
    public javax.swing.JComboBox<String> comboComponente;
    private javax.swing.JLabel lblCentroSAP;
    private javax.swing.JLabel lblComponente;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private void addListeners(){
        ControladorGenerarAuditoriaIFrame controladorGenerarAuditoriaIFrame = new ControladorGenerarAuditoriaIFrame(this,ventanaPrincipal);
        btnGenerar.addMouseListener(controladorGenerarAuditoriaIFrame);
    }
}
