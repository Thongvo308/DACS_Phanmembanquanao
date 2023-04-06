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
public class SanPham {
    private int id;
    private String maSP, tenSP;
    private LoaiSanPham loaiSP;
    private HangSanXuat hangSX;
    private String kichCo, mauSac;
    private int soluong, giaNhap, giaBan;

    public SanPham() {
    }

    public SanPham(int id) {
        this.id = id;
    }

    public SanPham(String maSP, int soluong, int giaBan) {
        this.maSP = maSP;
        this.soluong = soluong;
        this.giaBan = giaBan;
    }

    public SanPham(int id, String maSP, String tenSP, LoaiSanPham loaiSP, String kichCo, String mauSac, int soluong, int giaBan) {
        this.id = id;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.kichCo = kichCo;
        this.mauSac = mauSac;
        this.soluong = soluong;
        this.giaBan = giaBan;
    }

    public SanPham(String maSP, String tenSP, LoaiSanPham loaiSP, HangSanXuat hangSX, String kichCo, String mauSac, int soluong, int giaNhap, int giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.hangSX = hangSX;
        this.kichCo = kichCo;
        this.mauSac = mauSac;
        this.soluong = soluong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public SanPham(int id, String maSP, String tenSP, LoaiSanPham loaiSP, HangSanXuat hangSX, String kichCo, String mauSac, int soluong, int giaNhap, int giaBan) {
        this.id = id;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.hangSX = hangSX;
        this.kichCo = kichCo;
        this.mauSac = mauSac;
        this.soluong = soluong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public LoaiSanPham getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(LoaiSanPham loaiSP) {
        this.loaiSP = loaiSP;
    }

    public HangSanXuat getHangSX() {
        return hangSX;
    }

    public void setHangSX(HangSanXuat hangSX) {
        this.hangSX = hangSX;
    }

    public String getKichCo() {
        return kichCo;
    }

    public void setKichCo(String kichCo) {
        this.kichCo = kichCo;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
    
}
