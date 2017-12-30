/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop23_String;

import java.util.Scanner;

/**
 *
 * @author CỌP
 */
public class String_BieuThucChinhQuy {

    Scanner sc = new Scanner(System.in);

    public void NhapSDT() {
        System.out.println("Nhập số mobile: ");
        String moblie = sc.nextLine();
        String chinhqui = "0[0-9]{9,10}";//[0-9]: 1 kí tự; {9-10}:ít nhất 9 or 10, kể cả [0-9]
        if (moblie.matches(chinhqui)) {
            System.out.println("Bạn đã nhập đúng số mobile.");
        } else {
            System.out.println("Bạn đã nhập không đúng số mobile.");

        }
    }

    public void NhapCMND() {
        System.out.println("Nhập số CMND: ");
        String CMND = sc.next();
        String chinhqui = "[0-9]{9}";//[0-9]=\d
        if (CMND.matches(chinhqui)) {
            System.out.println("Bạn nhập đúng số CMND");
        } else {
            System.out.println("Bạn đã nhập không đúng số CMND");
        }
    }

    public void NhapSoXeMay() {
        System.out.println("Nhập số xe máy: ");
        String soXeMay = sc.next();
        String chinhqui = "([0-9][0-9][A-Z][0-9])-[0-9]{4,5}";//[0-9]=\d
        if (soXeMay.matches(chinhqui)) {
            System.out.println("Bạn nhập đúng số xe máy");
        } else {
            System.out.println("Bạn đã nhập không đúng số xe máy");
        }
    }

    public void NhapEmail() {
        System.out.println("Nhập em mail: ");
        String email = sc.nextLine();
        String chinhqui = "\\w+@\\w+\\.\\w";//maivantu@gmail.com
        if (email.matches(chinhqui)) {
            System.out.println("Bạn đã nhập email");
        } else {
            System.out.println("Bạn đã nhập không đúng email");
        }
    }

    public static void main(String[] args) {
        String_BieuThucChinhQuy a = new String_BieuThucChinhQuy();
        a.NhapEmail();
        a.NhapSDT();
        a.NhapCMND();
        a.NhapSoXeMay();
    }
}
