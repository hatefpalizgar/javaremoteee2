package com.sda.demo;

import com.sda.demo.beans.MyBean;
import com.sda.demo.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyBean bean = context.getBean(MyBean.class);
        System.out.println(bean.sayHello());
    }
}
