/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop22_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CỌP
 */
public class SinhVien2 {

    ArrayList<SinhVien2> a = new ArrayList<SinhVien2>();
    public String hoTen;

    public SinhVien2() {
    }

    public SinhVien2(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    // hàm nhập
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập họ tên sinh viên: ");
            hoTen = sc.nextLine();
            a.add(this);
            if(hoTen.equals("N")){
                break;
            }
        }
    }

    //hàm xuất
    public void Xuat() {
        for(int i=0;i<a.size();i++){
            SinhVien2 x =a.get(i);
            System.out.println("Mảng sinh viên là: "+a.get(i));
        }
        
            
        
        
    }

    //hàm sắp xếp
    public void SapXep() {
        
    }
    public static void main(String[] args) {
        SinhVien2 sv =new SinhVien2();
        sv.Nhap();
        sv.Xuat();
    }
}
