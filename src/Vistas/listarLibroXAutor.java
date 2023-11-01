package Vistas;

import biblioteca.Data.LibroData;
import biblioteca.Entidades.Ejemplar;
import biblioteca.Entidades.Libro;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class listarLibroXAutor extends javax.swing.JInternalFrame {
    private ArrayList<Ejemplar> listalib;
    private LibroData libData;
    private Libro libroActual;
    private DefaultTableModel modelo;
    
    public listarLibroXAutor() { 
        initComponents();
        libData = new LibroData();modelo= new DefaultTableModel();
       // cargarLibros(libroActual);
        armarCabeceraTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTLibros = new javax.swing.JTable();
        jBSalir = new javax.swing.JButton();
        jTFAutor = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 255));
        jLabel1.setText("LISTAS DE LIBRO POR AUTOR");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("Inserte un autor");

        jTLibros.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jTLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTLibros);

        jBSalir.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBBuscar.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jBBuscar.setText("BUSCAR");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jTFAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBBuscar)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBSalir)
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jBSalir)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        modelo.setRowCount(0);
        String autor = jTFAutor.getText();
        for (Ejemplar ejem : libData.listarLibrosXautor(autor)) {
            modelo.addRow(new Object[]{ejem.getLibro().getTitulo(),
                ejem.getCodigo(), ejem.getLibro().getEditor(), ejem.getEstado()
            });
        }

    }//GEN-LAST:event_jBBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFAutor;
    private javax.swing.JTable jTLibros;
    // End of variables declaration//GEN-END:variables
    private void armarCabeceraTable(){
        modelo.addColumn("Titulo");
        modelo.addColumn("codido");
        modelo.addColumn("Editorial");
        modelo.addColumn("Estado");
        jTLibros.setModel(modelo);  
    }
        private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }        
        private void cargarLibros(Libro libroActual) {
       
        //    modelo.addRow(new Object[]{libroActual.getIsbn(), libroActual.getTitulo(), libroActual.getEditor(), libroActual.getNumEjemplares()});
        
        }        
//            try {                              
//        listalib = libData.listarLibrosXautor("autor");
//        
//        jCBAutor.removeAllItems();
//        
//        for (Libro item : listalib) {
//            jCBAutor.addItem(item.getAutor());
//            JOptionPane.showMessageDialog(null, "Y??????");
//        }
//        
//        if (!listalib.isEmpty()) {
//            
//            modelo.setRowCount(0); 
//            
//            for (Libro libroActual : listalib) {
//                modelo.addRow(new Object[]{libroActual.getIsbn(), libroActual.getTitulo(), libroActual.getEditor(), libroActual.getNumEjemplares()});
//            }
//        }
//    } catch (Exception ex) {
//        JOptionPane.showMessageDialog(this, "Error al cargar los libros: " + ex.getMessage());
//    }
//}  
}   

