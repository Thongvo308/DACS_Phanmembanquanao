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
public class LoaiTaiKhoan {
    private int id;
    private String tenLTK;

    public LoaiTaiKhoan() {
    }

    public LoaiTaiKhoan(int id, String tenLTK) {
        this.id = id;
        this.tenLTK = tenLTK;
    }

    public LoaiTaiKhoan(int id) {
        this.id = id;
    }

    public LoaiTaiKhoan(String tenLTK) {
        this.tenLTK = tenLTK;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLTK() {
        return tenLTK;
    }

    public void setTenLTK(String tenLTK) {
        this.tenLTK = tenLTK;
    }

    @Override
    public String toString() {
        return getTenLTK();
    }
      
}
