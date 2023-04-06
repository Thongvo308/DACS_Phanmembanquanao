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
public class ChiTietPhieuNhap {
    private int id;
    private int phieuNhap;
    private int sanPham;
    private int soLuong;

    public ChiTietPhieuNhap() {
    }

    public ChiTietPhieuNhap(int id, int phieuNhap, int sanPham, int soLuong) {
        this.id = id;
        this.phieuNhap = phieuNhap;
        this.sanPham = sanPham;
        this.soLuong = soLuong;
    }

    public ChiTietPhieuNhap(int phieuNhap, int sanPham, int soLuong) {
        this.phieuNhap = phieuNhap;
        this.sanPham = sanPham;
        this.soLuong = soLuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhieuNhap() {
        return phieuNhap;
    }

    public void setPhieuNhap(int phieuNhap) {
        this.phieuNhap = phieuNhap;
    }

    public int getSanPham() {
        return sanPham;
    }

    public void setSanPham(int sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
