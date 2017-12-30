/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop42_TongHopArrayArrayListVectorHasMap;

import java.util.Collections;
import java.util.Vector;

/**
 *
 * @author CỌP
 */
public class VetorClass {
    public static void main(String[] args){
        Vector v = new Vector();// tạo 1 vetor 0 phần tử
        v.add(2);
        v.addElement(1);
        v.addElement(new Integer(5));
        Collections.addAll(v, 4);                
        System.out.println(v);// [2, 1, 5, 4]
        System.out.println(v.toString());// [2, 1, 5, 4]
        System.out.println(v.get(0));
//        v.add("Mai Văn Tú");
//        System.out.println(v.toString());      
//        System.out.println(v.capacity());// dung lượng của 1 vetor chỉ định = 10,
        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i)); // nó cũng lấy giá trị như trong array
        }
        for (Object x : v) {// nó là kiểu Object, ? why
            System.out.println(x);
        }
    }
// có 4 constructor
}// nó có các method và thao tác của array
// nó là mảng động như array: nhưng khác biệt 2 điểm: vector được đồng bộ, vector chưa các method legacy mà không là 1 phần của Collection FrameWork 