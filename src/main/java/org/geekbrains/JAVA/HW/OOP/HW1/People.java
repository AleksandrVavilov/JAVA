package org.geekbrains.JAVA.HW.OOP.HW1;

import java.util.ArrayList;
import java.util.List;

public class People {
    private String name;
    private String sex;
    private int age;
    private People Father;
    private People Mother;
    private People Spouse;
    private List<People> children;
    private People Sibling;

    public People(String name, String sex, int age) {
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

    public People getFather() {
        return Father;
    }

    public People getMother() {
        return Mother;
    }

    public People getSpouse() {
        return Spouse;
    }

    public List<People> getChildren() {
        return children;
    }

    public People getSibling() {
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

    public void setFather(People father) {
        this.Father = father;
    }

    public void setMother(People mother) {
        this.Mother = mother;
    }

    public void setSpouse(People spouse) {
        this.Spouse = spouse;

    }

    public void setSibling(People sibling) {
        this.Sibling = sibling;
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
            for (People child : children) {
                sb.append("[" + child.getName() + "]");
            }
        }
        return sb + "\n";
    }

    public void addChild(People child) {
        this.children.add(child);
    }
}


