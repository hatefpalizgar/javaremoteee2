package com.sda.dependencyinjectionwithspring.consumer;

import com.sda.dependencyinjectionwithspring.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // tells Spring context that I am eligible for receiving any dependency
public class MiniOutlookWithSpring {
    private MessageService service;

    @Autowired  // tells spring context that hey! I am a dependency that should be injected, Automatically Wiring dependency
    public MiniOutlookWithSpring(MessageService service) {
        this.service = service;
    }

    public boolean processMessage(String msg, String rec) {
        return service.sendMessage(msg, rec);
    }

}

/*
 * Dependency injection can be done in 3 ways:
 * 1. Field Injection (should avoid this)
 * 2. Constructor Injection (putting @Autowired is optional)
 * 3. Setter Injection
 * */
