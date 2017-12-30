/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop41_Annotation;

/**
  
 * @author CỌP
 */
@interface  ClassTest {
    String value();
    String owner();    
}
@ClassTest(value ="Class scope",owner ="Anna")
public class AnnotationForClass{
    public static void main(String[] args) {
        System.out.println("Test annotatio ! ");
    }
    
}

