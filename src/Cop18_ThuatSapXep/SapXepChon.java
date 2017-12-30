/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop18_ThuatSapXep;

import java.util.Arrays;

/**
 *
 * @author CỌP
 */
public class SapXepChon {

    public static void main(String[] args) {
        int a[] = {3, 1, 10, 4, 7, 5, 31};
        int t;
        int min;
        int i;
        int j = 0;
        for (i = 0; j < a.length - 1; i++) {
            min = i;
            for (j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (min != i) {
                t = a[min];
                a[min] = a[i];
                a[i] = t;
                

            }
//            Arrays.sort(a);
//            System.out.println(" " + Arrays.toString(a));
            
        }
        
    }
}
