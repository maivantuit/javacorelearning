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
public class LaoCong extends NhanVien{
    public double soGioLamVien;
    @Override
    public double getThuNhap(){
        return this.soGioLamVien =soGioLamVien=2000000;        
    }
}
