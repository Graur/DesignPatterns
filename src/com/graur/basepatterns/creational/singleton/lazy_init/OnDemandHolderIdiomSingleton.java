package com.graur.basepatterns.creational.singleton.lazy_init;

/**
 * + Ленивая инициализация
 * + Высокая производительность
 * - Невозможно использовать для не статических полей класса
 */

public class OnDemandHolderIdiomSingleton {

    public static class SingletonHolder {
        public static final OnDemandHolderIdiomSingleton HOLDER_INSTANCE = new OnDemandHolderIdiomSingleton();
    }

    public static OnDemandHolderIdiomSingleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
