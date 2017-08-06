package com.yet.spring.domain.impl;

import com.yet.spring.domain.EventLogger;

public class ConsoleEventLogger implements EventLogger {

    public void logEvent(String msg) {
        System.out.println(msg);
    }
}
