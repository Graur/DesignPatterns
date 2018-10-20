package com.graur.basepatterns.creational.singleton.normal_init;

/**
 * + Простая и прозрачная реализация
 * + Потокобезопасность
 * - Не ленивая инициализация
 */
public class StaticFieldSingleton {
    public static final StaticFieldSingleton INSTANCE = new StaticFieldSingleton();
}
