/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop35_toString;

/**
 *
 * @author CỌP
 */
public class Example1 {
    public static void main(String[] args) {
        Example1 e =new  Example1();
        System.out.println(e);// kq: Cop35_toString.Example1@15db9742
        System.out.println(e.toString());//kq: Cop35_toString.Example1@15db9742 // kq tương đồng với e.
        
    }
    @Override
    public String toString(){
        return "This is an Example object"; // kq: This is an Example object

    }
}
// toString thừa kế mặc đinh.
// sử dụng khi các Exception đẩy ra các giá trị ngoại lệ, và rất nhiều các nữa
// nó rất sử dụng nhiều, và hữu dụng: hiểu cách của nó: 
