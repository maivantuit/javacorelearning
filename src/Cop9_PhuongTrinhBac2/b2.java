package Cop9_PhuongTrinhBac2;


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


    /**
     * Phương trình bậc 2 có dạng tổng quát
     *
     * ax^{2}+bx+c=0
     *
     * Trong đó a ≠ 0 , a , b là hệ số, c là hằng số
     *
     * Để giải phương trình bậc 2, tưc là tìm nghiệm x, ta cần tính delta ( KH:
     * \Delta )      *
     * \Delta = b^{2}-4ac
     *
     * - Nếu \Delta >0 thì phương trình có 2 nghiệm phân biệt
     *
     * x_{1}=\frac{-b-\sqrt{\Delta }}{2a} x_{2}=\frac{-b+\sqrt{\Delta }}{2a}
     *
     * - Nếu \Delta =0 thì phương trình có 1 nghiệm
     *
     * x=\frac{-b}{2a}
     *
     * - Nếu \Delta <0 thì phương trình vô nghiệm
     */
public class b2 {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        double delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = sc.nextInt();
        System.out.println("Nhập b: ");
        b = sc.nextInt();
        System.out.println("Nhập c: ");
        c = sc.nextInt();
        delta = Math.pow(b,2) - (4 * a * c);
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt");
            double x1 = (-b - Math.sqrt(delta)) / 2 * a;
            double x2 = (-b + Math.sqrt(delta)) / 2 * a;
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }
        if (delta == 0) {
            System.out.println("Phương trình có 1 nghiệm: ");
            double x3 = (-b) / (2 * a);
            System.out.println("x3: " + x3);
        }
        if (delta < 0) {
            System.out.println("Chương trình vô nghiệm: ");
        }
    }

}
