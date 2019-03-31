package com.emeraldhieu.listener;

public interface EventBus {

    void fireEvent(Event event);

    void addHandler(Class<? extends Event> eventClass, EventHandler eventHandler);

}
