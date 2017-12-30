/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop37_DaLuongThread;

/**
 *
 * @author CỌP
 */
public class Mutil extends Thread {
    @Override
    public void run(){
        System.out.println("task one");
    }
    public static void main(String[] args) {
        Mutil t1 = new Mutil();
        Mutil t2 = new Mutil();
        Mutil t3 = new Mutil();
        t1.start();
        t2.start();
        t3.start();// kq: task one x3
    }
}
