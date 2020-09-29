package com.rvasquez.anotations;

import org.springframework.stereotype.Component;

@Component
public class Aten implements MobileProcessor{

    public void process() {
        System.out.println("Im A10 Processor");
    }
}
