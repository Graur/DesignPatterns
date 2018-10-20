package com.graur.basepatterns.behavioral.strategy;

public class Expert implements Level{

    @Override
    public void startLevel() {
        System.out.println("Expert level");
    }
}
