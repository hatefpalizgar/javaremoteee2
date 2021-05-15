package com.sda.dependencyinjectionwithjava.injector;

import com.sda.dependencyinjectionwithjava.consumer.Consumer;
import com.sda.dependencyinjectionwithjava.consumer.MiniOutlookWithDI;
import com.sda.dependencyinjectionwithjava.service.SMSService;

public class SMSServiceInjector implements MessageServiceInjector{
    @Override
    public Consumer getConsumer() {
        // automatically injects the required dependencies and returns the consumer
        return new MiniOutlookWithDI(new SMSService());
    }
}
