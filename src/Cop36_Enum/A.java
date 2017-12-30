/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop36_Enum;

/**
 *
 * @author CỌP
 */
// có thể bỏ enum ngoài class
public class A {
    enum color{RED, BLUE,YELLOW,GREEN}
    public static void main(String[] args) {
        System.out.println(color.RED);
        color c = color.RED;
        System.out.println(c);
        System.out.println(c.YELLOW);
        if(c==color.GREEN){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        switch(c){
            case RED:System.out.println("Red");break;//<giatri> là 1 phần tử của enum, không . lấy giá trị
            case BLUE:System.out.println("Blue");break;
            case YELLOW:System.out.println("Yellow");break;
            case GREEN:System.out.println("Green");break;            
        }
    }
    
}

