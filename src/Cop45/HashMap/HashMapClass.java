/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop45.HashMap;

import static java.lang.reflect.Array.set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author CỌP
 */
public class HashMapClass {

    public static void main(String[] args) {
        HashMap h = new HashMap();
        h.put(1, "4");
        h.put(2, "3");
        h.put(3, "7");
        h.put(4, "9");
        h.put(5, "2");
        h.put(6, "1");
        System.out.println("Mảng gốc: " + h);//Mảng gốc: {1=4, 2=3, 3=7, 4=9, 5=2, 6=1}
//        h.clear();
//        System.out.println("Clear: "+h);//Clear: {}
//        System.out.println("Clone: "+h.clone());//Clone: {1=4, 2=3, 3=7, 4=9, 5=2, 6=1}
//        System.out.println("ContaisKey: "+h.containsKey(4));//ContaisKey: true
//        System.out.println("ContaisKey: "+h.containsKey(11));//ContaisKey: false
//        System.out.println("containsValue: "+h.containsValue(4));//containsValue: false
//        System.out.println("entrySet: "+h.entrySet());//entrySet: [1=4, 2=3, 3=7, 4=9, 5=2, 6=1]
//        System.out.println("get: "+h.get(4));//get: 9
//        System.out.println("isEmpty: "+h.isEmpty());//isEmpty: false
//        Set s1 = h.keySet();
//        System.out.println("keySet: "+s1);//keySet: [1, 2, 3, 4, 5, 6]
//        System.out.println("ketSet: "+h.keySet());//keySet: [1, 2, 3, 4, 5, 6]
//        System.out.println("put: "+h.put(1, 4));//put: 4
//        System.out.println("remove: "+h.remove(4));//remove: 9
//        System.out.println("Mảng vừa xóa: "+h);//Mảng vừa xóa: {1=4, 2=3, 3=7, 5=2, 6=1}
//        System.out.println("size: "+h.size());//size: 5
//        h.values();
//        System.out.println("values: "+h);//values: {1=4, 2=3, 3=7, 4=9, 5=2, 6=1}
//        // duyệt mảng 1
        for(int i=1;i<h.size();i++){
            System.out.println(h.get(i));
        }
        // duyệt mảng 2 đặc trưng của hashmap
        Set s = h.keySet();// phải set các key ra trước.[1, 2, 3, 4, 5, 6]        
        for (Object x : s) {
            System.out.println(x + " " + h.get(x));
        }
        /**
         * 1 4
         * 2 3
         * 3 7
         * 4 9
         * 5 2
         * 6 1
         */
        //duyệt mảng 3 
        //...
        
        
    }
}
