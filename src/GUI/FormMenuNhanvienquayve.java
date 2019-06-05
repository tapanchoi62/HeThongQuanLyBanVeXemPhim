
package GUI;

import javax.swing.JFrame;

public class FormMenuNhanvienquayve extends javax.swing.JFrame {

   
    public FormMenuNhanvienquayve() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMinimize = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelHeader = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelDatve = new javax.swing.JLabel();
        jButtonDatve = new javax.swing.JButton();
        jLabelDangxuat = new javax.swing.JLabel();
        jButtonDoimatkhau = new javax.swing.JButton();
        jLabelTrangchu = new javax.swing.JLabel();
        jLabelTracuu = new javax.swing.JLabel();
        jLabelDoiatkhau = new javax.swing.JLabel();
        jButtonTracuu = new javax.swing.JButton();
        jButtonDangxuat = new javax.swing.JButton();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(820, 478));
        setResizable(false);
        setSize(new java.awt.Dimension(820, 478));
        getContentPane().setLayout(null);

        jLabelMinimize.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelMinimize);
        jLabelMinimize.setBounds(710, 0, 50, 40);

        jLabelClose.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelClose);
        jLabelClose.setBounds(770, 0, 50, 40);

        jLabelHeader.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelHeader.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/image0.png"))); // NOI18N
        getContentPane().add(jLabelHeader);
        jLabelHeader.setBounds(0, 0, 820, 40);

        jPanel1.setLayout(null);

        jLabelDatve.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDatve.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDatve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDatve.setText("Đặt vé");
        jPanel1.add(jLabelDatve);
        jLabelDatve.setBounds(60, 240, 130, 30);

        jButtonDatve.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDatve.setForeground(new java.awt.Color(255, 0, 0));
        jButtonDatve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icon7.png"))); // NOI18N
        jButtonDatve.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButtonDatve);
        jButtonDatve.setBounds(70, 140, 110, 100);

        jLabelDangxuat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDangxuat.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDangxuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDangxuat.setText("Đăng xuất");
        jPanel1.add(jLabelDangxuat);
        jLabelDangxuat.setBounds(650, 240, 130, 30);

        jButtonDoimatkhau.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDoimatkhau.setForeground(new java.awt.Color(255, 0, 0));
        jButtonDoimatkhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icon9.jpg"))); // NOI18N
        jButtonDoimatkhau.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDoimatkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoimatkhauActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDoimatkhau);
        jButtonDoimatkhau.setBounds(450, 140, 110, 100);

        jLabelTrangchu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelTrangchu.setForeground(new java.awt.Color(255, 0, 0));
        jLabelTrangchu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTrangchu.setText("TRANG CHỦ");
        jPanel1.add(jLabelTrangchu);
        jLabelTrangchu.setBounds(260, 10, 280, 30);

        jLabelTracuu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelTracuu.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTracuu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTracuu.setText("Tra cứu mã vé");
        jPanel1.add(jLabelTracuu);
        jLabelTracuu.setBounds(240, 240, 130, 30);

        jLabelDoiatkhau.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDoiatkhau.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDoiatkhau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDoiatkhau.setText("Đổi mật khẩu");
        jPanel1.add(jLabelDoiatkhau);
        jLabelDoiatkhau.setBounds(440, 240, 130, 30);

        jButtonTracuu.setBackground(new java.awt.Color(0, 0, 0));
        jButtonTracuu.setForeground(new java.awt.Color(255, 0, 0));
        jButtonTracuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icon10.jpg"))); // NOI18N
        jButtonTracuu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButtonTracuu);
        jButtonTracuu.setBounds(250, 140, 110, 100);

        jButtonDangxuat.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDangxuat.setForeground(new java.awt.Color(255, 0, 0));
        jButtonDangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icon11.png"))); // NOI18N
        jButtonDangxuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButtonDangxuat);
        jButtonDangxuat.setBounds(660, 140, 110, 100);

        jLabelBackground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/image12.png"))); // NOI18N
        jPanel1.add(jLabelBackground);
        jLabelBackground.setBounds(0, 0, 820, 440);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 40, 820, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jButtonDoimatkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoimatkhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDoimatkhauActionPerformed

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
            java.util.logging.Logger.getLogger(FormMenuNhanvienquayve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenuNhanvienquayve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenuNhanvienquayve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenuNhanvienquayve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenuNhanvienquayve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDangxuat;
    private javax.swing.JButton jButtonDatve;
    private javax.swing.JButton jButtonDoimatkhau;
    private javax.swing.JButton jButtonTracuu;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelDangxuat;
    private javax.swing.JLabel jLabelDatve;
    private javax.swing.JLabel jLabelDoiatkhau;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelTracuu;
    private javax.swing.JLabel jLabelTrangchu;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
