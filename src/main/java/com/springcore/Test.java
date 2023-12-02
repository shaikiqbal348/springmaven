package com.springcore;

import com.springcore.autowire.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
 ApplicationContext context = new ClassPathXmlApplicationContext("autowireconfig.xml");
 Emp employee = context.getBean("emp", Emp.class);
 System.out.println("autowire byName"+employee);
    }
}
