package org.geekbrains.HW;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
        if (a == null) {
            return null;
        }
        if (a.length < 2) {
            return a;
        }
        int[] b = new int[a.length / 2];
        System.arraycopy(a, 0, b, 0, a.length / 2);
        int[] c = new int[a.length - a.length / 2];
        System.arraycopy(a, a.length / 2, c, 0, a.length - a.length / 2);
        b = mergeSort(b);
        c = mergeSort(c);
        return mergeArray(b, c);
    }

    public static int[] mergeArray(int[] a1, int[] b1) {
        int[] result = new int[a1.length + b1.length];
        int i = 0, j = 0, k = 0;
        while (i < a1.length && j < b1.length) {
            if (a1[i] <= b1[j]) {
                result[k++] = a1[i++];
            } else {
                result[k++] = b1[j++];
            }
        }
        while (i < a1.length) {
            result[k++] = a1[i++];
        }
        while (j < b1.length) {
            result[k++] = b1[j++];
        }
        return result;
    }
}

class Printer {
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}


