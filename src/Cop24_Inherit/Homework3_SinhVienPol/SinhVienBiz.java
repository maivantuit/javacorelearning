/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop24_Inherit.Homework3_SinhVienPol;

/**
 *
 * @author CỌP
 */
public class SinhVienBiz extends SinhVienPoly{
    public double marketting;
    public double sales;

    public SinhVienBiz(double marketting, double sales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.marketting = marketting;
        this.sales = sales;
    }
    @Override
    public double getDiem(){
        return (2*marketting+sales)/3;
    }
}
