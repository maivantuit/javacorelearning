/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop22_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author CỌP
 */
public class ArraylistType {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Cường");
        a.add("Tuấn");
        a.add("Phương");
        a.add("Hạnh");
        //mảng gốc
        System.out.println("Mảng: " + a.toString());
        //chèn thêm 1 phần tử,default ở cuối phần từ
        System.out.println("Chèn thêm phần tử:  " + a.add("Cọp"));
        System.out.println("Mảng: " + a.toString());
        //chè thêm 1 phần tử vào vị trí thứ        
        a.add(2,"Chiến");
        System.out.println("Mảng: " + a.toString());
        //xóa 1 phần tử index thứ 1: là Tuấn
        System.out.println("Xóa 1 phần tử: " + a.remove("Cường"));
        System.out.println("Mảng: " + a.toString());
        //thay đổi vị trí thứ nhất là tuấn = Cọp
        System.out.println("Thay đổi vị trí thứ 1= Cọp:  " + a.set(1, "Cọp"));
        System.out.println("Mảng: " + a.toString());
        //truy xuất 1 phần từ tại vị trí thứ 3 là Hạnh
        System.out.println("Truy xuất phần tử vị trí thứ 3:  " + a.get(3));
        System.out.println("Mảng: " + a.toString());
        //kiểm tra mảng có bao nhiêu phần tử
        System.out.println(" " + a.size());
        System.out.println("Mảng: " + a.toString());
        //kiểm tra sự tồn tại của,contains
        System.out.println("Kiểm tra sự tồn tại:  " + a.contains("Cường"));
        System.out.println("Mảng: " + a.toString());
        //kiểm tra rỗng,empty
        System.out.println("Kiểm tra arraylist rỗng:  " + a.isEmpty());
        System.out.println("Mảng: " + a.toString());
        //tìm vị trí của phần tử
        System.out.println("Vị trí phần tử: " + a.indexOf("Cường"));
        System.out.println("Vị trí phần tử: " + a.indexOf("Hạnh"));
        System.out.println("Mảng: " + a.toString());
        //xóa sạch,clean
        System.out.println("Xóa và nhận lại ví trí: " + a.remove(2));
        System.out.println("Mảng: " + a.toString());
        //xóa sạch, clean
        a.clear();
        System.out.println("Mảng: " + a.toString());

    }
}
