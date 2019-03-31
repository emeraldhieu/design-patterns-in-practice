package com.emeraldhieu.listener;

import static com.emeraldhieu.listener.EventType.*;

public class EndpointDefinitionRegistryEvent implements Event {

    private final EventType type;

    public EndpointDefinitionRegistryEvent(EventType type) {
        this.type = type;
    }

    @Override
    public void dispatch(EventHandler eventHandler) {
        if (type == REGISTERED) {
            eventHandler.handle(type);
        } else if (type == UNREGISTERED) {
            eventHandler.handle(type);
        }
    }
}
