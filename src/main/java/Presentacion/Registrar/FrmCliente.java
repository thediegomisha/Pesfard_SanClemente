/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion.Registrar;

import Logica.fcliente;



/**
 *
 * @author Juan Luis Diaz Aylas
 */
public class FrmCliente extends javax.swing.JInternalFrame {

//    private conexion mysql = new conexion();
//    private Connection cn = mysql.conectar();
    fcliente fcliente = new fcliente();

    /**
     * Creates new form FrmCliente
     */
    public FrmCliente() {
        initComponents();
      //  setLocationRelativeTo(null);
       
        

        cbotipodocumento.removeAllItems();
        fcliente.llenar_combo(cbotipodocumento);
        bgtiposexo.add(rbMasculino);
        bgtiposexo.add(rbFemenino);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgtiposexo = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtnombre2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidopaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidomaterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidomaterno1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblIdCliente = new javax.swing.JLabel();
        txtnombres1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtApellidomaterno2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbotipodocumento = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Registro de Clientes");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 1, 14), new java.awt.Color(0, 51, 153))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel2.setText("Segundo Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtnombre2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 210, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel3.setText("Apellido Paterno");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txtApellidopaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtApellidopaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 210, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel4.setText("Apellido Materno");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        txtApellidomaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtApellidomaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 210, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel5.setText("Edad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        txtApellidomaterno1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jPanel1.add(txtApellidomaterno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 35, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel6.setText("Sexo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        rbMasculino.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        rbMasculino.setText("Masculino");
        jPanel1.add(rbMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        rbFemenino.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        rbFemenino.setText("Femenino");
        jPanel1.add(rbFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel7.setText("Direccion");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(2);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 350, 60));

        btnNuevo.setText("Nuevo");
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        btnGuardar.setText("Guardar");
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        lblIdCliente.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        lblIdCliente.setText("IdCliente");
        jPanel1.add(lblIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        txtnombres1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtnombres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 210, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel9.setText("N° Documento");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        txtApellidomaterno2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtApellidomaterno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 140, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel10.setText("Tipo de Documento");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        cbotipodocumento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel1.add(cbotipodocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 130, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel11.setText("Primer Nombre");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel13.setText("IdCliente");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 500));

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

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
        jScrollPane3.setViewportView(jTable2);

        jLabel12.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel12.setText("Items :");

        jLabel14.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel14.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 450, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgtiposexo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbotipodocumento;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txtApellidomaterno;
    private javax.swing.JTextField txtApellidomaterno1;
    private javax.swing.JTextField txtApellidomaterno2;
    private javax.swing.JTextField txtApellidopaterno;
    private javax.swing.JTextField txtnombre2;
    private javax.swing.JTextField txtnombres1;
    // End of variables declaration//GEN-END:variables
}
