/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop24_Inherit.Homework1;

import java.util.Scanner;

/**
 *
 * @author CỌP
 */
public class HinhChuNhat {
    public int rong;
    public int dai;
    
    public double getChuVi(){
        return 2*(dai+rong);
    }
    public double getDienTich(){
        return dai*rong;
    }
    public HinhChuNhat(int dai,int rong){
        
    }
    public void xuat(){
        System.out.println("Chiều dài: "+this.dai);        
        System.out.println("Chiều rộng: "+this.rong);
        System.out.println("Chu vi HCN: "+this.getChuVi());
        //getChuVi();
        System.out.println("Diện tích HCN: "+this.getDienTich());
        //getDienTich();
    }
   
}
