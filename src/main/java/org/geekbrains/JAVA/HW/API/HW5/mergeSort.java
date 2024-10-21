package org.geekbrains.JAVA.HW.API.HW5;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        mergeSort(new int[]{5, 7, 5, 3, 1, 9, 3, 4, 5, 6});
    }

    public static void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) result[k++] = left[i++];
            else result[k++] = right[j++];
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
        System.out.println(Arrays.toString(result));
    }

    public static void mergeSort(int[] array) {
        if (array.length < 2) return;
        int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] right = Arrays.copyOfRange(array, left.length, array.length);
        mergeSort(left);
        mergeSort(right);
        merge(left, right, array);

    }
}
