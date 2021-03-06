
package Vista;
import Modelo.*;
import metodos.*;
import javax.swing.*;
import java.util.*;
import javax.swing.table.*;
import java.io.*;

public class GuiRegistroSospechoso extends javax.swing.JFrame {
    Sospechoso sospechoso1=new Sospechoso();
    Direccion direccion1=new Direccion();
    GuardarDireccion guardarDatosDire=new GuardarDireccion();
    GuardarDatoSospechoso guardarDatos=new GuardarDatoSospechoso();
    DefaultTableModel mdlTabla;
    Vector vCabeceras=new Vector();


    public GuiRegistroSospechoso() {
        initComponents();
        
        vCabeceras.addElement("Noid");
        vCabeceras.addElement("Nombres");
        vCabeceras.addElement("Apellidos");
        vCabeceras.addElement("Edad");
        vCabeceras.addElement("Alias");
        vCabeceras.addElement("DescripcionFisica");
        vCabeceras.addElement("Ciudad");
        vCabeceras.addElement("Departamento");
        vCabeceras.addElement("Pais");
        vCabeceras.addElement("Localidad");
        vCabeceras.addElement("UltimaDireccion");
        mdlTabla=new DefaultTableModel(vCabeceras,0);
        jTable1.setModel(mdlTabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NoID = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        Edad = new javax.swing.JTextField();
        Ali = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescripcionFisica = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Ciudad = new javax.swing.JTextField();
        Depa = new javax.swing.JTextField();
        Pa = new javax.swing.JTextField();
        Loca = new javax.swing.JTextField();
        UltiDire = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButtonEditar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NoID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 78, 41, -1));

        jLabel2.setText("Nombres:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 106, 55, -1));

        jLabel3.setText("Apellidos:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 135, 63, -1));

        jLabel4.setText("Edad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 161, 41, -1));

        jLabel5.setText("Alias:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 187, 41, -1));

        jLabel6.setText("DescripcionFisica:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        NoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoIDActionPerformed(evt);
            }
        });
        getContentPane().add(NoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 75, 235, -1));
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 106, 235, -1));

        Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 132, 235, -1));
        getContentPane().add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 158, 235, -1));
        getContentPane().add(Ali, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 184, 235, -1));

        DescripcionFisica.setColumns(20);
        DescripcionFisica.setRows(5);
        jScrollPane1.setViewportView(DescripcionFisica);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 240, 50));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel7.setText("Registro Sospechosos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 340, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Noid", "Nombres", "Apellidos", "Edad", "Alias", "DescripcionFisica"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 872, 91));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 73, -1));

        jLabel8.setText("Ciudad:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 78, -1, -1));

        jLabel9.setText("Departamento:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 109, -1, -1));

        jLabel10.setText("Pais:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 135, 48, -1));

        jLabel11.setText("Localidad:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 161, 440, -1));

        jLabel12.setText("UlitmaDireccion:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 187, -1, -1));
        getContentPane().add(Ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 75, 97, -1));
        getContentPane().add(Depa, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 106, 97, -1));
        getContentPane().add(Pa, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 132, 97, -1));

        Loca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocaActionPerformed(evt);
            }
        });
        getContentPane().add(Loca, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 158, 97, -1));
        getContentPane().add(UltiDire, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 184, 97, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ciudad", "Departamento", "Pais", "Localidad", "UltimaDireccion"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 397, 870, 85));

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, -1, -1));

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, -1, -1));

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\Casos2Modi\\src\\Imagen Proyecto\\ubuntu-linux-mGrande.jpg")); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoActionPerformed

    private void NoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mdlTabla=new DefaultTableModel();
        int noID=NoID.hashCode();
        String nombre=Nombre.getText();
        String apellido=Apellido.getText();
        int edad=Edad.hashCode();
        String alias=Ali.getText();
        String descripFisica=DescripcionFisica.getText();
        String ciudad=Ciudad.getText();
        String departamento=Depa.getText();
        String pais=Pa.getText();
        String localidad=Loca.getText();
        String ultimaDireccion=UltiDire.getText();
        
        sospechoso1.setNoID(noID);
        sospechoso1.setNombres(nombre);
        sospechoso1.setApellidos(apellido);
        sospechoso1.setEdad(edad);
        sospechoso1.setAlias(alias);
        sospechoso1.setDescripcionFisica(descripFisica);
        direccion1.setCiudad(ciudad);
        direccion1.setDepartamento(departamento);
        direccion1.setPais(pais);
        direccion1.setLocalidad(localidad);
        direccion1.setUltidireconocidad(ultimaDireccion);
        
        guardarDatos.guardar(sospechoso1);
        guardarDatos.guardarArchivo(sospechoso1);
        guardarDatosDire.guardarDire(direccion1);
        guardarDatosDire.GuardarDireccion(direccion1);
        
        JOptionPane.showMessageDialog(null, "Registro exitoso");
        
        NoID.setText("");
        Nombre.setText("");
        Apellido.setText("");
        Edad.setText("");
        Ali.setText("");
        DescripcionFisica.setText("");
        Ciudad.setText("");
        Depa.setText("");
        Pa.setText("");
        Loca.setText("");
        UltiDire.setText("");
        
        jTable1.setModel(guardarDatos.listaSospechosos());
        jTable2.setModel(guardarDatosDire.listaDireccion());
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocaActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        GuiEditarSospechoso GE = new GuiEditarSospechoso();
        GE.setVisible(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        GuiEliminarSospechoso GeS = new GuiEliminarSospechoso();
        GeS.setVisible(true);
    }//GEN-LAST:event_EliminarActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(GuiRegistroSospechoso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiRegistroSospechoso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiRegistroSospechoso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiRegistroSospechoso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiRegistroSospechoso().setVisible(true);
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
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField Loca;
    private javax.swing.JTextField NoID;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Pa;
    private javax.swing.JTextField UltiDire;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
