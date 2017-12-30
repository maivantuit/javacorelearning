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
public class Multi3 implements Runnable{
    @Override
    public void run(){
        System.out.println("Task one");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new Multi3());
        Thread t2 = new Thread(new Multi3());//Chuyển đối tượng ẩn danh của lớp A
        t1.start();
        t2.start(); // kq: Task one x2
    }
}
