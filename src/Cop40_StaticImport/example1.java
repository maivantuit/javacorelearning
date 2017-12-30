/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop40_StaticImport;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.System.out;
public class example1 {
    public static void main(String[] args) {
        double x = sqrt(1000);
        System.out.println(x);
        double y = pow(10,2);
        System.out.println(y);
        out.println("Hello there!!");
    }
}
