package Vistas;

import biblioteca.Data.LibroData;
import biblioteca.Entidades.Libro;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class listarLibroXAutor extends javax.swing.JInternalFrame {
    private ArrayList<Libro> listalib;
    private LibroData libData;
    private Libro libroActual;
    private DefaultTableModel modelo;
    public listarLibroXAutor() { 
        initComponents();
        libData= new LibroData();
        listalib=libData.listarLibrosXautor("autor");
        modelo= new DefaultTableModel();
        cargarLibros();
        armarCabeceraTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTLibros = new javax.swing.JTable();
        jCBAutor = new javax.swing.JComboBox();
        jBSalir = new javax.swing.JButton();

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

        jCBAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAutorActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jCBAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jBSalir)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jCBAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAutorActionPerformed
        
        borrarFilaTabla();
        cargarLibros();
        
        //Libro selec= (Libro)jCBAutor.getSelectedItem();
       // ArrayList<Libro> lib= libData.listarLibrosXautor(selec.getAutor());
        //for(Libro libro:lib){
           // modelo.addRow(new Object[]{libro.getIsbn(),libro.getTitulo(),libro.getEditor(),libro.getNumEjemplares()});
        //}
    }//GEN-LAST:event_jCBAutorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox jCBAutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTLibros;
    // End of variables declaration//GEN-END:variables
//    private void cargarLibro(){
//        for(Libro item: listalib){
//            jCBAutor.addItem("item");
//        }
//    }
    private void armarCabeceraTable(){
      ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ISBN");
        filaCabecera.add("Titulo");
        filaCabecera.add("Editor");
        filaCabecera.add("Número de Ejemplar");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jTLibros.setModel(modelo);  
    }
        private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    private void cargarLibros() {
        try {
                   for(Libro item: listalib){
            jCBAutor.addItem("item");
        }
            if (libroActual != null) {
                Libro selec = (Libro) jCBAutor.getSelectedItem();
                String autor = selec.autor;
                listalib = libData.listarLibrosXautor("autor");
                for (Libro libroActual : listalib) {
                   
                    modelo.addRow(new Object[]{libroActual.getIsbn(), libroActual.getTitulo(), libroActual.getEditor(), libroActual.getNumEjemplares()});
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un autor válido");
        }
     }   
}
