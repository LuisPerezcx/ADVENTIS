/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controller.ControladorLogin;

/**
 *
 * @author david
 */
public class Login extends javax.swing.JFrame {

   int xMause, yMause;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        addListeners();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //no borrar hacia abajo
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        imgTurbinas = new javax.swing.JLabel();
        fondoAzul = new javax.swing.JLabel();
        pnlArriba = new javax.swing.JPanel();
        lblAdventis = new javax.swing.JLabel();
        panelForm = new javax.swing.JPanel();
        iniciarSesionLbl = new javax.swing.JLabel();
        usuarioLbl1 = new javax.swing.JLabel();
        usuarioTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        usuarioLbl = new javax.swing.JLabel();
        paswordField = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        ingresarBtn = new javax.swing.JButton();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoAdventis..png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adventis");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgTurbinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgLogin.png"))); // NOI18N
        getContentPane().add(imgTurbinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 330, 500));

        fondoAzul.setBackground(new java.awt.Color(255, 255, 255));
        fondoAzul.setOpaque(true);
        getContentPane().add(fondoAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, -40, 320, 540));

        pnlArriba.setBackground(new java.awt.Color(255, 255, 255));

        lblAdventis.setBackground(new java.awt.Color(255, 255, 255));
        lblAdventis.setFont(new java.awt.Font("Axia", 1, 48)); // NOI18N
        lblAdventis.setForeground(new java.awt.Color(31, 54, 133));
        lblAdventis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdventis.setText("ADVENTIS");
        lblAdventis.setOpaque(true);

        javax.swing.GroupLayout pnlArribaLayout = new javax.swing.GroupLayout(pnlArriba);
        pnlArriba.setLayout(pnlArribaLayout);
        pnlArribaLayout.setHorizontalGroup(
            pnlArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArribaLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(lblAdventis, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addGap(112, 112, 112))
        );
        pnlArribaLayout.setVerticalGroup(
            pnlArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAdventis, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        getContentPane().add(pnlArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 130));

        panelForm.setBackground(new java.awt.Color(255, 255, 255));

        iniciarSesionLbl.setFont(new java.awt.Font("Axia", 1, 36)); // NOI18N
        iniciarSesionLbl.setText("INICIAR SESIÓN");

        usuarioLbl1.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        usuarioLbl1.setText("Usuario");

        usuarioTxt.setFont(new java.awt.Font("Axia", 0, 18)); // NOI18N
        usuarioTxt.setForeground(new java.awt.Color(204, 204, 204));
        usuarioTxt.setText("Ingrese su nombre de usuario");
        usuarioTxt.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        usuarioLbl.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        usuarioLbl.setText("Contraseña");

        paswordField.setForeground(new java.awt.Color(204, 204, 204));
        paswordField.setText("********");
        paswordField.setBorder(null);
        paswordField.setPreferredSize(new java.awt.Dimension(221, 22));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        ingresarBtn.setBackground(new java.awt.Color(31, 54, 133));
        ingresarBtn.setFont(new java.awt.Font("Axia", 3, 18)); // NOI18N
        ingresarBtn.setForeground(new java.awt.Color(255, 255, 255));
        ingresarBtn.setText("Ingresar");
        ingresarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ingresarBtn.setFocusPainted(false);

        javax.swing.GroupLayout panelFormLayout = new javax.swing.GroupLayout(panelForm);
        panelForm.setLayout(panelFormLayout);
        panelFormLayout.setHorizontalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createSequentialGroup()
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFormLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(iniciarSesionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(paswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usuarioTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                                .addComponent(usuarioLbl1)
                                .addComponent(jSeparator1)
                                .addComponent(usuarioLbl)
                                .addComponent(jSeparator2)))))
                .addGap(0, 65, Short.MAX_VALUE))
            .addGroup(panelFormLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(ingresarBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFormLayout.setVerticalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(iniciarSesionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuarioLbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuarioLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(ingresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(panelForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 480, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //no borrar hacia abajo
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondoAzul;
    private javax.swing.JLabel imgTurbinas;
    public javax.swing.JButton ingresarBtn;
    private javax.swing.JLabel iniciarSesionLbl;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAdventis;
    private javax.swing.JPanel panelForm;
    public javax.swing.JPasswordField paswordField;
    private javax.swing.JPanel pnlArriba;
    private javax.swing.JLabel usuarioLbl;
    private javax.swing.JLabel usuarioLbl1;
    public javax.swing.JTextField usuarioTxt;
    // End of variables declaration//GEN-END:variables

    private void addListeners(){
        ControladorLogin controladorLogin = new ControladorLogin(this);
        ingresarBtn.addActionListener(controladorLogin);
        usuarioTxt.addMouseListener(controladorLogin);
        paswordField.addMouseListener(controladorLogin);
    }
}
