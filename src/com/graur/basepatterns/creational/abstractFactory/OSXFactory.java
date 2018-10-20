package com.graur.basepatterns.creational.abstractFactory;

public class OSXFactory implements IGUIFactory {

    @Override
    public IButton createButton() {
        return new OSXButton();
    }
}
