/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author ~Midori Mato~
 */
public class FormBanve extends javax.swing.JFrame {

    /**
     * Creates new form FormBanve
     */
    public FormBanve() {
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

        jLabelHeader = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(820, 478));
        setResizable(false);
        setSize(new java.awt.Dimension(820, 478));
        getContentPane().setLayout(null);

        jLabelHeader.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelHeader.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/image0.png"))); // NOI18N
        getContentPane().add(jLabelHeader);
        jLabelHeader.setBounds(0, 0, 820, 40);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

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
            java.util.logging.Logger.getLogger(FormBanve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBanve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBanve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBanve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBanve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JLabel jLabelMinimize;
    // End of variables declaration//GEN-END:variables
}
