/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Aplication;

import Presentation.List_ven;
import java.awt.BorderLayout;

/**
 *
 * @author Usuario
 */
public class realizarVenta extends javax.swing.JPanel {

    /**
     * Creates new form a
     */
    public realizarVenta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        con_venta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        btnVer = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        con_venta.setBackground(new java.awt.Color(255, 255, 255));
        con_venta.setPreferredSize(new java.awt.Dimension(966, 420));
        con_venta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cantidad");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        con_venta.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 90, 30));
        con_venta.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 40, 30));

        jLabel2.setText("CodigoProducto");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        con_venta.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, 30));

        jLabel3.setText("Producto");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        con_venta.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, 30));
        con_venta.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 90, 30));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        con_venta.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 230, 30));

        jLabel6.setText("jLabel6");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        con_venta.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 90, 110));

        jLabel7.setText("DNI");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        con_venta.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 60, 30));

        jLabel8.setText("Nombres");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        con_venta.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 60, 30));

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
        jScrollPane1.setViewportView(jTable1);

        con_venta.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 940, 250));

        jLabel9.setText("Total a Pagar");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        con_venta.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 80, 30));
        con_venta.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 80, 30));

        btnVer.setText("Ver Ventas");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        con_venta.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 120, 30));

        jButton2.setText("RealizarVenta");
        con_venta.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 120, 30));
        con_venta.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 940, 20));

        jLabel10.setText("Precio");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        con_venta.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 90, 30));

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        con_venta.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 90, 30));

        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        con_venta.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 60, 30));

        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        con_venta.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 230, 30));

        jLabel5.setText("CodigoOrden");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        con_venta.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        con_venta.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 400, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(con_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(con_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        // TODO add your handling code here:
        List_ven ven=new List_ven();
        ven.setSize(966, 448);
        ven.setLocation(0,0);
        
        con_venta.removeAll();
        con_venta.add(ven, BorderLayout.CENTER);
        con_venta.revalidate();
        con_venta.repaint();
    }//GEN-LAST:event_btnVerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVer;
    private javax.swing.JPanel con_venta;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
