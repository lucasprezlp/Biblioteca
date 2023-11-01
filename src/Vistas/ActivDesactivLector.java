package Vistas;

import biblioteca.Data.LectorData;
import javax.swing.JOptionPane;

public class ActivDesactivLector extends javax.swing.JInternalFrame {
        LectorData lec = new LectorData();

    public ActivDesactivLector() {
        initComponents();
        activar.setEnabled(false);
        desactivar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFNombreLector = new javax.swing.JTextField();
        activar = new javax.swing.JRadioButton();
        desactivar = new javax.swing.JRadioButton();
        jBbuscar = new javax.swing.JButton();
        jLEstado = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 153));
        jLabel1.setText("Activar/desactivar lectores");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("Escriba nombre del lector");

        activar.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        activar.setText("Activar lector");
        activar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activarActionPerformed(evt);
            }
        });

        desactivar.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        desactivar.setText("Desactivar lector");
        desactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desactivarActionPerformed(evt);
            }
        });

        jBbuscar.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jBbuscar.setText("BUSCAR");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jLEstado.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLEstado.setText("Estado del lector");

        jBSalir.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(activar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(desactivar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLEstado)
                            .addComponent(jTFNombreLector, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombreLector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar))
                .addGap(18, 18, 18)
                .addComponent(jLEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desactivar)
                    .addComponent(jBSalir))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void desactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desactivarActionPerformed
        // TODO add your handling code here:
                String st = jTFNombreLector.getText();
        lec.desactivarLector(lec.obtenerIdLectorPorNombre(st));
        activar.setEnabled(true);
        activar.setSelected(false);
        desactivar.setEnabled(false);
        jLEstado.setText("INACTIVO");
    
    }//GEN-LAST:event_desactivarActionPerformed

    private void activarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activarActionPerformed
         String st = jTFNombreLector.getText();
        lec.activarLector(lec.obtenerIdLectorPorNombre(st));
        desactivar.setEnabled(true);
        desactivar.setSelected(false);
        activar.setEnabled(false);
        jLEstado.setText("ACTIVO");

    }//GEN-LAST:event_activarActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed

        if (jTFNombreLector.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un lector");
            return;
        }

        String st = jTFNombreLector.getText();

        int Idlector = lec.obtenerIdLectorPorNombre(st);

        if (Idlector == -1) {
            JOptionPane.showMessageDialog(this, "Ingrese un lector valido");
            jTFNombreLector.setText("");
            return;
        }

        boolean estado = lec.EstadoLector(Idlector);

        if (estado == true) {
            activar.setEnabled(false);
            desactivar.setEnabled(true);
            jLEstado.setText("ACTIVO");
        } else {
            activar.setEnabled(true);
            desactivar.setEnabled(false);
            jLEstado.setText("INACTIVO");
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton activar;
    private javax.swing.JRadioButton desactivar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTFNombreLector;
    // End of variables declaration//GEN-END:variables
}
