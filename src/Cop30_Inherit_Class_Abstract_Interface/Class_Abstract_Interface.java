/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop30_Inherit_Class_Abstract_Interface;
public class Class_Abstract_Interface {
    
}
class Studen{
    private String name;
    public void study(){        
    }
}
abstract class Employee{
    private String name;
    public abstract void move();
    
}
interface Person{
    public static final String CONTTRY_NAME="VIET NAM";
    public void show();// khi thừa kế phải implemment method(); này.
}