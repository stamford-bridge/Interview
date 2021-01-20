package com.andersenbel.interview_tasks.fixtures_test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Alexey Adamovich on 20.01.2021
 */
public class ExceptionCase extends BaseTest{

    @BeforeAll
    public static void beforeClass() {
        System.out.println("BeforeAll CHILD");
//        throw new RuntimeException();
    }

    @BeforeEach
    public void beforeMethod() {
        System.out.println("      BeforeEach CHILD");
    }

    @AfterEach
    public void afterMethod() {
        System.out.println("      AfterEach CHILD");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("AfterAll CHILD");
    }

    @Test
    public void fakeTest() {
        System.out.println("========== This is Test!!!");
        throw new RuntimeException();
    }
}
