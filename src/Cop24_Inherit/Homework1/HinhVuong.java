/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop24_Inherit.Homework1;

import java.util.Scanner;

/**
 *
 * @author CỌP
 */
public class HinhVuong extends HinhChuNhat {

    public int canh;

    public HinhVuong(int canh, int dai, int rong) {
        super(dai, rong);
        this.canh = canh;
    }

    public HinhVuong(int dai, int rong) {
        super(dai, rong);
    }
    
    @Override
    public void xuat() {
        super.xuat();
    }

    public static void main(String[] args) {
        HinhChuNhat hcn= new HinhChuNhat(3,4);
        HinhChuNhat hcmn = new HinhVuong(3,4,5);
        hcn.xuat();
        hcmn.xuat();
    }

    
}
