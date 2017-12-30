/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop26_ClassNangCao_Constructor_ThamSoBienDoiVARARGS;
public class Varargs {
    int  Tinh(int...x){
      int sum, i;
      sum=0;
      for(i=0; i< x.length; i++) {
         sum += x[i];
      }
      return(sum);
   }
   public static void main(String args[]){
       Varargs vs = new Varargs();
       int sum=0;
       sum=vs.Tinh(new int[]{10,12,33});
       System.out.println("Ket qua: "+sum);
      //int sum=0;
      //sum = Tinh(new int[]{10,12,33});// vì phương thức là stati, nên không cần khởi tạo
      //System.out.println("The sum of the numbers is: " + sum);
   }
}
