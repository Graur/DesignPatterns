package com.graur.basepatterns.behavioral.delegate;

/**
 * Шаблон проектирования, в котором объект внешне выражает некоторое поведение, но в реальности передает ответственность
 * за выполнение этого поведения связанному объекту.
 *
 * Класс делегирует вызовы методов другому объекту.
 */
public interface Repository {
    void add(Object obj);
    Object get(Object key);
    void delete(Object key);
    Object[] getAll();
}
