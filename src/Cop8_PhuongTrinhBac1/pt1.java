package Cop8_PhuongTrinhBac1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CỌP
 */
public class pt1 {
    // phuong trinh bac 1: a va b nhap tu ban phim
    public static void main(String[] args) {
        int a;
        int b;
        double kq;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập a: ");
        a=sc.nextInt();
        System.out.println("Nhập b: ");
        b=sc.nextInt();
        if(a ==0){
            if(b==0){
                System.out.println("Phương trình vô số nghiệm");
            }else{
                System.out.println("Phương trình vô nghiệm");
            }
        }else{
            kq=-b/a;
            System.out.println("Chương trình có 1 nghiệm: "+kq);//Math.round(kq));// làm tròn
        }
    }
}