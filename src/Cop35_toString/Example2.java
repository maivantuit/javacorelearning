/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop35_toString;

import java.util.Scanner;

/**
 *
 * @author CỌP
 */
public class Example2 {

    private int sodc;
    private String tendc;

    public Example2() {
    }

    public Example2(int sodc, String tendc) {
        this.sodc = sodc;
        this.tendc = tendc;

    }

    public int getSodc() {
        return sodc;
    }

    public String getTendc() {
        return tendc;
    }

    public void setSodc(int sodc) {
        this.sodc = sodc;
    }

    public void setTendc(String tendc) {
        this.tendc = tendc;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số địa chỉ: ");
        setSodc(sc.nextInt());// nếu bỏ ngược trên thì nó k cho nhập. Tên địa chỉ.
        System.out.println("Nhập tên địa chỉ: ");
        setTendc(sc.nextLine());
        setTendc(sc.nextLine()); // vd nhập 2 Nguyễn Văn Hoàng

    }

    public String toString() {
        return sodc + " " + tendc + " ";
    }

    public static void main(String[] args) {
        Example2 ex = new Example2();
        ex.nhap();

        System.out.println(ex);// gọi toString().
//        System.out.println(ex.toString());// hoặc như này
//        Example2 ex2= new Example2(44,"Thanh Long");
//        System.out.println(ex2);
    }
}
