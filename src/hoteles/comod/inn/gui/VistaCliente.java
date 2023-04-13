
package hoteles.comod.inn.gui;

import hoteles.comod.inn.gui.components.Dialog;
import hoteles.comod.inn.gui.forms.CuentaForm;
import hoteles.comod.inn.modelos.Cliente;
import hoteles.comod.inn.modelos.Cuenta;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaCliente extends javax.swing.JPanel {
    
    private final Cliente cliente;
    private DefaultTableModel tablaCuenta;
    private VistaHotel vistaHotel;
            
    public VistaCliente(Cliente cliente, VistaHotel vistaHotel) {
        initComponents();
        tablaCuenta = (DefaultTableModel) tabla.getModel();
        this.cliente = cliente;
        this.vistaHotel = vistaHotel;
        cargarDatosClientes();
    }
    
    private void cargarDatosClientes(){
        nombreLb.setText(cliente.getNombre());
        telefonoLb.setText(cliente.getTelefono());
        cargarCuentasCliente();
    }
    
    private void cargarCuentasCliente(){
        List<Cuenta> cuentas = cliente.getServicioCuenta().getList();
        tablaCuenta.setRowCount(0);
        for(Cuenta cuenta: cuentas){
            String estadoCuenta = cuenta.isPagada() ? "PAGADA" : "PENDIENTE";
            String row [] = {
                "" + cuenta.getId(),
                "" + cuenta.getTotalCuenta(),
                estadoCuenta,
                "" + cuenta.getFechaCreacion()
            };
            
            tablaCuenta.addRow(row);
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreLb = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        telefonoLb = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(718, 417));

        nombreLb.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nombreLb.setForeground(new java.awt.Color(102, 102, 102));
        nombreLb.setText("Nombre del cliente");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Telefono:");

        telefonoLb.setText("301 248 8842");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TOTAL", "ESTADO", "FECHA CREACION"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Cuentas");

        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telefonoLb))
                            .addComponent(jLabel4))
                        .addGap(0, 551, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreLb, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreLb)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(telefonoLb))
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 272, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int row = tabla.getSelectedRow();
        int id = Integer.parseInt((String) tabla.getValueAt(row, 0));
        
        try {
     
            Cuenta cuenta = cliente.getServicioCuenta().getCuentaById(id);
            CuentaForm cuentaForm = new CuentaForm(cuenta);
            
            Dialog dialog = new Dialog(null, true, cuentaForm);
            dialog.setVisible(true);
            cargarCuentasCliente();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VistaPrincipal.getInstance().setPanel(vistaHotel);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreLb;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel telefonoLb;
    // End of variables declaration//GEN-END:variables
}
