package com.mycompany.vista;

import com.mycompany.util.ExcelUtil;
import java.io.IOException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Principal extends javax.swing.JFrame {

    DefaultTableModel modeloTabla;

    public Principal() {
        initComponents();
        modeloTabla = (DefaultTableModel) tabla.getModel();
        txtMontoTotal.setEditable(false);
        cmbCochera.setText("");
    }
    // (Aquí va el código generado automáticamente por NetBeans en la pestaña Design)
    // Ya lo tienes, así que no lo repito aquí.


    private void limpiarCampos() {
        txtId.setText("");
        txtNombre.setText("");
        txtDni.setText("");
        txtPlaca.setText("");
        txtHoraIngreso.setText("");
        txtHoraSalida.setText("");
        txtMontoPorMinuto.setText("");
        txtMontoTotal.setText("");
        cmbCochera.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtHoraIngreso = new javax.swing.JTextField();
        txtHoraSalida = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbCochera = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMontoPorMinuto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMontoTotal = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnExportarExcel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        jButton6.setText("jButton6");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("Nombre");

        txtId.setText("jTextField1");

        txtNombre.setText("jTextField1");

        jLabel3.setText("DNI");

        txtDni.setText("jTextField1");

        jLabel4.setText("Placa");

        txtPlaca.setText("jTextField1");

        jLabel5.setText("Hora Ingreso (HH:mm)");

        jLabel6.setText("HoraSalida (HH:mm)");

        txtHoraIngreso.setText("jTextField1");

        txtHoraSalida.setText("jTextField2");

        jLabel7.setText("N° Cochera");

        cmbCochera.setText("jTextField1");

        jLabel8.setText("Monto por minuto");

        txtMontoPorMinuto.setText("jTextField1");

        jLabel9.setText("Monto total");

        txtMontoTotal.setText("jTextField1");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");

        btnActualizar.setText("Actualizar");

        btnEliminar.setText("Eliminar");

        btnExportarExcel.setText("Exportar a Excel");
        btnExportarExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarExcelActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrar)
                                .addGap(39, 39, 39)
                                .addComponent(btnEditar)
                                .addGap(29, 29, 29)
                                .addComponent(btnActualizar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(txtHoraIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExportarExcel)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbCochera, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtMontoPorMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCochera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMontoPorMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnEditar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnExportarExcel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        String[] fila = new String[9];
        fila[0] = txtId.getText();
        fila[1] = txtNombre.getText();
        fila[2] = txtDni.getText();
        fila[3] = txtPlaca.getText();
        fila[4] = txtHoraIngreso.getText();
        fila[5] = txtHoraSalida.getText();
        fila[6] = cmbCochera.getText();
        fila[7] = txtMontoPorMinuto.getText();
        fila[8] = txtMontoTotal.getText();

        modeloTabla.addRow(fila);
        limpiarCampos();
    }//GEN-LAST:event_btnRegistrarActionPerformed
    // TODO add your handling code here:
    // TODO add your handling code here:
    // TODO add your handling code here:
    // TODO add your handling code here:
    // TODO add your handling code here:


    private void btnExportarExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarExcelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportarExcelActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String horaI = txtHoraIngreso.getText();
            String horaS = txtHoraSalida.getText();
            double montoMinuto = Double.parseDouble(txtMontoPorMinuto.getText());

            DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime ingreso = LocalTime.parse(horaI, formato);
            LocalTime salida = LocalTime.parse(horaS, formato);
            long minutos = Duration.between(ingreso, salida).toMinutes();

            if (minutos < 0) {
                JOptionPane.showMessageDialog(this, "La hora de salida debe ser mayor que la de ingreso.");
                return;
            }

            double total = minutos * montoMinuto;
            txtMontoTotal.setText(String.format("%.2f", total));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al calcular monto: " + e.getMessage());
        }
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        int fila = tabla.getSelectedRow();
        if (fila >= 0) {
            modeloTabla.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar.");
        }
    }

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {
        int fila = tabla.getSelectedRow();
        if (fila >= 0) {
            txtId.setText(modeloTabla.getValueAt(fila, 0).toString());
            txtNombre.setText(modeloTabla.getValueAt(fila, 1).toString());
            txtDni.setText(modeloTabla.getValueAt(fila, 2).toString());
            txtPlaca.setText(modeloTabla.getValueAt(fila, 3).toString());
            txtHoraIngreso.setText(modeloTabla.getValueAt(fila, 4).toString());
            txtHoraSalida.setText(modeloTabla.getValueAt(fila, 5).toString());
            cmbCochera.setText(modeloTabla.getValueAt(fila, 6).toString());
            txtMontoPorMinuto.setText(modeloTabla.getValueAt(fila, 7).toString());
            txtMontoTotal.setText(modeloTabla.getValueAt(fila, 8).toString());

            modeloTabla.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila para editar.");
        }
    }

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        ExcelUtil.exportarTablaAExcel(tabla, "clientes.xlsx");
        JOptionPane.showMessageDialog(this, "Exportación exitosa.");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Error al exportar: " + ex.getMessage());
    }
}

 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Principal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExportarExcel;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField cmbCochera;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtHoraIngreso;
    private javax.swing.JTextField txtHoraSalida;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMontoPorMinuto;
    private javax.swing.JTextField txtMontoTotal;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
