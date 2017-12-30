/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop31_Exception;

/**
 *
 * @author CỌP
 */
public class vidu4 {
    static void proA() {
        try {
            System.out.println("Trong phương thức proA");
            throw new RuntimeException("Demo"); //(1)
        } finally {
            System.out.println("Trong khối finally của proA");
        }
    }
    static void proB(){
        try {
            System.out.println("Trong phương thức proB");
            return;
        } finally {
            System.out.println("Trong khối finally của proB");
        }
    }
    static void proC(){
        try {
            System.out.println("Trong phương thức proC");
        } finally{
            System.out.println("Trong khối finally của proC");
        }
    }

    public static void main(String[] args) {
        vidu4.proA();// chạy xuất hiện lỗi(có tạo ngoại lệ mà vẫn chạy khối fially)
        //vidu4.proB(); chạy k có lỗi(có return mà vẫn chạy khối finally)
        //vidu4.proC(); chạy k có lỗi()
        
    }
}
