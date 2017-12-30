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
 *
 * Chào các bạn, hôm nay mình sẽ nói về array list trong java, và các thao tác
 * của nó Đầu tiên ta so sánh với Mảng; Mảng là 1 tập hợp phần tử cố định, không
 * thêm xóa 1 cách mềm dẻo, các phần tử k cần thiết chiếm bộ nhớ... ect Và
 * arraylist khắc phục các đó. Bắt đầu:
 */
public class ThaoTacCuaArrayList {

    public static void main(String[] args) {
        //các bạn bấm psvm + table nhé
        //khai báo 1 arraylist(có định kiểu)
        ArrayList<String> a = new ArrayList<String>();
        //chèn vào mảng này các phần tử sau.
        a.add("Cường");
        a.add("Tuấn");
        a.add("Phương");
        a.add("Hạnh");
        //xuất ra mảng này có [] chứa.
        System.out.println("Mảng gốc: " + a.toString());// các bạn bấm sout+table nhé
        a.add("Copj");
        a.toString();// k in ra được
        a.set(2,"Tèo");
        System.out.println("Mảng sao khi chèn tèo:"+a.toString());
        //thực hiện các thao tác của arraylist.
        //thêm vào cuối.
        System.out.println("Thêm vào cuối mảng: " + a.add("Tú"));
        System.out.println("Mảng sau khi thêm 1 phần tử: " + a.toString());//xem lại mảng
        //chèn 1 phần tử vào vị trí
        a.add(1, "An");// các chỉ mục(index) bắt đầu là số 0.
        System.out.println("Mảng sau khi chèn: " + a.toString());
        //xóa phần tử.
        System.out.println("Xóa phần tử: " + a.remove("Tú"));
        System.out.println("Mảng sau khi xóa: " + a.toString());
        //xóa, nhận phần tử tại vị trí
        System.out.println("Xóa phần tử " + a.remove(2));
        System.out.println("Mảng sau khi xóa: " + a.toString());

        // để có dữ liệu ta xóa cái trước nhé
        //thay đổi phần tử tại ví trí
        System.out.println("thay đổi: " + a.set(1, "Tuấn"));
        System.out.println("Mảng sau khi thay đổi: " + a.toString());
        //truy xuất phần tử
        System.out.println("Truy xuất phần tử: " + a.get(2));
        System.out.println("Mảng sau khi truy xuất: " + a.toString());
        //số phần tử
        System.out.println("Số phần tử: " + a.size());
        System.out.println("Mảng sau khi đếm " + a.toString());
        //trong mảng là length, còn trong arraylist là size();
        //kiểm tra sự tồn tại
        System.out.println("Tồn tại: "+a.contains("Hạnh"));
        //kiểm tra rỗng
        System.out.println("Rỗng: "+a.isEmpty());
        // mảng có phần tử nên trả về là false
        //tìm vị trí phần tử.
        System.out.println("Mảng:"+a.toString());
        System.out.println("Vị trị: "+a.indexOf("Hạnh"));
        // Hạnh ở vị trí thứ 3.(0,1,2,3)Index
        //Cảm ơn Các bạn đã theo dõi.
    }
}
