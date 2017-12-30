/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop5_VKhoiLapPhuong;

import java.util.Scanner;

/**
 *
 * @author CỌP
 */
public class lp {

    public static void main(String[] args) {
        int canh = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập cạnh: ");
            canh = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Vui lòng nhập số !");
        }

        //double tt=canh*canh*canh;
        double tt = Math.pow(canh, 3);//canh^3
        System.out.println("Thể tích của Khối Lập Phương: " + tt);
    }
}
