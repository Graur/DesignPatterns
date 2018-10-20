package com.graur.basepatterns.structural.proxy;

/**
 * Паттерн прокси(Заместитель) используется как контейнер над объектом, прокси объект перехватывает все вызовы методов другого объекта.
 *
 * Пример использования, допустим в Hibernate у Session есть метод load, который как раз использует прокси объект для ленивой инициализации.
 */
public class ProxyProject implements Project {
    private String url;
    private RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (realProject == null) {
            realProject = new RealProject(url);
        }
        realProject.run();
    }
}
