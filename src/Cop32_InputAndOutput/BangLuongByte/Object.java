/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop32_InputAndOutput.BangLuongByte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CỌP
 */
public class Object implements Serializable { //Serializable: la ?

    private int id;
    private String desc;
    private double price;
    private int quantity;

    public Object(int id, String desc, double price, int quantity) {
        this.id = id;
        this.desc = desc;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return (id + " " + desc + " " + price + " " + quantity);
    }
}

class ObjectExampleWrite {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("fileobject.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Object[] obj = {new Object(1001, "CD ROM Cọp Cúte", 100.00, 20),
            new Object(1002, "DRAM", 120.00, 30),
            new Object(1003, "P4 Processor", 300.00, 20),
            new Object(1004, "Conon Jet", 80.00, 10),
            new Object(1005, "HP Scanner", 75.00, 90)
        };
        oos.writeObject(obj);
        oos.close();
    }
}
    //  chu thich la vi 2 ham main: 1 ham de ghi du lieu file, con lai la doc ra du lieu file,ra man hinhf\

//    public static void main(String[] args) {
//        FileInputStream fis = null;
//        ObjectInputStream ois = null;
//        try {
//            fis = new FileInputStream("fileobject.txt");
//            ois = new ObjectInputStream(fis);
//            Object[] obj1 = (Object[]) ois.readObject();// mang: obj1
//            System.out.println("Doc tu file: ");
//            for (Object x : obj1) {
//                System.out.println(x);
//            }
//            ois.close();
//            fis.close();
//        } catch (Exception e) {
//            System.out.println("Co loi: " + e);
//        }
////        Doc tu file: 
////1001 CD ROM 100.0 20
////1002 DRAM 120.0 30
////1003 P4 Processor 300.0 20
////1004 Conon Jet 80.0 10
////1005 HP Scanner 75.0 90
//
//    }
