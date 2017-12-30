/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop26_ClassNangCao_Static;

/**
 *
 * @author CỌP
 */
public class  Static2{
    static public int x= 100;
    static{
        x+=100;
    }
    static public void method2(){
        x+=200;
    }
    public static void main(String[] args) {
        Static2 st2 = new Static2();
        st2.x+=300;        
        Static2.x+=500;
        Static2.method2();
        System.out.println(""+x);
        
       
        
    }
}
