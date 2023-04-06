/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;



/**
 *
 * @author AN515
 */
public class KhachHang {
    private int id;
    private String maKH, tenKH;
    private Date ngaySinh;
    private String gioiTinh, diaChi, sdt;
    private LoaiKhachHang loaiKH;

    public KhachHang() {
    }

    public KhachHang(int id) {
        this.id = id;
    }

    public KhachHang(String maKH, String tenKH, String sdt) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.sdt = sdt;
    }  

    public KhachHang(String maKH, String tenKH, Date ngaySinh, String gioiTinh, String diaChi, String sdt, LoaiKhachHang loaiKH) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.loaiKH = loaiKH;
    }

    public KhachHang(int id, String maKH, String tenKH, Date ngaySinh, String gioiTinh, String diaChi, String sdt, LoaiKhachHang loaiKH) {
        this.id = id;
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.loaiKH = loaiKH;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public LoaiKhachHang getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(LoaiKhachHang loaiKH) {
        this.loaiKH = loaiKH;
    }

    @Override
    public String toString() {
        return maKH;
    }

}
