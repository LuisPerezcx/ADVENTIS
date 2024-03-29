package Views;

import Controller.ControladorRegistroHerramientasIFrame;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author david
 */
public class RegistroHerramientasIFrame extends javax.swing.JInternalFrame {
    private final VentanaPrincipal ventanaPrincipal;

    /**
     * Creates new form VerEmpleadosIFrame
     */
    public RegistroHerramientasIFrame(VentanaPrincipal ventanaPrincipal) {
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
        lblTipo = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblNumSerie = new javax.swing.JLabel();
        lblUbicacion = new javax.swing.JLabel();
        comboUnidadMedida = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNumSerie = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblCapacidad = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblFechaCalibracion = new javax.swing.JLabel();
        lblVerificacion = new javax.swing.JLabel();
        lblDiagnostico = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        lblBares = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(70, 0), new java.awt.Dimension(70, 0), new java.awt.Dimension(70, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(70, 0), new java.awt.Dimension(70, 0), new java.awt.Dimension(70, 32767));
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        comboUbicacion = new javax.swing.JComboBox<>();
        comboTipoHerramienta = new javax.swing.JComboBox<>();
        comboEstadoHerramienta = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaComentarios = new javax.swing.JTextArea();
        txtAreaComentarios.setLineWrap(true);
        txtAreaComentarios.setWrapStyleWord(true);
        JScrollPane scrollPaneDescripcion = new JScrollPane(txtAreaComentarios);
        scrollPaneDescripcion.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPaneDescripcion.setPreferredSize(new Dimension(150,50));

        setClosable(true);
        setTitle("Registro de herramientas");

        titulo.setFont(new java.awt.Font("Axia", 3, 48)); // NOI18N
        titulo.setText("Registro de herramientas");

        lblTipo.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblTipo.setText("Tipo de Herramienta: ");

        lblMarca.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblMarca.setText("Comentarios:");

        lblNombre.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblNombre.setText("Nombre/modelo/marca:");

        lblNumSerie.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblNumSerie.setText("Num. serie: ");

        lblUbicacion.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblUbicacion.setText("Ubicacion:");

        comboUnidadMedida.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        comboUnidadMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtNombre.setBackground(new java.awt.Color(238, 238, 238));
        txtNombre.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        txtNombre.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        txtNumSerie.setBackground(new java.awt.Color(238, 238, 238));
        txtNumSerie.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        txtNumSerie.setBorder(null);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        lblCapacidad.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblCapacidad.setText("Capacidad:");

        txtCapacidad.setBackground(new java.awt.Color(238, 238, 238));
        txtCapacidad.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        txtCapacidad.setBorder(null);

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        lblFechaCalibracion.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblFechaCalibracion.setText("Fecha de calibracion:");

        lblVerificacion.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblVerificacion.setText("Cantidad:");

        lblDiagnostico.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblDiagnostico.setText("Unidad de media:");

        txtCantidad.setBackground(new java.awt.Color(238, 238, 238));
        txtCantidad.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        txtCantidad.setBorder(null);

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        lblBares.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        lblBares.setText("Estado Herramienta:");

        btnGuardar.setBackground(new java.awt.Color(96, 133, 188));
        btnGuardar.setFont(new java.awt.Font("Axia", 3, 36)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setOpaque(true);

        jDateChooser2.setBackground(new java.awt.Color(238, 238, 238));
        jDateChooser2.setFont(new java.awt.Font("Axia", 0, 18)); // NOI18N
        jDateChooser2.setPreferredSize(new java.awt.Dimension(64, 29));

        comboUbicacion.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        comboUbicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboTipoHerramienta.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        comboTipoHerramienta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboEstadoHerramienta.setFont(new java.awt.Font("Axia", 0, 24)); // NOI18N
        comboEstadoHerramienta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtAreaComentarios.setBackground(new java.awt.Color(238, 238, 238));
        txtAreaComentarios.setColumns(10);
        txtAreaComentarios.setFont(new java.awt.Font("Axia", 0, 14)); // NOI18N
        txtAreaComentarios.setRows(5);
        txtAreaComentarios.setBorder(null);
        jScrollPane1.setViewportView(txtAreaComentarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addComponent(titulo)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUbicacion)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblNumSerie)
                                    .addComponent(lblTipo)
                                    .addComponent(lblMarca)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(128, 128, 128)
                                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboTipoHerramienta, 0, 246, Short.MAX_VALUE)
                                    .addComponent(jSeparator2)
                                    .addComponent(txtNumSerie, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                    .addComponent(jSeparator1)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                    .addComponent(comboUbicacion, 0, 246, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBares)
                            .addComponent(lblFechaCalibracion)
                            .addComponent(lblCapacidad)
                            .addComponent(lblDiagnostico)
                            .addComponent(lblVerificacion))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                        .addComponent(txtCapacidad, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                        .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                        .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(comboUnidadMedida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboEstadoHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(548, 548, 548))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titulo)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipo)
                            .addComponent(lblCapacidad)
                            .addComponent(comboTipoHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFechaCalibracion)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblDiagnostico)
                                .addComponent(lblNumSerie))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(comboUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblVerificacion)
                                    .addComponent(lblMarca)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUbicacion)
                            .addComponent(comboUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBares)
                            .addComponent(comboEstadoHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btnGuardar)
                .addGap(153, 153, 153))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btnGuardar;
    public javax.swing.JComboBox<String> comboEstadoHerramienta;
    public javax.swing.JComboBox<String> comboTipoHerramienta;
    public javax.swing.JComboBox<String> comboUbicacion;
    public javax.swing.JComboBox<String> comboUnidadMedida;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblBares;
    private javax.swing.JLabel lblCapacidad;
    private javax.swing.JLabel lblDiagnostico;
    private javax.swing.JLabel lblFechaCalibracion;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumSerie;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JLabel lblVerificacion;
    private javax.swing.JLabel titulo;
    public javax.swing.JTextArea txtAreaComentarios;
    public javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtCapacidad;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNumSerie;
    // End of variables declaration//GEN-END:variables

    private void addListeners(){
        ControladorRegistroHerramientasIFrame controladorRegistroHerramientasIFrame = new ControladorRegistroHerramientasIFrame(this);
        btnGuardar.addMouseListener(controladorRegistroHerramientasIFrame);
    }
}
