/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop27_InnerClass;



public class IN {
    public static void main(String[] args) {
//        Outer ot= new Outer();
//        ot.show();
        C c = new C();
        c.show();
        
    }
}
class Outer{
    public void show(){
        inner in = new inner();
        in.display();
    }
    class inner{
        public void display(){
            System.out.println("I am an inner class");
        }
    }
}
class C{
     public void show(){
        Outer.inner in = new Outer().new inner();
        in.display();
    }
}