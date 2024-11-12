package org.geekbrains.JAVA.HW.OOP.CheckPoint.presenter;

import org.geekbrains.JAVA.HW.OOP.CheckPoint.model.Note;
import org.geekbrains.JAVA.HW.OOP.CheckPoint.model.Notebook;
import org.geekbrains.JAVA.HW.OOP.CheckPoint.view.Menu;
import org.geekbrains.JAVA.HW.OOP.CheckPoint.view.NotebookView;

import java.io.IOException;

public class NotebookPresenter {
    private Notebook model;
    private NotebookView view;
    boolean exit;
    private Menu menu = new Menu(this);

    public NotebookPresenter(Notebook model, NotebookView view) {
        this.model = model;
        this.view = view;
        exit = true;
    }

    public void addNote() {
        model.add(new Note(view.getDateTimeInput(), view.getDescriptionInput()));
        view.showMessage("Запись добавлена!");
    }

    public void showNotesForDay() {
        view.showNotes(model.getNotesForDay(view.getDateInput().atStartOfDay()));
    }

    public void showNotesForWeek() {
        view.showNotes(model.getNotesForWeek(view.getDateInput().atStartOfDay()));
    }

    public void saveNotes() {
        String fileName = view.getFileNameInput();
        try {
            model.saveToFile(fileName);
            view.showMessage("Запись сохранена в файл: " + fileName);
        } catch (IOException e) {
            view.showMessage("Ошибка сохранения записи: " + e.getMessage());
        }
    }

    public void loadNotes() {
        String fileName = view.getFileNameInput();
        try {
            model.loadFromFile(fileName);
            view.showMessage("Записи загружены из файла: " + fileName);
        } catch (IOException e) {
            view.showMessage("Ошибка загрузки файла: " + e.getMessage());
        }
    }

    public void start() {
        while (exit) {
            printMenu();
            execute();
        }
    }

    private void printMenu() {
        view.showMessage(menu.menu());
    }

    private void execute() {
        String line = view.getUserInput();
        if (checkTextForInt(line)) {
            int numCommand = Integer.parseInt(line);
            if (checkCommand(numCommand)) {
                menu.execute(numCommand);
            }
        }
    }

    private boolean checkCommand(int numCommand) {
        if (numCommand <= menu.getSize()) {
            return true;
        } else {
            showError();
            return false;
        }
    }

    private boolean checkTextForInt(String text) {
        if (text.matches("[0-9]+")) {
            return true;
        } else {
            showError();
            return false;
        }
    }

    public static void showError() {
        System.out.println("Неверный ввод команды! Попробуйте снова");
    }

    public void finish() {
        exit = false;
        System.out.println("Всего доброго!");
    }

}
