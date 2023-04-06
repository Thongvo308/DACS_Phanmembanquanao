/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ChucVu;
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
public class NhanVien_DAO {

    private Connection conn;
    SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");

    public NhanVien_DAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/store_system_managerment";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<NhanVien> getListNhanVien() {
        ArrayList<NhanVien> list = new ArrayList<>();
        String sql = "SELECT `employee`.`id`, `employee`.`id employee`, `employee`.`name`, `position`.`name`, `employee`.`date of birth`, `employee`.`gender`, `employee`.`address`, `employee`.`number phone`, `employee`.`email`, `employee`.`salary`\n"
                + "FROM (`employee`\n"
                + "INNER JOIN `position` ON `employee`.`id position` = `position`.`id`);";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien s = new NhanVien();
                s.setId(rs.getInt(1));
                s.setMaNV(rs.getString(2));
                s.setTenNV(rs.getString(3));
                s.setChucVu(new ChucVu(rs.getString(4)));
                s.setNgaySinh(formatDate.parse(rs.getString(5)));
                s.setGioiTinh(rs.getString(6));
                s.setDiaChi(rs.getString(7));
                s.setSdt(rs.getString(8));
                s.setEmail(rs.getString(9));
                s.setLuong(rs.getInt(10));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<NhanVien> getListNhanVienBH() {
        ArrayList<NhanVien> list = new ArrayList<>();
        String sql = "SELECT `employee`.`id`, `employee`.`id employee`, `employee`.`name`, `position`.`name`, `employee`.`date of birth`, `employee`.`gender`, `employee`.`address`, `employee`.`number phone`, `employee`.`email`, `employee`.`salary`\n"
                + "FROM (`employee`\n"
                + "INNER JOIN `position` ON `employee`.`id position` = `position`.`id`)\n"
                + "WHERE `employee`.`id position` = 3";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien s = new NhanVien();
                s.setId(rs.getInt(1));
                s.setMaNV(rs.getString(2));
                s.setTenNV(rs.getString(3));
                s.setChucVu(new ChucVu(rs.getString(4)));
                s.setNgaySinh(formatDate.parse(rs.getString(5)));
                s.setGioiTinh(rs.getString(6));
                s.setDiaChi(rs.getString(7));
                s.setSdt(rs.getString(8));
                s.setEmail(rs.getString(9));
                s.setLuong(rs.getInt(10));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
        public ArrayList<NhanVien> getListNVKhoHang() {
        ArrayList<NhanVien> list = new ArrayList<>();
        String sql = "SELECT `employee`.`id`, `employee`.`id employee`, `employee`.`name`, `position`.`name`, `employee`.`date of birth`, `employee`.`gender`, `employee`.`address`, `employee`.`number phone`, `employee`.`email`, `employee`.`salary`\n"
                + "FROM (`employee`\n"
                + "INNER JOIN `position` ON `employee`.`id position` = `position`.`id`)\n"
                + "WHERE `employee`.`id position` = 4";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien s = new NhanVien();
                s.setId(rs.getInt(1));
                s.setMaNV(rs.getString(2));
                s.setTenNV(rs.getString(3));
                s.setChucVu(new ChucVu(rs.getString(4)));
                s.setNgaySinh(formatDate.parse(rs.getString(5)));
                s.setGioiTinh(rs.getString(6));
                s.setDiaChi(rs.getString(7));
                s.setSdt(rs.getString(8));
                s.setEmail(rs.getString(9));
                s.setLuong(rs.getInt(10));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public NhanVien getIDNhanVienBH(String id) {     
        String sql = "SELECT `employee`.`id`, `employee`.`id employee`, `employee`.`name`, `position`.`name`, `employee`.`date of birth`, `employee`.`gender`, `employee`.`address`, `employee`.`number phone`, `employee`.`email`, `employee`.`salary`\n"
                + "FROM (`employee`\n"
                + "INNER JOIN `position` ON `employee`.`id position` = `position`.`id`)\n"
                + "WHERE `employee`.`id employee` ='"+id+"' AND`employee`.`id position` = 3";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien s = new NhanVien();
                s.setId(rs.getInt(1));
                s.setMaNV(rs.getString(2));
                s.setTenNV(rs.getString(3));
                s.setChucVu(new ChucVu(rs.getString(4)));
                s.setNgaySinh(formatDate.parse(rs.getString(5)));
                s.setGioiTinh(rs.getString(6));
                s.setDiaChi(rs.getString(7));
                s.setSdt(rs.getString(8));
                s.setEmail(rs.getString(9));
                s.setLuong(rs.getInt(10));
                return s;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public NhanVien getIDNhanVienKH(String id) {     
        String sql = "SELECT `employee`.`id`, `employee`.`id employee`, `employee`.`name`, `position`.`name`, `employee`.`date of birth`, `employee`.`gender`, `employee`.`address`, `employee`.`number phone`, `employee`.`email`, `employee`.`salary`\n"
                + "FROM (`employee`\n"
                + "INNER JOIN `position` ON `employee`.`id position` = `position`.`id`)\n"
                + "WHERE `employee`.`id employee` ='"+id+"' AND`employee`.`id position` = 4";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien s = new NhanVien();
                s.setId(rs.getInt(1));
                s.setMaNV(rs.getString(2));
                s.setTenNV(rs.getString(3));
                s.setChucVu(new ChucVu(rs.getString(4)));
                s.setNgaySinh(formatDate.parse(rs.getString(5)));
                s.setGioiTinh(rs.getString(6));
                s.setDiaChi(rs.getString(7));
                s.setSdt(rs.getString(8));
                s.setEmail(rs.getString(9));
                s.setLuong(rs.getInt(10));
                return s;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
        public NhanVien getIDNhanVien(String id) {     
        String sql = "SELECT `employee`.`id`, `employee`.`id employee`, `employee`.`name`, `position`.`name`, `employee`.`date of birth`, `employee`.`gender`, `employee`.`address`, `employee`.`number phone`, `employee`.`email`, `employee`.`salary`\n"
                + "FROM (`employee`\n"
                + "INNER JOIN `position` ON `employee`.`id position` = `position`.`id`)\n"
                + "WHERE `employee`.`id employee` ='"+id+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien s = new NhanVien();
                s.setId(rs.getInt(1));
                s.setMaNV(rs.getString(2));
                s.setTenNV(rs.getString(3));
                s.setChucVu(new ChucVu(rs.getString(4)));
                s.setNgaySinh(formatDate.parse(rs.getString(5)));
                s.setGioiTinh(rs.getString(6));
                s.setDiaChi(rs.getString(7));
                s.setSdt(rs.getString(8));
                s.setEmail(rs.getString(9));
                s.setLuong(rs.getInt(10));
                return s;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<NhanVien> findByName(String name) {
        ArrayList<NhanVien> list = new ArrayList<>();
        String sql = "SELECT `employee`.`id`, `employee`.`id employee`, `employee`.`name`, `position`.`name`, `employee`.`date of birth`, `employee`.`gender`, `employee`.`address`, `employee`.`number phone`, `employee`.`email`, `employee`.`salary`\n"
                + "FROM (`employee`\n"
                + "INNER JOIN `position` ON `employee`.`id position` = `position`.`id`)\n"
                + "WHERE `employee`.`name` LIKE '%" + name + "%'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien s = new NhanVien();
                s.setId(rs.getInt(1));
                s.setMaNV(rs.getString(2));
                s.setTenNV(rs.getString(3));
                s.setChucVu(new ChucVu(rs.getString(4)));
                s.setNgaySinh(formatDate.parse(rs.getString(5)));
                s.setGioiTinh(rs.getString(6));
                s.setDiaChi(rs.getString(7));
                s.setSdt(rs.getString(8));
                s.setEmail(rs.getString(9));
                s.setLuong(rs.getInt(10));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public NhanVien getByID(int id) {
        String sql = "SELECT `employee`.`id`, `employee`.`id employee`, `employee`.`name`, `position`.`name`, `employee`.`date of birth`, `employee`.`gender`, `employee`.`address`, `employee`.`number phone`, `employee`.`email`, `employee`.`salary`\n"
                + "FROM (`employee`\n"
                + "INNER JOIN `position` ON `employee`.`id position` = `position`.`id`)\n"
                + "WHERE `employee`.`id` = '%" + id + "%'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien s = new NhanVien();
                s.setId(rs.getInt(1));
                s.setMaNV(rs.getString(2));
                s.setTenNV(rs.getString(3));
                s.setChucVu(new ChucVu(rs.getString(4)));
                s.setNgaySinh(formatDate.parse(rs.getString(5)));
                s.setGioiTinh(rs.getString(6));
                s.setDiaChi(rs.getString(7));
                s.setSdt(rs.getString(8));
                s.setEmail(rs.getString(9));
                s.setLuong(rs.getInt(10));
                return s;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void insert(NhanVien k) {
        String sql = "INSERT INTO `employee`(`id employee`, `name`, `id position`, `date of birth`, `gender`, `address`, `number phone`, `email`, `salary`) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, k.getMaNV());
            ps.setString(2, k.getTenNV());
            ps.setInt(3, k.getChucVu().getId());
            ps.setString(4, formatDate.format(k.getNgaySinh()));
            ps.setString(5, k.getGioiTinh());
            ps.setString(6, k.getDiaChi());
            ps.setString(7, k.getSdt());
            ps.setString(8, k.getEmail());
            ps.setInt(9, k.getLuong());
            ps.executeUpdate();
            System.out.println("Thêm thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM `employee` WHERE id =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Xoá thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new NhanVien_DAO();
    }
}
