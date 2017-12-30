/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop21_Constructor;

import java.util.Scanner;

/**
 *
 * @author CỌP
 */
public class SinhVien {

    public String hoTen;
    public double diemTB;
    
    public SinhVien(String hoTen, double diemTB) {
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public SinhVien() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
    public void Nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        hoTen=sc.nextLine();
        System.out.println("Nhập ĐiểmTB");
        diemTB=sc.nextDouble();      
        
    }
    public void Xuat(){
        System.out.println(" "+hoTen);
        System.out.println(" "+diemTB);
        
    }
    public void XepLoai(){
        if(diemTB<4.0){
            System.out.println("Xếp loại kém");
        }else if(diemTB>4.0 && diemTB<5.5){
            System.out.println("Xếp loại yếu");
        }else if(diemTB>5.5 &&diemTB<7.0){
            System.out.println("Xếp loại trung bình");
        }else if(diemTB>7.0 && diemTB<8.5){
            System.out.println("Xếp loại khá");
        }else if(diemTB>8.5){
            System.out.println("Xếp loại giỏi");
        }
    }
    public static void main(String[] args) {
        SinhVien sv1= new SinhVien();
        sv1.Nhap();
        sv1.Xuat();
        sv1.XepLoai();
        SinhVien sv2= new SinhVien();
        sv2.Nhap();
        sv2.Xuat();
        sv2.XepLoai();
        
    }
}
