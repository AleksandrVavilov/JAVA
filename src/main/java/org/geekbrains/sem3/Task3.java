package org.geekbrains.sem3;

import java.util.*;

/*Заполнить список названиями планет Солнечной
системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его
повторений в списке*/
/*Пройти по списку из предыдущего задания и удалить
повторяющиеся элементы.*/

public class Task3 {
    public static void main(String[] args) {
        List<String> planets = new ArrayList();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Плутон");
        System.out.println(planets);
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int n = scaner.nextInt();
        Random rnd = new Random();
        List<String> rndPlanets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            rndPlanets.add(planets.get(rnd.nextInt(0, planets.size())));
        }
        System.out.println(rndPlanets);
        /*        Collections.sort(rndPlanets);*/
        getCount(planets, rndPlanets);
        scaner.close();
        /*Set<String> set = new HashSet<>(rndPlanets);
        rndPlanets.clear();
        rndPlanets.addAll(set);
        System.out.println(set);*/

        System.out.println(getUnique(planets));
        getCount(planets, getUnique(planets));

    }

    private static void getCount(List<String> planets, List<String> rndPlanets) {
        for (int i = 0; i < planets.size(); i++) {
            int count = 0;
            for (int j = 0; j < rndPlanets.size(); j++) {
                if (rndPlanets.get(j).equals(planets.get(i))) count++;
            }
            System.out.println(planets.get(i) + " встречается " + count + " раз");
        }
    }

    private static List<String> getUnique(List<String> planets) {
        List<String> uniquePlanets = new ArrayList<>();
        for (int i = 0; i < planets.size(); i++) {
            if (!uniquePlanets.contains((planets.get(i))))
                uniquePlanets.add(planets.get(i));
        }
        return uniquePlanets;
    }
}
