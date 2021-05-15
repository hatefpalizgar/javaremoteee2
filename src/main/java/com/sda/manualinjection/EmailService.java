package com.sda.manualinjection;

/*
* Main class responsible for sending emails
* */
public class EmailService {
    public void sendEmail(String message, String receiver) {
        // ... logic of sending email goes here
        System.out.println("Email sent to: " + receiver + " with message: " + message);
    }
}
