package com.emeraldhieu.listener;

public class RestDispatcherServlet implements EndpointDefinitionRegistryEventHandler {

    private final EventBus eventBus;

    public RestDispatcherServlet(EventBus eventBus) {
        this.eventBus = eventBus;
        this.eventBus.addHandler(EndpointDefinitionRegistryEvent.class, this);
    }

    @Override
    public void onEndpointRegistered() {
        System.out.println("Creating an endpoint...");
    }

    @Override
    public void onEndpointUnregistered() {
        System.out.println("Removing an endpoint...");
    }
}
