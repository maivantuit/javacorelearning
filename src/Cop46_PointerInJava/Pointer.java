
package Cop46_PointerInJava;

import Cop30_Inherit_Class_Abstract_Interface.A;

public class Pointer {
    public static void main(String[] args) {
        MonHoc mh1 ;//khai báo đối tượng,khai báo con trỏ
        mh1= new MonHoc();// khởi tạo đối tượng, khởi tạo con trỏ, để có vùng nhớ để tạo
        System.out.println(mh1);//@15db9742
        mh1.ten="Toan";
        mh1.soTinChi=5;
        MonHoc mh2 = mh1;// obj là con trỏ, vì giá trị bằng nhau nghĩ là 2 con trỏ có giá trị bằng nhau, và luôn trỏ và 1 ô nhớ(thuộc tính or index array), mh1 và mh2 cùng đến 1 ô nhớ.
        // nó khác với a=8; b=a; copy dữ liệu, mh1.soTinChi=5, mh2=mh1 thì 2  con trỏ cùng trỏ đến các ô nhớ        
        System.out.println("mh1.ten: "+mh1.ten);//Toan
        System.out.println("mh1.soTinChi: "+mh1.soTinChi);//5=> cùng trỏ vào 1 ô nhớ
        System.out.println("----------------------------------------------");
        System.out.println("mh1.ten: "+mh2.ten);//Toan
        System.out.println("mh1.soTinChi: "+mh2.soTinChi);//5 => cùng trỏ vào 1 ô nhớ
        System.out.println("----------------------------------------------");
        mh2.soTinChi=4;
        System.out.println("mh1.soTinChi: "+mh1.soTinChi);//4 => thay đổi obj(con trỏ) thì con trỏ cùng chỉ vào ô nhớ đều bị thay đổi
        System.out.println("mh1.soTinChi: "+mh2.soTinChi);//4
        System.out.println("----------------------------------------------");
        System.out.println("Gọi hàm tăng tín chỉ");
        tangTinChi(mh1);
        tangTinChi(mh2);
        System.out.println("mh1.soTinChi: "+mh1.soTinChi);//6
        System.out.println("mh1.soTinChi: "+mh2.soTinChi);//6
        tangTinChi(mh1.soTinChi);
        tangTinChi(mh2.soTinChi);
        System.out.println("mh1.soTinChi: "+mh1.soTinChi);//
        System.out.println("mh1.soTinChi: "+mh2.soTinChi);//
    }    
    public static void tangTinChi(MonHoc mh){//tham chiếu, hàm tác động đến vùng nhớ, ô nhớ, thây đổi giá trị ô nhơs
        mh.soTinChi++;//tăng lên 1
    }
    public static void tangTinChi(int soTinChi){// tham trị, không làm thay đổi giá trị ô nhớ
        soTinChi++;//tăng lên 1
    }
}
class MonHoc{
    public String ten;
    public int soTinChi;        
}