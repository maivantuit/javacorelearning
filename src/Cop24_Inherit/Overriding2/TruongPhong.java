/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop24_Inherit.Overriding2;

/**
 *
 * @author CỌP
 */
public class TruongPhong extends NhanVien{
    public double trachNhiem;
    @Override
    public double getThuNhap(){
        return this.trachNhiem =trachNhiem=9000000;
                
    }
    
}
