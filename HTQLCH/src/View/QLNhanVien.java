/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ChucVu_DAO;
import Controller.NhanVien_DAO;
import Model.ChucVu;
import Model.NhanVien;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AN515
 */
public class QLNhanVien extends javax.swing.JFrame {

    private DefaultTableModel model;
    private DefaultComboBoxModel cbxModel;
    private List<NhanVien> nhanViens;
    ChucVu_DAO daoCV = new ChucVu_DAO();
    NhanVien_DAO daoNV = new NhanVien_DAO();
    SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");

    int selectedIndexRow;
    int idNhanVien = -1;

    /**
     * Creates new form QLNhanVien
     */
    public QLNhanVien() {
        initComponents();
        this.setLocationRelativeTo(null);
        model = (DefaultTableModel) tableNV.getModel();
        rbtnNam.setSelected(true);
        getCbxChucVu();
        fillDataToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnThem3 = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        rbtnNam = new javax.swing.JRadioButton();
        rbtnNu = new javax.swing.JRadioButton();
        txtNgaySinh = new javax.swing.JTextField();
        cbxChucVu = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNV = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnThem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save-as-24.png"))); // NOI18N
        btnThem3.setText("Thêm");
        btnThem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem3ActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit-11-24.png"))); // NOI18N
        btnSua.setText("Sửa/Cập nhật");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete-24.png"))); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh-24.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit-24.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search-24.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimKiem))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btnRefresh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Mã nhân viên:");

        jLabel3.setText("Tên nhân viên:");

        jLabel4.setText("Chức vụ:");

        jLabel6.setText("Giới tính:");

        jLabel7.setText("Địa chỉ:");

        jLabel8.setText("Số điện thoại:");

        jLabel9.setText("Email:");

        jLabel10.setText("Lương:");

        buttonGroup1.add(rbtnNam);
        rbtnNam.setText("Nam");

        buttonGroup1.add(rbtnNu);
        rbtnNu.setText("Nữ");

