/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop22_ArrayList;

import java.util.ArrayList;

/**
 *
 * @author CỌP
 */
public class arrayl_Thaotac2 {
    public static void main(String[] args) {
        // tạo 1 mảng al
        ArrayList<String> a= new ArrayList<String>();
        //chèn các phần tử vào
        a.add("Cường");
        a.add("Tuấn");
        a.add("Phương");
        a.add("Hạnh");
        
        System.out.println("Marng1: "+a);
        //xem kết quả
        System.out.println("Mảng: "+a.toString());
        //thêm phần tử,default nằm cuối
        a.add("Tú");
        System.out.println("Mảng: "+a.toString());
        //chèn phần tử vào từng ví trí// no sorry
        a.add(2, "Hùng");
        System.out.println("Mảng: "+a.toString());
        //xóa phần tử
        a.remove("Hùng");
        System.out.println("Mảng: "+a.toString());
        //xóa phần tử theo vị trí
        a.remove(2);// là Phương.
        System.out.println("Mảng: "+a.toString());
//        //xóa sạch
//        a.clear();
//        System.out.println("Mảng: "+a.toString());
        //thay đổi phần tử tại ví trí
        a.set(1,"Tèo");
        System.out.println("Mảng: "+a.toString());
        //Truy suất phần tử
        a.get(2);
        System.out.println("Truy xuất: "+a.get(2));
        System.out.println("Mảng: "+a.toString());
        //Lấy số phần tử
        a.size();
        System.out.println("Số lượng: "+a.size());
        System.out.println("Mảng: "+a.toString());
        //kiểm tra tồn tại
        a.contains(2);
        System.out.println(""+a.contains(2));
        System.out.println("Mảng: "+a.toString());
        //kiểm tra rỗng
        a.isEmpty();
        System.out.println("Rỗng: "+a.isEmpty());
        System.out.println("Mảng: "+a.toString());
        //kitim vi tri
        
        a.indexOf("Cường");
        System.out.println("Vị trí thứ "+a.indexOf(2));
        System.out.println("Mảng: "+a.toString());
    }
}
