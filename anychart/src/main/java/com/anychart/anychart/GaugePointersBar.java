package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class GaugePointersBar extends GaugePointersBase {

    public GaugePointersBar() {

    }

    protected GaugePointersBar(String jsBase) {
        this.jsBase = jsBase;
    }

    protected GaugePointersBar(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private GaugeSidePosition position;
    private String position1;

    public GaugePointersBar setPosition(GaugeSidePosition position) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position = position;
        } else {
            this.position = position;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".position(%s)", (position != null) ? position.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".position(%s)", (position != null) ? position.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public GaugePointersBar setPosition(String position1) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position1 = position1;
        } else {
            this.position1 = position1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".position(%s)", position1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".position(%s)", position1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double radius;
    private String radius1;

    public GaugePointersBar setRadius(Double radius) {
        if (jsBase == null) {
            this.radius = null;
            this.radius1 = null;
            
            this.radius = radius;
        } else {
            this.radius = radius;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".radius(%f)", radius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".radius(%f)", radius));
                js.setLength(0);
            }
        }
        return this;
    }


    public GaugePointersBar setRadius(String radius1) {
        if (jsBase == null) {
            this.radius = null;
            this.radius1 = null;
            
            this.radius1 = radius1;
        } else {
            this.radius1 = radius1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".radius(%s)", radius1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".radius(%s)", radius1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double width;
    private String width1;

    public GaugePointersBar setWidth(Double width) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width = width;
        } else {
            this.width = width;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".width(%f)", width));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".width(%f)", width));
                js.setLength(0);
            }
        }
        return this;
    }


    public GaugePointersBar setWidth(String width1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
        } else {
            this.width1 = width1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".width(%s)", width1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".width(%s)", width1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSposition() {
        if (position != null) {
            return String.format(Locale.US, "position: %s,", (position != null) ? position.generateJs() : "null");
        }
        return "";
    }

    private String generateJSposition1() {
        if (position1 != null) {
            return String.format(Locale.US, "position: %s,", position1);
        }
        return "";
    }

    private String generateJSradius() {
        if (radius != null) {
            return String.format(Locale.US, "radius: %f,", radius);
        }
        return "";
    }

    private String generateJSradius1() {
        if (radius1 != null) {
            return String.format(Locale.US, "radius: %s,", radius1);
        }
        return "";
    }

    private String generateJSwidth() {
        if (width != null) {
            return String.format(Locale.US, "width: %f,", width);
        }
        return "";
    }

    private String generateJSwidth1() {
        if (width1 != null) {
            return String.format(Locale.US, "width: %s,", width1);
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSposition());
            js.append(generateJSposition1());
            js.append(generateJSradius());
            js.append(generateJSradius1());
            js.append(generateJSwidth());
            js.append(generateJSwidth1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}