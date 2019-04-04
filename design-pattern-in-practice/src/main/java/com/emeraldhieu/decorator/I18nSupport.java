package com.emeraldhieu.decorator;

public class I18nSupport {
    private String locale;

    public I18nSupport(String locale) {
        this.locale = locale;
    }

    public String translate(String text) {
        return locale + "_" + text;
    }
}
