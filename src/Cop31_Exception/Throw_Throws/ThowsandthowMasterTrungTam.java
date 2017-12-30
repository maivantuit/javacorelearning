/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop31_Exception.Throw_Throws;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InsufficientResourcesException;

public class ThowsandthowMasterTrungTam {

    public static void main(String[] args) {

        try {
            print(); // khi throws Exception, cac ham ma goi no thi phai bo try catch de xu ly va dua loi;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.toString());
        }
        try {
            print2();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error 2: " + e.toString());
        }

        try {
            print3();
        } catch (IOException ex) {
            System.out.println("Error 3: " + ex.toString());
        }
        System.out.println("Continue Program");
    }

    public static void print() throws ArrayIndexOutOfBoundsException {// quang ra Exception       
        int mang[] = {1, 2};
        System.out.println(mang[2]);
    }

    // tạo ra các exception, throw
    public static void print2() {//unchecked
        throw new ArrayIndexOutOfBoundsException();// new như 1 đối tượng mới
    }

    public static void print3() throws IOException {
        throw new IOException();// checked
    }

}
// sự khác nhau giữa print2() and exception(): đó là dưới.
// phân biệt: runtimexception và exception; theo mô hình phân cấp trong java, thuộc các Exception đó, những cái hay dùng: trong web mới saved
// throw: tạo ra Exception, tạo ra lỗi.
// throws: ném ra Exception, ném ra lỗi.
