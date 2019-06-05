
package GUI;

import javax.swing.JFrame;


public class FormMenuQuantri extends javax.swing.JFrame {

   
    public FormMenuQuantri() {
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
        jButtonQLPhim = new javax.swing.JButton();
        jLabelTrangchu = new javax.swing.JLabel();
        jButtonQLKhachhang = new javax.swing.JButton();
        jButtonQLPhongchieu = new javax.swing.JButton();
        jButtonQLLichchieu = new javax.swing.JButton();
        jButtonDangxuat = new javax.swing.JButton();
        jButtonQLTaikhoan = new javax.swing.JButton();
        jLabelQLLichchieu = new javax.swing.JLabel();
        jLabelQLPhim = new javax.swing.JLabel();
        jLabelQLPhongchieu = new javax.swing.JLabel();
        jLabelDangxuat = new javax.swing.JLabel();
        jLabelQLTaikhoan = new javax.swing.JLabel();
        jButtonDoimatkhau = new javax.swing.JButton();
        jButtonThongke = new javax.swing.JButton();
        jButtonQLGiave = new javax.swing.JButton();
        jButtonQLKhuyenmai = new javax.swing.JButton();
        jLabelDoiatkhau = new javax.swing.JLabel();
        jLabelThongke = new javax.swing.JLabel();
        jLabelQLGiave = new javax.swing.JLabel();
        jLabelQLKhuyenmai = new javax.swing.JLabel();
        jLabelQLKhachhang = new javax.swing.JLabel();
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

        jButtonQLPhim.setBackground(new java.awt.Color(0, 0, 0));
        jButtonQLPhim.setForeground(new java.awt.Color(255, 0, 0));
        jButtonQLPhim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icon3.png"))); // NOI18N
        jButtonQLPhim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonQLPhim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQLPhimActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonQLPhim);
        jButtonQLPhim.setBounds(360, 80, 110, 100);

        jLabelTrangchu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelTrangchu.setForeground(new java.awt.Color(255, 0, 0));
        jLabelTrangchu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTrangchu.setText("TRANG CHỦ");
        jPanel1.add(jLabelTrangchu);
        jLabelTrangchu.setBounds(260, 10, 280, 30);

