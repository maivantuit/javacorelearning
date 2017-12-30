/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop31_Exception.BaiTap;

import java.util.Scanner;

/**
 *
 * @author CỌP
 */
public class Mang {

    public int number[];

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số phần tử:  ");
        int spt = sc.nextInt();
        number = new int[spt];
        for (int i = 0; i < spt; i++) {
            System.out.println("Nhập phần tử thứ: " + (i + 1));
            number[i] = sc.nextInt();
        }
    }
    public void tinhtong(){
       
        for(int y:number){
            int tong=0;
            tong=tong+y;
            
        }
        
        
    }

    public void xuatmang() {
        for (int x : number) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Mang m = new Mang();
        m.nhap();
        m.xuatmang();     
        m.tinhtong();
    }
}
