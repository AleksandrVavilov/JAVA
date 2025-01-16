package org.geekbrains.exceptions.HW.HW3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import java.util.Scanner;

import static java.text.MessageFormat.*;

public class Task1 {
    private static final int size = 6;

    public static void main(String[] args) {
        System.out.println("Введите [Фамилию Имя Отчество дату_рождения(dd.MM.yyyy) номер_телефона пол] - разделенные пробелом ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        String[] array = input.split(" ");
        if (array.length != size) {
            System.out.println("Введено неверное количество полей- " + array.length + ", а нужно " + size);
        } else {
            String lastName = array[0];
            String firstName = array[1];
            String middleName = array[2];
            LocalDate dateOfBirth;
            try {
                DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                dateOfBirth = LocalDate.parse(array[3], format);
            } catch (DateTimeParseException e) {
                System.out.println("Некорректный формат даты!");
                return;
            }
            Long PhoneNumber;
            try {
                PhoneNumber = Long.parseLong(array[4]);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный формат телефона!");
                return;
            }
            String sex = array[5];
            if (!sex.equals("f") && !sex.equals("m")) {
                System.out.println("Неверный формат пола, введите f или m");
                return;
            }
            String fileName = lastName + ".txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                writer.write(format("{0} {1} {2} {3} {4} {5}", lastName, firstName, middleName, dateOfBirth, PhoneNumber.toString(), sex));
                writer.newLine();
                System.out.println("Файл " + fileName + " записан");
            } catch (IOException e) {
                System.out.println("Ошибка записи");
            }
        }
    }
}
