package com.graur.basepatterns.creational.prototype;

abstract class Gun implements Cloneable {
    private int clipCount;
    private int bulletCount;

    public Gun(int clipCount, int bulletCount) {
        this.clipCount = clipCount;
        this.bulletCount = bulletCount;
    }

    @Override
    public Gun clone() throws CloneNotSupportedException {
        return (Gun) super.clone();
    }
}
