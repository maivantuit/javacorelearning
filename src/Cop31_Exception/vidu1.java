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
public class vidu1 {
    public static void main(String[] args) {
        try{ // try catch: cố thử, và bắt lấy
        int a=5;
        int b=0;
        double kq = 5/0;
        System.out.println(" "+kq);// exception khi chia cho 0
        }catch(ArithmeticException e){ // hoặc bỏ ở đây là 1 exception
            System.out.println("Error: "+e);// báo lỗi ở đây: và tiếp tục chạy chương trình, ý nghĩa trycatch là như vậy
        }
        System.out.println("Continue program");
    }
}
