/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop7_SwitchNgayThangNam;

import java.util.Scanner;

/**
 *
 * @author CỌP
 */
public class st {

    public static void main(String[] args) {
        int th;
        int nam = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tháng: ");
        th = sc.nextInt();
        System.out.println("Nhập năm: ");
        nam = sc.nextInt();
        if (th > 0 && th < 12) {
            switch (th) {
                case 1:
                    System.out.println("Số ngày trong tháng 1 là: 31");
                    break;
                case 2:
                    if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)) {    // nam nhuan
                        System.out.println("Số ngày trong tháng 2 là: 29");
                        break;
                    } else {
                        System.out.println("Số ngày trong tháng 2 là: 28");
                    }
                    break;
                case 3:
                    System.out.println("Số ngày trong tháng 3 là: 31");
                    break;
                case 4:
                    System.out.println("Số ngày trong tháng 4 là: 30");
                    break;
                case 5:
                    System.out.println("Số ngày trong tháng 5 là: 31");
                    break;
                case 6:
                    System.out.println("Số ngày trong tháng 6 là: 30");
                    break;
                case 7:
                    System.out.println("Số ngày trong tháng 7 là: 31");
                    break;
                case 8:
                    System.out.println("Số ngày trong tháng 8 là: 31");
                    break;
                case 9:
                    System.out.println("Số ngày trong tháng 9 là: 30");
                    break;
                case 10:
                    System.out.println("Số ngày trong tháng 10 là: 31");
                    break;
                case 11:
                    System.out.println("Số ngày trong tháng 11 là: 30");
                    break;
                case 12:
                    System.out.println("Số ngày trong tháng 12 là: 31");
                    break;
                default:
                    System.out.println("");
                    break;

            }
        } else {
            System.out.println("Nhập tháng không hợp lệ!");
        }
    }
}
