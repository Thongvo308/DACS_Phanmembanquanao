/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.NhaPhanPhoi;
import Model.NhanVien;
import Model.PhieuNhap;
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
public class PhieuNhap_DAO {

    private Connection conn;
    SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");

    public PhieuNhap_DAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/store_system_managerment";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<PhieuNhap> getListPhieuNhap() {
        ArrayList<PhieuNhap> list = new ArrayList<>();
        String sql = "SELECT `receiving transaction`.`id`, `employee`.`id`, `receiving transaction`.`id distributor`, `receiving transaction`.`total amount`, `receiving transaction`.`transaction date`\n"
                + "FROM ((`receiving transaction`\n"
                + "INNER JOIN `employee` ON `receiving transaction`.`id employee` = `employee`.`id`)\n"
                + "INNER JOIN `distributor` ON `receiving transaction`.`id distributor` = `distributor`.`id`)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhieuNhap s = new PhieuNhap();
                s.setId(rs.getInt(1));
                s.setNhanVien(new NhanVien(rs.getInt(2)));
                s.setNhaPP(rs.getInt(3));
                s.setTongTien(rs.getInt(4));
                s.setNgayLap(formatDate.parse(rs.getString(5)));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public ArrayList<PhieuNhap> findByDate(String date) {
        ArrayList<PhieuNhap> list = new ArrayList<>();
        String sql = "SELECT * FROM `receiving transaction` WHERE `transaction date` LIKE ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + date + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhieuNhap s = new PhieuNhap();
                s.setId(rs.getInt("id"));
                s.setNhanVien(new NhanVien(rs.getInt("id employee")));
                s.setNhaPP(rs.getInt("id distributor"));
                s.setTongTien(rs.getInt("total amount"));
                s.setNgayLap(formatDate.parse(rs.getString("transaction date")));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void insert(PhieuNhap k) {
        String sql = "INSERT INTO `receiving transaction`(`id employee`, `id distributor`, `total amount`, `transaction date`) "
                + "VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, k.getNhanVien().getId());
            ps.setInt(2, k.getNhaPP());     
            ps.setInt(3, k.getTongTien());
            ps.setString(4, formatDate.format(k.getNgayLap()));
            ps.executeUpdate();
            System.out.println("Thêm thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM `receiving transaction` WHERE id =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Xoá thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
