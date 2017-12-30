/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop21_Constructor;

/**
 *
 * @author CỌP
 */
public class constractor {

    double dai, rong;

    public constractor() {
    }
    
    public constractor(double canh) {
        this.dai = canh;
        this.rong = canh;
    }

    public constractor(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public static void main(String[] args) {
        constractor cs1 = new constractor(20);
        constractor cs2 = new constractor(20, 20);
        System.out.println(" "+cs1.dai);
        System.out.println(" "+cs1.rong);
        System.out.println(" "+cs2.dai+cs2.rong);

    }
}
