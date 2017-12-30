/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop36_Enum;

/**
 *
 * @author CỌP
 */
public class Excample2 {
    enum color {
        RED(5), BLUE(6), YELLOW(7), GREEN(8); // chỉ khác class cái này
        private final int value;
        color(int value) {// hàm khởi tạo của nos
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }
    public static void main(String[] args) {
        color c = color.BLUE;
        System.out.println(c + ":  "+c.getValue()); // BLUE: 6   
        
    }
}
// enum là 1 class nó có filed và method, giống ở hàm, nhưng nó khác ở khai báo filed: RED(5),BLUE(6),YELLOW(7),GREEN(8);
