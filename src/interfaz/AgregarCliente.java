/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Cliente;
import clases.Helper;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Sarmientos
 */
public class AgregarCliente extends javax.swing.JDialog {

    /**
     * Creates new form AgregarCliente
     */
    String rutaC;
    ObjectOutputStream salida;
    ArrayList<Cliente> cliente;
    int aux = 0;

    public AgregarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        JButton botonesH[] = {cmdCancelar, cmdBuscar};
        JButton botonesD[] = {cmdEliminar, cmdGuardar};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
        rutaC = "src/datos/clientes.txt";
        try {
            cliente = Helper.traerDatos(rutaC);
            salida = new ObjectOutputStream(new FileOutputStream(rutaC));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        Helper.volcado(salida, cliente);
        Helper.llenarTablaClientes(tblTablaClientes, rutaC);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEstrato = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtConsumo = new javax.swing.JTextField();
        Si = new javax.swing.JRadioButton();
        No = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        Check1 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaClientes = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        cmdGuardar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cmdBuscar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AGREGAR CLIENTES");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, 20));

        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombre.setOpaque(false);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 120, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Consumo:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estrato:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));

        txtEstrato.setOpaque(false);
        jPanel2.add(txtEstrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 120, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cedula:");
        jLabel11.setToolTipText("");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtCedula.setOpaque(false);
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 120, -1));

        txtConsumo.setOpaque(false);
        txtConsumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsumoKeyTyped(evt);
            }
        });
        jPanel2.add(txtConsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 120, -1));

        Si.setText("Si");
        Si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiActionPerformed(evt);
            }
        });
        jPanel2.add(Si, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        No.setText("No");
        No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoActionPerformed(evt);
            }
        });
        jPanel2.add(No, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hbilitar Limpiar:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 230, 190));

        Check1.setForeground(new java.awt.Color(255, 255, 255));
        Check1.setText("Accepta que la Informacion sea Cancelada.");
        Check1.setOpaque(false);
        Check1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check1ActionPerformed(evt);
            }
        });
        jPanel1.add(Check1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 250, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Telefono", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTablaClientes.setOpaque(false);
        tblTablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTablaClientes);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 400, 190));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 420, 220));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1477426732_floppy.png"))); // NOI18N
        cmdGuardar.setContentAreaFilled(false);
        cmdGuardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1477426736_floppy.png"))); // NOI18N
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 100, -1));

        cmdEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1477427251_free-27.png"))); // NOI18N
        cmdEliminar.setContentAreaFilled(false);
        cmdEliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1477427253_free-27.png"))); // NOI18N
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 100, -1));

        cmdLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1477427345_edit-clear.png"))); // NOI18N
        cmdLimpiar.setContentAreaFilled(false);
        cmdLimpiar.setEnabled(false);
        cmdLimpiar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1477427346_edit-clear.png"))); // NOI18N
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 80, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1478031573_Log Out.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1478031574_Log Out.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 180, 110, 30));

        cmdBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1478031465_search.png"))); // NOI18N
        cmdBuscar.setContentAreaFilled(false);
        cmdBuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1478031466_search.png"))); // NOI18N
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 149, 60, 30));

        cmdCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1477427499_Cancel.png"))); // NOI18N
        cmdCancelar.setContentAreaFilled(false);
        cmdCancelar.setEnabled(false);
        cmdCancelar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1477427501_Cancel.png"))); // NOI18N
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 80, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 80, 220));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/programming-and-code-13_www.FullHDWpp.com_.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }

    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtConsumoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsumoKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtConsumoKeyTyped
    public void validarCheck1() {

        if (Check1.isSelected()) {
            cmdCancelar.setEnabled(true);
        } else if (Check1.isSelected() == false) {
            cmdCancelar.setEnabled(false);

        }
    }

    public void validar() {

        if (Si.isSelected()) {
            cmdLimpiar.setEnabled(true);
        } else if (No.isSelected()) {
            cmdLimpiar.setEnabled(false);
        }
    }
    private void SiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiActionPerformed
        validar();
    }//GEN-LAST:event_SiActionPerformed

    private void NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoActionPerformed
        validar();
    }//GEN-LAST:event_NoActionPerformed

    private void Check1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check1ActionPerformed
        validarCheck1();
    }//GEN-LAST:event_Check1ActionPerformed

    private void tblTablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaClientesMouseClicked
        int i;
        Cliente c;
        ArrayList<Cliente> clientes = Helper.traerDatos(rutaC);
        i = tblTablaClientes.getSelectedRow();

        c = clientes.get(i);
        txtCedula.setText(c.getCedula());
        txtNombre.setText(c.getNombre());
    }//GEN-LAST:event_tblTablaClientesMouseClicked

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        String cedula, nombre, consumo, estrato, factura;
        cedula = txtCedula.getText();
        nombre = txtNombre.getText();
        consumo = txtConsumo.getText();
        estrato = txtEstrato.getText();

        if (txtNombre.getText().isEmpty()) {
            getToolkit().beep();
            Helper.mensaje(this, "Digite su Nombre", 3);
            txtNombre.requestFocusInWindow();
        } else if (txtConsumo.getText().isEmpty()) {
            getToolkit().beep();
            Helper.mensaje(this, "Digite su Telefono", 3);
            txtConsumo.requestFocusInWindow();
        } else if (txtEstrato.getText().isEmpty()) {
            getToolkit().beep();
            Helper.mensaje(this, "Digite su Direccion", 3);
            txtEstrato.requestFocusInWindow();

        } else {
            ArrayList<Cliente> clientesModificado;
            try {
                if (aux == 0) {
                    Cliente p = new Cliente(cedula, nombre, consumo, estrato, factura);

                    p.guardar(salida);
                } else {
                    clientesModificado = Helper.modificarCliente(rutaC, cedula, nombre, consumo, estrato);
                    salida = new ObjectOutputStream(new FileOutputStream(rutaC));
                    Helper.volcado(salida, clientesModificado);
                    aux = 0;
                    Helper.mensaje(this, "Clientes Actualizados Correctamente!", 1);
                }
            } catch (IOException ex) {
            }

            Helper.llenarTablaClientes(tblTablaClientes, rutaC);

            txtCedula.setText("");
            txtNombre.setText("");
            txtConsumo.setText("");
            txtEstrato.setText("");

            txtCedula.requestFocusInWindow();
            JButton botonesH[] = {cmdCancelar, cmdBuscar};
            JButton botonesD[] = {cmdEliminar, cmdGuardar};

            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
        }
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        int i, op;
        op = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar a este computador ?", "Eliminar", JOptionPane.YES_NO_OPTION);

        ArrayList<Cliente> cliente = Helper.traerDatos(rutaC);
        if (op == JOptionPane.YES_OPTION) {
            i = tblTablaClientes.getSelectedRow();
            cliente.remove(i);
            
            Helper.volcado(salida, cliente);
            Helper.llenarTablaClientes(tblTablaClientes, rutaC);
            txtNombre.setText("");
            txtConsumo.setText("");
            txtEstrato.setText("");

            txtCedula.setText("");

            txtNombre.requestFocusInWindow();
        }
    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtNombre.setText("");
        txtConsumo.setText("");
        txtEstrato.setText("");

        txtCedula.setText("");

        txtCedula.requestFocusInWindow();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        String cedula;
        cedula = txtCedula.getText();
        Cliente p;

        if (txtCedula.getText().isEmpty()) {
            getToolkit().beep();
            Helper.mensaje(this, "Digite Numero de su Cedula", 3);
            txtCedula.requestFocusInWindow();
        } else {

            if (Helper.buscarClienteCedula(cedula, rutaC)) {
                p = Helper.traerClienteCedula(cedula, rutaC);
                txtNombre.setText(p.getNombre());
                txtConsumo.setText(p.getConsumo());
                txtEstrato.setText(p.getEstrato());

                aux = 1;
            } else {
                txtCedula.requestFocusInWindow();
                aux = 0;
            }
            JButton botonesH[] = {cmdBuscar, cmdCancelar};
            JButton botonesD[] = {cmdEliminar, cmdGuardar};

            Helper.habilitarBotones(botonesH);
            Helper.habilitarBotones(botonesD);
        }
    }//GEN-LAST:event_cmdBuscarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        txtNombre.setText("");
        txtConsumo.setText("");
        txtEstrato.setText("");

        txtCedula.setText("");

        txtNombre.requestFocusInWindow();
        JButton botonesH[] = {cmdBuscar, cmdCancelar};
        JButton botonesD[] = {cmdEliminar, cmdGuardar};

        Helper.habilitarBotones(botonesH);
        Helper.habilitarBotones(botonesD);
    }//GEN-LAST:event_cmdCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarCliente dialog = new AgregarCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Check1;
    private javax.swing.JRadioButton No;
    private javax.swing.JRadioButton Si;
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTablaClientes;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtConsumo;
    private javax.swing.JTextField txtEstrato;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}