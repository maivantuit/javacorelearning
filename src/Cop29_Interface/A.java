/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop29_Interface;

/**
 *
 * @author CỌP
 */
public class A {
    public static void main(String[] args) {
        Manager mn = new Manager();
        mn.show();
    }
}
interface Human{
    public static final int AVG_AGE=100;// khi khai báo 1 biến: thì phải có : public static final(hằng tĩnh công khai), nếu k có thì nó mặc định biết.
    int AVG_WEIGHT =65;
    public abstract void show();// khi khai báo 1 method: thf phải có public abstract,kết thúc method ";"
    void study();            
}
class Manager implements Human{ // thừa kê 1 interface.
    @Override
    public void show() {
        System.out.println("AVG_AGE: "+AVG_AGE);
    }
    @Override
    public void study() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
interface Wonman extends Human{//1 interface thừa kế 1 interface là: extends
}
class Manager2 implements Human,Wonman{

    @Override
    public void show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void study() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    


