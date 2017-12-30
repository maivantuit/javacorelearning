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
public class SinhVienIT extends SinhVien{// nếu không có override method getDiemTB else emplement abstract to SinhVienIT
    public double diemJava;
    public double diemCss;
    @Override
    public double getDiemTB(){
        return (2*diemJava+diemCss)/3;
    }
    
}
