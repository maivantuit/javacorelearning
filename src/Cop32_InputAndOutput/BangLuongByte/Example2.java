/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop32_InputAndOutput.BangLuongByte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author CỌP
 */
public class Example2 {
    //đọc thông tin từ file 'file1.dat' và in ra màn hình
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("file.dat");
        int c;
        while((c=fis.read())!=-1){
            System.out.println((char) c);            
        }
        fis.close();
    }
}
