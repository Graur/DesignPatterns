package com.graur.basepatterns.creational.singleton.lazy_init;

/**
 * + Ленивая инициализация
 * + Высокая производительность
 * - Поддерживается только с JDK 1.5 [5]
 */
public class DoubleCheckedLockingAndVolatileSingleton {
    private static volatile DoubleCheckedLockingAndVolatileSingleton instance;

    private DoubleCheckedLockingAndVolatileSingleton() {
    }

    public static DoubleCheckedLockingAndVolatileSingleton getInstance() {
        DoubleCheckedLockingAndVolatileSingleton localInstance = instance;
        if (localInstance == null) {
            synchronized (DoubleCheckedLockingAndVolatileSingleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DoubleCheckedLockingAndVolatileSingleton();
                }
            }
        }
        return localInstance;
    }
}
