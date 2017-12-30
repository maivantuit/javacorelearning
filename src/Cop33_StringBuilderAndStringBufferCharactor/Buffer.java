/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop33_StringBuilderAndStringBufferCharactor;

/**
 *
 * @author CỌP
 */
public class Buffer {

    public static void main(String[] args) {
//        đây là trong String
        String teststring = "MaiVanTu";

        System.out.println(teststring.charAt(2));// kq: i
        //đây là StringBuffer
        StringBuffer bf = new StringBuffer("MaiVanTu");
        System.out.println(bf);
//        những method mà String không hổ trợ
//        append(kieu du lieu nao cung duoc
//        ) : cộng vào sau cùng chuổi
//        ,có thể là String,int,double,char
        System.out.println(bf.append("Cọp"));// MaiVanTuCop
        //insert(vi tri chen, kieu du lieu nao cung duoc)
        System.out.println(bf.insert(2, "Teo"));//MaTeoiVanTu
//delete(tuindex,denindex) : xoa giua vung do.
        System.out.println(bf.delete(1, 3));//kq: MVanTu.
//delete(indexxoa)
        System.out.println(bf.deleteCharAt(2));// MaVanTu
//reverse: dao nguoc
        System.out.println(bf.reverse());//kq: uTnaViaM
//capacity:dem bo dem
        System.out.println(bf.capacity());//kq: 24(gom 16 bo dem, 8 cua chuoi)
////ensureCapacity:nó tăng capacity theo công thức (oldcapacity*2)+2.
        bf.ensureCapacity(23);// laf 1 void.

    }
}
