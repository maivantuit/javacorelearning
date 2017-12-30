/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop24_Inherit.Overriding;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author CỌP
 */
public class chau extends ParentChau {
    @Override
    public int increate(int a) {// override method of ParentChau
        return a + 7;
    }
    @Override
    public Parent create() throws FileNotFoundException {// overri method of ParentChau, nếu thay child vẫn được becasue cây phả hệ cháu thừa kế từ cha và từ ông nội
        return new Parent();//cháu có thể overrid lại của child(là cha của nó)
    }
}
class ParentChau {
    public int increate(int a) {
        return a + 5;
    }
    public Parent create() throws IOException {
        return new Parent();// gọi lại phương thức của cha
    }
}
