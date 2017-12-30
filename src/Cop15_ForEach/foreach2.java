package Cop15_ForEach;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CỌP
 */
public class foreach2 {
    public static void main(String[] args) {
        int so[]={7,8,9,6,31,2,10};
        int tong = 0;
        for(int x: so){
            if(x%2==0){
                System.out.println(" "+x);
                tong=tong+x;                
            }
        }
        System.out.println("Tổng các số chẳn là: "+tong);
    }
}
