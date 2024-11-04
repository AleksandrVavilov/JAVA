package org.geekbrains.JAVA.HW.OOP.HW1;


import org.geekbrains.JAVA.HW.OOP.HW1.Entitys.Person;
import org.geekbrains.JAVA.HW.OOP.HW1.Service.FileOperation;
import org.geekbrains.JAVA.HW.OOP.HW1.Service.FileOperationImpl;
import org.geekbrains.JAVA.HW.OOP.HW1.Trees.Tree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Tree<Person> Vavilovi = new Tree();
//        People Null = new People("Null", "", 0);
        Person Aleksandr = new Person("Aleksandr", "male", 32);
        Person Anastasiia = new Person("Anastasiia", "female", 30);
        Person Vladimir = new Person("Vladimir", "male", 64);
        Person Victory = new Person("Victory", "female", 61);
        Person Semen = new Person("Semen", "male", 37);
        Person Tatiana = new Person("Tatiana", "female", 39);
        Person Andrew = new Person("Andrew", "male", 6);
        Person Leonid = new Person("Leonid", "male", 86);
        Person Zinaida = new Person("Zinaida", "female", 84);
        Person Victor = new Person("Victor", "male", 60);
        Person Yuriy = new Person("Yuriy", "male", 35);
        Person Aleksandra = new Person("Aleksandra", "female", 32);
        Person VladimirBoy = new Person("Vladimir", "male", 3);
        Aleksandr.setFather(Vladimir);
        Semen.setFather(Vladimir);
        Andrew.setFather(Semen);
        Vladimir.setFather(Leonid);
        Victor.setFather(Leonid);
        Yuriy.setFather(Victor);
        VladimirBoy.setFather(Yuriy);
        Aleksandr.setMother(Victory);
        Semen.setMother(Victory);
        Vladimir.setMother(Zinaida);
        Victor.setMother(Zinaida);
        VladimirBoy.setMother(Aleksandra);
        Aleksandr.setSpouse(Anastasiia);
        Semen.setSpouse(Tatiana);
        Yuriy.setSpouse(Aleksandra);
        Leonid.setSpouse(Zinaida);
        Aleksandr.setSibling(Semen);
        Vavilovi.addVEntity(Aleksandr, Anastasiia, Vladimir, Victory, Semen);
        Vavilovi.addVEntity(Tatiana, Andrew, Leonid, Zinaida, Victor);
        Vavilovi.addEntity(Yuriy);
        Vavilovi.addEntity(Aleksandra);
        Vavilovi.addEntity(VladimirBoy);

        Vavilovi.stabilization();
        System.out.println(Aleksandr);
        System.out.println(Vavilovi);
        System.out.println(Semen.getChildren());
        FileOperation fileOps = new FileOperationImpl();
        try {
            fileOps.saveToFile(Vavilovi, "Vavilovi.dat");
            System.out.println("Vavilovi tree saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Tree loadTree = null;
        try {
            loadTree = fileOps.loadFromFile("Vavilovi.dat");
            System.out.println("Vavilovi loaded from file.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (loadTree != null) System.out.println(loadTree);

//        System.out.println(Vavilovi); //демонстрация сортировки
//        Vavilovi.sortByName();
//        System.out.println(Vavilovi);
//        Vavilovi.sortByAge();
//        System.out.println(Vavilovi);
    }
}

