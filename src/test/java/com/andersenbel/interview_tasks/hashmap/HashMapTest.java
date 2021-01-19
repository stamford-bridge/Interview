package com.andersenbel.interview_tasks.hashmap;

import com.andersenbel.interview_tasks.stream_api.Person;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * @author Alexey Adamovich on 10.01.2021
 */
public class HashMapTest {

    /**
     * Одинаковый hashcode, equals не переопределен
     */
    @Test
    void sameHashCode() {
        final String value1 = "value1";
        final String value2 = "value2";
        CompositeKey key1 = new CompositeKey(1, "first");
        CompositeKey key2 = new CompositeKey(1, "first");

        HashMap<CompositeKey, String> hashMap = new HashMap<>();
        hashMap.put(key1, value1);
        hashMap.put(key2, value2);

        System.out.println("Объектов в корзине = " + hashMap.size());
        System.out.println();
        System.out.println(hashMap);
    }

    /**
     * Кладем первый объект в корзину, затем меняем его поле, чтобы он был равен второму
     */
    @Test
    void changeKey1InBucket() {
        final String value1 = "value1";
        final String value2 = "value2";
        CompositeKey key1 = new CompositeKey(1, "first");
        CompositeKey key2 = new CompositeKey(1, "second");

        HashMap<CompositeKey, String> hashMap = new HashMap<>();
        hashMap.put(key1, value1);

        key1.setS("second");
        hashMap.put(key2, value2);

        System.out.println("Объектов в корзине = " + hashMap.size());
        System.out.println();
        System.out.println(hashMap);
    }
}
