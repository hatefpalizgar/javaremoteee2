package com.sda.dependencyinjectionwithjava.injector;

import com.sda.dependencyinjectionwithjava.consumer.Consumer;
import com.sda.dependencyinjectionwithjava.consumer.MiniOutlookWithDI;
import com.sda.dependencyinjectionwithjava.service.EmailService;

public class EmailServiceInjector implements MessageServiceInjector{
    // "Don't call us, we will call you" -> Hollywood Principle -> IoC [Inversion of Control]
    // [IoC] You don't explicitly define the exact type of dependency that you need
    // It's on Injector side to decide what dependency is suitable for you
    // IoC in Spring Framework is called Spring Context / Spring Application Context / IoC container
    // Container because it contains all the required information regarding the types of dependencies available and
    // the target services that should get those dependencies.
    @Override
    public Consumer getConsumer() {
        // automatically injects the required dependencies and returns the consumer
        return new MiniOutlookWithDI(new EmailService());
    }
}
