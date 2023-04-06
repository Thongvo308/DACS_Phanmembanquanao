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
public class ChiTietHoaDonSanPham {
    private int id, idHD, idCTSP, thanhTien;

    public ChiTietHoaDonSanPham() {
    }

    public ChiTietHoaDonSanPham(int id, int idHD, int idCTSP, int thanhTien) {
        this.id = id;
        this.idHD = idHD;
        this.idCTSP = idCTSP;
        this.thanhTien = thanhTien;
    }

    public ChiTietHoaDonSanPham(int idHD, int idCTSP, int thanhTien) {
        this.idHD = idHD;
        this.idCTSP = idCTSP;
        this.thanhTien = thanhTien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdHD() {
        return idHD;
    }

    public void setIdHD(int idHD) {
        this.idHD = idHD;
    }

    public int getIdCTSP() {
        return idCTSP;
    }

    public void setIdCTSP(int idCTSP) {
        this.idCTSP = idCTSP;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }
    
}
