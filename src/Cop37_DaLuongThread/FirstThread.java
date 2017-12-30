/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop37_DaLuongThread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CỌP
 */
public class FirstThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println("Messag from Fisrt Thread: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("First Thread error: "+e);
            }
        }
    }
    
}
 class SecondThread implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<10;i++){
            System.out.println("Messag from Second Thread: "+i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Second Thread error: "+e);
            }
        }
    }
    
}
class ThreadDemo{
    public static void main(String[] args) {
        // tao 2 doi tuong
        FirstThread ft = new FirstThread();
//        ft.run();
        SecondThread st = new SecondThread();
//        st.run();// chay fisrt truoc xong den second
      
        // chay class the first
        Thread th1 = new Thread(ft);
        th1.start();

        //chay class the second
        Thread th2 = new Thread(st);
        th2.start();
//       
        
        
    }
}