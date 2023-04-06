/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ChiTietHoaDonSanPham;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author AN515
 */
public class ChiTietHDSP_DAO {

    private Connection conn;

    public ChiTietHDSP_DAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/store_system_managerment";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert(ChiTietHoaDonSanPham n) {
        String sql = "INSERT INTO `product invoice details`(`id invoice`, `id product details`, `total amount`) VALUES (?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, n.getIdHD());
            ps.setInt(2, n.getIdCTSP());
            ps.setInt(3, n.getThanhTien());
            ps.executeUpdate();
            System.out.println("Thêm thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void truncate() {
        String sql = "TRUNCATE TABLE `product invoice details`";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Xoá dữ liệu bảng thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
