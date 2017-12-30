/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop24_Inherit.Homework3_SinhVienPol;

import java.util.Scanner;

/**
 *
 * @author CỌP
 */
public class SinhVienIT extends SinhVienPoly {

    public double java;
    public double html;
    public double css;


    public SinhVienIT(double java, double html, double css, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    @Override
    public double getDiem() {
        return  (2 * java + html + css) / 4;
    }
     public void nhap() {
        Scanner sc = new Scanner(System.in);
        int in;
        System.out.println("Cần nhập bao nhiêu sinh viên IT: ");
        in = sc.nextInt();
        for (int i = 0; i < in; i++) {
            System.out.println("Nhập sinh viên thứ: "+i);
            System.out.println("Nhập họ tên: "+i);
            setHoTen(sc.nextLine());
            System.out.println("Nhập ngành: "+i);
            setNganh(sc.nextLine());
        }

    }
}
