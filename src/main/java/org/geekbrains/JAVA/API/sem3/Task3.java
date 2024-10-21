package org.geekbrains.JAVA.API.sem3;

import java.util.*;

//аполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.
public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        String[] temp = {"Венера", "Земля", "Марс", "Земля", "Юпитер", "Венера", "Сатурн", "Марс"};
        planets.addAll(Arrays.asList(temp));
        System.out.println(planets);
        List<String> temp2 = List.of("Венера", "Земля", "Марс", "Земля", "Юпитер", "Венера", "Сатурн", "Марс"); //неизменяемый лист
        StringBuilder sb = new StringBuilder();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < planets.size(); i++) {
            String planet = planets.get(i);
            if (!result.contains(planet)) {
                result.add(planet);
                int count = 0;
                for (int j = 0; j < planets.size(); j++) {
                    if (planets.get(j).equals(planet)) {
                        count++;
                    }
                }
                sb.append(planet).append(" : ").append(count).append("\n");
            }

        }
        System.out.println(sb);
        System.out.println(delete(sb));
        System.out.println(getPlanetsWithCount(temp2));
        System.out.println(getUnicuePlanets(getPlanetsWithCount(temp2)));
    }

    public static StringBuilder delete(StringBuilder sb) {
        String temp = sb.toString();
        StringBuilder result = new StringBuilder();
        String[] split = temp.split("\n");
        for (String s : split) {
            if (s.split(" : ")[1].equals("1")) result.append(s).append("\n");
        }
        return result;
    }


    public static Map<String, Integer> getPlanetsWithCount(List<String> planets) {
        Map<String, Integer> result = new HashMap<>();
        Set<String> keys = result.keySet();
        for (String planet : planets) {
            if (!keys.contains(planet)) {
                result.put(planet, 1);
            } else {
                Integer value = result.get(planet);
                value++;
                result.put(planet, value);
            }
        }
        return result;
    }

    public static Map<String, Integer> getUnicuePlanets(Map<String, Integer> planets) {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : planets.entrySet()) {
            if (entry.getValue() == 1) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }
}

