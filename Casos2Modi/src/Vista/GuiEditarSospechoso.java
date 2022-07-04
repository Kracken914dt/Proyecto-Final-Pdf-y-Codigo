
package Vista;

import Modelo.*;
import Modelo.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import metodos.*;
import javax.swing.*;
import java.util.*;
import javax.swing.table.*;
public class GuiEditarSospechoso extends javax.swing.JFrame {
    
    int filas;
    GuardarDatoSospechoso modficar1=new GuardarDatoSospechoso();
    GuardarDireccion modificar2=new GuardarDireccion();
    DefaultTableModel mdlTabla;
   


    public GuiEditarSospechoso() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        jTable1.setModel(modficar1.listaSospechosos());
        jTable2.setModel(modificar2.listaDireccion());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NoID = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        Edad = new javax.swing.JTextField();
        Ali = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        DescripcionFisica = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Ciudad = new javax.swing.JTextField();
        Depa = new javax.swing.JTextField();
        Pa = new javax.swing.JTextField();
        Loca = new javax.swing.JTextField();
        UltiDire = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(820, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Selecione una fila, modifica y da clic en actualizar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 19, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 730, 100));

        jLabel3.setText("Apellidos:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 134, 63, -1));

        jLabel4.setText("Edad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 160, 41, -1));

        jLabel5.setText("Alias:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 186, 41, -1));

        jLabel6.setText("DescripcionFisica:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 209, -1, -1));

        NoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoIDActionPerformed(evt);
            }
        });
        getContentPane().add(NoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 74, 235, -1));
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 105, 235, -1));

        Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 131, 235, -1));
        getContentPane().add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 157, 235, -1));
        getContentPane().add(Ali, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 183, 235, -1));

        DescripcionFisica.setColumns(20);
        DescripcionFisica.setRows(5);
        jScrollPane2.setViewportView(DescripcionFisica);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 217, 238, -1));

        jLabel2.setText("NoID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 77, 41, -1));

        jLabel7.setText("Nombres:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 105, 55, -1));
        getContentPane().add(Ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 74, 97, -1));
        getContentPane().add(Depa, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 105, 97, -1));
        getContentPane().add(Pa, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 131, 97, -1));

        Loca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocaActionPerformed(evt);
            }
        });
        getContentPane().add(Loca, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 157, 97, -1));
        getContentPane().add(UltiDire, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 183, 97, -1));

        jLabel8.setText("Ciudad:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 77, -1, -1));

        jLabel9.setText("Departamento:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 108, -1, -1));

        jLabel10.setText("Pais:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 134, 48, -1));

        jLabel11.setText("Localidad:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 522, -1));

        jLabel12.setText("UlitmaDireccion:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 186, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 730, 90));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 251, 103, -1));

        jButton2.setText("Modificar1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 251, 87, -1));

        jButton3.setText("Mofdificar2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 251, 94, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\Casos2Modi\\src\\Imagen Proyecto\\ubuntu-linux-mGrande.jpg")); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 820, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoIDActionPerformed

    private void ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoActionPerformed

    private void LocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String []datos=new String[6];
        datos[0]=NoID.getText();
        datos[1]=Nombre.getText();
        datos[2]=Apellido.getText();
        datos[3]=Edad.getText();
        datos[4]=Ali.getText();
        datos[5]=DescripcionFisica.getText();
        for(int k=0;k<jTable1.getColumnCount();k++){
            jTable1.setValueAt(datos[k],filas,k);
        }
        try {
            String archivo="Sospechoso.txt";
            BufferedWriter bw=new BufferedWriter(new FileWriter(archivo));
            for(int i=0;i<jTable1.getRowCount();i++){
                for(int j=0;j<jTable1.getColumnCount();j++){
                    bw.write((String)(jTable1.getValueAt(i, j)));
                    if(j<jTable1.getColumnCount()-1){
                        bw.write("|");
                    }
                }
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        JOptionPane.showMessageDialog(null, "Registro Modificado");
        NoID.setText("");
        Nombre.setText("");
        Apellido.setText("");
        Edad.setText("");
        Ali.setText("");
        DescripcionFisica.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        this.mdlTabla=(DefaultTableModel)jTable1.getModel();
        
        int seleccion=jTable1.getSelectedRow();
        NoID.setText(jTable1.getValueAt(seleccion, 0).toString());
        Nombre.setText(jTable1.getValueAt(seleccion, 0).toString());
        Apellido.setText(jTable1.getValueAt(seleccion, 0).toString());
        Edad.setText(jTable1.getValueAt(seleccion, 0).toString());
        Ali.setText(jTable1.getValueAt(seleccion, 0).toString());
        DescripcionFisica.setText(jTable1.getValueAt(seleccion, 0).toString());
        filas=seleccion;
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String []datos2=new String[6];
        datos2[0]=Ciudad.getText();
        datos2[1]=Depa.getText();
        datos2[2]=Pa.getText();
        datos2[3]=Loca.getText();
        datos2[4]=UltiDire.getText();
        for(int k=0;k<jTable2.getColumnCount();k++){
            jTable2.setValueAt(datos2[k],filas,k);
        }
        try {
            String archivo="Dire.txt";
            BufferedWriter bw=new BufferedWriter(new FileWriter(archivo));
            for(int i=0;i<jTable2.getRowCount();i++){
                for(int j=0;j<jTable2.getColumnCount();j++){
                    bw.write((String)(jTable2.getValueAt(i, j)));
                    if(j<jTable2.getColumnCount()-1){
                        bw.write("|");
                    }
                }
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        JOptionPane.showMessageDialog(null, "Registro Modificado");
        Ciudad.setText("");
        Depa.setText("");
        Pa.setText("");
        Loca.setText("");
        UltiDire.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        this.mdlTabla=(DefaultTableModel)jTable1.getModel();
        
        int seleccion=jTable2.getSelectedRow();
        Ciudad.setText(jTable2.getValueAt(seleccion, 0).toString());
        Depa.setText(jTable2.getValueAt(seleccion, 0).toString());
        Pa.setText(jTable2.getValueAt(seleccion, 0).toString());
        Loca.setText(jTable2.getValueAt(seleccion, 0).toString());
        UltiDire.setText(jTable2.getValueAt(seleccion, 0).toString());
        filas=seleccion;
        
    }//GEN-LAST:event_jTable2MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GuiEditarSospechoso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiEditarSospechoso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiEditarSospechoso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiEditarSospechoso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiEditarSospechoso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ali;
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField Ciudad;
    private javax.swing.JTextField Depa;
    private javax.swing.JTextArea DescripcionFisica;
    private javax.swing.JTextField Edad;
    private javax.swing.JTextField Loca;
    private javax.swing.JTextField NoID;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Pa;
    private javax.swing.JTextField UltiDire;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
