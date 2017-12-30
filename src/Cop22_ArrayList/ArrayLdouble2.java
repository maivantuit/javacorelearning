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
public class ArrayLdouble2 {
    
    
    public static void main(String[] args) {
        ArrayList<Double> a=new ArrayList<Double>();
        double st;
        int spt;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số phần tử: ");
        spt=sc.nextInt();
        for(int i=0;i<spt;i++){                        
            System.out.println("Nhập số thực chỉ số: "+i);
            st =sc.nextDouble();
            a.add(st);   
            
        }
        System.out.println("Mảng: "+a.toString());
        for(double x:a){
            double tong=0;
            tong=tong+x;
            System.out.println("Tổng các số thực là: "+tong);
        }
        
       
        
    }
}
