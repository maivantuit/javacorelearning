/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop41_Annotation;

/**
 *
 * @author CỌP
 */
 @interface Hibernate_Table {
    String value();
}
 @interface Hibernate_Filed {
    String value();
}
public class AnnotationClassField{
    @Hibernate_Table("SinhVien")
    public class Student{
        @Hibernate_Filed("Masinhvien")
        private int id;
        @Hibernate_Filed("Heten")
        private String name;
        @Hibernate_Filed("Diem")
        private String score;
    }  
}



