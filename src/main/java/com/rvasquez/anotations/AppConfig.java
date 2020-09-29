package com.rvasquez.anotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.rvasquez.anotations")
public class AppConfig {



/**  Anotation Based Bean Configuration

    @Bean
    public Samsung getPhone(){
        return new Samsung();
    }

    @Bean
    public MobileProcessor getProcessor(){
        return new SnapDragon();
    }

 **/
}
