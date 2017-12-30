package Cop11_BangCuuChuongFor;


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
public class forcuuchuong {
    public static void main(String[] args) {
        int a;
        int sotang = 0;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập bảng cửu chương cần in: ");
        a=sc.nextInt();
        
        for(int i =1;i<10;i++){
            sotang++;//số tăng
            double kq=a*i;
            System.out.println(""+a+" * "+sotang+" = "+kq);
            
        }
    }
}
