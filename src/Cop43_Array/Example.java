/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop43_Array;

/**
 *
 * @author CỌP
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;

/**
 *
 * @author CỌP
 */
public class Example {
    public static void main(String[] args) {
        int so[] = {4, 5, 6, 3, 5, 6, 7, 3, 1};
        //in ra mảng gốc.
        System.out.println("Mảng gốc: " + Arrays.toString(so));
        System.out.println(so[0]);//kq: lấy mang so với index là 0        
        Arrays.sort(so);
        System.out.println("Sau khi sắp xếp: " + Arrays.toString(so));
        // k khởi tạo
        int so1[] = new int[]{2, 3, 4};// khởi tạo 3 phần tử biết trước
        String so2[] = new String[5];// khởi tạo 5 phần tử String
        // Arrays: k thể bổ sung và xóa các phần tử, lãng phí bộ nhớ
        System.out.println("Số phần tử: " + so.length);//kq: 9 
        //duyệt mảng. in ra mảng.for bt.
        for (int i = 0; i < so.length; i++) {
        //System.out.println(i);//kq : 0 1 2 ... 8, nó lấy số phần tử
            System.out.println(so[i]);//so[i]: lấy mảng so, vị trí index i: đưa ra mảng gốc
        }
        //duyệt mảng bằng for each:
        for (int x : so) { // x: là số pt,
            System.out.println(x);
        }
    }
}
// rút ra: Array sẽ có cái ưu và nhược điểm của nó.
/**
 *1: Ưu:
 *  +Tối ưu hóa code: từ đó chúng ta có thể thu nhận và sắp xếp dữ liệu một cách dễ dàng.

    +Truy cập ngẫu nhiên: chúng ta có thể lấy bất cứ dữ liệu nào ở tại bất cứ vị trí chỉ mục nào.
  2: Nhược:
  * Giới hạn kích cỡ: Chúng ta chỉ có thể lưu trữ kích cỡ cố định số phần tử trong mảng. Nó không tăng kích cỡ của nó tại runtime. Để xử lý vấn đề này, Collection Framework được sử dụng trong Java.
 * @author CỌP
 */