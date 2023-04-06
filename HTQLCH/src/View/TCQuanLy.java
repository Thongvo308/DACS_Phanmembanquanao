/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author AN515
 */
public class TCQuanLy extends javax.swing.JFrame {

    /**
     * Creates new form TCQuanLy
     */
    public TCQuanLy() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    String userAcc;

    public TCQuanLy(String username) {
        initComponents();
        userAcc = username;
        txtUsername.setText(userAcc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHangSX = new javax.swing.JButton();
        btnNhaPP = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        subTitle = new javax.swing.JLabel();
        titile = new javax.swing.JLabel();
        txtUsername = new javax.swing.JLabel();
        txtPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHangSX.setBackground(new java.awt.Color(204, 204, 204));
        btnHangSX.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnHangSX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/factory-32.png"))); // NOI18N
        btnHangSX.setText("HÃNG SẢN XUẤT");
        btnHangSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHangSXActionPerformed(evt);
            }
        });

        btnNhaPP.setBackground(new java.awt.Color(204, 204, 204));
        btnNhaPP.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnNhaPP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/organization-32.png"))); // NOI18N
        btnNhaPP.setText("NHÀ PHÂN PHỐI");
        btnNhaPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhaPPActionPerformed(evt);
            }
        });

        btnDangXuat.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout-32.png"))); // NOI18N
        btnDangXuat.setText("ĐĂNG XUẤT");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        subTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        subTitle.setText("NHÂN VIÊN QUẢN LÝ");

        titile.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titile.setText("HỆ THỐNG QUẢN LÝ CỬA HÀNG QUẦN ÁO ");

        txtUsername.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        txtUsername.setText("username");

        txtPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manager-48.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(titile)
                .addGap(0, 198, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnHangSX)
                        .addGap(63, 63, 63)
                        .addComponent(btnNhaPP)
                        .addGap(59, 59, 59)
                        .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(subTitle)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txtUsername))
                    .addComponent(txtPic, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(titile)
                .addGap(18, 18, 18)
                .addComponent(subTitle)
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHangSX, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNhaPP, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHangSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHangSXActionPerformed
        // TODO add your handling code here:
        QLHangSX k = new QLHangSX();
        k.setVisible(true);
        k.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnHangSXActionPerformed

    private void btnNhaPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhaPPActionPerformed
        // TODO add your handling code here:
        QLNhaPP d = new QLNhaPP();
        d.setVisible(true);
        d.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnNhaPPActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Đăng xuất thành công!");
        DangNhap d = new DangNhap();
        d.setVisible(true);
        d.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnDangXuatActionPerformed

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
            java.util.logging.Logger.getLogger(TCQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TCQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TCQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TCQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TCQuanLy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHangSX;
    private javax.swing.JButton btnNhaPP;
    private javax.swing.JLabel subTitle;
    private javax.swing.JLabel titile;
    private javax.swing.JLabel txtPic;
    private javax.swing.JLabel txtUsername;
    // End of variables declaration//GEN-END:variables
}
