package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext studentContext=new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) studentContext.getBean("student1");
        System.out.println("student object"+student1);
        Student student2 = (Student) studentContext.getBean("student2");
        System.out.println("student object"+student2);
        Student student3 = (Student) studentContext.getBean("student3");
        System.out.println("student object"+student3);
    }
}