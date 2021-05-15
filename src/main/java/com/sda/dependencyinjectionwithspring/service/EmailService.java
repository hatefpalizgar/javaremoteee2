package com.sda.dependencyinjectionwithspring.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class EmailService implements MessageService {
    @Override
    public boolean sendMessage(String msg, String rec) {
        System.out.println("Email sent to: " + rec + " with message: " + msg);
        return true;
    }
}
