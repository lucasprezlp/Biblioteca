
package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Biblioteca extends javax.swing.JFrame {

    public Biblioteca() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(700,510);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        ImageIcon icono=new ImageIcon(getClass().getResource("/recursos/ImagenBiblio.jpg"));
        Image miImagen=icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        EJEMPLAR = new javax.swing.JMenu();
        DisponibilidadDeEjemplares = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ActivarDesactivar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        AdminPrestamo = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        EJEMPLAR.setText("EJEMPLAR");

        DisponibilidadDeEjemplares.setText("Disponibilidad de Ejemplares");
        DisponibilidadDeEjemplares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisponibilidadDeEjemplaresActionPerformed(evt);
            }
        });
        EJEMPLAR.add(DisponibilidadDeEjemplares);

        jMenuBar1.add(EJEMPLAR);

        jMenu2.setText("LECTOR");

        ActivarDesactivar.setText("Activar/Desactivar lector");
        ActivarDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivarDesactivarActionPerformed(evt);
            }
        });
        jMenu2.add(ActivarDesactivar);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("PRESTAMOS");

        AdminPrestamo.setText("Administrar Préstamos");
        AdminPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminPrestamoActionPerformed(evt);
            }
        });
        jMenu1.add(AdminPrestamo);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("SALIR");
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
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DisponibilidadDeEjemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisponibilidadDeEjemplaresActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        LibrosDisponibles dde =new LibrosDisponibles();
        dde.setVisible(true);
        escritorio.add(dde);
        escritorio.moveToFront(dde);
        
    }//GEN-LAST:event_DisponibilidadDeEjemplaresActionPerformed

    private void ActivarDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivarDesactivarActionPerformed
        // TODO add your handling code here:
                escritorio.removeAll();
        escritorio.repaint();
        ActivDesactivLector dde =new ActivDesactivLector();
        dde.setVisible(true);
        escritorio.add(dde);
        escritorio.moveToFront(dde);
    }//GEN-LAST:event_ActivarDesactivarActionPerformed

    private void AdminPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminPrestamoActionPerformed
        // TODO add your handling code here:
                        escritorio.removeAll();
        escritorio.repaint();
        AdminPrestamo dde =new AdminPrestamo();
        dde.setVisible(true);
        escritorio.add(dde);
        escritorio.moveToFront(dde);
    }//GEN-LAST:event_AdminPrestamoActionPerformed

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
    private javax.swing.JMenuItem DisponibilidadDeEjemplares;
    private javax.swing.JMenu EJEMPLAR;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
