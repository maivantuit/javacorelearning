package Cop13_Break;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CỌP
 */
public class _break {
    public static void main(String[] args) {
        int diem=0;
        while(true){
            Scanner sc= new Scanner(System.in);
            System.out.println("Nhập điểm: ");
            diem=sc.nextInt();
            
            if(diem>=0 && diem<=10){
                System.out.println("Điểm đúng: "+diem);//1:
                continue;// nếu k có sẽ in 1: và 2:
            }
            System.out.println("Điểm phải từ 0 đến 10");//2: và cho nhập tiếp lần nữa tiếp tục như vậy
            
            
        }
    }
}
