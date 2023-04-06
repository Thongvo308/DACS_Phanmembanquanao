/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.LoaiSanPham;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author AN515
 */
public class LoaiSP_DAO {
    private Connection conn;

    public LoaiSP_DAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/store_system_managerment";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<LoaiSanPham> getListLoaiSP(){
        ArrayList<LoaiSanPham> list = new ArrayList<>();
        String sql = "SELECT * FROM `product category`";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                LoaiSanPham c = new LoaiSanPham();
                c.setId(rs.getInt("id"));
                c.setMaLSP(rs.getString("id product category"));
                c.setTenLSP(rs.getString("name"));
                list.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public LoaiSanPham getByName(String name){       
        String sql = "SELECT * FROM `product category` WHERE `name` ='"+name+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                LoaiSanPham c = new LoaiSanPham();
                c.setId(rs.getInt("id"));
                c.setMaLSP(rs.getString("id product category"));
                c.setTenLSP(rs.getString("name"));
                return c;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void insert(LoaiSanPham c){
        String sql ="INSERT INTO `product category`(`id product category`, `name`) VALUES (?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getMaLSP());
            ps.setString(2, c.getTenLSP());
            ps.executeUpdate();
            System.out.println("Thêm thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete(int id){
        String sql ="DELETE FROM `product category` WHERE id =?";
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
        new LoaiSP_DAO();
    }
    
}
