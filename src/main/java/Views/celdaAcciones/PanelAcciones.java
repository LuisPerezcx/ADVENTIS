/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.celdaAcciones;

/**
 *
 * @author david
 */
public class PanelAcciones extends javax.swing.JPanel {

    /**
     * Creates new form panelAcciones
     */
    public PanelAcciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abrirBtnTable = new Views.celdaAcciones.ActionButton();
        eliminarBtnTable = new Views.celdaAcciones.ActionButton();
        agregarBtnTable = new Views.celdaAcciones.ActionButton();
        pdfBtnTable = new Views.celdaAcciones.ActionButton();
        editarBtnTable1 = new Views.celdaAcciones.ActionButton();
        excelBtnTable = new Views.celdaAcciones.ActionButton();

        abrirBtnTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_file_25px.png"))); // NOI18N

        eliminarBtnTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_waste_25px.png"))); // NOI18N

        agregarBtnTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_add_25px.png"))); // NOI18N

        pdfBtnTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_pdf_25px_6.png"))); // NOI18N

        editarBtnTable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_edit_25px.png"))); // NOI18N

        excelBtnTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Microsoft_Excel_25px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eliminarBtnTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agregarBtnTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(abrirBtnTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editarBtnTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pdfBtnTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(excelBtnTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(excelBtnTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarBtnTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pdfBtnTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarBtnTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abrirBtnTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarBtnTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public Views.celdaAcciones.ActionButton abrirBtnTable;
    public Views.celdaAcciones.ActionButton agregarBtnTable;
    public Views.celdaAcciones.ActionButton editarBtnTable1;
    public Views.celdaAcciones.ActionButton eliminarBtnTable;
    public Views.celdaAcciones.ActionButton excelBtnTable;
    public Views.celdaAcciones.ActionButton pdfBtnTable;
    // End of variables declaration//GEN-END:variables
}
