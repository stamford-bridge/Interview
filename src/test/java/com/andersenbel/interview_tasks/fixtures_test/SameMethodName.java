package com.andersenbel.interview_tasks.fixtures_test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Alexey Adamovich on 20.01.2021
 */
public class SameMethodName extends BaseTest{

    @BeforeAll
    public static void beforeAll() {
        System.out.println("BeforeAll CHILD");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("      BeforeEach CHILD");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("      AfterEach CHILD");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("AfterAll CHILD");
    }

    @Test
    public void fakeTest() {
        System.out.println("========== This is Test!!!");
    }
}
