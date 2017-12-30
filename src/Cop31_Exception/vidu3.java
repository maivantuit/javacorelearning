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
public class vidu3 {

    public static void main(String[] args) {
        try {
            int b = 0;
            int a = 10 / b;
            System.out.println("a= " + a);
            int c[] = {2};
            c[5] = 3;

        } catch (ArithmeticException e) {
            System.out.println("Phép chia cho 0: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Bị lỗi do nhập index sai mảng");
        } finally {
            System.out.println("Luôn luôn thực hiện ");
        }
    }
}
