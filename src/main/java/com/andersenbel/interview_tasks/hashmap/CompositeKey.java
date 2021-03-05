package com.andersenbel.interview_tasks.hashmap;

import java.util.Objects;

/**
 * @author Alexey Adamovich on 10.01.2021
 */
public class CompositeKey {

    private int numberValue;
    private String stringValue;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        CompositeKey that = (CompositeKey) o;
//        return numberValue == that.numberValue && Objects.equals(stringValue, that.stringValue);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(numberValue, stringValue);
//    }

        @Override
    public int hashCode() {
        return 5;
    }

    public CompositeKey(int numberValue, String stringValue) {
        this.numberValue = numberValue;
        this.stringValue = stringValue;
    }

    public void setNumberValue(int numberValue) {
        this.numberValue = numberValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    @Override
    public String toString() {
        return "{" +
                "age=" + numberValue +
                ", name='" + stringValue + '\'' +
                '}';
    }
}
