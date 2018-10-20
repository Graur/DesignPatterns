package com.graur.basepatterns.structural.proxy;

public class ProjectRunner {

    public static void main(String[] args) {
        Project project = new ProxyProject("http://github.com/graur/design-patterns/real-project");

        project.run();
    }
}
