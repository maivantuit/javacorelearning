/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop28_DeQuy;

import java.util.Scanner;

public class XuLyMang {

    int so[];
    int spt;

    public void Nhap() {
        System.out.println("Số phần tử bạn cần nhập vào là: ");
        Scanner sc = new Scanner(System.in);
        spt = sc.nextByte();
        so = new int[spt];
        for (int i = 0; i < so.length; i++) {
            System.out.println("Nhập phần tử thứ: " + (i + 1) + " ");
            so[i] = sc.nextInt();
        }
    }

    public void xuat() {
       for(int i =0;i<so.length;i++){
           System.out.println("Mảng: "+so[i]);
       }
    }  
    public void sapxeptangdan() {
        for (int i = 0; i < so.length; i++) {
            for (int j = i + 1; j < so.length; j++) {
                if (so[i] > so[j]) {
                    int temp = so[i];
                    so[i] = so[j];
                    so[j] = temp;
                }
            } 
            System.out.println("Tăng dần: "+so[i]);
        }
        
    }
    public void sapxepgiamdan(){
        for (int i = 0; i < so.length; i++) {
            for (int j = i + 1; j < so.length; j++) {
                if (so[i] < so[j]) {
                    int temp = so[i];
                    so[i] = so[j];
                    so[j] = temp;
                }
            }
            System.out.println("Giảm dần: "+so[i]);
        }
    }

    public static void main(String[] args) {
        XuLyMang m = new XuLyMang();
        m.Nhap();
        m.xuat();       
        m.sapxeptangdan();
        m.sapxepgiamdan();

    }
}
