package org.geekbrains.JAVA.HW.OOP.HW1.Entitys;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person implements Serializable, Entity {
    private static final long serialVersionUID = 1L; //нужно для работы сериализибера
    private String name;
    private String sex;
    private int age;
    private Person Father;
    private Person Mother;
    private Person Spouse;
    private List<Entity> children;
    private Person Sibling;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Person getFather() {
        return Father;
    }

    public Person getMother() {
        return Mother;
    }

    public Person getSpouse() {
        return Spouse;
    }

    public List<Entity> getChildren() {
        return children;
    }

    public Person getSibling() {
        return Sibling;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFather(Person father) {
        this.Father = father;
    }

    public void setMother(Person mother) {
        this.Mother = mother;
    }

    public void setSpouse(Entity spouse) {
        this.Spouse = (Person) spouse;

    }
    
    public void setSibling(Entity sibling) {
        this.Sibling = (Person) sibling;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name=" + name + ", ");
        sb.append("sex=" + sex + ", ");
        sb.append("age=" + age);
        if (Father != null) sb.append(", Father=" + Father.getName());
        if (Mother != null) sb.append(", Mother=" + Mother.getName());
        if (Spouse != null) sb.append(", Spouse=" + Spouse.getName());
        if (Sibling != null) sb.append(", Sibling=" + Sibling.getName());
        if (!children.isEmpty()) {
            sb.append(", children=");
            for (Entity child : children) {
                sb.append("[" + child.getName() + "]");
            }
        }
        return sb + "\n";
    }

    public void addChild(Entity child) {
        this.children.add((Person) child);
    }
}


