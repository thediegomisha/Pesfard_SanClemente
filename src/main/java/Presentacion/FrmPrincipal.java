/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package Presentacion;

import Util.PosicionFormulario;
// import java.awt.Dimension;
// import java.awt.Toolkit;

/**
 *
 * @author Juan Luis Diaz Aylas
 */
public class FrmPrincipal extends javax.swing.JFrame {

    PosicionFormulario form = new PosicionFormulario();

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle("Sistema de Pesaje de Algodon - PESFARD");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuSistema = new javax.swing.JMenu();
        menuItemBaseDatos = new javax.swing.JMenuItem();
        menuItemPuertoSerie = new javax.swing.JMenuItem();
        menuItemCamaraVigilancia = new javax.swing.JMenuItem();
        jMenuRegistrar = new javax.swing.JMenu();
        menuItemCliente = new javax.swing.JMenuItem();
        menuItemAgricultor = new javax.swing.JMenuItem();
        menuItemAcopiador = new javax.swing.JMenuItem();
        menuItemConductor = new javax.swing.JMenuItem();
        menuItemLote = new javax.swing.JMenuItem();
        menuItemUsuario = new javax.swing.JMenuItem();
        menuItemProductosAlgodon = new javax.swing.JMenuItem();
        jMenuModificar = new javax.swing.JMenu();
        editMenu = new javax.swing.JMenu();
        jMenuConsultaPesos = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuItemBalanzaGrande = new javax.swing.JMenuItem();
        menuItemBalanzaChica = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mini_engrane.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("Mantenimiento");

        jMenuSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mini_sistema.png"))); // NOI18N
        jMenuSistema.setText("Sistema");

        menuItemBaseDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mini_bd.png"))); // NOI18N
        menuItemBaseDatos.setMnemonic('o');
        menuItemBaseDatos.setText("Configurar Base de Datos");
        menuItemBaseDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBaseDatosActionPerformed(evt);
            }
        });
        jMenuSistema.add(menuItemBaseDatos);

        menuItemPuertoSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mini_serialport.jpg"))); // NOI18N
        menuItemPuertoSerie.setMnemonic('a');
        menuItemPuertoSerie.setText("Configurar Puerto Serie");
        menuItemPuertoSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPuertoSerieActionPerformed(evt);
            }
        });
        jMenuSistema.add(menuItemPuertoSerie);

        menuItemCamaraVigilancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mini_camara.png"))); // NOI18N
        menuItemCamaraVigilancia.setMnemonic('s');
        menuItemCamaraVigilancia.setText("Configurar Camara de Vigilancia");
        menuItemCamaraVigilancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCamaraVigilanciaActionPerformed(evt);
            }
        });
        jMenuSistema.add(menuItemCamaraVigilancia);

        fileMenu.add(jMenuSistema);

        jMenuRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar1.png"))); // NOI18N
        jMenuRegistrar.setText("Registrar");

        menuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mini_cliente.png"))); // NOI18N
        menuItemCliente.setText("Registrar Cliente");
        menuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClienteActionPerformed(evt);
            }
        });
        jMenuRegistrar.add(menuItemCliente);

        menuItemAgricultor.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        menuItemAgricultor.setForeground(new java.awt.Color(0, 0, 255));
        menuItemAgricultor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mini_agricultor.png"))); // NOI18N
        menuItemAgricultor.setText("Registrar Agricultor");
        menuItemAgricultor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAgricultorActionPerformed(evt);
            }
        });
        jMenuRegistrar.add(menuItemAgricultor);

        menuItemAcopiador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mini_vendedor.png"))); // NOI18N
        menuItemAcopiador.setText("Registrar Acopiador");
        jMenuRegistrar.add(menuItemAcopiador);

        menuItemConductor.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        menuItemConductor.setForeground(new java.awt.Color(0, 51, 204));
        menuItemConductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mini_placa.png"))); // NOI18N
        menuItemConductor.setText("Registrar Placa - Conductor");
        menuItemConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConductorActionPerformed(evt);
            }
        });
        jMenuRegistrar.add(menuItemConductor);

        menuItemLote.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        menuItemLote.setForeground(new java.awt.Color(153, 0, 0));
        menuItemLote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lote.png"))); // NOI18N
        menuItemLote.setText("Registrar Lote");
        menuItemLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLoteActionPerformed(evt);
            }
        });
        jMenuRegistrar.add(menuItemLote);

        menuItemUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administrador.png"))); // NOI18N
        menuItemUsuario.setText("Registrar Usuario");
        menuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUsuarioActionPerformed(evt);
            }
        });
        jMenuRegistrar.add(menuItemUsuario);

        menuItemProductosAlgodon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos.png"))); // NOI18N
        menuItemProductosAlgodon.setText("Registrar Productos de Algodon");
        jMenuRegistrar.add(menuItemProductosAlgodon);

        fileMenu.add(jMenuRegistrar);

        jMenuModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mini_editar.png"))); // NOI18N
        jMenuModificar.setText("Modificar");
        fileMenu.add(jMenuModificar);

        menuBar.add(fileMenu);

        editMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mini_reporte.png"))); // NOI18N
        editMenu.setMnemonic('e');
        editMenu.setText("Reporte");

        jMenuConsultaPesos.setMnemonic('y');
        jMenuConsultaPesos.setText("Consulta de Pesos");
        jMenuConsultaPesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultaPesosActionPerformed(evt);
            }
        });
        editMenu.add(jMenuConsultaPesos);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Consulta");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("INGRESOS");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("COLCAS");
        helpMenu.add(aboutMenuItem);

        jMenu6.setText("LIQUIDACION GENERAL");
        helpMenu.add(jMenu6);

        jMenu7.setText("ACUDE");
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenu7);

        jMenu8.setText("ROMANEO");

        jMenuItem1.setText("CLIENTE");
        jMenu8.add(jMenuItem1);

        helpMenu.add(jMenu8);

        jMenuItem7.setText("BUSQUEDA");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem7);

        menuBar.add(helpMenu);

        jMenu1.setText("Balanza");

        menuItemBalanzaGrande.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        menuItemBalanzaGrande.setForeground(new java.awt.Color(0, 0, 153));
        menuItemBalanzaGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camion.png"))); // NOI18N
        menuItemBalanzaGrande.setText("BALANZA GRANDE");
        menuItemBalanzaGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBalanzaGrandeActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemBalanzaGrande);

        menuItemBalanzaChica.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        menuItemBalanzaChica.setForeground(new java.awt.Color(255, 0, 0));
        menuItemBalanzaChica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mini_balanza.png"))); // NOI18N
        menuItemBalanzaChica.setText("BALANZA CHICA");
        menuItemBalanzaChica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBalanzaChicaActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemBalanzaChica);

        menuBar.add(jMenu1);

        jMenu2.setText("Orden de Produccion");

        jMenuItem4.setText("Generar Orden de Produccion");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Modificar Orden de Produccion");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Estado de Orden de Produccion");
        jMenu2.add(jMenuItem6);

        menuBar.add(jMenu2);

        jMenu3.setText("Liquidacion");
        menuBar.add(jMenu3);

        jMenu4.setText("Backup");
        menuBar.add(jMenu4);

        jMenu5.setText("Salir");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        menuBar.add(jMenu5);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemPuertoSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPuertoSerieActionPerformed
        // TODO add your handling code here:
        Presentacion.Sistema.FrmPortCom pantalla;
        form.abrirFormulario(pantalla = new Presentacion.Sistema.FrmPortCom(), escritorio);
    }//GEN-LAST:event_menuItemPuertoSerieActionPerformed

    private void menuItemBaseDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBaseDatosActionPerformed
        // TODO add your handling code here:
        Presentacion.Sistema.FrmConfigurarDB pantalla;
        form.abrirFormulario(pantalla = new Presentacion.Sistema.FrmConfigurarDB(), escritorio);
    }//GEN-LAST:event_menuItemBaseDatosActionPerformed

    private void menuItemCamaraVigilanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCamaraVigilanciaActionPerformed
        // TODO add your handling code here:
        Presentacion.Sistema.FrmConfigurarCamaraVig pantalla;
        form.abrirFormulario(pantalla = new Presentacion.Sistema.FrmConfigurarCamaraVig(), escritorio);
    }//GEN-LAST:event_menuItemCamaraVigilanciaActionPerformed

    private void menuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUsuarioActionPerformed
        // TODO add your handling code here:
        Presentacion.Registrar.FrmUsuario pantalla;
        form.abrirFormulario(pantalla = new Presentacion.Registrar.FrmUsuario(), escritorio);
    }//GEN-LAST:event_menuItemUsuarioActionPerformed

    private void menuItemConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConductorActionPerformed
        // TODO add your handling code here:
        Presentacion.Registrar.FrmRegistroChoferes pantalla;
        form.abrirFormulario(pantalla = new Presentacion.Registrar.FrmRegistroChoferes(), escritorio);

    }//GEN-LAST:event_menuItemConductorActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void menuItemBalanzaGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBalanzaGrandeActionPerformed
        // TODO add your handling code here:
        Presentacion.Registrar.FrmBalanzaGrande pantalla;
        form.abrirFormulario(pantalla = new Presentacion.Registrar.FrmBalanzaGrande(), escritorio);
    }//GEN-LAST:event_menuItemBalanzaGrandeActionPerformed

    private void menuItemBalanzaChicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBalanzaChicaActionPerformed
        // TODO add your handling code here:
        Presentacion.Registrar.FrmBalanzaChica pantalla;
        form.abrirFormulario(pantalla = new Presentacion.Registrar.FrmBalanzaChica(), escritorio);
    }//GEN-LAST:event_menuItemBalanzaChicaActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        Presentacion.FrmBusqueda pantalla;
        form.abrirFormulario(pantalla = new Presentacion.FrmBusqueda(), escritorio);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu7ActionPerformed

    private void menuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClienteActionPerformed
        // TODO add your handling code here:
        Presentacion.Registrar.FrmCliente pantalla;
        form.abrirFormulario(pantalla = new Presentacion.Registrar.FrmCliente(), escritorio);
    }//GEN-LAST:event_menuItemClienteActionPerformed

    private void menuItemLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLoteActionPerformed
        // TODO add your handling code here:
        Presentacion.Registrar.FrmCrearLote pantalla;
        form.abrirFormulario(pantalla = new Presentacion.Registrar.FrmCrearLote(), escritorio);
    }//GEN-LAST:event_menuItemLoteActionPerformed

    private void menuItemAgricultorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAgricultorActionPerformed
        // TODO add your handling code here:
        Presentacion.Registrar.FrmAgricultor pantalla;
        form.abrirFormulario(pantalla = new Presentacion.Registrar.FrmAgricultor(), escritorio);
    }//GEN-LAST:event_menuItemAgricultorActionPerformed

    private void jMenuConsultaPesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultaPesosActionPerformed
        // TODO add your handling code here:
        Presentacion.Reportes.FrmConsultaPesos pantalla;
        form.abrirFormulario(pantalla = new Presentacion.Reportes.FrmConsultaPesos(), escritorio);
    }//GEN-LAST:event_jMenuConsultaPesosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuItem jMenuConsultaPesos;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenu jMenuModificar;
    private javax.swing.JMenu jMenuRegistrar;
    private javax.swing.JMenu jMenuSistema;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemAcopiador;
    private javax.swing.JMenuItem menuItemAgricultor;
    private javax.swing.JMenuItem menuItemBalanzaChica;
    private javax.swing.JMenuItem menuItemBalanzaGrande;
    private javax.swing.JMenuItem menuItemBaseDatos;
    private javax.swing.JMenuItem menuItemCamaraVigilancia;
    private javax.swing.JMenuItem menuItemCliente;
    private javax.swing.JMenuItem menuItemConductor;
    private javax.swing.JMenuItem menuItemLote;
    private javax.swing.JMenuItem menuItemProductosAlgodon;
    private javax.swing.JMenuItem menuItemPuertoSerie;
    private javax.swing.JMenuItem menuItemUsuario;
    // End of variables declaration//GEN-END:variables

}
