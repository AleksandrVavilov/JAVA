package org.geekbrains.JAVA.API.sem6;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Goods milk1 = new Milk(100D, "123", LocalDateTime.now(), 1, "white");
        Water water1 = new Water(50D, "321", LocalDateTime.of(2024, 3, 22, 10, 33), 1, true);
        System.out.println(water1.getGoodType());
        Set<Goods> goods = new HashSet<>();
        goods.add(milk1);
        goods.add(water1);
        System.out.println(goods);
    }


}
