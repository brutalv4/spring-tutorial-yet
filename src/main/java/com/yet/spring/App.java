package com.yet.spring;

import com.yet.spring.domain.Client;
import com.yet.spring.domain.Event;
import com.yet.spring.domain.EventLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private Client client;
    private EventLogger eventLogger;

    public App(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        App app = context.getBean("app", App.class);
//        app.logEvent("Some event for 1");
//        app.logEvent("Some event for 2");
    }

    public void logEvent(Event event) {
//        Event message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(event);
    }

    public App() {
    }
}
