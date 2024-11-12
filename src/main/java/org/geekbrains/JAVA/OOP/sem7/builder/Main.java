package org.geekbrains.JAVA.OOP.sem7.builder;

public class Main {
    public static void main(String[] args) {
        BigCard bigcard = new BigCard();
        System.out.println(bigcard.
                setColorFront("Brown").
                setColorBack("Black").
                build());

        SmallCard smallCard = new SmallCard();
        System.out.println(smallCard.build());
    }
}
