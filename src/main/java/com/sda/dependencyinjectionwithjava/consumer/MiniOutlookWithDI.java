package com.sda.dependencyinjectionwithjava.consumer;

import com.sda.dependencyinjectionwithjava.service.MessageService;

public class MiniOutlookWithDI implements Consumer{
    MessageService service;

    public MiniOutlookWithDI(MessageService service) {
        this.service = service;
    }

    public void processMessage(String msg, String rec) {
        service.sendMessage(msg, rec);
    }
}
