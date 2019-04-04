package com.emeraldhieu.observer;

public class EndpointDefinitionRegistryEvent implements Event<EndpointDefinitionRegistryEventHandler> {

    private final Type type;

    public EndpointDefinitionRegistryEvent(Type type) {
        this.type = type;
    }

    @Override
    public void dispatch(EndpointDefinitionRegistryEventHandler eventHandler) {
        if (type == Type.REGISTERED) {
            eventHandler.onEndpointRegistered();
        } else if (type == Type.UNREGISTERED) {
            eventHandler.onEndpointUnregistered();
        }
    }

    public enum Type {
        REGISTERED,
        UNREGISTERED,
    }
}
