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
public class ThaoTacTapHop_Collection {

    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(3);
        a1.add(4);

        ArrayList a2 = new ArrayList();
        a2.add(4);
        a2.add(5);

        // hợp 2 tập hợp
        a1.addAll(a2);
        System.out.println("AddAll: " + a1.toString());
        // hiệu 2 tập hợp
        a1.removeAll(a2);
        System.out.println("RemoveAll: " + a1.toString());
        // giao 2 tập hợp
        a1.retainAll(a2);
        System.out.println("RetainAll: " + a1);
        //kiểm tra sự tồn tại
        a1.containsAll(a2);
        System.out.println("ContainsAll: " + a1);

    }
}
