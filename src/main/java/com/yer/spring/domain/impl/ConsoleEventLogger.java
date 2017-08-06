package com.yer.spring.domain.impl;

import com.yer.spring.domain.EventLogger;

public class ConsoleEventLogger implements EventLogger {

    public void logEvent(String msg) {
        System.out.println(msg);
    }
}
