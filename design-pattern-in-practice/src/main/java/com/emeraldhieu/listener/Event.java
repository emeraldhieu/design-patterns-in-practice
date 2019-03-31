package com.emeraldhieu.listener;

public interface Event<H extends EventHandler> {

    void dispatch(H eventHandler);
}
