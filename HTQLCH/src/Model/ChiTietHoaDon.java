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
public class ChiTietHoaDon {
    private int id;
    private HoaDon hoaDon;
    private int idSanPham;
    private int soLuong;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(HoaDon hoaDon, int idSanPham, int soLuong) {
        this.hoaDon = hoaDon;
        this.idSanPham = idSanPham;
        this.soLuong = soLuong;
    }

    public ChiTietHoaDon(int id, HoaDon hoaDon, int idSanPham, int soLuong) {
        this.id = id;
        this.hoaDon = hoaDon;
        this.idSanPham = idSanPham;
        this.soLuong = soLuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }


    
}
