/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop31_Exception.TryCatch_Finally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatch1 {

    public static void main(String[] args) {
        String test = "StudyandShare";
        try {
            System.out.println("Before");
            //kiemtra 1            
            System.out.println(test.substring(50));//=50//lỗi: lấy số kí tự con trong test. 50 vượt quá len, sinh ra lỗi này : StringIndexOutOfBoundsException        
            //kiem tra 2
//            int a = 5;
//            int b = 0;//b=0
//            System.out.println("a/b: " + a / b);
//            //kiem tra 3
//            Scanner sc = new Scanner(System.in);
//            int c;
//            System.out.println("Nhập c: ");// nhập vào double, error và mình bắt ở catch
//            c= sc.nextInt();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.toString()); // dùng báo lỗi: Error: java.lang.StringIndexOutOfBoundsException: String index out of range: -37
        } catch(ArithmeticException e){
            System.out.println("Error 2: "+e.toString());
        } catch(InputMismatchException e){
            System.out.println("Error 3: "+e.toString());
        } catch(Exception e){ // bắt lỗi não cũng đc, và chỉ ra lỗi đó(là cha các exception khác.), sử dung cái này an toàn hơn(vì nó cha của bắt lỗi)
            System.out.println("Error: "+e);
            
        }  finally{// ý nghĩa: dù có lỗi hay không có lỗi thì nó vẫn thực hiện: đọc,ghi,xóa file(IO),connect database, thì finally dùng để đóng các connection, đóng các giao tiếp IO, dùng để tiết kiệm bọ nhớ
            System.out.println("Luôn luôn thực hiện");
        }
        System.out.println("After: Continue program  ");// nếu không có try catch thì Continue program k đc thực hiện, đó là ý nghĩa try catch.oke
// mỗi try sẽ có ít nhất 1 catch or 1 finally.
//catch: khi có lỗi thì nó nhảy vào lỗi tương ứng.
// các lỗi này trong quá trình biên dịch thì có không có lỗi, nhưng quá trình chạy thì nó sẽ xin ra ngoại lệ(lỗi)
// Ngoại lệ runtime exception.
// ta đổi các thứ tự các catch các lỗi con thì k bị lỗi, nhưng ta bỏ catch lỗi cha lên đầu:catch(Exception e), thì nó bị lỗi, vì nó là cha các thằng khác, nên khai báo đầu thì các catch lỗi con không nhảy vào nữa(thằng  catch phía trên là con của catch Exception dưới)
    }
}
