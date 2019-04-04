package com.emeraldhieu.observer;

public interface Event<H extends EventHandler> {

    void dispatch(H eventHandler);
}
