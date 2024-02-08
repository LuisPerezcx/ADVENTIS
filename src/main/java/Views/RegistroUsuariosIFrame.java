/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Views;

import Controller.ControladorRegistroUsuariosIFrame;

/**
 *
 * @author david
 */
public class RegistroUsuariosIFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistroUsuariosIFrame
     */
    public RegistroUsuariosIFrame() {
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
        lblUsuario = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        lblConfirmarContrasena = new javax.swing.JLabel();
        lblTipoUsr = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        contrasenaConfirmar = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        mostrarConfirmarContrasena = new javax.swing.JLabel();
        ocultarConfirmarContrasena = new javax.swing.JLabel();
        ocultarConfirmarContrasena.setVisible(false);
        comboTipoUsrs = new javax.swing.JComboBox<>();
        txtUsuario = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        guardar = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        contrasena = new javax.swing.JPasswordField();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel12 = new javax.swing.JPanel();
        mostrarContrasena = new javax.swing.JLabel();
        ocultarContrasena = new javax.swing.JLabel();
        ocultarContrasena.setVisible(false);

        setClosable(true);
        setTitle("Registro de usuarios");

        titulo.setFont(new java.awt.Font("Axia", 3, 48)); // NOI18N
        titulo.setText("Registro de usuarios");

        lblUsuario.setFont(new java.awt.Font("Axia", 3, 36)); // NOI18N
        lblUsuario.setText("Usuario:");

        lblContrasena.setFont(new java.awt.Font("Axia", 3, 36)); // NOI18N
        lblContrasena.setText("Contraseña:");

        lblConfirmarContrasena.setFont(new java.awt.Font("Axia", 3, 36)); // NOI18N
        lblConfirmarContrasena.setText("Confirmar contraseña:");

        lblTipoUsr.setFont(new java.awt.Font("Axia", 3, 36)); // NOI18N
        lblTipoUsr.setText("Tipo de usuario:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_lock_25px_1.png"))); // NOI18N

        contrasenaConfirmar.setBackground(new java.awt.Color(238, 238, 238));
        contrasenaConfirmar.setFont(new java.awt.Font("Axia", 0, 36)); // NOI18N
        contrasenaConfirmar.setBorder(null);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostrarConfirmarContrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_eye_25px.png"))); // NOI18N
        mostrarConfirmarContrasena.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel8.add(mostrarConfirmarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        ocultarConfirmarContrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_hide_25px.png"))); // NOI18N
        ocultarConfirmarContrasena.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel8.add(ocultarConfirmarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 9, -1, -1));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contrasenaConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jSeparator3)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contrasenaConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        comboTipoUsrs.setBackground(new java.awt.Color(242, 242, 242));
        comboTipoUsrs.setFont(new java.awt.Font("Axia", 0, 36)); // NOI18N
        comboTipoUsrs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtUsuario.setBackground(new java.awt.Color(238, 238, 238));
        txtUsuario.setFont(new java.awt.Font("Axia", 0, 36)); // NOI18N
        txtUsuario.setBorder(null);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));

        guardar.setBackground(new java.awt.Color(96, 133, 188));
        guardar.setFont(new java.awt.Font("Axia", 3, 36)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guardar.setText("Guardar");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        guardar.setOpaque(true);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_lock_25px_1.png"))); // NOI18N

        contrasena.setBackground(new java.awt.Color(238, 238, 238));
        contrasena.setFont(new java.awt.Font("Axia", 0, 36)); // NOI18N
        contrasena.setBorder(null);

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostrarContrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_eye_25px.png"))); // NOI18N
        mostrarContrasena.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel12.add(mostrarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        ocultarContrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_hide_25px.png"))); // NOI18N
        ocultarContrasena.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel12.add(ocultarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 9, -1, -1));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contrasena)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jSeparator6)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConfirmarContrasena)
                    .addComponent(lblContrasena)
                    .addComponent(lblTipoUsr)
                    .addComponent(lblUsuario))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(comboTipoUsrs, javax.swing.GroupLayout.Alignment.LEADING, 0, 450, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsuario)
                    .addComponent(jSeparator4))
                .addContainerGap(209, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(393, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(397, 397, 397))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titulo)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContrasena)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblConfirmarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoUsr)
                    .addComponent(comboTipoUsrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(guardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboTipoUsrs;
    public javax.swing.JPasswordField contrasena;
    public javax.swing.JPasswordField contrasenaConfirmar;
    public javax.swing.JLabel guardar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblConfirmarContrasena;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblTipoUsr;
    private javax.swing.JLabel lblUsuario;
    public javax.swing.JLabel mostrarConfirmarContrasena;
    public javax.swing.JLabel mostrarContrasena;
    public javax.swing.JLabel ocultarConfirmarContrasena;
    public javax.swing.JLabel ocultarContrasena;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void addListeners(){
        ControladorRegistroUsuariosIFrame controladorRegistroUsuariosIFrame = new ControladorRegistroUsuariosIFrame(this);
        mostrarContrasena.addMouseListener(controladorRegistroUsuariosIFrame);
        ocultarContrasena.addMouseListener(controladorRegistroUsuariosIFrame);
        mostrarConfirmarContrasena.addMouseListener(controladorRegistroUsuariosIFrame);
        ocultarConfirmarContrasena.addMouseListener(controladorRegistroUsuariosIFrame);
        guardar.addMouseListener(controladorRegistroUsuariosIFrame);
    }
}
