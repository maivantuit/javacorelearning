/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop32_InputAndOutput.BangLuongCharacter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author CỌP
 */
public class Example1 {
    public static void main(String[] args) {
        File filename = new File("first.txt");
        try {
            FileWriter out = new FileWriter(filename);
            out.write("Doc ghi du lieu trong Java! ");
            out.write("\n");// ghi vao file
            out.write("Su dung Stream Character");
            out.close();
            //doc tu file text
            FileReader input = new FileReader(filename);
            System.out.println("Doc tu file first.txt: ");
            int ch = input.read();
            while(ch !=-1){
                System.out.println((char) ch);
                ch = input.read();
            }
        } catch (Exception e) {
        }
    }        
}
