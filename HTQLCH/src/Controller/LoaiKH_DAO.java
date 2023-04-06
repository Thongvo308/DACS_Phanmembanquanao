/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.LoaiKhachHang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author AN515
 */
public class LoaiKH_DAO {
    private Connection conn;

    public LoaiKH_DAO() {
         try {
            String url = "jdbc:mysql://localhost:3306/store_system_managerment";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<LoaiKhachHang> getList(){
        ArrayList<LoaiKhachHang> list = new ArrayList<>();
        String sql = "SELECT * FROM `customer category`";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                LoaiKhachHang l = new LoaiKhachHang();
                l.setId(rs.getInt("id"));               
                l.setTenLKH(rs.getString("name"));
                l.setGhiChu(rs.getString("note"));
                list.add(l);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public LoaiKhachHang getByName(String name){       
        String sql = "SELECT * FROM `customer category` WHERE `name` ='"+name+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                LoaiKhachHang l = new LoaiKhachHang();
                l.setId(rs.getInt("id"));               
                l.setTenLKH(rs.getString("name"));
                l.setGhiChu(rs.getString("note"));
                return l;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static void main(String[] args) {
        new LoaiKH_DAO();
    }
}
