/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop32_InputAndOutput.BangLuongByte;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



/**
 *
 * @author CỌP
 */
public class DocDuLieuBangDataStreamIntput {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("filedata.txt");
        DataInputStream dis = new DataInputStream(fis);
        int items = dis.readInt();
        for(int i =0;i<=items;i++){
            int n = dis.readInt();
            System.out.println(n+" ");
        }
        System.out.println(dis.readUTF());
        System.out.println(dis.readDouble());
        dis.close();
    }// 1 + 13213213E+2 ly do ket qua nay la do xu ly nhap xuat du lieu bang luong bye nen no k ho tro unicode
}
