package com.rvasquez.anotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Creating a Spring app with annotation bean configuration
 * No XML file
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }
}
