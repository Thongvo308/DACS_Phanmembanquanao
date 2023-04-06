/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ChiTietSanPham;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author AN515
 */
public class ChiTietSP_DAO {

    private Connection conn;

    public ChiTietSP_DAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/store_system_managerment";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<ChiTietSanPham> getListCTSP() {
        ArrayList<ChiTietSanPham> list = new ArrayList<>();
        String sql = "SELECT * FROM `product details`";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietSanPham c = new ChiTietSanPham();
                c.setId(rs.getInt("id"));
                c.setMaSP(rs.getString("id product"));
                c.setTenSP(rs.getString("name"));
                c.setSoLuong(rs.getInt("quantity"));
                c.setTongGia(rs.getInt("total amount"));
                list.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void insert(ChiTietSanPham n) {
        int last = 0;
        String sql = "INSERT INTO `product details`(`id product`, `name`, `quantity`, `total amount`) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, n.getMaSP());
            ps.setString(2, n.getTenSP());
            ps.setInt(3, n.getSoLuong());
            ps.setInt(4, n.getTongGia());
            ps.executeUpdate();
            ResultSet generatekey = ps.getGeneratedKeys();
            System.out.println("Thêm thành công!");
            if (generatekey.next()) {
                last = generatekey.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM `product details` WHERE id =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Xoá thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void truncate() {
        String sql = "TRUNCATE TABLE `product details`";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Xoá dữ liệu bảng thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
