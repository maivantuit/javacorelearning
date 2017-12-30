/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop31_Exception.Throw_Throws;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoMyException2 extends Exception {
    String a;
    public DemoMyException2(String a) {
        super();
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public void setA() {
        this.a = a;
    }
}

class B {

    public static void main(String[] args) {
        try {
            hienthiconnect();
        } catch (DemoMyException2 e) {
            System.out.println(e.getA());
        }
        System.out.println("Continue Program");
    }

    public static void hienthiconnect() throws DemoMyException2 {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập số nguyên a: ");
            int a = sc.nextInt();
            System.out.println("Họ tên sinh viên: "+a);
        } catch (Exception e) {
            throw new DemoMyException2("Vui lòng nhập kiểu số nguyên!");
            
        }      
        

    }
}
