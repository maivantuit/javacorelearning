/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop20_Overloading;

/**
 *
 * @author CỌP
 */
public class overload extends tutorial{
    public static void main(String[] args) {
        overload ov = new overload();
        System.out.println(" " + ov.add(4, 3));
        System.out.println(" " + ov.add(8, 9.0,10.0));
        System.out.println(" "+ov.add("Cọp 1"," Cọp 2"));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, double b,double c) {
        return (int) (a + b+c);
    }
}
class tutorial{
    String add(String srt1, String str2){
        return srt1 +str2;
    }
}