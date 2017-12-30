/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop34_CreateFileAndFolder;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CỌP
 */
public class Example1 {
    public static void main(String[] args) {
        try {
            File file = new File("taofilebangFile.txt");// lệnh đặt tên file và cpi tạo file
            file.createNewFile();// lện tạo file.
            File directory =new File("Tạo thư mục bằng File");
            directory.mkdir();// tạo thư mục            
        } catch (IOException ex) {
            Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
// còn nhiều phương thức.