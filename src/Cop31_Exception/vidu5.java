/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop31_Exception;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author CỌP
 */
public class vidu5 {// sử dụng từ khóa throws
    public void ghifile() throws IOException {
        FileWriter file = new FileWriter("data.txt");
        file.write("Xữ lý ngoại lệ trong java");
        file.write(100);
        System.out.println("Da ghi xong !");
        file.close();
    }
    public static void main(String[] args) throws IOException {// dùng throws trong main();
//        vidu5 vd = new vidu5(); 
//        vd.ghifile(); // kq: Da ghi xong !
        try {
            vidu5 obj = new vidu5();
            obj.ghifile();
            System.out.println("Sử dụng từ khóa throws");
            
        } catch (IOException ex) {
            System.out.println("Có lỗi: "+ex);
        }// kq: Da ghi xong, sử dụng từ khóa throws.
    }
}
