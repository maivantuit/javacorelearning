/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop42_TongHopArrayArrayListVectorHasMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author CỌP
 */
public class HashMap2 {

    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(1, "A");
        m.put(2, "B");
        m.put(3, "C");
        m.put(null, "D");
//        System.out.println(m.get(2));//B
//        System.out.println(m.get(null));//D
//        System.out.println(m.remove(1));// xóa theo key, như trong list và vetor thì xóa theo index
        System.out.println(m);
//        lấy ra mảng
        Set<Integer> ks = m.keySet();// phải set các key ra trước.        
        for (Integer x : ks) {
            System.out.println(x + " " + m.get(x));
        }
        // Lấy mảng 3
        for (int i = 0; i <= m.size(); i++) {
            System.out.println("mảng: " + m.get(i));// lấy k key đc

        }
//        lấy ra mảng 2
        for (Entry<Integer, String> s : m.entrySet()) {
            s.getKey();
            s.getValue();
            System.out.println(s);
        }
    }
    // 
//        Map<String,Person> mp = new HashMap<String,Person>();
//        mp.put("A", new Person("Mai Văn Tú"));
//        mp.put("B", new Person("Đỗ Minh Chiến"));
//        mp.get("A");
//        mp.get("B");
//        Person p = mp.get("A");
//        System.out.println(p);
//    }
//}
//
//class Person {
//    private String hoTen;
//    public Person(String hoTen) {
//        this.hoTen=hoTen;
//    }
//
//    public String getHoTen() {
//        return hoTen;
//    }
//
//    public void setHoTen(String hoTen) {
//        this.hoTen = hoTen;
//    }
//    

//    
//}
}
