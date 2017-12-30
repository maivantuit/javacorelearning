package Cop10_BangCuuChuongWhile;


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
public class bangcuuchuong {
    public static void main(String[] args) {
        int a;
        int N=1;// giá trị đầu
        double kq;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số bảng cửu chương: ");
        a=sc.nextInt();
        while(N<10){//giá trị cuối, để dừng
            kq=a*N;
            System.out.println(+a+" * "+N+" = "+kq);
            N++;
        }
    }
}
