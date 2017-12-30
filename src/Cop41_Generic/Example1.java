/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop41_Generic;

import java.util.ArrayList;

/**
 *
 * @author CỌP
 */
public class Example1 {
    public static void main(String[] args) {
        // không generic thì phải nhớ các index của nó.
        ArrayList<A> a = new ArrayList<A>();
        a.add(new A());
        a.add(new A());
        for(int i=0;i<a.size();i++){
            a.get(i).show();
            
        }   
        ArrayList<B> a1 = new ArrayList<B>();
        a1.add(new B());
        a1.add(new B());
        for(int i=0;i<a1.size();i++){
            a1.get(i).go();
        }
    }
}
class A{
    public void show(){
        
    }
}
class B{
    public void go(){
        
    }
}