        jButtonQLKhachhang.setBackground(new java.awt.Color(0, 0, 0));
        jButtonQLKhachhang.setForeground(new java.awt.Color(255, 0, 0));
        jButtonQLKhachhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icon1.png"))); // NOI18N
        jButtonQLKhachhang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonQLKhachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQLKhachhangActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonQLKhachhang);
        jButtonQLKhachhang.setBounds(20, 80, 110, 100);

        jButtonQLPhongchieu.setBackground(new java.awt.Color(0, 0, 0));
        jButtonQLPhongchieu.setForeground(new java.awt.Color(255, 0, 0));
        jButtonQLPhongchieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icon4.jpg"))); // NOI18N
        jButtonQLPhongchieu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonQLPhongchieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQLPhongchieuActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonQLPhongchieu);
        jButtonQLPhongchieu.setBounds(530, 80, 110, 100);

        jButtonQLLichchieu.setBackground(new java.awt.Color(0, 0, 0));
        jButtonQLLichchieu.setForeground(new java.awt.Color(255, 0, 0));
        jButtonQLLichchieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icon5.png"))); // NOI18N
        jButtonQLLichchieu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonQLLichchieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQLLichchieuActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonQLLichchieu);
        jButtonQLLichchieu.setBounds(690, 80, 110, 100);

        jButtonDangxuat.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDangxuat.setForeground(new java.awt.Color(255, 0, 0));
        jButtonDangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icon11.png"))); // NOI18N
        jButtonDangxuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButtonDangxuat);
        jButtonDangxuat.setBounds(690, 230, 110, 100);

        jButtonQLTaikhoan.setBackground(new java.awt.Color(0, 0, 0));
        jButtonQLTaikhoan.setForeground(new java.awt.Color(255, 0, 0));
        jButtonQLTaikhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icon2.png"))); // NOI18N
        jButtonQLTaikhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonQLTaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQLTaikhoanActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonQLTaikhoan);
        jButtonQLTaikhoan.setBounds(190, 80, 110, 100);

        jLabelQLLichchieu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelQLLichchieu.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQLLichchieu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelQLLichchieu.setText("Quản lý lịch chiếu");
        jPanel1.add(jLabelQLLichchieu);
        jLabelQLLichchieu.setBounds(680, 180, 130, 30);

        jLabelQLPhim.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelQLPhim.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQLPhim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelQLPhim.setText("Quản lý phim");
        jPanel1.add(jLabelQLPhim);
        jLabelQLPhim.setBounds(350, 180, 130, 30);

        jLabelQLPhongchieu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelQLPhongchieu.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQLPhongchieu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelQLPhongchieu.setText("Quản lý phòng chiếu");
        jPanel1.add(jLabelQLPhongchieu);
        jLabelQLPhongchieu.setBounds(520, 180, 130, 30);

        jLabelDangxuat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDangxuat.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDangxuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDangxuat.setText("Đăng xuất");
        jPanel1.add(jLabelDangxuat);
        jLabelDangxuat.setBounds(680, 330, 130, 30);

        jLabelQLTaikhoan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelQLTaikhoan.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQLTaikhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelQLTaikhoan.setText("Quản lý tài khoản");
        jPanel1.add(jLabelQLTaikhoan);
        jLabelQLTaikhoan.setBounds(180, 180, 130, 30);

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
        jButtonDoimatkhau.setBounds(530, 230, 110, 100);

        jButtonThongke.setBackground(new java.awt.Color(0, 0, 0));
        jButtonThongke.setForeground(new java.awt.Color(255, 0, 0));
        jButtonThongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icon8.png"))); // NOI18N
        jButtonThongke.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButtonThongke);
        jButtonThongke.setBounds(370, 230, 110, 100);

        jButtonQLGiave.setBackground(new java.awt.Color(0, 0, 0));
        jButtonQLGiave.setForeground(new java.awt.Color(255, 0, 0));
        jButtonQLGiave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icon7.png"))); // NOI18N
        jButtonQLGiave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonQLGiave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQLGiaveActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonQLGiave);
        jButtonQLGiave.setBounds(200, 230, 110, 100);

        jButtonQLKhuyenmai.setBackground(new java.awt.Color(0, 0, 0));
        jButtonQLKhuyenmai.setForeground(new java.awt.Color(255, 0, 0));
        jButtonQLKhuyenmai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icon6.png"))); // NOI18N
        jButtonQLKhuyenmai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonQLKhuyenmai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQLKhuyenmaiActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonQLKhuyenmai);
        jButtonQLKhuyenmai.setBounds(20, 230, 110, 100);

        jLabelDoiatkhau.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDoiatkhau.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDoiatkhau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDoiatkhau.setText("Đổi mật khẩu");
        jPanel1.add(jLabelDoiatkhau);
        jLabelDoiatkhau.setBounds(520, 330, 130, 30);

        jLabelThongke.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelThongke.setForeground(new java.awt.Color(255, 255, 255));
        jLabelThongke.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelThongke.setText("Thống kê, báo cáo");
        jPanel1.add(jLabelThongke);
        jLabelThongke.setBounds(360, 330, 130, 30);

        jLabelQLGiave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelQLGiave.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQLGiave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelQLGiave.setText("Quản lý giá vé");
        jPanel1.add(jLabelQLGiave);
        jLabelQLGiave.setBounds(190, 330, 130, 30);

        jLabelQLKhuyenmai.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelQLKhuyenmai.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQLKhuyenmai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelQLKhuyenmai.setText("Quản lý khuyến mãi");
        jPanel1.add(jLabelQLKhuyenmai);
        jLabelQLKhuyenmai.setBounds(10, 330, 130, 30);

        jLabelQLKhachhang.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelQLKhachhang.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQLKhachhang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelQLKhachhang.setText("Quản lý khách hàng");
        jPanel1.add(jLabelQLKhachhang);
        jLabelQLKhachhang.setBounds(10, 180, 130, 30);

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/image12.png"))); // NOI18N
        jLabelBackground.setOpaque(true);
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

    private void jButtonQLKhachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQLKhachhangActionPerformed
       FormQLKhachhang call = new FormQLKhachhang();
       call.setVisible(true);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       pack();
       dispose();
    }//GEN-LAST:event_jButtonQLKhachhangActionPerformed

    private void jButtonQLTaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQLTaikhoanActionPerformed
       FormQLTaikhoan call = new FormQLTaikhoan();
       call.setVisible(true);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       pack();
       dispose();
    }//GEN-LAST:event_jButtonQLTaikhoanActionPerformed

    private void jButtonQLPhimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQLPhimActionPerformed
       FormQLPhim call = new FormQLPhim();
       call.setVisible(true);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       pack();
       dispose();
    }//GEN-LAST:event_jButtonQLPhimActionPerformed

    private void jButtonQLPhongchieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQLPhongchieuActionPerformed
       FormQLPhongchieu call = new FormQLPhongchieu();
       call.setVisible(true);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       pack();
       dispose();
    }//GEN-LAST:event_jButtonQLPhongchieuActionPerformed

    private void jButtonQLLichchieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQLLichchieuActionPerformed
       FormQLLichchieu call = new FormQLLichchieu();
       call.setVisible(true);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       pack();
       dispose();
    }//GEN-LAST:event_jButtonQLLichchieuActionPerformed

    private void jButtonQLKhuyenmaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQLKhuyenmaiActionPerformed
       FormQLKhuyenmai call = new FormQLKhuyenmai();
       call.setVisible(true);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       pack();
       dispose();
    }//GEN-LAST:event_jButtonQLKhuyenmaiActionPerformed

    private void jButtonQLGiaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQLGiaveActionPerformed
       FormQLGiave call = new FormQLGiave();
       call.setVisible(true);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       pack();
       dispose();
    }//GEN-LAST:event_jButtonQLGiaveActionPerformed

    private void jButtonDoimatkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoimatkhauActionPerformed
        FormDoimatkhau call = new FormDoimatkhau();
       call.setVisible(true);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       pack();
       dispose();
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
            java.util.logging.Logger.getLogger(FormMenuQuantri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenuQuantri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenuQuantri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenuQuantri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenuQuantri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDangxuat;
    private javax.swing.JButton jButtonDoimatkhau;
    private javax.swing.JButton jButtonQLGiave;
    private javax.swing.JButton jButtonQLKhachhang;
    private javax.swing.JButton jButtonQLKhuyenmai;
    private javax.swing.JButton jButtonQLLichchieu;
    private javax.swing.JButton jButtonQLPhim;
    private javax.swing.JButton jButtonQLPhongchieu;
    private javax.swing.JButton jButtonQLTaikhoan;
    private javax.swing.JButton jButtonThongke;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelDangxuat;
    private javax.swing.JLabel jLabelDoiatkhau;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelQLGiave;
    private javax.swing.JLabel jLabelQLKhachhang;
    private javax.swing.JLabel jLabelQLKhuyenmai;
    private javax.swing.JLabel jLabelQLLichchieu;
    private javax.swing.JLabel jLabelQLPhim;
    private javax.swing.JLabel jLabelQLPhongchieu;
    private javax.swing.JLabel jLabelQLTaikhoan;
    private javax.swing.JLabel jLabelThongke;
    private javax.swing.JLabel jLabelTrangchu;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
