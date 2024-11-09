package org.geekbrains.JAVA.HW.OOP.HW5.model;

import org.geekbrains.JAVA.HW.OOP.HW5.model.Comparators.CompareEByName;
import org.geekbrains.JAVA.HW.OOP.HW5.model.Comparators.CompareEAge;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tree<T extends Entity> implements Serializable, Iterable<T> {
    private static final long serialVersionUID = 1L;
    private final List<T> entitys;

    public Tree() {
        this.entitys = new ArrayList<>();
    }

    public void addEntity(T entity) {
        this.entitys.add(entity);
    }

    public void addVEntity(T entity1, T entity2, T entity3, T entity4, T entity5) {
        this.entitys.add(entity1);
        this.entitys.add(entity2);
        this.entitys.add(entity3);
        this.entitys.add(entity4);
        this.entitys.add(entity5);
    }

    public void deleteEntity(T entity) {
        this.entitys.remove(entity);
    }

    public T findEntityByName(String name) {
        for (T entity : entitys) {
            if (entity.getName().equals(name)) return entity;
        }
        return null;
    }

    public void getChildren(Entity entity) {
        System.out.println(entity.getChildren());
    }

    public void stabilization() {
        for (T entity : entitys) {

            if (entity.getFather() != null) entity.getFather().addChild(entity);
            if (entity.getMother() != null) entity.getMother().addChild(entity);
            if (entity.getSibling() != null) entity.getSibling().setSibling(entity);
            if (entity.getSpouse() != null) entity.getSpouse().setSpouse(entity);
        }
    }

    @Override
    public String toString() {
        return entitys.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return entitys.listIterator();
    }

    public void sortByName() {
        entitys.sort(new CompareEByName());

    }

    public void sortByAge() {
        entitys.sort(new CompareEAge());
    }


    public List<T> getMembers() {
        return entitys;
    }
}
