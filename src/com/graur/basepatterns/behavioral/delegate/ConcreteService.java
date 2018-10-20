package com.graur.basepatterns.behavioral.delegate;

public class ConcreteService {
    private Repository repo;

    public ConcreteService(Repository repo) {
        this.repo = repo;
    }

    public void add(Object obj) {
        repo.add(obj);
    }

    public Object get(Object key) {
        return repo.get(key);
    }

    public void delete(Object key) {
        repo.delete(key);
    }

    public Object[] getAll() {
        return repo.getAll();
    }
}