        jLabel5.setText("Ngày sinh (dd/MM/yyyy):");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(txtDiaChi))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(86, 86, 86))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(81, 81, 81)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(txtTenNV)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rbtnNam)
                                .addGap(30, 30, 30)
                                .addComponent(rbtnNu))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(txtEmail)
                            .addComponent(txtSDT))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rbtnNam)
                    .addComponent(rbtnNu))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        tableNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã nhân viên", "Tên nhân viên", "Chức vụ", "Ngày sinh", "Giới tính", "Địa chỉ", "Số điện thoại", "Email", "Lương"
            }
        ));
        tableNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableNV);
        if (tableNV.getColumnModel().getColumnCount() > 0) {
            tableNV.getColumnModel().getColumn(0).setMinWidth(10);
            tableNV.getColumnModel().getColumn(0).setMaxWidth(40);
            tableNV.getColumnModel().getColumn(5).setMinWidth(60);
            tableNV.getColumnModel().getColumn(5).setMaxWidth(65);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(605, 605, 605))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem3ActionPerformed
        // TODO add your handling code here:
        try {
            if (validateForm() == true) {
                NhanVien s = new NhanVien();
                s.setMaNV(txtMaNV.getText());
                s.setTenNV(txtTenNV.getText());
                ChucVu l = daoCV.getByName(cbxChucVu.getSelectedItem().toString());
                s.setChucVu(l);
                s.setNgaySinh(formatDate.parse(txtNgaySinh.getText()));
                String gt = "";
                if (rbtnNam.isSelected()) {
                    gt = "Nam";
                } else {
                    gt = "Nữ";
                }
                s.setGioiTinh(gt);
                s.setDiaChi(txtDiaChi.getText());
                s.setSdt(txtSDT.getText());
                s.setEmail(txtEmail.getText());
                s.setLuong(Integer.parseInt(txtLuong.getText()));
                new NhanVien_DAO().insert(s);
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
                fillDataToTable();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThem3ActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        try {
            selectedIndexRow = tableNV.getSelectedRow();
            NhanVien k = nhanViens.get(selectedIndexRow);
            if (validateForm() == true) {
                int reply = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn sửa?");
                if (reply == JOptionPane.YES_OPTION) {
                    new NhanVien_DAO().delete(k.getId());
                    NhanVien s = new NhanVien();
                    s.setMaNV(txtMaNV.getText());
                    s.setTenNV(txtTenNV.getText());
                    ChucVu l = daoCV.getByName(cbxChucVu.getSelectedItem().toString());
                    s.setChucVu(l);
                    s.setNgaySinh(formatDate.parse(txtNgaySinh.getText()));
                    String gt = "";
                    if (rbtnNam.isSelected()) {
                        gt = "Nam";
                    } else {
                        gt = "Nữ";
                    }
                    s.setGioiTinh(gt);
                    s.setDiaChi(txtDiaChi.getText());
                    s.setSdt(txtSDT.getText());
                    s.setEmail(txtEmail.getText());
                    s.setLuong(Integer.parseInt(txtLuong.getText()));
                    new NhanVien_DAO().insert(s);
                    JOptionPane.showMessageDialog(this, "Sửa thành công!");
                    fillDataToTable();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Hãy chọn 1 dòng dữ liệu để sửa!");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        selectedIndexRow = tableNV.getSelectedRow();
        NhanVien s = nhanViens.get(selectedIndexRow);
        if (selectedIndexRow == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn 1 dòng dữ liệu để xoá!");
        } else {
            int reply = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xoá?");
            if (reply == JOptionPane.YES_OPTION) {
                new NhanVien_DAO().delete(s.getId());
                JOptionPane.showMessageDialog(this, "Xoá thành công!");
                fillDataToTable();
            } else {
                return;
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        resetForm();
        fillDataToTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        String message = "Bạn có chắc muốn thoát?";
        String title = "Thoát";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            //System.exit(0);
            this.dispose();
        } else {
            return;
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        String name = txtTimKiem.getText();
        if (name.length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập thông tin tìm kiếm!");
        } else if (name.length() > 0) {
            nhanViens = new NhanVien_DAO().findByName(name);
            model.setRowCount(0);
            for (NhanVien s : nhanViens) {
                model.addRow(new Object[]{
                    tableNV.getRowCount() + 1, s.getMaNV(), s.getTenNV(), s.getChucVu().getTenCV(), formatDate.format(s.getNgaySinh()), s.getGioiTinh(), s.getDiaChi(), s.getSdt(), s.getEmail(), s.getLuong()
                });
            }
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void tableNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNVMouseClicked
        // TODO add your handling code here:
        txtMaNV.setEnabled(false);
        selectedIndexRow = tableNV.getSelectedRow();
        NhanVien k = nhanViens.get(selectedIndexRow);
        txtMaNV.setText(model.getValueAt(selectedIndexRow, 1).toString());
        txtTenNV.setText(model.getValueAt(selectedIndexRow, 2).toString());
//        int position = tableNV.rowAtPoint(evt.getPoint());
//        idNhanVien = Integer.parseInt(tableNV.getValueAt(position, 0).toString());
//        NhanVien nv = daoNV.getByID(idNhanVien);
//        if (nv != null) {
//            setModel(nv);
//        }
        String position = model.getValueAt(selectedIndexRow, 3).toString();
        switch (position) {
            case "Quản lý":
                cbxChucVu.setSelectedIndex(0);
                break;
            case "Nhân viên bán hàng":
                cbxChucVu.setSelectedIndex(1);
                break;
            case "Nhân viên kho hàng":
                cbxChucVu.setSelectedIndex(2);
                break;
            case "Bảo vệ":
                cbxChucVu.setSelectedIndex(3);
                break;
        }
        txtNgaySinh.setText(model.getValueAt(selectedIndexRow, 4).toString());
        String gen = k.getGioiTinh();
        if (gen.equals("Nam")) {
            rbtnNam.setSelected(true);
        } else {
            rbtnNu.setSelected(true);
        }
        txtDiaChi.setText(model.getValueAt(selectedIndexRow, 6).toString());
        txtSDT.setText(model.getValueAt(selectedIndexRow, 7).toString());
        txtEmail.setText(model.getValueAt(selectedIndexRow, 8).toString());
        txtLuong.setText(model.getValueAt(selectedIndexRow, 9).toString());
    }//GEN-LAST:event_tableNVMouseClicked

    private boolean validateForm() {
        if (txtMaNV.getText().equals("") || txtTenNV.getText().equals("")
                || txtNgaySinh.getText().equals("") || txtDiaChi.getText().equals("") || txtSDT.getText().equals("")
                || txtEmail.getText().equals("") || txtLuong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhâp đầy đủ thông tin!");
            return false;
        }
        if (!(Pattern.matches("(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)", txtNgaySinh.getText()))) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đúng ngày sinh!");
            return false;
        }
        if (!(Pattern.matches("0\\d{9,11}", txtSDT.getText()))) {
            JOptionPane.showMessageDialog(this, "Bạn nhập sai số điện thoại!");
            return false;
        }
        if (!(Pattern.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", txtEmail.getText()))) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đúng email!");
            return false;
        }
        try {
            Long.parseLong(txtLuong.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lương nhập vào phải là số!");
            return false;
        }
        return true;
    }

    private void resetForm() {
        txtMaNV.setText("");
        txtTenNV.setText("");
        txtNgaySinh.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        txtLuong.setText("");
        txtTimKiem.setText("");
        cbxChucVu.setSelectedIndex(0);
        rbtnNam.setSelected(true);
        txtMaNV.setEnabled(true);
    }

    private void fillDataToTable() {
        nhanViens = new NhanVien_DAO().getListNhanVien();
        model.setRowCount(0);
        for (NhanVien s : nhanViens) {
            model.addRow(new Object[]{
                tableNV.getRowCount() + 1, s.getMaNV(), s.getTenNV(), s.getChucVu().getTenCV(), formatDate.format(s.getNgaySinh()), s.getGioiTinh(), s.getDiaChi(), s.getSdt(), s.getEmail(), s.getLuong()
            });
        }
    }

    private void getCbxChucVu() {
        cbxModel = (DefaultComboBoxModel) cbxChucVu.getModel();
        for (ChucVu cv : daoCV.getListChucVu()) {
            cbxModel.addElement(cv);
        }
    }

//    private void setModel(NhanVien s) {
//        for (ChucVu l : daoCV.getListChucVu()) {
//            if (l.getId() == s.getChucVu().getId()) {
//                for (int i = 0; i < cbxChucVu.getItemCount(); i++) {
//                    if (l.getTenCV().equals(String.valueOf(cbxChucVu.getItemAt(i)))) {
//                        cbxChucVu.setSelectedIndex(i);
//                    }
//                }
//            }
//        }
//    }

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
            java.util.logging.Logger.getLogger(QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnThem2;
    private javax.swing.JButton btnThem3;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxChucVu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnNam;
    private javax.swing.JRadioButton rbtnNu;
    private javax.swing.JTable tableNV;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}