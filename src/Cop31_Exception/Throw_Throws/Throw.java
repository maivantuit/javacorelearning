/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop31_Exception.Throw_Throws;

/**
 *
 * @author CỌP
 */
public class Throw {

    static void demoProC() {
        try { 
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Bên trong xữ lý ngoại lệ demoPro");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoProC();// gọi lại hàm demoProC vì static
        } catch (Exception e) {
            System.out.println("Trong main, tiếp tục xữ lý ngoại lệ");
        }
    }
}

