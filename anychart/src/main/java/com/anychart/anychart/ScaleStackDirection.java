package com.anychart.anychart;

import java.util.Locale;

public enum ScaleStackDirection implements JsObject.JsObjectInterface {
    DIRECT("direct"),
    REVERSE("reverse");

    private final String value;

    ScaleStackDirection(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}