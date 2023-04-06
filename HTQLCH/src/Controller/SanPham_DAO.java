/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.HangSanXuat;
import Model.LoaiSanPham;
import Model.SanPham;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author AN515
 */
public class SanPham_DAO {

    private Connection conn;

    public SanPham_DAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/store_system_managerment";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<SanPham> getListAllSanPham() {
        ArrayList<SanPham> list = new ArrayList<>();
        String sql = "SELECT `product`.`id`, `product`.`id product`, `product`.`name`, `product category`.`name`, `manufacturer`.`name`, `product`.`size`, `product`.`color`, `product`.`quantity`, `product`.`import price`, `product`.`export price`\n"
                + "FROM ((`product`\n"
                + "INNER JOIN `product category` ON `product`.`id product category` = `product category`.`id`)\n"
                + "INNER JOIN `manufacturer` ON `product`.`id manufacturer` = `manufacturer`.`id`);";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham s = new SanPham();
                s.setId(rs.getInt(1));
                s.setMaSP(rs.getString(2));
                s.setTenSP(rs.getString(3));
                s.setLoaiSP(new LoaiSanPham(rs.getString(4)));
                s.setHangSX(new HangSanXuat(rs.getString(5)));
                s.setKichCo(rs.getString(6));
                s.setMauSac(rs.getString(7));
                s.setSoluong(rs.getInt(8));
                s.setGiaNhap(rs.getInt(9));
                s.setGiaBan(rs.getInt(10));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public ArrayList<SanPham> getListSanPham() {
        ArrayList<SanPham> list = new ArrayList<>();
        String sql = "SELECT `product`.`id`, `product`.`id product`, `product`.`name`, `product category`.`name`, `product`.`size`, `product`.`color`, `product`.`quantity`, `product`.`export price`\n"
                + "FROM (`product`\n"
                + "INNER JOIN `product category` ON `product`.`id product category` = `product category`.`id`);";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham s = new SanPham();
                s.setId(rs.getInt(1));
                s.setMaSP(rs.getString(2));
                s.setTenSP(rs.getString(3));
                s.setLoaiSP(new LoaiSanPham(rs.getString(4)));
                s.setKichCo(rs.getString(5));
                s.setMauSac(rs.getString(6));
                s.setSoluong(rs.getInt(7));
                s.setGiaBan(rs.getInt(8));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    
    public SanPham getByID(int id) {
        String sql = "SELECT `product`.`id`, `product`.`id product`, `product`.`name`, `product category`.`name`, `manufacturer`.`name`, `product`.`size`, `product`.`color`, `product`.`quantity`, `product`.`import price`, `product`.`export price`\n"
                + "FROM ((`product`\n"
                + "INNER JOIN `product category` ON `product`.`id product category` = `product category`.`id`)\n"
                + "INNER JOIN `manufacturer` ON `product`.`id manufacturer` = `manufacturer`.`id`)\n"
                + "WHERE `product`.`id` ='"+id+"';";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham s = new SanPham();
                s.setId(rs.getInt(1));
                s.setMaSP(rs.getString(2));
                s.setTenSP(rs.getString(3));
                s.setLoaiSP(new LoaiSanPham(rs.getString(4)));
                s.setHangSX(new HangSanXuat(rs.getString(5)));
                s.setKichCo(rs.getString(6));
                s.setMauSac(rs.getString(7));
                s.setSoluong(rs.getInt(8));
                s.setGiaNhap(rs.getInt(9));
                s.setGiaBan(rs.getInt(10));
                return s;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public ArrayList<SanPham> findByName(String name) {
        ArrayList<SanPham> list = new ArrayList<>();
        String sql = "SELECT `product`.`id`, `product`.`id product`, `product`.`name`, `product category`.`name`, `manufacturer`.`name`, `product`.`size`, `product`.`color`, `product`.`quantity`, `product`.`import price`, `product`.`export price`\n"
                + "FROM ((`product`\n"
                + "INNER JOIN `product category` ON `product`.`id product category` = `product category`.`id`)\n"
                + "INNER JOIN `manufacturer` ON `product`.`id manufacturer` = `manufacturer`.`id`)\n"
                + "WHERE `product`.`name` LIKE '%"+name+"%'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);          
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham s = new SanPham();
                s.setId(rs.getInt(1));
                s.setMaSP(rs.getString(2));
                s.setTenSP(rs.getString(3));
                s.setLoaiSP(new LoaiSanPham(rs.getString(4)));
                s.setHangSX(new HangSanXuat(rs.getString(5)));
                s.setKichCo(rs.getString(6));
                s.setMauSac(rs.getString(7));
                s.setSoluong(rs.getInt(8));
                s.setGiaNhap(rs.getInt(9));
                s.setGiaBan(rs.getInt(10));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void insert(SanPham s) {
        String sql = "INSERT INTO `product`(`id product`, `name`, `id product category`, `id manufacturer`, `size`, `color`, `quantity`, `import price`, `export price`) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getMaSP());
            ps.setString(2, s.getTenSP());
            ps.setInt(3, s.getLoaiSP().getId());
            ps.setInt(4, s.getHangSX().getId());
            ps.setString(5, s.getKichCo());
            ps.setString(6, s.getMauSac());
            ps.setInt(7, s.getSoluong());   
            ps.setInt(8, s.getGiaNhap());
            ps.setInt(9, s.getGiaBan());
            ps.executeUpdate();
            System.out.println("Thêm thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete(int id){
        String sql ="DELETE FROM `product` WHERE id =?";
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
        new SanPham_DAO();
    }
}
