package com.hcl.coll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("list2.xml");
        Student student = (Student) context.getBean("student");
        student.displaySubjects();
    }
}
