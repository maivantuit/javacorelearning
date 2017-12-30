/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop44_Vector;

import java.util.Collections;
import java.util.Vector;

/**
 *
 * @author CỌP
 */
public class VectorClass {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(3);
        v.add(2);
        v.add(2);
        v.add(4);
        v.add(8);
        v.add(5);
        System.out.println(v);//[3, 2, 2, 4, 8, 5]
//        System.out.println(v.toString());//[3, 2, 2, 4, 8, 5]
//        v.add(1, 10);
//        System.out.println("add: "+v);//add: [3, 10, 2, 2, 4, 8, 5]
//        System.out.println("addAll: "+v.addAll(v));//true
//        System.out.println(v);
//        v.addElement(11);
//        System.out.println("addElement: "+v);//addElement: [3, 2, 2, 4, 8, 5, 11]
////        System.out.println("capacity: "+v.capacity());//capacity: 10, mặc định là 10
//        v.clear();
//        System.out.println(v);//[]
//        System.out.println("clone: "+v.clone());//clone: [3, 2, 2, 4, 8, 5]
//        System.out.println("contains: "+v.contains(2));//true
//        System.out.println("max: "+Collections.max(v));//8
//        System.out.println(v.get(3));//4
//        v.insertElementAt(11, 3);
//        System.out.println(v);
//        System.out.println(v.isEmpty());//false
//        System.out.println(v.lastElement());
//        System.out.println(v.lastIndexOf(5));
//v.setSize(15);
//        System.out.println(v);//[3, 2, 2, 4, 8, 5, null, null, null, null, null, null, null, null, null]
//        so
//v.trimToSize();
//        System.out.println(v);
//        System.out.println(v.hashCode());//Hashcode: 975301855
        Collections.reverseOrder();
        
    }
}
