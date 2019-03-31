package com.emeraldhieu.listener;

import java.util.Optional;

public class EndpointDefinitionRegistryEventHandler implements EventHandler {

    private OnRegisterHandler onRegisterHandler;
    private OnUnregisterHandler onUnregisterHandler;

    @Override
    public void handle(EventType type) {
        if (type == EventType.REGISTERED) {
            Optional.ofNullable(onRegisterHandler).ifPresent(OnRegisterHandler::onRegistered);
        } else {
            Optional.ofNullable(onUnregisterHandler).ifPresent(OnUnregisterHandler::onUnregistered);
        }
    }

    public void setOnRegisterHandler(OnRegisterHandler onRegisterHandler) {
        this.onRegisterHandler = onRegisterHandler;
    }

    public void setOnUnregisterHandler(OnUnregisterHandler onUnregisterHandler) {
        this.onUnregisterHandler = onUnregisterHandler;
    }

    public interface OnRegisterHandler {
        void onRegistered();
    }

    public interface OnUnregisterHandler {
        void onUnregistered();
    }
}
