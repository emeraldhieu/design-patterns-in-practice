package com.emeraldhieu.decorator;

public class I18nNode extends Node {

    private Node wrapped;
    private I18nSupport i18nSupport;

    public I18nNode(Node node, I18nSupport i18nSupport) {
        this.wrapped = node;
        this.i18nSupport = i18nSupport;
    }

    @Override
    public String getPropertyValue() {
        return i18nSupport.translate(wrapped.getPropertyValue());
    }
}
