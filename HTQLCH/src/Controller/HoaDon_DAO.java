/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.HoaDon;
import Model.KhachHang;
import Model.NhanVien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author AN515
 */
public class HoaDon_DAO {

    private Connection conn;
    SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");

    public HoaDon_DAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/store_system_managerment";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<HoaDon> getListHoaDon() {
        ArrayList<HoaDon> list = new ArrayList<>();
        String sql = "SELECT `id`, `creation date`, `total amount` FROM `invoice`";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon n = new HoaDon();
                n.setId(rs.getInt(1));
                n.setNgayDat(formatDate.parse(rs.getString(2)));
                n.setThanhTien(rs.getInt(3));
                list.add(n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public HoaDon getByID(int id) {
        String sql = "SELECT `id`, `creation date`, `total amount` FROM `invoice` WHERE `id` = '" + id + "'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon n = new HoaDon();
                n.setId(rs.getInt(1));
                n.setNgayDat(formatDate.parse(rs.getString(2)));
                n.setThanhTien(rs.getInt(3));
                return n;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void insert(HoaDon n) {
        String sql = "INSERT INTO `invoice`(`id customer`, `id employee`,`creation date`, `total amount`) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, n.getKhachHang().getId());
            ps.setInt(2, n.getNhanVien().getId());
            ps.setString(3, formatDate.format(n.getNgayDat()));
            ps.setInt(4, n.getThanhTien());
            ps.executeUpdate();
            System.out.println("Thêm thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM `invoice` WHERE id =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Xoá thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<HoaDon> findByDate(String date) {
        ArrayList<HoaDon> list = new ArrayList<>();
        String sql = "SELECT * FROM `invoice` WHERE `creation date` LIKE ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + date + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon n = new HoaDon();
                n.setId(rs.getInt("id"));
                n.setThanhTien(rs.getInt("total amount"));
                n.setNgayDat(formatDate.parse(rs.getString("creation date")));
                n.setKhachHang(new KhachHang(rs.getInt("id customer")));
                n.setNhanVien(new NhanVien(rs.getInt("id employee")));
                list.add(n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        new HoaDon_DAO();
    }
}
