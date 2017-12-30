/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop31_Exception.Throw_Throws;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Phân biệt Throw và Throws trong Java?
Throws: là từ khóa dùng để thiết lập chế độ bắt lấy các ngoại lệ (exception) có thể sẽ phát sinh trong phương thức (method) khi nó đang họat động, ví dụ ta viết một chương trình tính toán hai số nhập từ bàn phím vào, và khi ta nhập chữ thì một ngoại lễ sẽ được bắt và hiển thị ra ngoài cho lập trình viên biết.

Throw: là từ khóa dùng để tự thiết lập các ngoại lệ (exception) trong phương thức (method) và các điều kiện xảy ra các ngoại lệ, lấy vụ dụ thế này khi một số đầu vào nhỏ hơn 18 thì ta muốn quăng cho nó một ngoại lệ là dữ liệu này không hợp lệ, trên thực tế dữ đầu vào nhỏ hơn 18 không có gì là bất thường hay ngoại lệ cả chỉ là ta muốn nó phát sinh một ngoại lệ như vây thôi.

Vậy ta có thể nói đơn giản thể này Throws dùng để bắt các exception mà ta không xác định được, còn Throw dùng để thiết lập các tình huống mà ta mong muốn xảy ra ngoại lệ.

 * @author CỌP
 */
public class Throw1 {
    public static void main(String[] args) throws InterruptedException  {
        Building b = new Building();       
            b.go();
    }
    
}
class MyExcep extends Exception{
    
}
class Building{
    public void show() throws MyExcep {
        int numberConnection =0;
        if(numberConnection>100){
            throw new MyExcep();
        }
        // ném ra ngoại lệ trong thân hàm show này, cso 2 cách(Try-catch;casch2: throws  trên hàm throws MyException)
    }// throw: ném ra ngoại lệ trong thân hàm ; throws: sử dụng cho khai báo phương thức.
    public void go() throws InterruptedException{
        Thread.sleep(1000);// lỗi=>chọn throw=> throws InterruptedException
    }
}
//tự tạo Exception của mình: vì sao? ta tự định nghĩa
//trog thực tế: khi ta connect đến server hay database, ta muốn giới hạn connect = hằng số tĩnh, thì khi nó đạt đến giới hạn đó thì nó dừng lại. đó là ý nghĩa trong thực tế, bắt đc tình trạng kết nối

//Throws -3 người = người ném đá, chứ không phải bạn
//Throw -1 người = BẠN tự ném đá ...