package com.anychart.anychart;

import java.util.Locale;

public enum ScaleCompareWithMode implements JsObject.JsObjectInterface {
    FIRST_VISIBLE("first-visible"),
    SERIES_START("series-start");

    private final String value;

    ScaleCompareWithMode(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}