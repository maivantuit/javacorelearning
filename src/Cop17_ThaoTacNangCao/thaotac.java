package Cop17_ThaoTacNangCao;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CỌP
 */
public class thaotac {
    public static void main(String[] args) {
        int so[]= {9,3,8,7,3,9,4,2};
        // mảng gốc:
        System.out.println("Mảng gốc: "+Arrays.toString(so));
        //mảng sau khi sắp xếp
        Arrays.sort(so);
        System.out.println("Sau khi sắp xếp: "+Arrays.toString(so));
        //tìm vị trí phần tử trong mảng
        int i = Arrays.binarySearch(so,7);
        System.out.println("Vị trí của 8 là: "+i);
        //fill làm đầy
        Arrays.fill(so,1);
        System.out.println("Sau fill: "+Arrays.toString(so));
        //
        
        
    }
}
