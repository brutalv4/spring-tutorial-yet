package com.yet.spring.domain.impl;

import com.yet.spring.domain.Event;
import com.yet.spring.domain.EventLogger;

public class ConsoleEventLogger implements EventLogger {

    public void logEvent(Event event) {
        System.out.println(event);
    }
}
