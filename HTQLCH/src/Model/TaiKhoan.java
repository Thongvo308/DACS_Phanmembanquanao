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
public class TaiKhoan {
    private String tenTK, matKhau;
    private NhanVien nhanVien;
    private LoaiTaiKhoan loaiTaiKhoan;

    public TaiKhoan() {
    }

    public TaiKhoan(String tenTK, String matKhau) {
        this.tenTK = tenTK;
        this.matKhau = matKhau;
    }

    public TaiKhoan(String tenTK, String matKhau, NhanVien nhanVien, LoaiTaiKhoan loaiTaiKhoan) {
        this.tenTK = tenTK;
        this.matKhau = matKhau;
        this.nhanVien = nhanVien;
        this.loaiTaiKhoan = loaiTaiKhoan;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public LoaiTaiKhoan getLoaiTaiKhoan() {
        return loaiTaiKhoan;
    }

    public void setLoaiTaiKhoan(LoaiTaiKhoan loaiTaiKhoan) {
        this.loaiTaiKhoan = loaiTaiKhoan;
    }
    
}
