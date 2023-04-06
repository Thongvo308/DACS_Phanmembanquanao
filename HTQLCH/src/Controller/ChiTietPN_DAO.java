/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ChiTietPhieuNhap;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author AN515
 */
public class ChiTietPN_DAO {

    private Connection conn;

    public ChiTietPN_DAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/store_system_managerment";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<ChiTietPhieuNhap> getListChiTietPN() {
        ArrayList<ChiTietPhieuNhap> list = new ArrayList<>();
        String sql = "SELECT * FROM `receiving transaction details`";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietPhieuNhap n = new ChiTietPhieuNhap();
                n.setId(rs.getInt("id"));
                n.setPhieuNhap(rs.getInt("id receiving transaction"));
                n.setSanPham(rs.getInt("id product"));
                n.setSoLuong(rs.getInt("quantity"));
                list.add(n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
        public void insert(ChiTietPhieuNhap n) {
        String sql = "INSERT INTO `receiving transaction details`(`id receiving transaction`, `id product`, `quantity`) VALUES (?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, n.getPhieuNhap());
            ps.setInt(2, n.getSanPham());
            ps.setInt(3, n.getSoLuong());
            ps.executeUpdate();
            System.out.println("Thêm thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
