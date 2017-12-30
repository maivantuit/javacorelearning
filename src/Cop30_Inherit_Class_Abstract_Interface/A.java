/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop30_Inherit_Class_Abstract_Interface;

public class A {    
}
class B{
    private String name;
    public void nhap(){        
    }
}
abstract class C{
    private int diem;
    abstract void nhap();            
}
interface D{
    public static final String TENNUOC="VIET NAM";
    void nhap2();
}
interface H{
    
}
interface L{
    
}
class E extends B{
    
}
class J extends E implements D,H,L{
    @Override
    public void nhap2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
class F extends C{
    @Override
    void nhap() {
        System.out.println("I am method nhap();");
    }    
}
class G implements D{
    @Override
    public void nhap2() {
        System.out.println("I am method nhap2()");
    }    
}