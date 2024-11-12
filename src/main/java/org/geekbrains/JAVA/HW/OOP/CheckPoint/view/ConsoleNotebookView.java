package org.geekbrains.JAVA.HW.OOP.CheckPoint.view;

import org.geekbrains.JAVA.HW.OOP.CheckPoint.model.Note;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class ConsoleNotebookView implements NotebookView {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void showNotes(List<Note> notes) {
        if (notes.isEmpty()) {
            System.out.println("Записи не найдены!");
        } else {
            for (Note note : notes) {
                System.out.println(note);
            }
        }
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public LocalDateTime getDateTimeInput() {
        System.out.println("Введите дату в формате (гггг-мм-дд): ");
        String input1 = scanner.nextLine();
        System.out.println("Введите время в формате (чч:мм): ");
        String input2 = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        return LocalDateTime.parse(input1 + "T" + input2, formatter);
    }

    @Override
    public LocalDate getDateInput() {
        System.out.println("Введите дату в формате (гггг-мм-дд): ");
        String input1 = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        return LocalDate.parse(input1, formatter);
    }

    @Override
    public String getDescriptionInput() {
        System.out.println("Введите заметку к записи: ");
        return scanner.nextLine();
    }

    @Override
    public String getFileNameInput() {
        System.out.println("Введите имя файла: ");
        return scanner.nextLine();
    }

    @Override
    public String getUserInput() {
        System.out.println("Введите пункт: ");
        return scanner.nextLine();
    }
}
