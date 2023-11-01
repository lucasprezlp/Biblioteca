
package Vistas;

import biblioteca.Data.EjemplarData;
import biblioteca.Data.PrestamoData;
import biblioteca.Entidades.Ejemplar;
import biblioteca.Entidades.Lector;
import biblioteca.Entidades.Libro;
import biblioteca.Entidades.Prestamo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class AdministrarPrestamo extends javax.swing.JInternalFrame {

    public AdministrarPrestamo() {
        initComponents();
        jrbDevolucion.setEnabled(false);
        jrbPrestamo.setEnabled(false);
        jBEjecutar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtNombreCompleto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtTituloLibro = new javax.swing.JTextField();
        jBSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlFechaDeInicio = new javax.swing.JLabel();
        jlFechaDeDevolucion = new javax.swing.JLabel();
        jrbDevolucion = new javax.swing.JRadioButton();
        jrbPrestamo = new javax.swing.JRadioButton();
        jBEjecutar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jtBuscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Manejo de Préstamos");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel2.setText("Ingrese Lector");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel3.setText("Titulo del Libro");

        jBSalir.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlFechaDeInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlFechaDeDevolucion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jrbDevolucion.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jrbDevolucion.setText("Devolución de ejemplar");
        jrbDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDevolucionActionPerformed(evt);
            }
        });

        jrbPrestamo.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jrbPrestamo.setText("Prestamo de  ejemplar");
        jrbPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPrestamoActionPerformed(evt);
            }
        });

        jBEjecutar.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jBEjecutar.setText("EJECUTAR");
        jBEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEjecutarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel10.setText("Ingrese el Código:");

        jtBuscar.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jtBuscar.setText("Buscar Libro");
        jtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel3))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtBuscar))
                                    .addComponent(jtNombreCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(jtTituloLibro)))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbDevolucion)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jBEjecutar)
                                .addGap(112, 112, 112)
                                .addComponent(jBSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbPrestamo)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlFechaDeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlFechaDeDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtBuscar))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlFechaDeInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlFechaDeDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jrbPrestamo)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrbDevolucion)
                .addGap(27, 27, 27)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBEjecutar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEjecutarActionPerformed
        
        try {
        if (jtNombreCompleto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;
        }
        
        if (jrbPrestamo.isSelected()) {
            
            Lector lector = new Lector(jtNombreCompleto.getText());
            Libro libro = new Libro(jtTituloLibro.getText());
            Ejemplar ejemplar = new Ejemplar(Integer.parseInt(jtCodigo.getText()),libro);
            LocalDate fechaDeHoy = LocalDate.now();
            LocalDate fechaEn30Dias = fechaDeHoy.plusDays(30);
            Prestamo prestamo = new Prestamo(fechaDeHoy, fechaEn30Dias, ejemplar, lector, true);
            PrestamoData prestamoData = new PrestamoData();
            prestamoData.prestarEjemplar(prestamo);
         
        }

        if (jrbDevolucion.isSelected() && !jtCodigo.getText().isEmpty()) {
            Ejemplar ejemplar = new Ejemplar(Integer.parseInt(jtCodigo.getText()));
            Lector lector = new Lector(jtNombreCompleto.getText());
            Prestamo prestamo2 = new Prestamo(ejemplar, lector);
            PrestamoData pres = new PrestamoData();
            pres.devolucion(prestamo2);
            
        }
        
        if (!jrbPrestamo.isSelected() && !jrbDevolucion.isSelected()) {
            JOptionPane.showMessageDialog(this, "Usted no ha definido una opción.");
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Ingrese caracteres numéricos válidos.");
    }
    }//GEN-LAST:event_jBEjecutarActionPerformed

    private void jrbPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPrestamoActionPerformed

        jlFechaDeInicio.setText(LocalDate.now().toString());
        jlFechaDeDevolucion.setText(LocalDate.now().plusDays(30).toString());
        jrbDevolucion.setSelected(false);
        if (jrbPrestamo.isSelected()) {
            jBEjecutar.setEnabled(true);
        } else {
            jBEjecutar.setEnabled(false);
        }
        if (jrbPrestamo.isSelected()) {
            jLabel5.setText("Fecha de prestamo");
            jLabel4.setText("Fecha de devolución");
            jlFechaDeInicio.setText(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            jlFechaDeDevolucion.setText(LocalDate.now().plusDays(30).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        } else {
            jLabel5.setText("");
            jLabel4.setText("");
            jlFechaDeInicio.setText("");
            jlFechaDeDevolucion.setText("");
        }

    }//GEN-LAST:event_jrbPrestamoActionPerformed

    private void jtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtBuscarMouseClicked

        try {

            Ejemplar pre = new Ejemplar(Integer.parseInt(jtCodigo.getText()));
            PrestamoData ed = new PrestamoData();
            jtTituloLibro.setText(ed.buscartituloConElCodigo(Integer.parseInt(jtCodigo.getText())));
            jrbDevolucion.setEnabled(true);
            jrbPrestamo.setEnabled(true);

        } catch (NumberFormatException ex) {
            JOptionPane.showInternalMessageDialog(this, "Ingrese el código el que figura en dorso del libro");
        }
    }//GEN-LAST:event_jtBuscarMouseClicked

    private void jrbDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDevolucionActionPerformed
        // TODO add your handling code here:
        if (jrbDevolucion.isSelected()) {
            jBEjecutar.setEnabled(true);
        } else {
            jBEjecutar.setEnabled(false);
        }
        jrbPrestamo.setSelected(false);
        jlFechaDeInicio.setText("");
        jlFechaDeDevolucion.setText("");
        jLabel5.setText("");
        jLabel4.setText("");
    }//GEN-LAST:event_jrbDevolucionActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEjecutar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jlFechaDeDevolucion;
    private javax.swing.JLabel jlFechaDeInicio;
    private javax.swing.JRadioButton jrbDevolucion;
    private javax.swing.JRadioButton jrbPrestamo;
    private javax.swing.JButton jtBuscar;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNombreCompleto;
    private javax.swing.JTextField jtTituloLibro;
    // End of variables declaration//GEN-END:variables
}
