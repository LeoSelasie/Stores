/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapp;
import java.sql.ResultSet;
import javax.swing.*;
import com.sun.glass.events.KeyEvent;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Unknown
 */
public class jplSuppliers extends JPanel {
    final int pWidth = 800;
    final int pHeight = 450;
    /**
     * Creates new form jplSuppliers
     */
    public jplSuppliers(JPanel jplMain) {
        initComponents();
        this.setSize(pWidth, pHeight);
        int x = (jplMain.getWidth()-pWidth)/2;
        int y = (jplMain.getHeight()-pHeight)/2;
        this.setLocation(x, y);
        this.setVisible(true);
        //bnSearch.setText("Search");
        initialization();
        filltable();
    }
    public void initialization(){
        tfSupplierId.setText("");
        tfName.setText("");
        tfAddress.setText("");
        tfContact.setText("");
        tfProducts.setText("");
        bnDelete.setEnabled(false);
        bnSearch.setText("Search");
        
    }
    private void filltable(){
        String query="select * from supplier";
        try{
            ResultSet rs = utility.DBconnection.getStatement().executeQuery(query);
            jtSuppliers.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
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

        bnSave = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bnClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtSuppliers = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        tfSupplierId = new javax.swing.JTextField();
        bnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bnDelete = new javax.swing.JButton();
        tfName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfProducts = new javax.swing.JTextField();
        tfAddress = new javax.swing.JTextField();
        tfContact = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        bnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnSave.setText("Save");
        bnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnSaveActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Contact");
        jLabel4.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Suppliers");

        bnClose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnClose.setText("Close");
        bnClose.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnCloseActionPerformed(evt);
            }
        });

        jtSuppliers.setModel(new javax.swing.table.DefaultTableModel(
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
        jtSuppliers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtSuppliersMouseClicked(evt);
            }
        });
        jtSuppliers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtSuppliersKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtSuppliers);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Address");
        jLabel5.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Supplier ID");

        tfSupplierId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfSupplierIdFocusLost(evt);
            }
        });
        tfSupplierId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSupplierIdActionPerformed(evt);
            }
        });

        bnSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnSearch.setText("Search");
        bnSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnSearchActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Name:");
        jLabel3.setToolTipText("");

        bnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnDelete.setText("Delete");
        bnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnDeleteActionPerformed(evt);
            }
        });

        tfName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNameFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Products");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("All Suppliers");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfName, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                                        .addComponent(tfProducts)
                                        .addComponent(tfAddress)
                                        .addComponent(tfContact)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfSupplierId, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(bnSearch)
                                .addGap(38, 38, 38)
                                .addComponent(bnDelete)
                                .addGap(37, 37, 37)
                                .addComponent(bnClose)
                                .addGap(38, 38, 38)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfSupplierId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bnSearch)
                            .addComponent(bnDelete)
                            .addComponent(bnSave)
                            .addComponent(bnClose))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnSaveActionPerformed
        String query="insert into supplier values ('"+tfSupplierId.getText()+"','"+tfName.getText()+"','"+tfAddress.getText()+"','"+tfContact.getText()+"','"+tfProducts.getText()+"')";
        try{
           if(utility.DBconnection.getStatement().executeUpdate(query)>0){
               JOptionPane.showMessageDialog(null, "Successfully saved Item");
                tfSupplierId.setText("");
                tfName.setText("");
                tfAddress.setText("");
                tfContact.setText("");
                tfProducts.setText("");
               initialization();
               filltable();
           }else{
               JOptionPane.showMessageDialog(null, "Could not save data");
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }//GEN-LAST:event_bnSaveActionPerformed

    private void tfSupplierIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSupplierIdFocusLost
    tfSupplierId.setText(tfSupplierId.getText().toUpperCase());
    }//GEN-LAST:event_tfSupplierIdFocusLost

    private void tfNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNameFocusLost
       
    }//GEN-LAST:event_tfNameFocusLost

    private void tfSupplierIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSupplierIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSupplierIdActionPerformed

    private void bnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnCloseActionPerformed
        if (utility.Utility.universalCode == 1){
            int res=JOptionPane.showConfirmDialog(null, "Do you want to save changes?","Warning",JOptionPane.YES_NO_OPTION);
            if (res==JOptionPane.YES_OPTION){
                if (bnSearch.getText().equals("Update")){
                    bnSearch.doClick();
                }else{
                    bnSave.doClick();
                }
            }else{
                this.setVisible(false);
            }
        }else{
            this.setVisible(false);
        }
    }//GEN-LAST:event_bnCloseActionPerformed

    private void bnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnDeleteActionPerformed
         String query= "delete from supplier where Supplier_id='"+tfSupplierId.getText().trim()+"'";
            try{
                if(utility.DBconnection.getStatement().executeUpdate(query)>0){
                    JOptionPane.showMessageDialog(null, "Delete is Successful");
                    tfSupplierId.setText("");
                    tfName.setText("");
                    tfAddress.setText("");
                    tfContact.setText("");
                    tfProducts.setText("");
                    initialization();
                    filltable();
                    
                    tfSupplierId.setEditable(true);
                    tfName.setEditable(true);
                    tfAddress.setEditable(true);
                    tfContact.setEditable(true);
                    tfProducts.setEditable(true);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Delete not Successful");
                }
             }catch(Exception e){
                 JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
             }
    }//GEN-LAST:event_bnDeleteActionPerformed

    private void bnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnSearchActionPerformed
        if (bnSearch.getText().equals("Search")){
            if (tfSupplierId.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Supplier ID");
                return;  
            }
            String SupplierId = tfSupplierId.getText().trim();
            String query = "Select * from supplier where Supplier_id='"+SupplierId+"'";
            
            try{
                ResultSet rs = utility.DBconnection.getStatement().executeQuery(query);
                while(rs.next()){
                    tfSupplierId.setText(SupplierId);
                    tfName.setText(rs.getString("Supplier_name"));
                    tfAddress.setText(rs.getString("Address"));
                    tfContact.setText(rs.getString("Contact"));
                    tfProducts.setText(rs.getString("Products"));
                    
                }
                tfSupplierId.setEditable(false);
                tfName.setEditable(false);
                tfAddress.setEditable(false);
                tfContact.setEditable(false);
                tfProducts.setEditable(false);
                
                bnSave.setEnabled(false);
                bnDelete.setEnabled(true);
                bnSearch.setText("Edit");
                
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
                tfSupplierId.setText("");
            }
        } else if (bnSearch.getText().equals("Edit")){
                tfSupplierId.setEditable(false);
                tfName.setEditable(true);
                tfAddress.setEditable(true);
                tfContact.setEditable(true);
                tfProducts.setEditable(true);
                bnSearch.setText("Update");
        } else if (bnSearch.getText().equals("Update")){
            String query = "update supplier set Supplier_name='"+tfName.getText()+"', Address='"+tfAddress.getText()+"', Contact='"+tfContact.getText()+"', Products='"+tfProducts.getText()+"' where Supplier_id='"+tfSupplierId.getText()+"'";
            try {
                if (utility.DBconnection.getStatement().executeUpdate(query)>0){
                    JOptionPane.showMessageDialog(null, "Update is Successful");
                    tfSupplierId.setText("");
                    tfName.setText("");
                    tfAddress.setText("");
                    tfContact.setText("");
                    tfProducts.setText("");
                    tfSupplierId.setEditable(true);
                    bnSave.setEnabled(true);
                    initialization();
                    filltable();
                } else {
                    JOptionPane.showMessageDialog(null, "Could not update data");
                    tfSupplierId.setText("");
                    tfName.setText("");
                    tfAddress.setText("");
                    tfContact.setText("");
                    tfProducts.setText("");
                    
                    tfSupplierId.setEditable(false);
                    tfName.setEditable(true);
                    tfAddress.setEditable(true);
                    tfContact.setEditable(true);
                    tfProducts.setEditable(true);
                }
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            }
        }
    }//GEN-LAST:event_bnSearchActionPerformed

    private void jtSuppliersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtSuppliersMouseClicked
        try{
            int row=jtSuppliers.getSelectedRow();
            String TableClick=jtSuppliers.getModel().getValueAt(row, 0).toString();
            String query="select * from supplier where Supplier_id='"+TableClick+"'";
            
            ResultSet rs = utility.DBconnection.getStatement().executeQuery(query);
            while(rs.next()){
                    tfSupplierId.setText(rs.getString("Supplier_id"));
                    tfName.setText(rs.getString("Supplier_name"));
                    tfAddress.setText(rs.getString("Address"));
                    tfContact.setText(rs.getString("Contact"));
                    tfProducts.setText(rs.getString("Products"));
                }
                tfSupplierId.setEditable(false);
                tfName.setEditable(false);
                tfAddress.setEditable(false);
                tfContact.setEditable(false);
                tfProducts.setEditable(false);
                
                bnSave.setEnabled(false);
                bnDelete.setEnabled(true);
                bnSearch.setText("Edit");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
    }//GEN-LAST:event_jtSuppliersMouseClicked

    private void jtSuppliersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtSuppliersKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_DOWN||evt.getKeyCode() == KeyEvent.VK_UP){
          try{
            int row=jtSuppliers.getSelectedRow();
            String TableClick=jtSuppliers.getModel().getValueAt(row, 0).toString();
            String query="select * from supplier where Supplier_id='"+TableClick+"'";
            
            ResultSet rs = utility.DBconnection.getStatement().executeQuery(query);
            while(rs.next()){
                    tfSupplierId.setText(rs.getString("Supplier_id"));
                    tfName.setText(rs.getString("Supplier_name"));
                    tfAddress.setText(rs.getString("Address"));
                    tfContact.setText(rs.getString("Contact"));
                    tfProducts.setText(rs.getString("Products"));
                }
                tfSupplierId.setEditable(false);
                tfName.setEditable(false);
                tfAddress.setEditable(false);
                tfContact.setEditable(false);
                tfProducts.setEditable(false);
                
                bnSave.setEnabled(false);
                bnDelete.setEnabled(true);
                bnSearch.setText("Edit");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }  
        }
    }//GEN-LAST:event_jtSuppliersKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnClose;
    private javax.swing.JButton bnDelete;
    private javax.swing.JButton bnSave;
    private javax.swing.JButton bnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtSuppliers;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfContact;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfProducts;
    private javax.swing.JTextField tfSupplierId;
    // End of variables declaration//GEN-END:variables
}
