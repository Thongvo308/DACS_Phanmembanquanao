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
public class HangSanXuat {
    private int id;
    private String maHSX, tenHSX;

    public HangSanXuat() {
    }

    public HangSanXuat(int id) {
        this.id = id;
    }

    public HangSanXuat(String tenHSX) {
        this.tenHSX = tenHSX;
    }

    public HangSanXuat(String maHSX, String tenHSX) {
        this.maHSX = maHSX;
        this.tenHSX = tenHSX;
    }

    public HangSanXuat(int id, String maHSX, String tenHSX) {
        this.id = id;
        this.maHSX = maHSX;
        this.tenHSX = tenHSX;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaHSX() {
        return maHSX;
    }

    public void setMaHSX(String maHSX) {
        this.maHSX = maHSX;
    }

    public String getTenHSX() {
        return tenHSX;
    }

    public void setTenHSX(String tenHSX) {
        this.tenHSX = tenHSX;
    }

    @Override
    public String toString() {
        return getTenHSX();
    }
    
}
