package com.sda.manualinjection;

// MiniOutlook bean (Java class)
public class MiniOutlook {
    // emailService is a dependency to MiniOutlook
    // like Sun light or Water in nature analogy
    EmailService emailService = new EmailService();

    public void processMessages(String msg, String rec) {
        emailService.sendEmail(msg, rec);
    }

}
