/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop24_Inherit.Overriding2;

public class NhanVien {

    public String hoTen;
    protected double luong;

    public double getThuNhap() {
        return this.luong = luong = 2000000;
    }

    public static void main(String[] args) {
        TruongPhong tp = new TruongPhong();
        tp.getThuNhap();
        LaoCong lc = new LaoCong();
        lc.getThuNhap();
    }
}
