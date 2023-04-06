/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.HangSanXuat;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author AN515
 */
public class HangSX_DAO {
    private Connection conn;

    public HangSX_DAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/store_system_managerment";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<HangSanXuat> getListHangSX(){
        ArrayList<HangSanXuat> list = new ArrayList<>();
        String sql = "SELECT * FROM `manufacturer`";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                HangSanXuat h = new HangSanXuat();
                h.setId(rs.getInt("id"));
                h.setMaHSX(rs.getString("id manufacturer"));
                h.setTenHSX(rs.getString("name"));
                list.add(h);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public HangSanXuat getByName(String name){
        String sql = "SELECT * FROM `manufacturer` WHERE `name` ='"+name+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                HangSanXuat h = new HangSanXuat();
                h.setId(rs.getInt("id"));
                h.setMaHSX(rs.getString("id manufacturer"));
                h.setTenHSX(rs.getString("name"));
                return h;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void insert(HangSanXuat h){
        String sql ="INSERT INTO `manufacturer`(`id manufacturer`, `name`) VALUES (?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, h.getMaHSX());
            ps.setString(2, h.getTenHSX());
            ps.executeUpdate();
            System.out.println("Thêm thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete(int id){
        String sql ="DELETE FROM `manufacturer` WHERE id =?";
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
        new HangSX_DAO();
    }
    
}
