package com.graur.basepatterns.creational.factory;

class Factory {
    public OS getCurrentOS(String inputos) {
        OS os = null;
        if (inputos.equalsIgnoreCase("windows")) {
            os = new WindowsOS();
        } else if (inputos.equalsIgnoreCase("linux")) {
            os = new LinuxOS();
        }
        return os;
    }
}