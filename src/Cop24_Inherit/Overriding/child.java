/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop24_Inherit.Overriding;
public class child extends Parent{
    @Override
    void show(){// if methods this  show is show2 or show3 ..ect..cause not override.
        //super.show();//gọi phương thức show(),inherit,trong method().
        System.out.println("Show of child");
    }
    public static void main(String[] args) {  
//        Parent pr = new Parent();
//        pr.show();
        child ch = new child();
        ch.show();// gọi phương thức trong main()                 
        chau c = new chau();
        //c.create();
        c.increate(5);
    }
}
