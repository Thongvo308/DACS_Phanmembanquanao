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
public class ChucVu {
    private int id;
    private String maCV, tenCV;

    public ChucVu() {
    }

    public ChucVu(String tenCV) {
        this.tenCV = tenCV;
    }

    public ChucVu(int id) {
        this.id = id;
    }

    public ChucVu(String maCV, String tenCV) {
        this.maCV = maCV;
        this.tenCV = tenCV;
    }

    public ChucVu(int id, String maCV, String tenCV) {
        this.id = id;
        this.maCV = maCV;
        this.tenCV = tenCV;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }

    @Override
    public String toString() {
        return getTenCV(); //To change body of generated methods, choose Tools | Templates.
    }   
    
}
