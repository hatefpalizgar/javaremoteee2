package com.sda.dependencyinjectionwithjava.service;

// every messageService implementation is a good candidate to be injected
public interface MessageService {
    void sendMessage(String msg, String rec);
}
