package com.graur.basepatterns.creational.abstractFactory;

public class WinButton implements IButton {

    @Override
    public void paint() {
        System.out.println("WinButton");
    }
}
