package Cop22_ArrayList;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Scanner;

public class SinhVien {

    private String maHV;
    private String hoTen;
    private int namSinh;
    private double diemkt1;
    private double diemkt2;
    private double diemcuoiKhoa;
    private double dtb;

    //-------------------------------------------------------------------------
    public SinhVien() {

    }

    public SinhVien(double dtb, String maHV, String hoTen, int namSinh, double diemkt1, double diemkt2, double diemcuoiKhoa) {
        this.maHV = maHV;
        this.dtb = dtb;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemkt1 = diemkt1;
        this.diemkt2 = diemkt2;
        this.diemcuoiKhoa = diemcuoiKhoa;
    }

    public double getdtb() {
        return dtb;
    }

    public void setdtb() {
        this.dtb = dtb;
    }

    public String getMaHV() {
        return maHV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public double getDiemkt1() {
        return diemkt1;
    }

    public double getDiemkt2() {
        return diemkt2;
    }

    public double getDiemcuoiKhoa() {
        return diemcuoiKhoa;
    }

    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setDiemkt1(double diemkt1) {
        this.diemkt1 = diemkt1;
    }

    public void setDiemkt2(double diemkt2) {
        this.diemkt2 = diemkt2;
    }

    public void setDiemcuoiKhoa(double diemcuoiKhoa) {
        this.diemcuoiKhoa = diemcuoiKhoa;
    }

    ///-------------------------------------------------------------------
    public void XepLoai() {
        if (dtb > 8 && dtb < 10) {
            System.out.println("Giỏi");
        }
        if (dtb > 7 && dtb < 8) {
            System.out.println("Khá");
        }
        if (dtb > 5 && dtb < 7) {
            System.out.println("TrungBinh");
        }
        if (dtb < 5) {
            System.out.println("Không Đạt");
        }
    }

    //-------------------------------------------------------------------
    public void NhapThongTinThiSinh() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập mã học viên:");
        this.maHV = input.nextLine();
        System.out.println("Nhập  họ tên:");
        this.hoTen = input.nextLine();
        System.out.println("Nhập  năm sinh:");
        this.namSinh = input.nextInt();

        System.out.println("Nhập  điểm kiểm tra 1:");
        this.diemkt1 = input.nextDouble();
        System.out.println("Nhập  điểm kiểm tra 2:");
        this.diemkt2 = input.nextDouble();
        System.out.println("Nhập  điểm cuối khóa: :");
        this.diemcuoiKhoa = input.nextDouble();
    }

    public double TinhDiemTB() {
        return this.dtb = (((this.diemkt1 + this.diemkt2) / 2) + (this.diemcuoiKhoa * 2)) / 3;
    }

    public void HienThi() {

        System.out.println("Mã học viên:" + this.maHV);
        System.out.println("Họ tên học viên:" + this.hoTen);
        System.out.println("Năm sinh:" + this.namSinh);
        System.out.println("Điểm Trung Bình là:" + getdtb());
        XepLoai();

    }

}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC
 */
 class QuanLyHocVien {

    private static ArrayList<SinhVien> list = new ArrayList<SinhVien>();

    public static void main(String[] args) throws Exception {
        QuanLyHocVien ql = new QuanLyHocVien();
        ql.Menu1();
        for (SinhVien ts : list) {
            ts.HienThi();
        }

    }

    public void Menu1() throws Exception {
        boolean exit = true;
        do {
            System.out.println("Chương trình quản lý Thí Sinh");
            System.out.println("1. Nhập liệu học viên.");
            System.out.println("2. Kết thúc");
            System.out.println("Lựa chọn.");
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            int chon = 0;
            try {
                chon = Integer.parseInt(r.readLine());
                if (chon == 2) {
                    exit = false;
                }
            } catch (Exception e) {
                return;
            }
            switch (chon) {
                case 1:
                    SinhVien hv = new SinhVien();
                    
                        hv.NhapThongTinThiSinh();
                    
                    hv.TinhDiemTB();
                    hv.HienThi();
                    list.add(hv);
                    break;

                case 2:
                    System.out.println("Cảm ơn.");
                    System.exit(0);

                    break;

            }
        } while (exit);
    }

}
