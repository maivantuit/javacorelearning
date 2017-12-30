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
public class SimpleThread extends Thread{
    public SimpleThread(String str){
        super(str);
    }
    public void run(){
        for(int i=1;i<10;i++){     
            System.out.println("Tp Ho Chi Minh");            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Second Thread error: "+e);
            }
            
        }
        System.out.println("Done");
    }
    public static void main(String[] args) {
        SimpleThread s1 = new SimpleThread("Tp Ho Chi Minh");        
        s1.start();
      
    }
}
