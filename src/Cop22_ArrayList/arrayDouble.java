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
public class arrayDouble {

    public static void main(String[] args) {
        ArrayList<Double> a = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        double tong = 0;
        double tbcong = 0;        
        System.out.println("Nhập danh sách số thực: ");
        double db = sc.nextDouble();

        while (db != 0) {
            a.add(db);
            db = sc.nextDouble();
        }
        //in ra mảng
        System.out.println("Mảng Số thực: " + a.toString());
        
        //tinh tong
        for (int i = 0; i < a.size(); i++) {
            double x = a.get(i);
            tong = tong + x;
        }
        //in ra tong
        System.out.println("Tổng:" + tong);
        for (double x : a) {
            tbcong = (tong) / a.size();
        }

        System.out.println("TB cộng: " +  tbcong);
    }

}
