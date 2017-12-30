/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop29_Interface_AbstactClass;
abstract class A {
    abstract void callme();
    void callmetoo(){
        System.out.println("A concrete method.");//Một phương thức cụ thể
    }
}
class B extends A{
    @Override
    void callme(){
        System.out.println("B is implementation of callme");// thực hiện: implemetation
    }
}
class TestAbstract{
    public static void main(String[] args) {
        B a = new B();// hoặc: A a1 =new B();(A là abstract),(B là class bt)
        a.callme();
        a.callmetoo();
    }
}