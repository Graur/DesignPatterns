package com.graur.basepatterns.behavioral.strategy;

/**
 * Паттерн стратегия - **поведенческий шаблон**, при котором мы можем выбрать реализацию исходя из определенного класса.
 */
public class StrategyTest {
    public static void main(String[] args) {
        Game game = new Game();

        System.out.println("Beginner mode: ");
        game.setLevel(new Beginner());
        game.startGame();

        System.out.println("Expert mode: ");
        game.setLevel(new Expert());
        game.startGame();
    }
}
