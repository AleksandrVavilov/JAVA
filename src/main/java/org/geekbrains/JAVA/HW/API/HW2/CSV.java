package org.geekbrains.JAVA.HW.API.HW2;

public class CSV {
    public static void main(String[] args) {
        String[] headers = {"Name", "Age", "City"};
        String[][] data = {{"John", "30", "NewYork"}, {"Alice", "25", "LosAngeles"}, {"Bob", "35", "Chicago"}};
        System.out.println(generatecsv(headers, data));
    }

    public static String generatecsv(String[] headers, String[][] data) {
        StringBuilder csv = new StringBuilder();
        csv.append(String.join(",", headers)).append("\n");
        for (String[] row : data) {
            csv.append(String.join(",", row)).append(("\n"));
        }
        return csv.toString().trim();
    }


}
