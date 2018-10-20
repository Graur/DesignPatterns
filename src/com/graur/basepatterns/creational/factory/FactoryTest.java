package com.graur.basepatterns.creational.factory;

public class FactoryTest {
    public static void main(String[] args){
        String keyWorld = "linux";
        Factory factory = new Factory();
        OS os = factory.getCurrentOS(keyWorld);
        os.getOS();
    }
}
