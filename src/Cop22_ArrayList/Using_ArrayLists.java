/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop22_ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author CỌP
 */
public class Using_ArrayLists {

    // chú ý static k có là k dc, have errors
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> a = new ArrayList<Integer>();

    public static void main(String[] args) throws Exception  {
        Using_ArrayLists ql = new Using_ArrayLists();
        ql.Menu1();

    }

    public static void Menu1() throws Exception   {
        boolean exit = true;
        do {
            System.out.println("Chương trình quản lý");
            System.out.println("1. Nhập liệu các số.");
            System.out.println("2. Xuất liệu các số.");
            System.out.println("3. Xóa liệu.");
            System.out.println("4. Đếm số phần tử.");
            System.out.println("5. Chèn phần tử.");
            System.out.println("6. Sắp xếp.");
            System.out.println("7. Kết thúc");
            System.out.println("Lựa chọn.");
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            int chon = 0;
            try {
                chon = Integer.parseInt(r.readLine());
                if (chon == 7) {
                    exit = false;
                }
            } catch (Exception e) {
                return;
            }
            switch (chon) {
                case 1:
                    Using_ArrayLists ql = new Using_ArrayLists();
                    ql.Nhap();
                    break;
                case 2:
                    Using_ArrayLists ql2 = new Using_ArrayLists();
                    ql2.PrintArray();
                    break;
                case 3:
                    Using_ArrayLists ql1 = new Using_ArrayLists();
                    ql1.Xoa();
                    break;

                case 4:
                    Using_ArrayLists ql3 = new Using_ArrayLists();
                    ql3.demspt();
                    break;
                case 5:
                    Using_ArrayLists ql4 = new Using_ArrayLists();
                    ql4.chen();
                    break;
                case 6:
                    Using_ArrayLists ql5 = new Using_ArrayLists();
                    ql5.sapxep();
                    ql5.sapxepgiam();

                    break;

                case 7:
                    System.out.println("Cảm ơn.");
                    System.exit(0);

                    break;

            }
        } while (exit);
    }

    public void Nhap() {
        System.out.println("Nhập lần lượt các số: Nhấn 0 thoát.");
        int in = sc.nextInt();
        while (in != 0) {
            a.add(in);
            in = sc.nextInt();
        }

    }

    public void Xoa() {
        //xóa
        System.out.println("Nhập số mà bạn muốn xóa: ");
        int del = sc.nextInt();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == del) {
                a.remove(i);
            }
        }
        PrintArray();

    }

    public void demspt() {
        //các số phần tử
        a.size();
        PrintArray();
        System.out.println("Size: " + a.size());
    }

    public void chen() {
        // chèn thêm phần tử
        System.out.println("Nhập số cần chèn: ");
        int insert = sc.nextByte();
        a.add(insert);
                                            
                    
      
        System.out.println("Mang: "+a.toString());
        
        
    }

    public void sapxep() {
        //sắp xếp tăng dần
        Collections.sort(a);
        System.out.println("Sort: "+a);
    }
    public void sapxepgiam(){
        
        Collections.reverse(a);
        System.out.println("Reverse: "+a);
    }

    public void PrintArray() {
        //in ra mảng
        System.out.println("----------------------");
        for (int x : a) {
            //sout(""+xd)
            System.out.println(x);
        }
        System.out.println("----------------------");

    }
}
