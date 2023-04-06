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
public class HoaDon {
    private int id;
    private NhanVien nhanVien;
    private KhachHang khachHang;
    private Date ngayDat;
    private int thanhTien;

    public HoaDon() {
    }

    public HoaDon(int id) {
        this.id = id;
    }

    public HoaDon(NhanVien nhanVien, KhachHang khachHang, Date ngayDat, int thanhTien) {
        this.nhanVien = nhanVien;
        this.khachHang = khachHang;
        this.ngayDat = ngayDat;
        this.thanhTien = thanhTien;
    }

    public HoaDon(int id, NhanVien nhanVien, KhachHang khachHang, Date ngayDat, int thanhTien) {
        this.id = id;
        this.nhanVien = nhanVien;
        this.khachHang = khachHang;
        this.ngayDat = ngayDat;
        this.thanhTien = thanhTien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

 
    
}
