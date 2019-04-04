package com.emeraldhieu.observer;

import java.util.HashMap;
import java.util.Map;

public class SimpleEventBus implements EventBus {

    private Map<Class<? extends Event>, EventHandler> eventHandlers = new HashMap<>();

    @Override
    public void fireEvent(Event event) {
        EventHandler eventHandler = eventHandlers.get(event.getClass());
        event.dispatch(eventHandler);
    }

    @Override
    public void addHandler(Class<? extends Event> eventClass, EventHandler eventHandler) {
        eventHandlers.put(eventClass, eventHandler);
    }
}
