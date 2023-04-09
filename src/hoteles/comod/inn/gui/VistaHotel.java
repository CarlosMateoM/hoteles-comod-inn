
package hoteles.comod.inn.gui;

import hoteles.comod.inn.modelos.Hotel;

/**
 *
 * @author mateo
 */
public class VistaHotel extends javax.swing.JPanel {

    /**
     * Creates new form VistaHotel
     */
    
    private Hotel hotel;
    
    public VistaHotel(Hotel hotel) {
        initComponents();
        this.hotel = hotel;
        mostrarDatos();
    }
    
    private void mostrarDatos(){
        nombreTxt.setText(hotel.getNombre());
        categoriaTxt.setText(hotel.getCategoria());
        localizacionTxt.setText(hotel.getLocalizacion());
        paisTxt.setText(hotel.getPais());
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreTxt = new javax.swing.JLabel();
        categoriaTxt = new javax.swing.JLabel();
        paisTxt = new javax.swing.JLabel();
        localizacionTxt = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        nombreTxt.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        nombreTxt.setForeground(new java.awt.Color(36, 32, 32));
        nombreTxt.setText("NOMBRE HOTEL");
        nombreTxt.setToolTipText("");

        categoriaTxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        categoriaTxt.setText("Categoria:");

        paisTxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        paisTxt.setText("Pais:");

        localizacionTxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        localizacionTxt.setText("Localizacion:");

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CLIENTES", jPanel1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Categoria:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Pais:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Localizacion:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paisTxt)
                                    .addComponent(localizacionTxt)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(categoriaTxt)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreTxt)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriaTxt)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paisTxt)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(localizacionTxt)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VistaPrincipal.getInstance().setPanel(new VistaHoteles());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoriaTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel localizacionTxt;
    private javax.swing.JLabel nombreTxt;
    private javax.swing.JLabel paisTxt;
    // End of variables declaration//GEN-END:variables
}
