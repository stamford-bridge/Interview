package com.andersenbel.interview_tasks.stream_api;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Alexey Adamovich on 10.01.2021
 */
public class StreamApiTest {

    /**
     * Посчитать сумму
     */
    @Test
    void sum() {
        final int expected = 6;
        Stream<String> stream = Stream.of("4", "3", "1", "-3", "1");

        int actual = 0;

        assertEquals(expected, actual);
    }

    /**
     * Найти имя самой пожилой женщины
     */
    @Test
    void findFemaleOldest() {
        final String expected = "Анастасия";

        Stream<Person> stream = prepareTestStream();

        String actual = "";

        assertEquals(expected, actual);
    }

    /**
     * Вывести в консоль имена всех мужчин в отсортированном виде, а затем найти количество мужчин
     */
    @Test
    void printMaleNamesSorted() {
        final int expected = 3;

        Stream<Person> stream = prepareTestStream();

        int actual = 0;

        assertEquals(expected, actual);
    }

    private Stream<Person> prepareTestStream() {
        return Stream.of(
                new Person("Иван", 22, Gender.MALE),
                new Person("Сергей", 63, Gender.MALE),
                new Person("Петр", 37, Gender.MALE),
                new Person("Мария", 17, Gender.FEMALE),
                new Person("Екатерина", 29, Gender.FEMALE),
                new Person("Анастасия", 67, Gender.FEMALE));
    }
}