/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import java.awt.*;
import javax.swing.*;
import java.beans.PropertyVetoException;

import Controller.ControladorVentanaPrincipal;
import Theme.Imagen;

/**
 *
 * @author david
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        addListeners();
        setSize(new Dimension(1430, 820));
        setResizable(false);
        setTitle("ADVENTIS");
        setVisible(true);
        setLocationRelativeTo(null);
        //setExtendedState(MAXIMIZED_BOTH);
        //repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraMenu = new javax.swing.JPanel();
        reportesBMenu = new javax.swing.JLabel();
        herramientasBMenu = new javax.swing.JLabel();
        auditoriasBMenu = new javax.swing.JLabel();
        perfilBMenu = new javax.swing.JLabel();
        empleadosBMenu = new javax.swing.JLabel();
        contenedorDesktokPnl = new javax.swing.JPanel(new BorderLayout());
        Image imagen = new ImageIcon(getClass().getResource("/Images/adventisbk.png")).getImage();
        desktopPnl = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g) {
                g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            }
        };
        menuBar = new javax.swing.JMenuBar();
        EmpleadosMenu = new javax.swing.JMenu();
        rUsuariosItem = new javax.swing.JMenuItem();
        rEmpleadosItem = new javax.swing.JMenuItem();
        verUsuariosItem = new javax.swing.JMenuItem();
        verEmpleadosItem = new javax.swing.JMenuItem();
        herramientasMenu = new javax.swing.JMenu();
        rHerramientasItem = new javax.swing.JMenuItem();
        verHerramientasItem = new javax.swing.JMenuItem();
        prestarHerramientasItem = new javax.swing.JMenuItem();
        solicitarHerramientaItem = new javax.swing.JMenuItem();
        rTipoHerramientaItem = new javax.swing.JMenuItem();
        rTipoComponente = new javax.swing.JMenuItem();
        AuditoriasMenu = new javax.swing.JMenu();
        generarAuditoriasItem = new javax.swing.JMenuItem();
        verAuditoriasItem = new javax.swing.JMenuItem();
        reportesMenu = new javax.swing.JMenu();
        verReportesItem = new javax.swing.JMenuItem();
        generarPDFitem = new javax.swing.JMenuItem();
        perfilMenu = new javax.swing.JMenu();
        verPerfilItem = new javax.swing.JMenuItem();
        cerrarSesionItem = new javax.swing.JMenuItem();
        salirItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADVENTIS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(242, 242, 242));
        setPreferredSize(new java.awt.Dimension(1460, 820));

        BarraMenu.setBackground(new java.awt.Color(31, 61, 115));

        reportesBMenu.setBackground(new java.awt.Color(31, 61, 115));
        reportesBMenu.setFont(new java.awt.Font("Axia", 1, 24)); // NOI18N
        reportesBMenu.setForeground(new java.awt.Color(255, 255, 255));
        reportesBMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_documents_50px.png"))); // NOI18N
        reportesBMenu.setText("Reportes");
        reportesBMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        herramientasBMenu.setBackground(new java.awt.Color(31, 61, 115));
        herramientasBMenu.setFont(new java.awt.Font("Axia", 1, 24)); // NOI18N
        herramientasBMenu.setForeground(new java.awt.Color(255, 255, 255));
        herramientasBMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Tools_50px.png"))); // NOI18N
        herramientasBMenu.setText("Herramientas");
        herramientasBMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        auditoriasBMenu.setBackground(new java.awt.Color(31, 61, 115));
        auditoriasBMenu.setFont(new java.awt.Font("Axia", 1, 24)); // NOI18N
        auditoriasBMenu.setForeground(new java.awt.Color(255, 255, 255));
        auditoriasBMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_audit_50px.png"))); // NOI18N
        auditoriasBMenu.setText("Auditorias");
        auditoriasBMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        perfilBMenu.setBackground(new java.awt.Color(31, 61, 115));
        perfilBMenu.setFont(new java.awt.Font("Axia", 1, 24)); // NOI18N
        perfilBMenu.setForeground(new java.awt.Color(255, 255, 255));
        perfilBMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_User_Menu_Male_50px.png"))); // NOI18N
        perfilBMenu.setText("Mi perfil");
        perfilBMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        empleadosBMenu.setBackground(new java.awt.Color(31, 61, 115));
        empleadosBMenu.setFont(new java.awt.Font("Axia", 1, 24)); // NOI18N
        empleadosBMenu.setForeground(new java.awt.Color(255, 255, 255));
        empleadosBMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Member_50px.png"))); // NOI18N
        empleadosBMenu.setText("Empleados");
        empleadosBMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BarraMenuLayout = new javax.swing.GroupLayout(BarraMenu);
        BarraMenu.setLayout(BarraMenuLayout);
        BarraMenuLayout.setHorizontalGroup(
            BarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportesBMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(auditoriasBMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(perfilBMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(herramientasBMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(empleadosBMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BarraMenuLayout.setVerticalGroup(
            BarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraMenuLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(empleadosBMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(herramientasBMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(auditoriasBMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(reportesBMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(perfilBMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        desktopPnl.setName(""); // NOI18N
        desktopPnl.setPreferredSize(new java.awt.Dimension(1194, 903));

        javax.swing.GroupLayout desktopPnlLayout = new javax.swing.GroupLayout(desktopPnl);
        desktopPnl.setLayout(desktopPnlLayout);
        desktopPnlLayout.setHorizontalGroup(
            desktopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1225, Short.MAX_VALUE)
        );
        desktopPnlLayout.setVerticalGroup(
            desktopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contenedorDesktokPnlLayout = new javax.swing.GroupLayout(contenedorDesktokPnl);
        contenedorDesktokPnl.setLayout(contenedorDesktokPnlLayout);
        contenedorDesktokPnlLayout.setHorizontalGroup(
            contenedorDesktokPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDesktokPnlLayout.createSequentialGroup()
                .addComponent(desktopPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 1225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        contenedorDesktokPnlLayout.setVerticalGroup(
            contenedorDesktokPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDesktokPnlLayout.createSequentialGroup()
                .addComponent(desktopPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuBar.setOpaque(true);

        EmpleadosMenu.setText("Empleados");
        EmpleadosMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rUsuariosItem.setText("Registrar usuarios");
        rUsuariosItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EmpleadosMenu.add(rUsuariosItem);

        rEmpleadosItem.setText("Registrar empleados");
        rEmpleadosItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EmpleadosMenu.add(rEmpleadosItem);

        verUsuariosItem.setText("Ver usuarios");
        verUsuariosItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EmpleadosMenu.add(verUsuariosItem);

        verEmpleadosItem.setText("Ver empleados");
        verEmpleadosItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verEmpleadosItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verEmpleadosItemActionPerformed(evt);
            }
        });
        EmpleadosMenu.add(verEmpleadosItem);

        menuBar.add(EmpleadosMenu);

        herramientasMenu.setText("Herramientas");
        herramientasMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rHerramientasItem.setText("Registrar herramientas");
        herramientasMenu.add(rHerramientasItem);

        verHerramientasItem.setText("Ver herramientas");
        herramientasMenu.add(verHerramientasItem);

        prestarHerramientasItem.setText("Prestar herramientas");
        herramientasMenu.add(prestarHerramientasItem);

        solicitarHerramientaItem.setText("Solicitar herramientas");
        herramientasMenu.add(solicitarHerramientaItem);

        rTipoHerramientaItem.setText("Registrar tipo de herramienta");
        herramientasMenu.add(rTipoHerramientaItem);

        rTipoComponente.setText("Registrar tipo de componente");
        herramientasMenu.add(rTipoComponente);

        menuBar.add(herramientasMenu);

        AuditoriasMenu.setText("Auditorias");
        AuditoriasMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        generarAuditoriasItem.setText("Generar auditorias");
        AuditoriasMenu.add(generarAuditoriasItem);

        verAuditoriasItem.setText("Ver auditorias");
        AuditoriasMenu.add(verAuditoriasItem);

        menuBar.add(AuditoriasMenu);

        reportesMenu.setText("Reportes");
        reportesMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        verReportesItem.setText("Ver Reportes");
        verReportesItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportesMenu.add(verReportesItem);

        generarPDFitem.setText("Generar PDF");
        generarPDFitem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportesMenu.add(generarPDFitem);

        menuBar.add(reportesMenu);
        menuBar.add(Box.createHorizontalGlue());

        //para el icono de perfilMenu
        Imagen imagenPerfil;
        ImageIcon iconoPerfil;
        imagenPerfil = new Imagen(0,0,"Images/icons8_User_Menu_Male_80px_1.png");
        imagenPerfil.redimensionar(25,25);
        iconoPerfil = new ImageIcon();
        iconoPerfil.setImage(imagenPerfil.getImagen());
        perfilMenu.setIcon(iconoPerfil);
        perfilMenu.setText("");
        perfilMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        verPerfilItem.setText("Ver perfil");
        verPerfilItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        perfilMenu.add(verPerfilItem);

        cerrarSesionItem.setText("Cerrar sesión");
        cerrarSesionItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        perfilMenu.add(cerrarSesionItem);

        salirItem.setText("Salir de la aplicacion");
        salirItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        perfilMenu.add(salirItem);

        menuBar.add(perfilMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BarraMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contenedorDesktokPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BarraMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contenedorDesktokPnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verEmpleadosItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verEmpleadosItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verEmpleadosItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AuditoriasMenu;
    private javax.swing.JPanel BarraMenu;
    private javax.swing.JMenu EmpleadosMenu;
    public javax.swing.JLabel auditoriasBMenu;
    public javax.swing.JMenuItem cerrarSesionItem;
    private javax.swing.JPanel contenedorDesktokPnl;
    public javax.swing.JDesktopPane desktopPnl;
    public javax.swing.JLabel empleadosBMenu;
    public javax.swing.JMenuItem generarAuditoriasItem;
    public javax.swing.JMenuItem generarPDFitem;
    public javax.swing.JLabel herramientasBMenu;
    private javax.swing.JMenu herramientasMenu;
    private javax.swing.JMenuBar menuBar;
    public javax.swing.JLabel perfilBMenu;
    private javax.swing.JMenu perfilMenu;
    public javax.swing.JMenuItem prestarHerramientasItem;
    public javax.swing.JMenuItem rEmpleadosItem;
    public javax.swing.JMenuItem rHerramientasItem;
    public javax.swing.JMenuItem rTipoComponente;
    public javax.swing.JMenuItem rTipoHerramientaItem;
    public javax.swing.JMenuItem rUsuariosItem;
    public javax.swing.JLabel reportesBMenu;
    private javax.swing.JMenu reportesMenu;
    public javax.swing.JMenuItem salirItem;
    public javax.swing.JMenuItem solicitarHerramientaItem;
    public javax.swing.JMenuItem verAuditoriasItem;
    public javax.swing.JMenuItem verEmpleadosItem;
    public javax.swing.JMenuItem verHerramientasItem;
    public javax.swing.JMenuItem verPerfilItem;
    public javax.swing.JMenuItem verReportesItem;
    public javax.swing.JMenuItem verUsuariosItem;
    // End of variables declaration//GEN-END:variables
    private void addListeners(){
        ControladorVentanaPrincipal controladorVentanaPrincipal = new ControladorVentanaPrincipal(this);
        rUsuariosItem.addActionListener(controladorVentanaPrincipal);
        rEmpleadosItem.addActionListener(controladorVentanaPrincipal);
        empleadosBMenu.addMouseListener(controladorVentanaPrincipal);
        herramientasBMenu.addMouseListener(controladorVentanaPrincipal);
        auditoriasBMenu.addMouseListener(controladorVentanaPrincipal);
        reportesBMenu.addMouseListener(controladorVentanaPrincipal);
        perfilBMenu.addMouseListener(controladorVentanaPrincipal);
        verEmpleadosItem.addActionListener(controladorVentanaPrincipal);
        verUsuariosItem.addActionListener(controladorVentanaPrincipal);
        rHerramientasItem.addActionListener(controladorVentanaPrincipal);
        generarAuditoriasItem.addActionListener(controladorVentanaPrincipal);

    }
    public void dibujarVista(JInternalFrame internal){
        cerrarIFrames();
        if (!internal.isVisible()) {
            try {
                internal.setMaximum(true);
            } catch (PropertyVetoException e) {
                throw new RuntimeException(e);
            }
            desktopPnl.add(internal);
            internal.setVisible(true);
        } else{
            internal.toFront();
        }
    }
    public void  cerrarIFrames() {
        Component[] components = desktopPnl.getComponents();
        for (Component component : components) {
            if (component instanceof JInternalFrame internalFrame) {
                try {
                    internalFrame.setClosed(true);
                } catch (Exception ex) {
                    System.out.println("No se pudo cerrar");
                    ex.printStackTrace();
                }
            }
        }
    }
}
