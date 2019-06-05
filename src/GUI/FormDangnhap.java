package GUI;

import AppPackage.AnimationClass;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FormDangnhap extends javax.swing.JFrame {

    AnimationClass AC = new AnimationClass();

    public FormDangnhap() {

        initComponents();
        SlideShow();

        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void SlideShow() {
        new Thread() {

            int count = 0;

            @Override
            public void run() {
                try {
                    while(true){
                    
                        switch (count) {

                            case 0:
                                ImageIcon a = new ImageIcon(getClass().getResource("/IMAGES/image1.jpg"));
                                jLabelimage1.setIcon(a);    
                                Thread.sleep(3200);
                                AC.jLabelXLeft(0, -820, 20, 10, jLabelimage1);
                                AC.jLabelXLeft(820, 0, 20, 10, jLabelimage2);
                                count = 1;
                                break;
                            case 1:
                                ImageIcon II2 = new ImageIcon(getClass().getResource("/IMAGES/image2.jpg"));
                                jLabelimage2.setIcon(II2); 
                                Thread.sleep(3200);
                                AC.jLabelXRight(-820, 0, 20, 10, jLabelimage1);
                                AC.jLabelXRight(0, 820, 20, 10, jLabelimage2);
                                count = 2;
                                break;
                            case 2:
                                ImageIcon II3 = new ImageIcon(getClass().getResource("/IMAGES/image3.jpg"));
                                jLabelimage1.setIcon(II3); 

                                Thread.sleep(3200);
                                AC.jLabelXLeft(0, -820, 20, 10, jLabelimage1);
                                AC.jLabelXLeft(820, 0, 20, 10, jLabelimage2);
                                count = 3;
                                break;
                            case 3:
                            ImageIcon II4 = new ImageIcon(getClass().getResource("/IMAGES/image4.jpg"));
                                jLabelimage2.setIcon(II4); 
                                Thread.sleep(3200);
                                AC.jLabelXRight(-820, 0, 20, 10, jLabelimage1);
                                AC.jLabelXRight(0, 820, 20, 10, jLabelimage2);
                                count = 0;
                                break;        
                        }
                    }
                } catch (Exception e)
                {
                    
                }
                
            }
        }.start();

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel2 = new javax.swing.JPanel();
        jLabelDangnhap = new javax.swing.JLabel();
        jLabelTendangnhap = new javax.swing.JLabel();
        jTextFieldTendangnhap = new javax.swing.JTextField();
        jLabelMatkhau = new javax.swing.JLabel();
        jPasswordFieldMatkhau = new javax.swing.JPasswordField();
        jButtonDangnhap = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelimage1 = new javax.swing.JLabel();
        jLabelimage2 = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelHeader = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(820, 478));
        setResizable(false);
        setSize(new java.awt.Dimension(820, 478));
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jPanel2.setLayout(null);

        jLabelDangnhap.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelDangnhap.setForeground(new java.awt.Color(255, 51, 51));
        jLabelDangnhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDangnhap.setText("Đăng nhập");
        jPanel2.add(jLabelDangnhap);
        jLabelDangnhap.setBounds(20, 40, 248, 49);

        jLabelTendangnhap.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelTendangnhap.setForeground(new java.awt.Color(0, 255, 0));
        jLabelTendangnhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTendangnhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/iconuser.png"))); // NOI18N
        jPanel2.add(jLabelTendangnhap);
        jLabelTendangnhap.setBounds(20, 120, 50, 40);
        jPanel2.add(jTextFieldTendangnhap);
        jTextFieldTendangnhap.setBounds(70, 125, 180, 30);

        jLabelMatkhau.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelMatkhau.setForeground(new java.awt.Color(0, 255, 0));
        jLabelMatkhau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMatkhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/iconpass.png"))); // NOI18N
        jPanel2.add(jLabelMatkhau);
        jLabelMatkhau.setBounds(20, 186, 50, 30);
        jPanel2.add(jPasswordFieldMatkhau);
        jPasswordFieldMatkhau.setBounds(70, 186, 180, 30);

        jButtonDangnhap.setBackground(new java.awt.Color(204, 255, 204));
        jButtonDangnhap.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonDangnhap.setForeground(new java.awt.Color(0, 0, 153));
        jButtonDangnhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/iconlogin.png"))); // NOI18N
        jButtonDangnhap.setText("Đăng nhập");
        jButtonDangnhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jButtonDangnhap);
        jButtonDangnhap.setBounds(60, 250, 170, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/image5.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 280, 440);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(260, 40, 280, 440);

        jLabelimage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelimage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/image1.jpg"))); // NOI18N
        jLabelimage1.setText(" ");
        getContentPane().add(jLabelimage1);
        jLabelimage1.setBounds(0, 38, 820, 440);

        jLabelimage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelimage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/image2.jpg"))); // NOI18N
        getContentPane().add(jLabelimage2);
        jLabelimage2.setBounds(820, 38, 820, 440);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    /*
    private void jButtonDangnhapActionPerformed(java.awt.event.ActionEvent evt) {                                                
       if(jTextFieldTendangnhap.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Hãy điền tên đăng nhập!");
       } else if (jPassMatkhau.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Hãy điền mật khẩu!");
       } else {
           try String sql = "SELECT * FROM TAIKHOAN" + "WHERE MaNV=? AND Matkhau=?";
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setString (1,jTextFieldTendangnhap.getText());
           ps.setString (1,jPassMatkhau.getText());
           
           ResultSet rs= ps.excuteQuery();
           if(rs.next()){
               JOptionPane.showMessageDialog(this, "Bạn đã đăng nhập thành công.");
           } else {
               JOptionPane.showMessageDialog(this, "Tên đăng nhập không hợp lệ hoặc sai mật khẩu.");
           }
       } catch(Exception e){
           System.out.println(e);
       }
    }                                               
*/
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDangnhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButtonDangnhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelDangnhap;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JLabel jLabelMatkhau;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelTendangnhap;
    private javax.swing.JLabel jLabelimage1;
    private javax.swing.JLabel jLabelimage2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldMatkhau;
    private javax.swing.JTextField jTextFieldTendangnhap;
    // End of variables declaration//GEN-END:variables
}
