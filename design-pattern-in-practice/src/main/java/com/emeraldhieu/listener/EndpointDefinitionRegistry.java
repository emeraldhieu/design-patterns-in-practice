package com.emeraldhieu.listener;

import static com.emeraldhieu.listener.EventType.*;

public class EndpointDefinitionRegistry implements Registry {

    private final EventBus eventBus;

    public EndpointDefinitionRegistry(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void registerEndpoint() {
        eventBus.fireEvent(new EndpointDefinitionRegistryEvent(REGISTERED));
    }

    public void unregisterEndpoint() {
        eventBus.fireEvent(new EndpointDefinitionRegistryEvent(UNREGISTERED));
    }
}
