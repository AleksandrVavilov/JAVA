package org.geekbrains.JAVA.sem5;

import java.util.HashMap;
import java.util.Map;

public class RomanToArab {
    public static void main(String[] args) {
        System.out.println(convert("MMIXIVI"));
    }

    public static int convert(String romanNum) {


        String[] arr = romanNum.split("");
        String first = Character.toString(romanNum.charAt(0));
        int result = romanToArabMap.get(first);
        for (int i = 1; i < arr.length; i++) {
            String prev = arr[i - 1];
            String current = arr[i];
            int prevNum = romanToArabMap.get(prev);
            int currentNum = romanToArabMap.get(current);

            if (currentNum > prevNum) result = result + currentNum - 2 * prevNum;
            else result += currentNum;

        }

        return result;
    }

    private static final Map<String, Integer> romanToArabMap = new HashMap<>(
            Map.of(
                    "I", 1,
                    "V", 5,
                    "X", 10,
                    "L", 50,
                    "C", 100,
                    "D", 500,
                    "M", 1000)
    );
}
