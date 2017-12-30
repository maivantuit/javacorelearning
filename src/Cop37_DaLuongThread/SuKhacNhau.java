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
public class SuKhacNhau {// giua thuc thi(implements) interface Runnable va ke thua(extends) tu class Thread
    public static void main(String[] args) {
        a_ExtendsThread a1 =new a_ExtendsThread();   
        a1.start();
        a_ImplementsRunnable a2 = new a_ImplementsRunnable();
        Thread th = new Thread(a2);        
        th.start();
        // kq: of me: ExtendsThread: Counter= 1; Implements Runnable : Counter= 1
        //kq: of them:  
            /**
             * Implements Runnable : Counter= 1
             * Implements Runnable : Counter= 2
             * ExtendsThread: Counter= 1
             * ExtendsThread: Counter= 1
             */

        
    }
    
}
class a_ExtendsThread extends Thread{
    private int counter = 0;
    @Override
    public void run(){
        counter++;
        System.out.println("ExtendsThread: Counter= "+counter);
    }
}
class a_ImplementsRunnable implements Runnable{
    private int counter = 0;

    @Override
    public void run() {
        counter++;
        System.out.println("Implements Runnable : Counter= "+counter);
    }
}
