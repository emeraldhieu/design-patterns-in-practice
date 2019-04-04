package com.emeraldhieu.decorator;

public class Driver {

    public static void main(String[] args) {
        Node node = new Node("title", "The Alchemist");
        I18nSupport i18nSupport = new I18nSupport("jp");
        node = new I18nNode(node, i18nSupport);
        System.out.println(node.getPropertyValue());
    }
}
