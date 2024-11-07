package org.geekbrains.JAVA.HW.OOP.HW5.Entitys;

import java.util.List;

public interface Entity {
    String getName();

    String getSex();

    int getAge();

    Entity getFather();

    Entity getMother();

    List<Entity> getChildren();

    Entity getSibling();

    Entity getSpouse();


    void addChild(Entity entity);

    void setSibling(Entity entity);

    void setSpouse(Entity entity);
}
