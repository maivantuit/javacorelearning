/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop42_TongHopArrayArrayListVectorHasMap;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author CỌP
 */
public class ArrayListClass {

    public static void main(String[] args) {
        //tao 1 arraylist, khác với tạo mảng ở array
        ArrayList a = new ArrayList();
        a.add(2);   
        a.add(2);
//        a.add("Mai Văn Tú");
        a.add(5);
//        System.out.println(a.toString());
        a.add( new Integer(3));
        System.out.println(a.toString());
//        System.out.println(a.get(0));// trả về index 0 kq: 2
//        System.out.println("Mảng gốc: "+a.toString());//kq: [2,Mai Văn Tú,5.6]
//        System.out.println(a.remove(2));
//        System.out.println("Mảng gốc: "+a.toString());// kq: đã xóa 2 
//        System.out.println("kích cở mảng: "+a.size());//2, vì xóa 1 cái rồi        
        // ect nhiều phương thức khác
//        //duyệt arraylist for
//        for(int i =0;i<a.size();i++){
//            System.out.println(a.get(i));// lấy ra từ phần tử,khác bên array: a[i].
//        }
        //duyệt arraylist foreach
        for(Object x: a){// vì mảng trên là 1 mảng chứa nhiều kiểu dữ liệu nên bỏ Object; còn bt là kiểu dữ liệu tương ứng với no
            System.out.println(x);// in ra mảng.
        }
        // dùng 1 số collection: để sắp xếp tăng dần
//        a.sort(a);// báo lỗi, vì trong arraylist hổ trợ Collection để sắp xếp
//        Collections.sort(a); // chỉ sắp xếp được khi chúng mảng chúng là 1 kiểu dữ liệu
//        System.out.println(a.toString()); // 2 5
//        // giảm dần thì đảo ngược:
//        Collections.reverse(a);
//        System.out.println(a.toString());//5 2

        

    }
}//gồm nhiều thao tác và phương thức khác
// ưu điểm: là tập hợp dùng rất thường xuyên trong java.khắc phục rất nhiều các của array, hổ trợ thêm collection: thao tác mảng nâng cao
// 1: rất linh hoạt trong việc tăng giảm kích thước; tháo tác tập hợp; chèn và xóa dữ liệu dễ dàng, truy xuât băng 2 for; còn Iterrator và ListIterator, chưa cần thiêt
// có 3 contrucstor: ArrayList(); ArrayList(Collection c ); ArrayList(int capacity )
// nhược điểm: 
