/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop6_ThueThuNhap;

import java.util.Scanner;

/**
 *
 * @author CỌP
 */
public class thue {

    public static void main(String[] args) {
        int tn;
        long thue = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thu nhập: ");
        tn = sc.nextInt();
        if (tn < 9000000) {
            System.out.println("Với thu nhập này không cần đóng thuế");
        } else if (9000000 < tn && tn < 15000000) {
            thue = (long) (0.10 * tn);
            System.out.println("Thuế thu nhập là: " + thue);
        } else if (tn > 15000000 && tn < 30000000) {
            thue = (long) (0.15 * tn);
            System.out.println("Thuế thu nhập là: " + thue);
        } else if (tn > 30000000) {
            thue = (long) (0.20 * tn);
            System.out.println("Thuế thu nhập là: " + thue);
        }

    }
}
