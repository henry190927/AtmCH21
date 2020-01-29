package com.tom.bmi;

import com.tom.bmi.hello.Person;
import com.tom.bmi.hello.Student;

public class Tester {
    public static void main(String[] args) {
        Student student = new Student("001", "Hank", 60, 80);
        Student student2 = new Student("002", "Eric", 56, 42);
        student.Print();
        student2.Print();

        /*student.setId("001");
        student.setName("Hank");
        student.setMath(60);
        student.setEnglish(80);*/

    /*
        //System.out.println("Hello World!!");
        Person person = new Person();
        person.hello();
        person.hello("Tom");
        person.setWeight(66);
        person.setHeight(1.7f);
        System.out.println(person.bmi());
    */
    }
}
