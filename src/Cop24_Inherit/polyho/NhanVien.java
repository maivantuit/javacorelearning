
package Cop24_Inherit.polyho;
public class NhanVien {
    // i was thinking
    public String hoTen;// inherit
    protected double luong;// inherit
    public NhanVien(String hoTen, double luong) {//not inhertir, because subclass not inhetir constructor
        this.hoTen = hoTen;
        this.luong = luong;
    }
    void xuat(){//not inherit    
    }
    public void xuat2(){        
    }
    private double thueThuNhap;//not inherit, because private        
}
