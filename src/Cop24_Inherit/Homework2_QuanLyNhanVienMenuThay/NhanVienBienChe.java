/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop24_Inherit.Homework2_QuanLyNhanVienMenuThay;



public class NhanVienBienChe extends NhanVien {
    public double luong;
    //-------------------------------------------------
    public NhanVienBienChe(){
        
    }

    public NhanVienBienChe(double luong, int maNV, String hoTen, int namSinh, String loaiNV, int mucLuong, double hesoLuong, int luongcaBan) {
        super(maNV, hoTen, namSinh, loaiNV, mucLuong, hesoLuong, luongcaBan);
        this.luong = luong;
    }
    //-----------------------------------------------------

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    //------------------------------------------------------
    @Override
    public void Nhap(){
        super.Nhap();
        this.luong=(long)super.getHesoLuong()*super.getMucLuong();// nếu kq là: 17E.034
        //Ôi, 2 triệu mà *5 thì kiểu long dư sức thể hiện bạn à. Vậy trường hợp của bạn có thể lý giải là bạn đã vô tình sử dụng số thực để tính toán trong biểu thức nào đó với số long kia, khiến hệ thống tự ép kiểu về số thực, nên mới ra kết quả 1.E07 đấy nhé.
    }
    @Override
    public void HienThi(){
        super.HienThi();
        System.out.println("Lương của nhân viên biên chế: "+this.luong);
    }
    
    
    
}
