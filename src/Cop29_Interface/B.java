
package Cop29_Interface;
interface  myinterface {
    void mymethod1();
    void mymethod2();
}

class myclass implements myinterface {

    @Override
    public void mymethod1() { // phải là public 
        System.out.println("Override my method 1");
    }

    @Override
    public void mymethod2() {
        System.out.println("Override my method 2");
    }
    void mymethod3(){ // method of class
        System.out.println("my method 3");
    }
    
}
public class B{
    public static void main(String[] args) {
//        myclass ms =new myclass();
//        ms.mymethod1();
//        ms.mymethod2();
//        ms.mymethod3();
        
        myinterface it = new myclass();
        it.mymethod1();
        it.mymethod2();
        //it.mymethod3();//error;
        
        
    }
}
interface C extends myinterface{
    void mymethod4();
}
class myclass2 implements C{

    @Override
    public void mymethod4() {
        System.out.println("Implements method 1");
    }

    @Override
    public void mymethod1() {
        System.out.println("Implements method 2");
    }
    @Override
    public void mymethod2() {
        System.out.println("Implements method 3");
    }
    
}
// kế thừa trong 3 cái bài tiếp theo