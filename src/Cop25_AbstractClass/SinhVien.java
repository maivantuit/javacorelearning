/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop25_AbstractClass;

/**
 *
 * @author CỌP
 */
abstract public class SinhVien {// name abstractclass have abstract fisrt
    public String hoTen;
    abstract public double getDiemTB();
    public static void main(String[] args) {
        //SinhVien sv = new SinhVien();, because SinhVien is an abstract,not instantiated: thể hiện,khởi tạo đối tượng
        SinhVienIT svit = new SinhVienIT();
        svit.getDiemTB();
        SinhVienBiz svb = new SinhVienBiz();
        svb.getDiemTB();
    }
}
