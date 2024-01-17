
import java.awt.Color;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author apoor
 */
public class PROPERTY_TYPE_WINDOW extends javax.swing.JFrame {

    /**
     * Creates new form PROPERTY_TYPE_WINDOW
     */
    public PROPERTY_TYPE_WINDOW() {
        initComponents();
        
       
            // set border to the jpanel title
           Border panel_title_border = BorderFactory.createMatteBorder (0, 0, 3, 0, Color.orange);
            jPanel_Title.setBorder (panel_title_border);
            
            fillTypeList();
    }
    
    // function to populate the Jlist using type hashmap
    public void fillTypeList()
    {
        P_TYPE type = new P_TYPE();
        
        HashMap<String, Integer> map = type.getTtypesMap();
        
        DefaultListModel ListModel = new DefaultListModel();
        
        int i = 0;
        
        for(String typeName: map.keySet())
        {
            ListModel.add(i, typeName);
            
            i++;
        }
        jList1.setModel(ListModel);
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
        jPanel_Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jTextField_name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_dsc = new javax.swing.JTextArea();
        jButton_edit_type = new javax.swing.JButton();
        jButton_add_type = new javax.swing.JButton();
        jButton_refresh_type = new javax.swing.JButton();
        jButton_remove_type = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jPanel_Title.setBackground(new java.awt.Color(255, 153, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Russo One", 1, 24)); // NOI18N
        jLabel1.setText("     PROPERTY TYPES");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TitleLayout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(361, 361, 361))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("NAME:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("DESCRIPTION:");

        jTextField_id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jTextField_name.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jTextArea_dsc.setColumns(20);
        jTextArea_dsc.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        jTextArea_dsc.setRows(5);
        jScrollPane1.setViewportView(jTextArea_dsc);

        jButton_edit_type.setBackground(new java.awt.Color(51, 255, 255));
        jButton_edit_type.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_edit_type.setText("Edit");
        jButton_edit_type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_edit_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_edit_typeActionPerformed(evt);
            }
        });

        jButton_add_type.setBackground(new java.awt.Color(51, 255, 255));
        jButton_add_type.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_add_type.setText("Add");
        jButton_add_type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_add_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_typeActionPerformed(evt);
            }
        });

        jButton_refresh_type.setBackground(new java.awt.Color(51, 255, 255));
        jButton_refresh_type.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_refresh_type.setText("Refresh");
        jButton_refresh_type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_refresh_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_refresh_typeActionPerformed(evt);
            }
        });

        jButton_remove_type.setBackground(new java.awt.Color(51, 255, 255));
        jButton_remove_type.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton_remove_type.setText("Remove");
        jButton_remove_type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_remove_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_remove_typeActionPerformed(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButton_add_type, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButton_edit_type, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton_remove_type, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(124, 124, 124)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_name, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jButton_refresh_type, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_add_type, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_edit_type, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_remove_type, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_refresh_type, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

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

    private void jButton_add_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_typeActionPerformed
        
        String name = jTextField_name.getText();
        String description = jTextArea_dsc.getText();
        
        P_TYPE type = new P_TYPE(0, name, description);
        if(!name.trim().equals(""))
        {
             if(type.execTypeQuery("add", type))
        {
            JOptionPane.showMessageDialog(null, "New Type Added", "Add Type", 1);
        }
        else{
            JOptionPane.showMessageDialog(null, "Operation Failed", "Add Type", 2);
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Enter Type Name", "Empty Name", 2);
        }
       
    }//GEN-LAST:event_jButton_add_typeActionPerformed

    private void jButton_edit_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_edit_typeActionPerformed
       
     try{
            Integer id = Integer.valueOf(jTextField_id.getText());
      String name = jTextField_name.getText();
        String description = jTextArea_dsc.getText();
        
        P_TYPE type = new P_TYPE(id, name, description);
        if(!name.trim().equals(""))
        {
             if(type.execTypeQuery("edit", type))
        {
            JOptionPane.showMessageDialog(null, "New Type Updated", "Edit Type", 1);
        }
        else{
            JOptionPane.showMessageDialog(null, "Operation Failed", "Edit Type", 2);
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Enter Type Name", "Empty Name", 2);
        }
     }catch(Exception ex)
     {
         JOptionPane.showMessageDialog(null, ex.getMessage() + "Enter a Valid Type ID", "Invalid ID", 0);
     }
       
    }//GEN-LAST:event_jButton_edit_typeActionPerformed

    private void jButton_remove_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_remove_typeActionPerformed
        
        try{
              Integer id = Integer.valueOf(jTextField_id.getText());
     
        
        P_TYPE type = new P_TYPE(id, "", "");
        if(!jTextField_id.getText().trim().equals(""))
        {
            int yes_or_no = JOptionPane.showConfirmDialog(null, "Do You Want To Delete This Type?","Delete Type", JOptionPane.YES_NO_OPTION);
            if(yes_or_no == JOptionPane.YES_OPTION)
            {
                  if(type.execTypeQuery("remove", type))
            {
                    JOptionPane.showMessageDialog(null, "Type Deleted", "Delete Type", 1);
            }
                else{
                    JOptionPane.showMessageDialog(null, "Operation Failed", "Delete Type", 2);
            } 
            }
         
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Enter Type Id", "Empty Id", 2);
        }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage() + "Enter a Valid Type ID", "Invalid ID", 0);
        }
    }//GEN-LAST:event_jButton_remove_typeActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        
        P_TYPE type = new P_TYPE();
        HashMap<String, Integer> map = type.getTtypesMap();
        Integer typeId = map.get(jList1.getSelectedValue().toString());
        type = type.getTypeById(typeId);
        jTextField_id.setText(type.getId().toString());
        jTextField_name.setText(type.getName());
        jTextArea_dsc.setText(type.getDescription());
        
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton_refresh_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_refresh_typeActionPerformed
        fillTypeList();
    }//GEN-LAST:event_jButton_refresh_typeActionPerformed

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
            java.util.logging.Logger.getLogger(PROPERTY_TYPE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_TYPE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_TYPE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_TYPE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROPERTY_TYPE_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add_type;
    private javax.swing.JButton jButton_edit_type;
    private javax.swing.JButton jButton_refresh_type;
    private javax.swing.JButton jButton_remove_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea_dsc;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_name;
    // End of variables declaration//GEN-END:variables
}