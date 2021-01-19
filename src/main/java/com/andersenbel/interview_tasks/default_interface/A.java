package com.andersenbel.interview_tasks.default_interface;

/**
 * @author Alexey Adamovich on 14.01.2021
 */
public interface A {

    default String conflict() {
        return "It's Interface A";
    }
}
