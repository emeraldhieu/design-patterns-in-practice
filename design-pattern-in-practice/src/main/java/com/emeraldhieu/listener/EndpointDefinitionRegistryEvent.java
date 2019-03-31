package com.emeraldhieu.listener;

import static com.emeraldhieu.listener.EndpointDefinitionRegistryEvent.Type.*;

public class EndpointDefinitionRegistryEvent implements Event<EndpointDefinitionRegistryEventHandler> {

    private final Type type;

    public EndpointDefinitionRegistryEvent(Type type) {
        this.type = type;
    }

    @Override
    public void dispatch(EndpointDefinitionRegistryEventHandler eventHandler) {
        if (type == REGISTERED) {
            eventHandler.onEndpointRegistered();
        } else if (type == UNREGISTERED) {
            eventHandler.onEndpointUnregistered();
        }
    }

    public enum Type {
        REGISTERED,
        UNREGISTERED,
    }
}
