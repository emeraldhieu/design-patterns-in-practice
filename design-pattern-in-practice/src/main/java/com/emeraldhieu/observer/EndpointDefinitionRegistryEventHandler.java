package com.emeraldhieu.observer;

public interface EndpointDefinitionRegistryEventHandler extends EventHandler {

    void onEndpointRegistered();

    void onEndpointUnregistered();

}
