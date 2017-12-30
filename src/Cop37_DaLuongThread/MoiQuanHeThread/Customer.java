/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop37_DaLuongThread.MoiQuanHeThread;

/**
 *
 * @author CỌP
 */
public class Customer {

    int amount = 1000;

    public synchronized void ruttien(int m) {
        System.out.println("Bạn đang rút tiền...");
        if (amount < m) {
            System.out.println("Số dư không đủ để rút !");
        }
        try {
            wait();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        amount = amount - m;
        System.out.println("Bạn đã rút tiền thành công !!");
    }

    synchronized void naptien(int m) {
        System.out.println("Bạn đang nạp tiền...");
        amount = amount + m;
        System.out.println("Nạp tiền thành công!!");
        notify();
    }

    public static void main(String[] args) {
        final Customer c = new Customer();
        Thread th1 = new Thread() {
            @Override
            public void run() {
                c.ruttien(1500);
            }
        };
        th1.start();
        Thread th2 = new Thread() {
            @Override
            public void run() {
                c.naptien(3000);
            }
        };
        th2.start();
    }
}
/**
 * Bạn đang rút tiền...
Số dư không đủ để rút !
Bạn đang nạp tiền...
Nạp tiền thành công!!
Bạn đã rút tiền thành công !!
 */
