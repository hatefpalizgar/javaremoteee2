package com.sda.dependencyinjectionwithjava.consumer;

// every consumer is a possible candidate to receive injection
public interface Consumer {
    public void processMessage(String msg, String rec);
}

