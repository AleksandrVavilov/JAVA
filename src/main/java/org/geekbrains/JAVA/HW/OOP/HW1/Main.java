package org.geekbrains.JAVA.HW.OOP.HW1;


import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FamilyTree Vavilovi = new FamilyTree();
        People Null = new People("Null", "", 0);
        People Aleksandr = new People("Aleksandr", "male", 32);
        People Anastasiia = new People("Anastasiia", "female", 30);
        People Vladimir = new People("Vladimir", "male", 64);
        People Victory = new People("Victory", "female", 61);
        People Semen = new People("Semen", "male", 37);
        People Tatiana = new People("Tatiana", "female", 39);
        People Andrew = new People("Andrew", "male", 6);
        People Leonid = new People("Leonid", "male", 86);
        People Zinaida = new People("Zinaida", "female", 84);
        People Victor = new People("Victor", "male", 60);
        People Yuriy = new People("Yuriy", "male", 35);
        People Aleksandra = new People("Aleksandra", "female", 32);
        People VladimirBoy = new People("Vladimir", "male", 3);
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
        Vavilovi.addVPerson(Aleksandr, Anastasiia, Vladimir, Victory, Semen);
        Vavilovi.addVPerson(Tatiana, Andrew, Leonid, Zinaida, Victor);
        Vavilovi.addPerson(Yuriy);
        Vavilovi.addPerson(Aleksandra);
        Vavilovi.addPerson(VladimirBoy);

        Vavilovi.stabilization();
//        System.out.println(Aleksandr);
//        System.out.println(Vavilovi);
//        System.out.println(Semen.getChildren());
        FileOperation fileOps = new FileOperationImpl();
        try {
            fileOps.saveToFile(Vavilovi, "Vavilovi.dat");
            System.out.println("Vavilovi tree saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        FamilyTree loadFamilyTree = null;
        try {
            loadFamilyTree = fileOps.loadFromFile("Vavilovi.dat");
            System.out.println("Vavilovi loaded from file.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (loadFamilyTree != null) System.out.println(loadFamilyTree);
    }
}

