/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop24_Inherit.Homework3_SinhVienPol;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CỌP
 */
abstract public class SinhVienPoly {

    ArrayList<SinhVienPoly> a = new ArrayList<SinhVienPoly>();
    public String hoTen;
    public String nganh;
//----------------------------------------------------------------

    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
//----------------------------------------------------------------    

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        int in;
        System.out.println("Cần nhập bao nhiêu sinh viên: ");
        in = sc.nextInt();
        for (int i = 0; i < in; i++) {
            System.out.println("Nhập sinh viên thứ: "+i);
            System.out.println("Nhập họ tên: "+i);
            setHoTen(sc.nextLine());
            
            System.out.println("Nhập ngành: "+i);
            setNganh(sc.nextLine());
        }

    }
//----------------------------------------------------------------    

    public SinhVienPoly(String hoTen, String nganh) {

    }
//----------------------------------------------------------------

    abstract public double getDiem();

    public double getHocLuc() {
        getDiem();
        double diem = 0;
        if (diem < 5) {
            System.out.println("Yếu");
        } else if (diem > 6.5 && diem >= 5) {
            System.out.println("Trung bình");
        } else if (diem > 6.5 && diem < 7.5) {
            System.out.println("Khá");
        } else if (diem > 7.5 && diem < 9) {
            System.out.println("Giỏi");
        } else if (diem >= 9) {
            System.out.println("Xuất sắc");
        }
        return diem;
    }
//----------------------------------------------------------------

    public void xuat() {
        System.out.println("Họ tên: " + getHoTen());
        System.out.println("Ngành: " + getNganh());
        System.out.println("Điểm: " + getDiem());
        System.out.println("Xếp Loại: " + getHocLuc());

    }
   

}
