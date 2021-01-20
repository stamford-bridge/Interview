package com.andersenbel.interview_tasks.fixtures_test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 * @author Alexey Adamovich on 20.01.2021
 */
public class BaseTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("BeforeAll PARENT");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("      BeforeEach PARENT");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("      AfterEach PARENT");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("AfterAll PARENT");
    }
}
