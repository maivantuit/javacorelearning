/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop32_InputAndOutput.BangLuongByte;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author CỌP
 */
public class GhiDuLieuBangDataStreamOutput {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("filedata.txt");// tao file 
        DataOutputStream dos = new DataOutputStream(fos);
        final int number=5;
        for(int i=0;i<=number;i++){
            dos.writeInt(i);
        }
        dos.writeUTF("Hello everyone!");
        dos.writeDouble(100.75);
        dos.flush();
        dos.close();
        //kq: 1 day so nhi phan + Hello everyone!
    }
}
