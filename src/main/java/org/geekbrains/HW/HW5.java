package org.geekbrains.HW;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
//
//Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:
//
//int[] arr - числовой массив
//
//После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt' в формате год-месяц-день час:минуты {массив на данной итерации}. Для логирования использовать логгер logger класса BubbleSort.
//
//        Пример
//
//
//        arr = new int[]{9, 4, 8, 3, 1};
//sort(arr)
//
//// При чтении лог-файла получим:
//2023-05-19 07:53 [4, 8, 3, 1, 9]
//        2023-05-19 07:53 [4, 3, 1, 8, 9]
//        2023-05-19 07:53 [3, 1, 4, 8, 9]
//        2023-05-19 07:53 [1, 3, 4, 8, 9]
//        2023-05-19 07:53 [1, 3, 4, 8, 9]
public class HW5 {
    private static File log;
    private static FileWriter fileWriter;

    public static void main(String[] args) {
        try {
            log = new File("log.txt");
            fileWriter = new FileWriter(log);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            int[] arr = new int[]{9, 4, 8, 3, 1};
            boolean isSort = false;
            int temp;
            while (!isSort) {
                isSort = true;
                for (int i = 0; i < arr.length - 1; i++) {
                    temp = arr[i];
                    if (arr[i] > arr[i + 1]) {
                        isSort = false;
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
                if (!isSort)
//                    System.out.println(Arrays.toString(arr));
                    fileWriter.write(String.format("%s %s%n", LocalDateTime.now().format(dtf), Arrays.toString(arr)));
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
