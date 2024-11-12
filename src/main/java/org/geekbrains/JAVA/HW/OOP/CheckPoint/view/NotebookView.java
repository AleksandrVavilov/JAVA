package org.geekbrains.JAVA.HW.OOP.CheckPoint.view;

import org.geekbrains.JAVA.HW.OOP.CheckPoint.model.Note;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface NotebookView {
    void showNotes(List<Note> notes);

    void showMessage(String message);

    LocalDateTime getDateTimeInput();

    LocalDate getDateInput();

    String getDescriptionInput();

    String getFileNameInput();

    String getUserInput();
}
