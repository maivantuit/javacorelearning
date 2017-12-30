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
public class Static1 {
    int b;
    static public int x;
    static{
        
        x+=100;
    }
    static public void method1(){
        
        x+=200;
    }
    static class Cop{}
    public static void main(String[] args) {
        Static1.x = 700;
        Static1.method1();
        System.out.println(" " + x);//kq: 900
//        Static1 st = new Static1();
//        st.x=700;
//        System.out.println(""+x);
        // không gọi đc vì thuộc và phương thức đều là stactic.
        
    }
}
