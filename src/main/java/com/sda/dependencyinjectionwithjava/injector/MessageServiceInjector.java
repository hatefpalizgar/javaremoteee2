package com.sda.dependencyinjectionwithjava.injector;

import com.sda.dependencyinjectionwithjava.consumer.Consumer;

public interface MessageServiceInjector {
    public Consumer getConsumer();
}
