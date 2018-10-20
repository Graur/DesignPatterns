package com.graur.basepatterns.behavioral.strategy;

public class Game {
    private Level level;

    public void setLevel(Level level) {
        this.level = level;
    }

    public void startGame() {
        level.startLevel();
        System.out.println("End level");
    }
}
