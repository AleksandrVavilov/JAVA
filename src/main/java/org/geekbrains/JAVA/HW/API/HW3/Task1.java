package org.geekbrains.JAVA.HW.API.HW3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Реализуйте метод, который принимает на вход целочисленный массив и
//удаляет все отрицательные числа. Метод должен вернуть массив, содержащий
//только неотрицательные числа.
public class Task1 {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{-2, 2, 3, -5, 6, 1, -4};

        System.out.println(Arrays.toString(filterNegative(a)));
    }

    public static Integer[] filterNegative(Integer[] a) {
        ArrayList<Integer> temp = new ArrayList<>();
        Collections.addAll(temp, a);
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) < 0) {
                temp.remove(i);
                i--;
            }
        }
        Integer[] result = temp.toArray(new Integer[temp.size()]);
        return result;
    }
}
