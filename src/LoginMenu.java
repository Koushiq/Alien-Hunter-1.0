
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Koushiq
 */
public class LoginMenu extends javax.swing.JFrame {

    /**
     * Creates new form LoginMenu
     */
    private JFrame jf;
    public LoginMenu() {
        jf= new JFrame();
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlableMinimize = new javax.swing.JLabel();
        jlableClose = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        deleteAccountButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        clickme = new javax.swing.JLabel();
        resetAccountButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(135, 46, 146));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alien  Hunter  1.0 ");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jlableMinimize.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlableMinimize.setForeground(new java.awt.Color(255, 255, 255));
        jlableMinimize.setText("_");
        jlableMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlableMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlableMinimizeMouseClicked(evt);
            }
        });

        jlableClose.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlableClose.setForeground(new java.awt.Color(255, 255, 255));
        jlableClose.setText("X");
        jlableClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlableClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlableCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jlableMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlableClose)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlableClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlableMinimize))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        deleteAccountButton.setBackground(new java.awt.Color(194, 0, 29));
        deleteAccountButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteAccountButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteAccountButton.setText("Delete Account");
        deleteAccountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteAccountButtonMouseClicked(evt);
            }
        });
        deleteAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccountButtonActionPerformed(evt);
            }
        });

        playButton.setBackground(new java.awt.Color(34, 167, 240));
        playButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        playButton.setForeground(new java.awt.Color(255, 255, 255));
        playButton.setText("Play");
        playButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playButtonMouseClicked(evt);
            }
        });
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        clickme.setBackground(new java.awt.Color(102, 102, 102));
        clickme.setForeground(new java.awt.Color(255, 255, 255));
        clickme.setText("Click here to go back to previous page");
        clickme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clickme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickmeMouseClicked(evt);
            }
        });

        resetAccountButton.setBackground(new java.awt.Color(51, 188, 18));
        resetAccountButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetAccountButton.setForeground(new java.awt.Color(255, 255, 255));
        resetAccountButton.setText("Reset Stats");
        resetAccountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetAccountButtonMouseClicked(evt);
            }
        });
        resetAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetAccountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(clickme)
                .addGap(120, 120, 120))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resetAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(resetAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(deleteAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(clickme)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlableMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlableMinimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jlableMinimizeMouseClicked

    private void jlableCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlableCloseMouseClicked
        // TODO add your handling code here:
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jlableCloseMouseClicked

    private void deleteAccountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAccountButtonMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_deleteAccountButtonMouseClicked

    private void deleteAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccountButtonActionPerformed
        // TODO add your handling code here:
        String username = Main.menu.getUserName();
        Main.db.deleteAcc(username);
    }//GEN-LAST:event_deleteAccountButtonActionPerformed

    private void playButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        /*dispose();
        Main.signup.dispose();
        Main.menu.dispose();
        */
        Main.game.start();
    }//GEN-LAST:event_playButtonMouseClicked

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playButtonActionPerformed

    private void clickmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickmeMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        Main.menu.setVisible(true);
    }//GEN-LAST:event_clickmeMouseClicked

    private void resetAccountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetAccountButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_resetAccountButtonMouseClicked

    private void resetAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetAccountButtonActionPerformed
        // TODO add your handling code here:
       String username = Main.menu.getUserName();
       
       Main.db.resetValues(username);
    }//GEN-LAST:event_resetAccountButtonActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(jf,"Developer -> Rahman , S.M Mushfiqur");
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(LoginMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clickme;
    private javax.swing.JButton deleteAccountButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel jlableClose;
    private javax.swing.JLabel jlableMinimize;
    private javax.swing.JButton playButton;
    private javax.swing.JButton resetAccountButton;
    // End of variables declaration//GEN-END:variables
}
