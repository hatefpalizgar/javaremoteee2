package com.sda.dependencyinjectionwithspring.configuration;

import com.sda.dependencyinjectionwithspring.service.EmailService;
import com.sda.dependencyinjectionwithspring.service.MessageService;
import com.sda.dependencyinjectionwithspring.service.TwitterService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration  // tells spring context to look for any configuration it needs inside this class
@ComponentScan(value = {"com.sda.dependencyinjectionwithspring.consumer"})  // tells spring context where to look for components(beans)
public class AppConfig {

    @Bean // tells spring context that the return result of this method is going to be a bean
    @Primary
    public MessageService getEmailService() {
        return new EmailService();
    }

    @Bean
    public MessageService getTwitterService() {
        return new TwitterService();
    }
}
