package com.emeraldhieu.listener;

import static com.emeraldhieu.listener.EndpointDefinitionRegistryEventHandler.*;

public class RestDispatcherServlet implements OnRegisterHandler, OnUnregisterHandler {

    private final EventBus eventBus;
    private final EndpointDefinitionRegistryEventHandler endpointDefinitionRegistryEventHandler;

    public RestDispatcherServlet(EventBus eventBus) {
        this.eventBus = eventBus;
        this.endpointDefinitionRegistryEventHandler = new EndpointDefinitionRegistryEventHandler();
        this.endpointDefinitionRegistryEventHandler.setOnRegisterHandler(this);
        this.endpointDefinitionRegistryEventHandler.setOnUnregisterHandler(this);
        this.eventBus.addHandler(EndpointDefinitionRegistryEvent.class, endpointDefinitionRegistryEventHandler);
    }

    @Override
    public void onRegistered() {
        System.out.println("Creating an endpoint...");
    }

    @Override
    public void onUnregistered() {
        System.out.println("Removing an endpoint...");
    }
}
