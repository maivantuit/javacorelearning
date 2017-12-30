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
public class Arrayl_SinhVien2 {

    public String hoTen;
    public double diem;

    public Arrayl_SinhVien2(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public Arrayl_SinhVien2() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        hoTen=sc.nextLine();
        System.out.println("Nhập điểm: ");
        diem=sc.nextDouble();
    }

    public static void main(String[] args) {       
        ArrayList<Arrayl_SinhVien2> a = new ArrayList<Arrayl_SinhVien2>();
        int spt;
        Scanner sc1= new Scanner(System.in);
        System.out.println("Số phần tử của mảng: ");
        spt =sc1.nextInt();
        for(int i =1;i<spt;i++){
            
        }
        

    }
}
