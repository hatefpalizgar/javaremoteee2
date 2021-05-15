package com.sda.dependencyinjectionwithjava;

import com.sda.dependencyinjectionwithjava.consumer.Consumer;
import com.sda.dependencyinjectionwithjava.injector.EmailServiceInjector;
import com.sda.dependencyinjectionwithjava.injector.MessageServiceInjector;
import com.sda.dependencyinjectionwithjava.injector.SMSServiceInjector;

public class App {
    public static void main(String[] args) {
        Consumer app;

        // send email
        MessageServiceInjector injector = new EmailServiceInjector();
        // we no longer are worried about the type of dependencies and their injection
        app = injector.getConsumer();
        app.processMessage("Hi Hatef","hatef@abc.com");

        // send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessage("Let's catchup at the Bar","12345");
    }
}
