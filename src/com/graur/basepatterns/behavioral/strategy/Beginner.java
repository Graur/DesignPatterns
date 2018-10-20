package com.graur.basepatterns.behavioral.strategy;

public class Beginner implements Level {

    @Override
    public void startLevel() {
        System.out.println("beginner level");
    }
}
