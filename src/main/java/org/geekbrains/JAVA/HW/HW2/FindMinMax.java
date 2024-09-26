package org.geekbrains.JAVA.HW.HW2;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FindMinMax {
    private static final Logger LOG = Log.log(FindMinMax.class.getName());

    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 9, 15, 21, 3, 42, 8};
        findMinMax(arr);
    }

    public static void findMinMax(int[] arr) {
        Arrays.sort(arr);
        int min = arr[0];
        LOG.log(Level.INFO, "min = " + min);
        int max = arr[arr.length - 1];
        LOG.log(Level.INFO, "max = " + max);
    }
}
