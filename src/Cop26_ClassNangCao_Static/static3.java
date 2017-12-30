/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop26_ClassNangCao_Static;

/**
 *
 * @author CỌP
 */
public class static3 {   
    public static void main(String[] args) {
        Room r1 = new Room();
        r1.number=10;
        System.out.println("R1: "+r1.number);
        System.out.println("R1 erea before: "+r1.area);
        r1.area=300;        
        System.out.println("R1 erea after: "+r1.area);
        
        Room r2 = new Room();        
        r2.number=20;
        System.out.println("R1: "+r2.number);
        System.out.println("R1 erea: "+r2.area);
        
        Room r3 = new Room();
        r3.number=30;
        System.out.println("R1: "+r3.number);
        System.out.println("R1 erea: "+r3.area);
        Room.area=400; 
    }
}
class Room{
    static int area=200;
    int number;
}
