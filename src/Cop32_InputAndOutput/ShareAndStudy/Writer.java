///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Cop32_InputAndOutput.ShareAndStudy;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
///**
// *
// * @author CỌP
// */
//public class Writer {
//    public static void main(String[] args) {
//        try {
//            File file = new File("cop.txt");
//            file.createNewFile(); // tao ra 1 file bang lenh.
//            
//            FileWriter fw= new FileWriter(file);// lấy file khác or file mình mới tạo ra
//            BufferedWriter bw= new BufferedWriter(fw);
//            //
//            String data ="studyandshare";            
//            bw.append(data + "\n");
//            bw.write(data + "\n");
//            bw.write(data + "\n");// notepate: k xuống dòng, sử dụng cái khác:Wrokpad             
//            bw.close();
//            fw.close();
//            //kq: nó đã in ra file: C:\Users\PC\Documents\NetBeansProjects\Java Core\cop.txt
//            //có thể tạo 1 nó method riêng để sử dụng lại nhiều lần
//        } catch (IOException ex) {
//            Logger.getLogger(Writer.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//}
