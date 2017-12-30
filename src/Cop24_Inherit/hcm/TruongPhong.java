
package Cop24_Inherit.hcm;
import Cop24_Inherit.polyho.NhanVien;
public class TruongPhong extends NhanVien {    
    public double trachNhiem;    
    public TruongPhong( String hoTen, double luong,double trachNhiem) {
        super(hoTen, luong);
        this.trachNhiem = trachNhiem;
    }
    public void xuat(){  
        this.hoTen=super.hoTen;//inherit        
        this.luong=super.luong;    
        //super.NhanVien(); //not inherit
        //this.thueThuNhap =super.thueThuNhap;// not inherit
        super.xuat2();
        System.out.println(trachNhiem);
    }          
}
