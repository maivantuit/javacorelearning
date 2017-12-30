/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop39_Autoboxing;

/**
 *
 * @author CỌP
 */
public class example1 {
    public static void main(String[] args) {
        //tao doi tuong Integer voi gia tri la 100
        Integer iobj = new Integer(100);
        //tao 1 bien int voi gia ti lay ra tu doi tuong Interger tren.
        double i=iobj.intValue();
        System.out.println(i);//kq: 100
        //tu dong chuyen kieu trong phep gan;
        Integer iobj2 =200; 
        double i2 =iobj2;
        System.out.println(i2);// kq: 200
        //tu dong chuyen kieu trong bieu thuc
        iobj2++;
        iobj2+=10;
        System.out.println(iobj2);// kq: 211
    }
}
