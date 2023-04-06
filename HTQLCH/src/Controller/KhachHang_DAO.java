/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.KhachHang;
import Model.LoaiKhachHang;
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
public class KhachHang_DAO {
    private Connection conn;
    SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
    

    public KhachHang_DAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/store_system_managerment";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<KhachHang> getListKhachHang() {
        ArrayList<KhachHang> list = new ArrayList<>();
        String sql = "SELECT `customer`.`id`, `customer`.`id customer`, `customer`.`name`, `customer`.`date of birth`, `customer`.`gender`, `customer`.`address`, `customer`.`number phone`, `customer category`.`name`\n"
                + "FROM (`customer`\n"
                + "INNER JOIN `customer category` ON `customer`.`customer category` = `customer category`.`id`);";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang s = new KhachHang();
                s.setId(rs.getInt(1));
                s.setMaKH(rs.getString(2));
                s.setTenKH(rs.getString(3));          
                s.setNgaySinh(formatDate.parse(rs.getString(4)));
                s.setGioiTinh(rs.getString(5));
                s.setDiaChi(rs.getString(6));
                s.setSdt(rs.getString(7));
                s.setLoaiKH(new LoaiKhachHang(rs.getString(8)));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
        public KhachHang getByIDCus(String idcus) {
        String sql = "SELECT `customer`.`id`, `customer`.`id customer`, `customer`.`name`, `customer`.`date of birth`, `customer`.`gender`, `customer`.`address`, `customer`.`number phone`, `customer category`.`name`\n"
                + "FROM (`customer`\n"
                + "INNER JOIN `customer category` ON `customer`.`customer category` = `customer category`.`id`)"
                + "WHERE `customer`.`id customer` = '"+idcus+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang s = new KhachHang();
                s.setId(rs.getInt(1));
                s.setMaKH(rs.getString(2));
                s.setTenKH(rs.getString(3));          
                s.setNgaySinh(formatDate.parse(rs.getString(4)));
                s.setGioiTinh(rs.getString(5));
                s.setDiaChi(rs.getString(6));
                s.setSdt(rs.getString(7));
                s.setLoaiKH(new LoaiKhachHang(rs.getString(8)));
                return s;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
        public KhachHang getByID(int id) {
        String sql = "SELECT `customer`.`id`, `customer`.`id customer`, `customer`.`name`, `customer`.`date of birth`, `customer`.`gender`, `customer`.`address`, `customer`.`number phone`, `customer category`.`name`\n"
                + "FROM (`customer`\n"
                + "INNER JOIN `customer category` ON `customer`.`customer category` = `customer category`.`id`)\n"
                + "WHERE `customer`.`id` = '%"+id+"%'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang s = new KhachHang();
                s.setId(rs.getInt(1));
                s.setMaKH(rs.getString(2));
                s.setTenKH(rs.getString(3));          
                s.setNgaySinh(formatDate.parse(rs.getString(4)));
                s.setGioiTinh(rs.getString(5));
                s.setDiaChi(rs.getString(6));
                s.setSdt(rs.getString(7));
                s.setLoaiKH(new LoaiKhachHang(rs.getString(8)));
                return s;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public ArrayList<KhachHang> findByName(String name) {
        ArrayList<KhachHang> list = new ArrayList<>();
        String sql = "SELECT `customer`.`id`, `customer`.`id customer`, `customer`.`name`, `customer`.`date of birth`, `customer`.`gender`, `customer`.`address`, `customer`.`number phone`, `customer category`.`name`\n"
                + "FROM (`customer`\n"
                + "INNER JOIN `customer category` ON `customer`.`customer category` = `customer category`.`id`)\n"
                + "WHERE `customer`.`name` LIKE '%"+name+"%'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);          
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang s = new KhachHang();
                s.setId(rs.getInt(1));
                s.setMaKH(rs.getString(2));
                s.setTenKH(rs.getString(3));          
                s.setNgaySinh(formatDate.parse(rs.getString(4)));
                s.setGioiTinh(rs.getString(5));
                s.setDiaChi(rs.getString(6));
                s.setSdt(rs.getString(7));
                s.setLoaiKH(new LoaiKhachHang(rs.getString(8)));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void insert(KhachHang k) {
        String sql = "INSERT INTO `customer`(`id customer`, `name`, `date of birth`, `gender`, `address`, `number phone`, `customer category`) "
                + "VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, k.getMaKH());
            ps.setString(2, k.getTenKH());
            ps.setString(3, formatDate.format(k.getNgaySinh()));
            ps.setString(4, k.getGioiTinh());
            ps.setString(5, k.getDiaChi());  
            ps.setString(6, k.getSdt());
            ps.setInt(7, k.getLoaiKH().getId());
            ps.executeUpdate();
            System.out.println("Thêm thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete(int id){
        String sql ="DELETE FROM `customer` WHERE id =?";
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
        new KhachHang_DAO();
    }
}
