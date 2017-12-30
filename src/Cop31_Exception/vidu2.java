/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop31_Exception;

import java.util.Scanner;

/**
 *
 * @author CỌP
 */
public class vidu2 {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập a: ");// Exception khi nhập a là 1 số thực
            a = sc.nextInt();
            System.out.println("Nhập b: ");
            b = sc.nextInt();
            int kq = a / b;
            System.out.println("Thương:  " + kq);
        } catch (Exception e) {
            System.out.println("Có lỗi, tên lỗi đó là:  "+e);
        }
        System.out.println("Sau khi phép chia !");//(*)// luôn luôn thực hiện dù b=0 hay b!=0
 // các exception: số 0, nhập sai kiểu(double,String),
// ý  nghĩa là: trong 1 chương trình đang chạy, nếu tự nhiên có lỗi tương tự như vậy thì chương trình break lại
// nên ta sử dụng try catch để bắt lỗi và cho chương trình tiếp tục chạy
    }
}
