package com.zipcodewilmington.scientificcalculator;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 6/27/21 11:04 AM
 */
public class Display {

    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public void display() {
        Console.println(getValue());
    }

    private String getValue() {
        return this.value;
    }
}
