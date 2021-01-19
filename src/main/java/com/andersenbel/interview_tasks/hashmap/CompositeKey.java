package com.andersenbel.interview_tasks.hashmap;

import java.util.Objects;

/**
 * @author Alexey Adamovich on 10.01.2021
 */
public class CompositeKey {

    private final int x;

    private String s;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        CompositeKey that = (CompositeKey) o;
//        return x == that.x && Objects.equals(s, that.s);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(x, s);
//    }

        @Override
    public int hashCode() {
        return 5;
    }


    public CompositeKey(int x, String s) {
        this.x = x;
        this.s = s;
    }

    public void setS(String s) {
        this.s = s;
    }


    @Override
    public String toString() {
        return "{" +
                "age=" + x +
                ", name='" + s + '\'' +
                '}';
    }
}
