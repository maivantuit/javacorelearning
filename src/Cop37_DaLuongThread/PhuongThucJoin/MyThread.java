/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop37_DaLuongThread.PhuongThucJoin;

import java.util.logging.Level;
import java.util.logging.Logger;
public class MyThread extends Thread {
    private String name;
    public MyThread(String name) {
        this.name = name;
    }
    public void run() {
        try {
            System.out.println("\n Trong run()" + name);
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " ");
            }
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(" " + ex);
        }
    }

    public static void main(String[] args) {
        try {
            MyThread th1 = new MyThread("Thread1: ");
            MyThread th2 = new MyThread("Thread2: ");
            th1.start();
            th1.join();// cho den khi 1 thread dung hoat dong
            th2.start();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }// kq: Trong run() Thread: 1 1 0 1 2 3 4 5 6 7 8 9 chay xong roi den
                //Trong run() Thread:  2 1 0 1 2 3 4 5 6 7 8 9
    }
}
