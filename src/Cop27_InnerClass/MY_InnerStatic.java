/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop27_InnerClass;

/**
 *
 * @author CỌP
 */
public class MY_InnerStatic {
    static public class MyInnerStaticClass{
       
    }
    public class MyInnerClass{
        
    }
    public static void main(String[] args) {
        MY_InnerStatic.MyInnerStaticClass x= new MY_InnerStatic.MyInnerStaticClass();
        MY_InnerStatic.MyInnerClass x2= new MY_InnerStatic().new MyInnerClass();
    }
}
