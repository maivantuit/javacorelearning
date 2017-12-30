/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop25_AbstractClass.PolymorphismUseOverriding;
abstract public class DongVat {
    abstract public void speak();
    public static void main(String[] args) {
        //DongVat dv = new DongVat(); abstract not instranteated: khởi tạo Object
        DongVat dog = new Dog();
        dog.speak();
        DongVat cat = new Cat();
        cat.speak();
        DongVat duck = new Duck();
        duck.speak();
    }
}
// speak() is 1 hành vi, "Quack","Woof","Meo" is hình thái