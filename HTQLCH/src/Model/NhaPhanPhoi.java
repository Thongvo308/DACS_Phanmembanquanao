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
public class NhaPhanPhoi {
    private int id;
    private String maNPP, tenNPP, diaChi, sdt, email;

    public NhaPhanPhoi() {
    }

    public NhaPhanPhoi(int id) {
        this.id = id;
    }

    public NhaPhanPhoi(String maNPP, String tenNPP, String diaChi, String sdt, String email) {
        this.maNPP = maNPP;
        this.tenNPP = tenNPP;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
    }

    public NhaPhanPhoi(int id, String maNPP, String tenNPP, String diaChi, String sdt, String email) {
        this.id = id;
        this.maNPP = maNPP;
        this.tenNPP = tenNPP;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaNPP() {
        return maNPP;
    }

    public void setMaNPP(String maNPP) {
        this.maNPP = maNPP;
    }

    public String getTenNPP() {
        return tenNPP;
    }

    public void setTenNPP(String tenNPP) {
        this.tenNPP = tenNPP;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }    
    
}
