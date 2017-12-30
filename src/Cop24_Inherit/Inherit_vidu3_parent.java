/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop24_Inherit;

/**
 *
 * @author CỌP
 */
public class Inherit_vidu3_parent {
    public String name;
    public void method() {

    }
}

class child extends Inherit_vidu3_parent {
    public void method2() {
        this.name = super.name;
        super.method();
    }
}
