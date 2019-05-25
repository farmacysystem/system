/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import db.DBConnection;
import java.awt.List;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import logic.ItemAction;
import logic.Ref;

/**
 *
 * @author Indunil
 */
public class AddItem extends javax.swing.JPanel {

    /**
     * Creates new form AddItem
     */
    
    public AddItem() {
        
        initComponents();
        fillCombo1();
        
    }
    
    public void fillCombo1()
    {
        String sql="SELECT * FROM ref";
        
        DBConnection db=new DBConnection(); 
        Connection con=db.getConnection();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                comboRefName.addItem(rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddItem.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        comboRefName = new javax.swing.JComboBox<>();
        itemId = new javax.swing.JTextField();
        itemName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtsalePrice = new javax.swing.JTextField();
        txtretailPrice = new javax.swing.JTextField();

        jLabel2.setText("Ref Name");

        jLabel3.setText("Item Id");

        jLabel4.setText("Item Name");

        jLabel5.setText("Quantity");

        jLabel6.setText("Whole Sale Price");

        jButton1.setText("Add This Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Retail Price");

        itemId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemIdKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboRefName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(itemId, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(itemName)
                            .addComponent(txtQuantity)
                            .addComponent(txtsalePrice)
                            .addComponent(txtretailPrice)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jButton1)))
                .addContainerGap(355, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboRefName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtsalePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtretailPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String bName=itemName.getText();
//        String itemId = i
        String refName=comboRefName.getSelectedItem().toString();
        
        Ref ref=new Ref();
        String id=ref.getRefId(refName);
        int refId=Integer.parseInt(id);
        String ItemId=itemId.getText();
        String quantity=txtQuantity.getText();
        String salePrice=txtsalePrice.getText();
        String wholesalePrice=txtretailPrice.getText();
        Double quantityD=Double.parseDouble(quantity);
        Double rPrice=Double.parseDouble(salePrice);
        Double sprice=Double.parseDouble(wholesalePrice);
        model.Stock stock=new model.Stock();
        stock.setItemId(ItemId);
        stock.setQuantity(quantityD);
        stock.setRefId(refId);
        stock.setRecievePrice(rPrice);
        stock.setSalePrice(sprice);
        ItemAction ia=new ItemAction();
        boolean result=ia.stockItem(stock);
        if(result)
        {
             JOptionPane.showMessageDialog(null, "Stock the Item !!");
        }else
        {
            JOptionPane.showMessageDialog(null, "Fail !!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void itemIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemIdKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){ 
           String itemId1=itemId.getText();
            ItemAction ia=new ItemAction();
            String itemName1=ia.getItemName(itemId1);
          
          
         if(itemName!=null){
               itemName.setText(itemName1);
          }
        else{
              itemName.setText("Item Not Found");
                         
          } }   
    }//GEN-LAST:event_itemIdKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboRefName;
    private javax.swing.JTextField itemId;
    private javax.swing.JTextField itemName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtretailPrice;
    private javax.swing.JTextField txtsalePrice;
    // End of variables declaration//GEN-END:variables
}
