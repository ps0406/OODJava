
public class BuyerMenu extends javax.swing.JFrame {

    /**
     * Creates new form SellerMenu
     */
    public BuyerMenu() {
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

        ViewItemButton = new javax.swing.JButton();
        ManageAccountButton = new javax.swing.JButton();
        ViewTransactionButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SignOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ViewItemButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        ViewItemButton.setText("View Items on Sale");
        ViewItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewItemButtonActionPerformed(evt);
            }
        });

        ManageAccountButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        ManageAccountButton.setText("Manage Account");
        ManageAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageAccountButtonActionPerformed(evt);
            }
        });

        ViewTransactionButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        ViewTransactionButton.setText("View Transaction History");
        ViewTransactionButton.setToolTipText("");
        ViewTransactionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTransactionButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Buyer Menu");

        SignOutButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        SignOutButton.setText("Sign Out");
        SignOutButton.setToolTipText("");
        SignOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SignOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManageAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ViewTransactionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ViewItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(85, 85, 85))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ManageAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewTransactionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SignOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManageAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageAccountButtonActionPerformed
        // TODO add your handling code here:
        new BuyerAccount().setVisible(true);
        this.dispose();    
    }//GEN-LAST:event_ManageAccountButtonActionPerformed

    private void SignOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutButtonActionPerformed
        // TODO add your handling code here:\
        
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignOutButtonActionPerformed

    private void ViewItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewItemButtonActionPerformed
        // TODO add your handling code here:
        
        new BuyerViewItems().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewItemButtonActionPerformed

    private void ViewTransactionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTransactionButtonActionPerformed
        // TODO add your handling code here:
        new BuyerViewRecords().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewTransactionButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SellerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellerMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageAccountButton;
    private javax.swing.JButton SignOutButton;
    private javax.swing.JButton ViewItemButton;
    private javax.swing.JButton ViewTransactionButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
