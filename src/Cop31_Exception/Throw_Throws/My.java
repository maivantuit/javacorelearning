/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop31_Exception.Throw_Throws;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CỌP
 */
public class My extends Exception{//kết thừa 1 con của Exception cũng đc
    private String b;

    public My(String b, String string) {
        super(string);
        this.b = b;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
    

         
}
class Hello{
    public static void main(String[] args) {

        try {
            chia2so(8,0);
        } catch (My e) {
            System.out.println(e.getB());
        }     
    }
    public static void chia2so(int a,int b) throws My{
        try{
            int kq= a/b;
        System.out.println("Ket qua: "+kq);
        }catch(Exception e){
            throw new My("Lỗi chia cho 0","Cọp");// khi khởi tạo đối tượng exception, thì tạo 1 throws My trên.
        }
    }
}