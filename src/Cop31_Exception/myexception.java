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
public class myexception extends Exception {

    private int message;

    myexception(int a) {
        message = a;
    }

    @Override
    public String toString() {
        return "My exception: " + message;
    }

    static void tinhtoan(int a) throws myexception {
        if (a > 10) {
            throw new myexception(a);
        }
        System.out.println("Normal exit");
    }

    public static void main(String[] args) {
        try {
            tinhtoan(1); // không tạo ra exception, Normal exit
            tinhtoan(20);//tạo ra exception, Caugh:  My exception: 20
        } catch (myexception e) {
            System.out.println("Caugh: " + e);
        }
    }
}
