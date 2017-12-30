/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop30_Inherit_Class_Abstract_Interface;
public class Inherit {
    public static void main(String[] args) {
        ReferentBook n = new ReferentBook();
        n.move();
    }
}
interface Dop extends Document,ReferentDoc{
    
}
interface Document  {
    void show();
}
interface ReferentDoc extends Document{ // 1 interface thừa kế 1 interface = extends
    
}

class ReferentBook extends Book implements Document,ReferentDoc{// = extends, đơn thừa kế
    @Override
    public void show(){
        
    }
}
class Book implements Document{// 1 class thừa kế 1 interface =implements    
    @Override
    public void show(){
        
    }
    void move(){
        
    }
}
class Paper implements Document,ReferentDoc{
      @Override
      public void show(){
        
    }
}
// đa thừa kế: interface
// đơn thừa kế: class
//