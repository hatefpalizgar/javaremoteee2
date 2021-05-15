package com.sda.demo.beans;

import org.springframework.stereotype.Component;

@Component("firstName")
public class FirstName implements BeanName{
    private String name;

    public FirstName() {
        this.name = "SDA";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
