package Views;
import Controller.ControladorRegistroCamarasDigitalesIFrame;

import javax.swing.*;
import java.awt.*;


/**
 *
 * @author david
 */
public class RegistroCamarasDigitalesIFrame extends javax.swing.JInternalFrame {

    private final VentanaPrincipal ventanaPrincipal;

    /**
     * Creates new form VerEmpleadosIFrame
     */
    public RegistroCamarasDigitalesIFrame(VentanaPrincipal ventanaPrincipal) {
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
        txtMarca = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        guardar = new javax.swing.JLabel();
        lblUbicacion = new javax.swing.JLabel();
        lblResponsable = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblMarcaModelo = new javax.swing.JLabel();
        lblComentario = new javax.swing.JLabel();
        txtNumeroSeire = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaComentarios = new javax.swing.JTextArea();
        txtAreaComentarios.setLineWrap(true);
        txtAreaComentarios.setWrapStyleWord(true);
        JScrollPane scrollPaneDescripcion = new JScrollPane(txtAreaComentarios);
        scrollPaneDescripcion.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPaneDescripcion.setPreferredSize(new Dimension(150,50));
        lblNumeroSerie = new javax.swing.JLabel();
        comboUbicacion = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Registro de camaras digitales");

        titulo.setFont(new java.awt.Font("Axia", 3, 48)); // NOI18N
        titulo.setText("Registro de camaras digitales");

        txtMarca.setBackground(new java.awt.Color(238, 238, 238));
        txtMarca.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        txtMarca.setBorder(null);
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        guardar.setBackground(new java.awt.Color(96, 133, 188));
        guardar.setFont(new java.awt.Font("Axia", 3, 24)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guardar.setText("Guardar");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.setOpaque(true);

        lblUbicacion.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblUbicacion.setText("Ubicacion:");

        lblResponsable.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblResponsable.setText("Responsable:");

        txtResponsable.setBackground(new java.awt.Color(238, 238, 238));
        txtResponsable.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        txtResponsable.setBorder(null);
        txtResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResponsableActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        lblMarcaModelo.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblMarcaModelo.setText("Marca/Modelo:");

        lblComentario.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblComentario.setText("Comentarios:");

        txtNumeroSeire.setBackground(new java.awt.Color(238, 238, 238));
        txtNumeroSeire.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        txtNumeroSeire.setBorder(null);
        txtNumeroSeire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroSeireActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        txtAreaComentarios.setBackground(new java.awt.Color(238, 238, 238));
        txtAreaComentarios.setColumns(10);
        txtAreaComentarios.setFont(new java.awt.Font("Axia", 0, 14)); // NOI18N
        txtAreaComentarios.setRows(5);
        txtAreaComentarios.setBorder(null);
        jScrollPane1.setViewportView(txtAreaComentarios);

        lblNumeroSerie.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblNumeroSerie.setText("Numero de serie:");

        comboUbicacion.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        comboUbicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumeroSerie)
                    .addComponent(lblMarcaModelo)
                    .addComponent(lblUbicacion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroSeire, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComentario)
                            .addComponent(lblResponsable)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                        .addComponent(txtResponsable, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(316, 316, 316))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(442, 442, 442))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMarcaModelo)
                            .addComponent(lblComentario))
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblResponsable)
                                    .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNumeroSerie)
                                    .addComponent(txtNumeroSeire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUbicacion)
                            .addComponent(comboUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addComponent(guardar)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResponsableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResponsableActionPerformed

    private void txtNumeroSeireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroSeireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroSeireActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> comboUbicacion;
    public javax.swing.JLabel guardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblComentario;
    private javax.swing.JLabel lblMarcaModelo;
    private javax.swing.JLabel lblNumeroSerie;
    private javax.swing.JLabel lblResponsable;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextArea txtAreaComentarios;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNumeroSeire;
    private javax.swing.JTextField txtResponsable;
    // End of variables declaration//GEN-END:variables

    private void addListeners(){
        ControladorRegistroCamarasDigitalesIFrame controladorRegistroCamarasDigitalesIFrame = new ControladorRegistroCamarasDigitalesIFrame(this);
        guardar.addMouseListener(controladorRegistroCamarasDigitalesIFrame);
    }
}
