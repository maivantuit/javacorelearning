/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop22_ArrayList;

import java.util.ArrayList;

/**
 *
 * @author CỌP
 */
public class arrayl {
    public static void main(String[] args) {
        ArrayList a= new ArrayList();
        a.add("Cường");
        a.add(true);
        a.add(1);
        a.add(2.5);
        String x =(String)a.get(1);        
        int x1 =(int)a.get(2);
        int x2 =(int)a.get(3);
        System.out.println(" "+a.get(2));
        
    }
}
