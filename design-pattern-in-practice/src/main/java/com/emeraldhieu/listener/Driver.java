package com.emeraldhieu.listener;

public class Driver {


    public static void main(String[] args) {
        /**
         * In reality, this event bus will be injected using IoC.
         */
        EventBus eventBus = new SimpleEventBus();

        /**
         * RestDispatcherServlet will create or remove the rest endpoint upon any update of endpoint registry.
         */
        RestDispatcherServlet restDispatcherServlet = new RestDispatcherServlet(eventBus);

        /**
         * If user registers an endpoint definition somewhere (YAML, JCR), RestDispatcherServlet will be notified.
         */
        EndpointDefinitionRegistry endpointDefinitionRegistry = new EndpointDefinitionRegistry(eventBus);
        endpointDefinitionRegistry.registerEndpoint();
        endpointDefinitionRegistry.unregisterEndpoint();
    }
}
