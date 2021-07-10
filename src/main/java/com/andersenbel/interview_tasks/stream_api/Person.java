package com.andersenbel.interview_tasks.stream_api;

/**
 * @author Alexey Adamovich on 10.01.2021
 */
public class Person {

    private final String name;

    private final Integer age;

    private final Gender gender;

    public Person(final String name, final Integer age, final Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
