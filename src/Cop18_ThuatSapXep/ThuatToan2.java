/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop18_ThuatSapXep;

/**
 *
 * @author CỌP
 */
public class ThuatToan2 {

    public static void main(String[] args) {
        int a[]={8,2,6,2,9,1,5};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){//thay đổi < trên thành sắp xếp giảm dần
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;                 
                }
            }
            System.out.println(" "+a[i]);
        }
    }
}
