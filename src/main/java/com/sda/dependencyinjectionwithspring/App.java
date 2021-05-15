package com.sda.dependencyinjectionwithspring;

import com.sda.dependencyinjectionwithspring.configuration.AppConfig;
import com.sda.dependencyinjectionwithspring.consumer.MiniOutlookWithSpring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // we have to setup the Spring context (IoC container)
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MiniOutlookWithSpring app = context.getBean(MiniOutlookWithSpring.class);
        app.processMessage("Hi Hatef", "hatef@abc.com");

        // close context
        context.close();
    }
}
