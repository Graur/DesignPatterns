package com.graur.basepatterns.creational.abstractFactory;

public class WinFactory implements IGUIFactory {

    @Override
    public IButton createButton() {
        return new WinButton();
    }
}
