
package Vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Biblioteca extends javax.swing.JFrame {

    public Biblioteca() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(1080,910);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono=new ImageIcon(getClass().getResource("/recursos/ImagenBiblio.jpg"));
        Image miImagen=icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMIAdministrarLibro = new javax.swing.JMenuItem();
        jMIListarLibroXAutor = new javax.swing.JMenuItem();
        EJEMPLAR = new javax.swing.JMenu();
        jMIMostrarEjemplar = new javax.swing.JMenuItem();
        jMIAdminEjemplar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ActivarDesactivar = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        AdminPrestamo = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        jMenu5.setText("LIBRO");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });

        jMIAdministrarLibro.setText("Administrar Libros");
        jMIAdministrarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAdministrarLibroActionPerformed(evt);
            }
        });
        jMenu5.add(jMIAdministrarLibro);

        jMIListarLibroXAutor.setText("Listar libro por autor");
        jMIListarLibroXAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIListarLibroXAutorActionPerformed(evt);
            }
        });
        jMenu5.add(jMIListarLibroXAutor);

        jMenuBar1.add(jMenu5);

        EJEMPLAR.setText("EJEMPLAR");

        jMIMostrarEjemplar.setText("Mostrar ejemplares");
        jMIMostrarEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIMostrarEjemplarActionPerformed(evt);
            }
        });
        EJEMPLAR.add(jMIMostrarEjemplar);

        jMIAdminEjemplar.setText("Administrar ejemplares");
        jMIAdminEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAdminEjemplarActionPerformed(evt);
            }
        });
        EJEMPLAR.add(jMIAdminEjemplar);

        jMenuBar1.add(EJEMPLAR);

        jMenu2.setText("LECTOR");

        ActivarDesactivar.setText("Activar/Desactivar lector");
        ActivarDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivarDesactivarActionPerformed(evt);
            }
        });
        jMenu2.add(ActivarDesactivar);

        jMenuItem5.setText("consultar lector moroso");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem4.setText("Agregar Lector");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("PRESTAMOS");

        AdminPrestamo.setText("Adminsitrar prestamo");
        AdminPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminPrestamoActionPerformed(evt);
            }
        });
        jMenu1.add(AdminPrestamo);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("SALIR");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActivarDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivarDesactivarActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ActivDesactivLector dde =new ActivDesactivLector();
        dde.setVisible(true);
        dde.getContentPane().setBackground(new Color(204, 204, 255));
        escritorio.add(dde);
        escritorio.moveToFront(dde);
    }//GEN-LAST:event_ActivarDesactivarActionPerformed

    private void AdminPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminPrestamoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        AdministrarPrestamo dde =new AdministrarPrestamo();
        dde.setVisible(true);
        dde.getContentPane().setBackground(new Color(204, 204, 255));
        escritorio.add(dde);
        escritorio.moveToFront(dde);
    }//GEN-LAST:event_AdminPrestamoActionPerformed

    private void jMIAdministrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAdministrarLibroActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ModificarLibro modificar = new ModificarLibro();
        modificar.setVisible(true);
        //modificar el color del internal frame
        modificar.getContentPane().setBackground(new Color(204, 204, 255));
        escritorio.add(modificar);
        escritorio.moveToFront(modificar);
        
    }//GEN-LAST:event_jMIAdministrarLibroActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMIListarLibroXAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIListarLibroXAutorActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        listarLibroXAutor listaxAutor = new listarLibroXAutor();
        listaxAutor.setVisible(true);
        listaxAutor.getContentPane().setBackground(new Color(204, 204, 255));
//        listaxAutor.getContentPane().setBackground(new Color(204, 204, 255));
        escritorio.add(listaxAutor);
        escritorio.moveToFront(listaxAutor);
       
    }//GEN-LAST:event_jMIListarLibroXAutorActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ConsultarLectorMoroso LectorMoroso = new ConsultarLectorMoroso();
        LectorMoroso.setVisible(true);
        LectorMoroso.getContentPane().setBackground(new Color(204, 204, 255));
        escritorio.add(LectorMoroso);
        escritorio.moveToFront(LectorMoroso);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

       escritorio.removeAll();
        escritorio.repaint();
        AgregarLector NuevoLector = new AgregarLector();
        NuevoLector.setVisible(true);
        NuevoLector.getContentPane().setBackground(new Color(204, 204, 255));
        escritorio.add(NuevoLector);
        escritorio.moveToFront(NuevoLector);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed

    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
    confirmarSalida();
}

private void confirmarSalida() {
    int confirmacion = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas salir?", "Confirmar Salida", JOptionPane.YES_NO_OPTION);
    if (confirmacion == JOptionPane.YES_OPTION) {
        cerrarAplicacion();
    }
}

private void cerrarAplicacion() {
    dispose(); // Cierra el JFrame
    System.exit(0); // Cierra la aplicación
    
    
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMIMostrarEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIMostrarEjemplarActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        MostrarEjemplar libDisponible = new MostrarEjemplar();
        libDisponible.setVisible(true);
        libDisponible.getContentPane().setBackground(new Color(204, 204, 255));
        escritorio.add(libDisponible);
        escritorio.moveToFront(libDisponible); 
    }//GEN-LAST:event_jMIMostrarEjemplarActionPerformed

    private void jMIAdminEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAdminEjemplarActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        AdministrarEjemplares ejemDisponible = new AdministrarEjemplares();
        ejemDisponible.setVisible(true);
        ejemDisponible.getContentPane().setBackground(new Color(204, 204, 255));
        escritorio.add(ejemDisponible);
        escritorio.moveToFront(ejemDisponible); 
    }//GEN-LAST:event_jMIAdminEjemplarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ActivarDesactivar;
    private javax.swing.JMenuItem AdminPrestamo;
    private javax.swing.JMenu EJEMPLAR;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMIAdminEjemplar;
    private javax.swing.JMenuItem jMIAdministrarLibro;
    private javax.swing.JMenuItem jMIListarLibroXAutor;
    private javax.swing.JMenuItem jMIMostrarEjemplar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}
