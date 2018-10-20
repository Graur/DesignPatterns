package com.graur.basepatterns.creational.abstractFactory;

/**
 * Предоставляет интерфейс для создания семейств взаимосвязанных или взаимозависимых объектов, не специфицируя их конкретных классов.
 */
public interface IGUIFactory {
    IButton createButton();
}
