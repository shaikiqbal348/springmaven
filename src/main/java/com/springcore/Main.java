package com.springcore;

import com.springcore.collections.Employee;
import com.springcore.reference.Hundai;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Setter Injection example
        System.out.println("Hello world!");
        ApplicationContext studentContext=new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) studentContext.getBean("student1");
        System.out.println("student object"+student1);
        Student student2 = (Student) studentContext.getBean("student2");
        System.out.println("student object"+student2);
        Student student3 = (Student) studentContext.getBean("student3");
        System.out.println("student object"+student3);
        ApplicationContext emp=new ClassPathXmlApplicationContext("collectionconfig.xml");
        Employee emps=(Employee) emp.getBean("emp");
        System.out.println("Set of values"+emps.getAddresses());
        System.out.println("List of values"+emps.getPhones());
        System.out.println("Map of values"+emps.getCourses().entrySet());
        System.out.println("prop of values"+emps.getProps().entrySet());

        //Reference injection
        ApplicationContext vechile=new ClassPathXmlApplicationContext("refconfig.xml");
        Hundai hu =(Hundai) vechile.getBean("Hundai");
        System.out.println("Car details"+hu.getName());
    }
}