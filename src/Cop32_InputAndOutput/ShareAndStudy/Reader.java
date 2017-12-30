/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop32_InputAndOutput.ShareAndStudy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CỌP
 */
public class Reader {
    public static void main(String[] args) {
        File file = new File("cop.txt");        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            int i =0;
            while((line =br.readLine())!=null){// đọc phải kiểm tra phải hết chưa, khi cuối file thì trả về giá trị null nên mình kiểm tra, vd: insert database. tùy TH
                System.out.println(++i+": "+line);// 1: line1 ect
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException e){
            System.out.println("");
        }
    }
}
// String IO, file IO: khá quan trọng: IO,ghi log,insert database