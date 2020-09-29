package com.rvasquez.springExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  Very basic example with component injection, beans and xml configuration based
 *  for spring framework
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // With Annotation configuration (see: Car.java)
        Vehicle obj2 = (Vehicle) context.getBean("car");
        obj2.drive();

        // With Bean configuration
        Vehicle obj = (Vehicle) context.getBean("Bike");
        obj.drive();

        Tyre t = (Tyre) context.getBean("tyre");
        System.out.println(t);
    }
}
