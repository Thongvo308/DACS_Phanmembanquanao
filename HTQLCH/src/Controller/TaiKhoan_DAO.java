/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.LoaiTaiKhoan;
import Model.NhanVien;
import Model.TaiKhoan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author AN515
 */
public class TaiKhoan_DAO {

    private Connection conn;

    public TaiKhoan_DAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/store_system_managerment";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<TaiKhoan> getTaiKhoan() {
        ArrayList<TaiKhoan> list = new ArrayList<>();
        String sql = "SELECT `user`.`username`, `user`.`password`, `employee`.`id employee`, `permission`.`name`\n"
                + "FROM ((`user`\n"
                + "INNER JOIN `employee` ON `user`.`id employee` = `employee`.`id`)\n"
                + "INNER JOIN `permission` ON `user`.`permission` = `permission`.`id`)\n"
                + "WHERE `user`.`permission` = 2 OR `user`.`permission` = 3 OR `user`.`permission` = 4";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TaiKhoan c = new TaiKhoan();
                c.setTenTK(rs.getString(1));
                c.setMatKhau(rs.getString(2));
                c.setNhanVien(new NhanVien(rs.getString(3)));
                c.setLoaiTaiKhoan(new LoaiTaiKhoan(rs.getString(4)));
                list.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean getTaiKhoanAdmin(String tenTaiKhoan, String matKhau) {
        String sql = "SELECT * FROM `user` WHERE `username` =? and `password` =? and `permission` =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tenTaiKhoan);
            ps.setString(2, matKhau);
            ps.setInt(3, 1);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean getTaiKhoanQuanLy(String tenTaiKhoan, String matKhau) {
        String sql = "SELECT * FROM `user` WHERE `username` =? and `password` =? and `permission` =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tenTaiKhoan);
            ps.setString(2, matKhau);
            ps.setInt(3, 2);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean getTaiKhoanNhapKho(String tenTaiKhoan, String matKhau) {
        String sql = "SELECT * FROM `user` WHERE `username` =? and `password` =? and `permission` =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tenTaiKhoan);
            ps.setString(2, matKhau);
            ps.setInt(3, 3);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean getTaiKhoanBanHang(String tenTaiKhoan, String matKhau) {
        String sql = "SELECT * FROM `user` WHERE `username` =? and `password` =? and `permission` =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tenTaiKhoan);
            ps.setString(2, matKhau);
            ps.setInt(3, 4);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void insert(TaiKhoan s) {
        String sql = "INSERT INTO `user`(`username`, `password`, `id employee`, `permission`) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getTenTK());
            ps.setString(2, s.getMatKhau());
            ps.setInt(3, s.getNhanVien().getId());
            ps.setInt(4, s.getLoaiTaiKhoan().getId());
            ps.executeUpdate();
            System.out.println("Thêm thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String id) {
        String sql = "DELETE FROM `user` WHERE `username` =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
            System.out.println("Xoá thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    

    public static void main(String[] args) {
        new TaiKhoan_DAO();
    }
}
