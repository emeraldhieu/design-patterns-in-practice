package com.emeraldhieu.decorator;

public class Node {
    private String propertyKey;
    private String propertyValue;

    protected Node() {
    }

    public Node(String propertyKey, String propertyValue) {
        this.propertyKey = propertyKey;
        this.propertyValue = propertyValue;
    }

    public String getPropertyKey() {
        return propertyKey;
    }

    public String getPropertyValue() {
        return propertyValue;
    }
}
