/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author AN515
 */
public class LoaiKhachHang {
    private int id;
    private String tenLKH, ghiChu;

    public LoaiKhachHang() {
    }

    public LoaiKhachHang(int id) {
        this.id = id;
    }

    public LoaiKhachHang(String tenLKH) {
        this.tenLKH = tenLKH;
    }

    public LoaiKhachHang(int id, String tenLKH, String ghiChu) {
        this.id = id;
        this.tenLKH = tenLKH;
        this.ghiChu = ghiChu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLKH() {
        return tenLKH;
    }

    public void setTenLKH(String tenLKH) {
        this.tenLKH = tenLKH;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public String toString() {
        return getTenLKH();
    }
    
}
