package com.graur.basepatterns.creational.abstractFactory;

public class OSXButton implements IButton {

    @Override
    public void paint() {
        System.out.println("OSXButton");
    }
}
