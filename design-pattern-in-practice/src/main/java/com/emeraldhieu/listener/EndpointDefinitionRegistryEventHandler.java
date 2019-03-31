package com.emeraldhieu.listener;

public interface EndpointDefinitionRegistryEventHandler extends EventHandler {

    void onEndpointRegistered();

    void onEndpointUnregistered();

}
