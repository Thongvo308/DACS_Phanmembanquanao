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
public class PhieuNhap {
    private int id;
    private NhanVien nhanVien;
    private int nhaPP;
    private int tongTien;
    private Date ngayLap;

    public PhieuNhap() {
    }

    public PhieuNhap(int id) {
        this.id = id;
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

    public int getNhaPP() {
        return nhaPP;
    }

    public void setNhaPP(int nhaPP) {
        this.nhaPP = nhaPP;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public PhieuNhap(NhanVien nhanVien, int nhaPP, int tongTien, Date ngayLap) {
        this.nhanVien = nhanVien;
        this.nhaPP = nhaPP;
        this.tongTien = tongTien;
        this.ngayLap = ngayLap;
    }

    public PhieuNhap(int id, NhanVien nhanVien, int nhaPP, int tongTien, Date ngayLap) {
        this.id = id;
        this.nhanVien = nhanVien;
        this.nhaPP = nhaPP;
        this.tongTien = tongTien;
        this.ngayLap = ngayLap;
    }
    
}
