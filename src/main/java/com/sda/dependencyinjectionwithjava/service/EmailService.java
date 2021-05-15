package com.sda.dependencyinjectionwithjava.service;

public class EmailService implements MessageService {

    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("Email sent to: " + rec + " with message: " + msg);
    }
}
