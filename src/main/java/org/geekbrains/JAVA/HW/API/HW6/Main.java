package org.geekbrains.JAVA.HW.API.HW6;

import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(100000, "1", LocalDateTime.now(), 1, "black", "MAC", 1024, 16);
        Laptop laptop2 = new Laptop(65000, "2", LocalDateTime.now(), 2, "white", "Linux", 512, 8);
        Laptop laptop3 = new Laptop(75000, "3", LocalDateTime.now(), 3, "yellow", "Windows", 2048, 32);
        Laptop laptop4 = new Laptop(68000, "4", LocalDateTime.now(), 3, "white", "Linux", 512, 8);
        Laptop laptop5 = new Laptop(85000, "5", LocalDateTime.now(), 2, "yellow", "Windows", 2048, 32);
        Laptop laptop6 = new Laptop(95000, "6", LocalDateTime.now(), 1, "black", "MAC", 1024, 16);
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);
        Map<String, Object> filter = getFilter();

        filterLaptops(laptops, filter);


    }

    private static Map<String, Object> getFilter() {
        Map<Integer, String> criteria = new HashMap<>();
        criteria.put(1, "Color");
        criteria.put(2, "os");
        criteria.put(3, "HDD");
        criteria.put(4, "RAM");
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filter = new HashMap<>();
        boolean flag = true;
        while (flag) {
            System.out.println("Введите цифру соответсвующую критерию для поиска: ");
            System.out.println(criteria);

            int criterion = scanner.nextInt();
            scanner.nextLine();
            switch (criterion) { //удобно перебирать ключи вместо if
                case 1:
                    System.out.println("Введите цвет на английском: ");
                    filter.put("color", scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Введите операционную систему:");
                    filter.put("os", scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Введите объем жесткого диска в гб: ");
                    filter.put("HDD", scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Введите объем оперативной памяти в гб: ");
                    filter.put("RAM", scanner.nextInt());
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("Вы ввели некорректный критерий!");
            }
            System.out.println("Хотите добавить критерий для поиска? Введите 'Да' или 'Нет'");
            String response = scanner.nextLine();
            flag = response.equalsIgnoreCase("да");

        }
        return filter;
    }

    public static void filterLaptops(Set<Laptop> laptops, Map<String, Object> filter) {
        for (Laptop laptop : laptops) {
            boolean matches = true;
            if (filter.containsKey("color") && !laptop.getColor().equalsIgnoreCase(filter.get("color").toString())) {
                matches = false;
            }
            if (filter.containsKey("os") && !laptop.getOs().equalsIgnoreCase(filter.get("os").toString())) {
                matches = false;
            }
            if (filter.containsKey("HDD") && laptop.getCapacityHDD() < (int) filter.get("HDD")) {
                matches = false;
            }
            if (filter.containsKey("RAM") && laptop.getAmountRAM() < (int) filter.get("RAM")) {
                matches = false;
            }
            if (matches) System.out.println(laptop);
        }
    }
}

