package com.springcore;

import com.springcore.collections.Employee;
import com.springcore.constructor.Person;
import com.springcore.lifecycle.Animal;
import com.springcore.lifecycle.LifeCycleInterface;
import com.springcore.reference.Hundai;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Setter Injection example
        System.out.println("Hello world!");
        ApplicationContext studentContext = new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) studentContext.getBean("student1");
        System.out.println("student object" + student1);
        Student student2 = (Student) studentContext.getBean("student2");
        System.out.println("student object" + student2);
        Student student3 = (Student) studentContext.getBean("student3");
        System.out.println("student object" + student3);
        ApplicationContext emp = new ClassPathXmlApplicationContext("collectionconfig.xml");
        Employee emps = (Employee) emp.getBean("emp");
        System.out.println("Set of values" + emps.getAddresses());
        System.out.println("List of values" + emps.getPhones());
        System.out.println("Map of values" + emps.getCourses().entrySet());
        System.out.println("prop of values" + emps.getProps().entrySet());

        //Reference injection
        ApplicationContext vechile = new ClassPathXmlApplicationContext("refconfig.xml");
        Hundai hu = (Hundai) vechile.getBean("hundai");
        System.out.println("Car details" + hu.getName());

        //Constructor injection
        ApplicationContext construct = new ClassPathXmlApplicationContext("constructorconfig.xml");
        Person perdon = (Person) construct.getBean("person");
        System.out.println("constructor values" + perdon);
        System.out.println("constructor values list" + perdon);

        // Life cycle xml methods
        AbstractApplicationContext life = new ClassPathXmlApplicationContext("lifecycleconfig.xml");
        Animal ani = (Animal) life.getBean("life");
        System.out.println("life cycle" + ani);
        life.registerShutdownHook();

        //Life cycle Interface using
        AbstractApplicationContext lifeInt = new ClassPathXmlApplicationContext("lifecycleconfig.xml");
        LifeCycleInterface lifInt = (LifeCycleInterface) life.getBean("lifeInt");
        System.out.println("life cycle" + lifInt);

    }


}