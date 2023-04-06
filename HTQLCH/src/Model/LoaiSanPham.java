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
public class LoaiSanPham {
    private int id;
    private String maLSP, tenLSP;

    public LoaiSanPham() {
    }

    public LoaiSanPham(int id) {
        this.id = id;
    }   

    public LoaiSanPham(String tenLSP) {
        this.tenLSP = tenLSP;
    }

    public LoaiSanPham(String maLSP, String tenLSP) {
        this.maLSP = maLSP;
        this.tenLSP = tenLSP;
    }

    public LoaiSanPham(int id, String maLSP, String tenLSP) {
        this.id = id;
        this.maLSP = maLSP;
        this.tenLSP = tenLSP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaLSP() {
        return maLSP;
    }

    public void setMaLSP(String maLSP) {
        this.maLSP = maLSP;
    }

    public String getTenLSP() {
        return tenLSP;
    }

    public void setTenLSP(String tenLSP) {
        this.tenLSP = tenLSP;
    }

    @Override
    public String toString() {
        return getTenLSP();
    }
    
    
}
