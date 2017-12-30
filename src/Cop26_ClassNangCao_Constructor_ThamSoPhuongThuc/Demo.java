/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop26_ClassNangCao_Constructor_ThamSoPhuongThuc;

/**
 *
 * @author CỌP
 */
public class Demo {
    static int a;
    public static void Nhap(){
        System.out.println("I am Cop");
    }
    
    public static void main(String[] args) {
        Demo d = new Demo();
        d.a=3;
        
        System.out.println(""+a);
        // k cho gọi hàm nhập
    }
}
