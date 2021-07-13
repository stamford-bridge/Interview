package com.andersenbel.interview_tasks.hashmap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Alexey Adamovich on 10.01.2021
 */
class HashMapTest {

    /**
     * Одинаковый hashcode, equals не переопределен
     */
    @Test
    void sameHashCode() {
        final CompositeKey key1 = new CompositeKey(1, "first");
        final CompositeKey key2 = new CompositeKey(1, "first");

        final Map<CompositeKey, String> hashMap = new HashMap<>();
        hashMap.put(key1, "value1");
        hashMap.put(key2, "value2");

        System.out.println("Объектов в корзине = " + hashMap.size());
        System.out.println();
        System.out.println(hashMap);
    }

    /**
     * Кладем первый объект в корзину, затем меняем его поле, чтобы он был равен второму
     */
    @Test
    void changeKey1InBucket() {
        final CompositeKey key1 = new CompositeKey(1, "first");
        final CompositeKey key2 = new CompositeKey(1, "second");

        final Map<CompositeKey, String> hashMap = new HashMap<>();
        hashMap.put(key1, "value1");
        
        key1.setStringValue("second");
        hashMap.put(key2, "value2");

        System.out.println("Объектов в корзине = " + hashMap.size());
        System.out.println();
        System.out.println(hashMap);
    }
}
