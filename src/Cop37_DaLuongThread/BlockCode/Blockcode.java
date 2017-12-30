/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop37_DaLuongThread.BlockCode;

/**
 *
 * @author CỌP
 */
public class Blockcode {   
    // super thực hiện đầu tiên
    {
        System.out.println("Block code 1");
    }
    static{
        System.out.println("Static Block code 1");
    }
    public Blockcode() {
        System.out.println("Đây là hàm constructor");
    }
    {
        System.out.println("Block code 2");
    }
    static{
        System.out.println("Static Block code 2");
    }
        public static void main(String[] args) {
        Blockcode b1 = new Blockcode();
    }
}

