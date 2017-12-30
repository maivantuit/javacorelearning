/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop21_EncapsulationGETTERSETER;

/**
 *
 * @author CỌP
 * Get have return,Set not return but have tham số and void
 * set: create value
 * get: print value
 */
public class Encapsulation {
    public static void main(String[] args) {
        SinhVien ec1 = new SinhVien();        
        ec1.setHoTen("Mai Văn Tú");
        System.out.println(""+ec1.getHoTen());
        ec1.setDiem(9.0);
        System.out.println(" "+ec1.getDiem());        
        
    }
    
}
class SinhVien{
    private String hoTen;
    private double diem;

    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    
}