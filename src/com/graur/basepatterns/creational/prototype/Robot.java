package com.graur.basepatterns.creational.prototype;

/**
 * Прототип - порождающий шаблон проектирования, позволяющий клонировать объекты любой сложности без привязки их к конкретным классам.
 */
public class Robot implements Cloneable {
    private int uid;
    private Gun gun;

    public Robot(int uid, Gun gun) {
        this.uid = uid;
        this.gun = gun;
    }

    @Override
    public Robot clone() throws CloneNotSupportedException {
        Robot robot = (Robot) super.clone();
        Gun gun = this.gun.clone();
        robot.setGun(gun);
        return robot;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }
}
