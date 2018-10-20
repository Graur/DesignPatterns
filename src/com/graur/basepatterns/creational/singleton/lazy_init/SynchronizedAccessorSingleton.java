package com.graur.basepatterns.creational.singleton.lazy_init;

/**
 * + Ленивая инициализация
 * - Низкая производительность (критическая секция) в наиболее типичном доступе
 */
public class SynchronizedAccessorSingleton {
    private static SynchronizedAccessorSingleton instance;

    public static synchronized SynchronizedAccessorSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedAccessorSingleton();
        }
        return instance;
    }
}
