/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop37_DaLuongThread.Synchronized;

/**
 *
 * @author CỌP
 */
public class SynchronzedMethod implements Runnable{
    @Override
    public synchronized void run() {
        for(int i=0 ; i<5;i++){
            System.out.println(Thread.currentThread().getName()+i);
            try{
                Thread.sleep(1500
                );
            }catch(Exception iex){
                System.out.println(" "+iex);
            }
        }
        System.out.println("*Hoanh Thanh: "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        SynchronzedMethod m1 = new SynchronzedMethod();
        Thread t1 = new Thread(m1);// hien tai co 3 luong, 3 thread
        Thread t2 = new Thread(m1);
        Thread t3 = new Thread(m1);
        t1.setName(" Thread 1: ");
        t2.setName(" Thread 2: ");
        t3.setName(" Thread 3: ");
        t1.start();        
        t2.start();
        t3.start();// kq: khong su dung tu khoa synchronnized thi thu tu cac thread bi dao lon khi thay doi sleep hoac chay lan 2, lan 3..
    }
    
}
