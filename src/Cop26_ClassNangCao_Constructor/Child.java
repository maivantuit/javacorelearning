/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop26_ClassNangCao_Constructor;

/**
 *
 * @author CỌP
 */
public class Child extends Parent {
    int lop;
    public Child() {

    }
    public Child(int lop) {
        this.lop = lop;
    }
    public Child(int lop, String hoTen) {//2,5
        super(hoTen);
        this.lop = lop;
    }
    public static void main(String[] args) {
        Child ch1 = new Child();
        Child ch2 = new Child(3);
        Child ch3 = new Child(3, "Mai Van Tu");
        Parent pr = new Parent();
        Parent pr2 = new Parent("Mai Van Phuc");
    }
}
