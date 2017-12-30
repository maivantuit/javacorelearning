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
public class String_Login {

    public static void main(String[] args) {
        String username = null;
        int password[] = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập username: ");
        username = sc.nextLine();
        System.out.println("Nhập password: ");
        
        // NHẬP PASSWORD BỊ LỖI, TÌM HIỂU
        if (username.equalsIgnoreCase("hello")&&password.length>6) {// khi nhập username=hello 
            System.out.println("Bạn đã đăng nhập thành công");

        } else {
            System.out.println("Bạn đã đăng nhập thất bại");
        }
    }

}
