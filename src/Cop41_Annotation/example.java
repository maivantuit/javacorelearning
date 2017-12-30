/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop41_Annotation;

/**
 *
 * @author CỌP
 */
public class example {
    @Deprecated
    public void showSomething(){
        System.out.println("Phương thức đã được bóc tách");
    }
    public static void main(String[] args) {
        example obj = new example();
        obj.showSomething();
        Child c = new Child();
        c.hi();
    }
}
class Child extends example{
    public void hi(){
        System.out.println("Hello !");
    }
}
