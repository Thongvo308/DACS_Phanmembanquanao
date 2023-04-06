/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.LoaiTaiKhoan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author AN515
 */
public class LoaiTK_DAO {
    private Connection conn;

    public LoaiTK_DAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/store_system_managerment";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<LoaiTaiKhoan> getListLoaiTK(){
        ArrayList<LoaiTaiKhoan> list = new ArrayList<>();
        String sql = "SELECT * FROM `permission`";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                LoaiTaiKhoan c = new LoaiTaiKhoan();
                c.setId(rs.getInt("id"));
                c.setTenLTK(rs.getString("name"));
                list.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
        public LoaiTaiKhoan getByName(String name){
        String sql = "SELECT * FROM `permission` WHERE `name` ='"+name+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                LoaiTaiKhoan h = new LoaiTaiKhoan();
                h.setId(rs.getInt("id"));
                h.setTenLTK(rs.getString("name"));
                return h;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
