/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop38_Enum;

/**
 *
 * @author CỌP
 */
public class example1 {
    enum COLOR {
        RED, BLUE, YELLOW, GREEN
    }
    public static void main(String[] args) {
        //display
        COLOR cl;
        cl=COLOR.GREEN;
        System.out.println(cl);// GREEN
        // DISPLAY 
        System.out.println(COLOR.RED);//KQ: RED
        //DISPLAY 2
        COLOR c = COLOR.RED;
        System.out.println(c);//kq: RED
        System.out.println(c.YELLOW);//kq: YELLOW
        //if
        if (c == COLOR.RED) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }// kq: true
    }
}
