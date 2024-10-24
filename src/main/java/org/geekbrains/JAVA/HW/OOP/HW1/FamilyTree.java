package org.geekbrains.JAVA.HW.OOP.HW1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<People> people;

    public FamilyTree() {
        this.people = new ArrayList<>();
    }

    public void addPerson(People person) {
        this.people.add(person);
    }

    public void addVPerson(People person1, People person2, People person3, People person4, People person5) {
        this.people.add(person1);
        this.people.add(person2);
        this.people.add(person3);
        this.people.add(person4);
        this.people.add(person5);
    }

    public void deletePerson(People person) {
        this.people.remove(person);
    }

    public People findPersonByName(String name) {
        for (People person : people) {
            if (person.getName().equals(name)) return person;
        }
        return null;
    }

    public void getChildren(People person) {
        System.out.println(person.getChildren());
    }

    public void stabilization() {
        for (People person : people) {

            if (person.getFather() != null) person.getFather().addChild(person);
            if (person.getMother() != null) person.getMother().addChild(person);
            if (person.getSibling() != null) person.getSibling().setSibling(person);
            if (person.getSpouse() != null) person.getSpouse().setSpouse(person);
        }
    }

    @Override
    public String toString() {
        return people.toString();
    }

}
