package com.springcore;

import com.springcore.autowire.Emp;
import com.springcore.autowireannotation.EmployeeAuto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireMain {
    public static void main(String[] args){
 ApplicationContext context = new ClassPathXmlApplicationContext("autowireannotationconfig.xml");
 EmployeeAuto employee = context.getBean("emp", EmployeeAuto.class);
 System.out.println("autowire byType"+employee);
    }
}
