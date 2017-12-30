/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop28_DeQuy;

/**
 *
 * @author CỌP
 */
public class Sort {
    public void sort(int []a, int i){
        if(i>a.length){
            return;
        }
        for(int j=i+1;j<a.length;j++){
            if(a[i]<a[j]){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        sort(a,i+1);
    }
    public static void main(String[] args) {
        Sort s = new Sort();
        
        
        
        
        
    }
}
