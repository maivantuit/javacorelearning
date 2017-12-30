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
public class Mutil2 {
    public static void main(String[] args) {
        task1 t1 =new task1();
        task2 t2 = new task2();
//        t1.start();
//        t2.start();//kq : task 1 va task 2
        // hoac thuc hien nhieu cong viec bang Thread
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();// kq: task 1 va task 2
    }
}
class task1 extends Thread{
    public void run(){
        System.out.println("task 1");
    }
}
class task2 extends Thread{
    public void run(){
        System.out.println("task 2");
    }
}
