/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop24_Inherit.Homework2_QuanLyNhanVienMenuThay;



/**
 *
 * @author CỌP
 */

public class NhanVienHopDong extends NhanVien{
    public double luong;
    //--------------------------------------------------------
    public NhanVienHopDong(){
        
    }
    public NhanVienHopDong(double luong, int maNV, String hoTen, int namSinh, String loaiNV, int mucLuong, double hesoLuong, int luongcaBan) {
        super(maNV, hoTen, namSinh, loaiNV, mucLuong, hesoLuong, luongcaBan);
        this.luong = luong;
    }
    public double getLuong() {
        return luong;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }
    //----------------------------------------------------------
    @Override
    public void Nhap(){
        super.Nhap();
        this.luong=(double)super.getHesoLuong()*super.getMucLuong();
    }
    @Override
    public void HienThi(){
        super.HienThi();
        System.out.println("Lương của nhân viên hợp đồng: "+this.luong);
    }

}
