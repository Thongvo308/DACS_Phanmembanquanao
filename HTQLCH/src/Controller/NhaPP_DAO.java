/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.NhaPhanPhoi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author AN515
 */
public class NhaPP_DAO {

    private Connection conn;

    public NhaPP_DAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/store_system_managerment";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<NhaPhanPhoi> getListNhaPP() {
        ArrayList<NhaPhanPhoi> list = new ArrayList<>();
        String sql = "SELECT * FROM `distributor`";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhaPhanPhoi n = new NhaPhanPhoi();
                n.setId(rs.getInt("id"));
                n.setMaNPP(rs.getString("id distributor"));
                n.setTenNPP(rs.getString("name"));
                n.setDiaChi(rs.getString("address"));
                n.setSdt(rs.getString("number phone"));
                n.setEmail(rs.getString("email"));
                list.add(n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public NhaPhanPhoi getByName(String name) {
        String sql = "SELECT * FROM `distributor` WHERE `name` ='" + name + "'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhaPhanPhoi n = new NhaPhanPhoi();
                n.setId(rs.getInt("id"));
                n.setMaNPP(rs.getString("id distributor"));
                n.setTenNPP(rs.getString("name"));
                n.setDiaChi(rs.getString("address"));
                n.setSdt(rs.getString("number phone"));
                n.setEmail(rs.getString("email"));
                return n;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public ArrayList<NhaPhanPhoi> findByName(String name) {
        ArrayList<NhaPhanPhoi> list = new ArrayList<>();
        String sql = "SELECT * FROM `distributor` WHERE `name` LIKE '%" + name + "%'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);          
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhaPhanPhoi n = new NhaPhanPhoi();
                n.setId(rs.getInt("id"));
                n.setMaNPP(rs.getString("id distributor"));
                n.setTenNPP(rs.getString("name"));
                n.setDiaChi(rs.getString("address"));
                n.setSdt(rs.getString("number phone"));
                n.setEmail(rs.getString("email"));
                list.add(n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void insert(NhaPhanPhoi n) {
        String sql = "INSERT INTO `distributor`(`id distributor`, `name`, `address`, `number phone`, `email`) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, n.getMaNPP());
            ps.setString(2, n.getTenNPP());
            ps.setString(3, n.getDiaChi());
            ps.setString(4, n.getSdt());
            ps.setString(5, n.getEmail());
            ps.executeUpdate();
            System.out.println("Thêm thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM `distributor` WHERE id =?";
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
        new NhaPP_DAO();
    }

}
