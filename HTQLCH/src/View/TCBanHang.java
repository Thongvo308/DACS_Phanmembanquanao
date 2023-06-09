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
public class TCBanHang extends javax.swing.JFrame {

    /**
     * Creates new form TCBanHang
     */
    public TCBanHang() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    String userAcc;

    public TCBanHang(String username) {
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

        txtUsername = new javax.swing.JLabel();
        txtPic = new javax.swing.JLabel();
        titile = new javax.swing.JLabel();
        subTitle = new javax.swing.JLabel();
        btnKhachHang = new javax.swing.JButton();
        btnLapDonHang = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnThongKeDT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtUsername.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        txtUsername.setText("username");

        txtPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/assistant-48.png"))); // NOI18N

        titile.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titile.setText("HỆ THỐNG QUẢN LÝ CỬA HÀNG QUẦN ÁO ");

        subTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        subTitle.setText("NHÂN VIÊN BÁN HÀNG");

        btnKhachHang.setBackground(new java.awt.Color(204, 204, 204));
        btnKhachHang.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/conference-32.png"))); // NOI18N
        btnKhachHang.setText("KHÁCH HÀNG");
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });

        btnLapDonHang.setBackground(new java.awt.Color(204, 204, 204));
        btnLapDonHang.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnLapDonHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/purchase-order-32.png"))); // NOI18N
        btnLapDonHang.setText("LẬP ĐƠN HÀNG");
        btnLapDonHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLapDonHangActionPerformed(evt);
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

        btnThongKeDT.setBackground(new java.awt.Color(204, 204, 204));
        btnThongKeDT.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnThongKeDT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bill-32.png"))); // NOI18N
        btnThongKeDT.setText("THỐNG KÊ DOANH THU");
        btnThongKeDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeDTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnThongKeDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLapDonHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(103, 103, 103)
                            .addComponent(subTitle))
                        .addComponent(titile)))
                .addGap(0, 198, Short.MAX_VALUE))
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
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLapDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThongKeDT, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        // TODO add your handling code here:
        QLKhachHang k = new QLKhachHang();
        k.setVisible(true);
        k.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnLapDonHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLapDonHangActionPerformed
        // TODO add your handling code here:
        QLDonHang d = new QLDonHang();
        d.setVisible(true);
        d.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnLapDonHangActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Đăng xuất thành công!");
        DangNhap d = new DangNhap();
        d.setVisible(true);
        d.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnThongKeDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeDTActionPerformed
        // TODO add your handling code here:
        ThongKeDoanhThu d = new ThongKeDoanhThu();
        d.setVisible(true);
        d.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnThongKeDTActionPerformed

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
            java.util.logging.Logger.getLogger(TCBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TCBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TCBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TCBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TCBanHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnLapDonHang;
    private javax.swing.JButton btnThongKeDT;
    private javax.swing.JLabel subTitle;
    private javax.swing.JLabel titile;
    private javax.swing.JLabel txtPic;
    private javax.swing.JLabel txtUsername;
    // End of variables declaration//GEN-END:variables
}
