package org.geekbrains.JAVA.HW.OOP.CheckPoint.model;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private List<Note> notes = new ArrayList<>();

    public void add(Note note) {
        notes.add(note);
    }

    public void remove(Note note) {
        notes.remove(note);
    }

    public List<Note> getNotes() {
        return notes;
    }

    public List<Note> getNotesForDay(LocalDateTime dateTime) {
        List<Note> result = new ArrayList<>();
        for (Note note : notes) {
            if (note.getDateTime().toLocalDate().equals(dateTime.toLocalDate())) {
                result.add(note);
            }
        }
        return result;
//        return notes.stream().filter(note -> note.getDateTime().toLocalDate().isEqual(dateTime.toLocalDate())); //красивое решение одной строкой - вернули отфильтрованный лист
    }

    public List<Note> getNotesForWeek(LocalDateTime startOfWeek) {
        List<Note> result = new ArrayList<>();
        LocalDateTime endOfWeek = startOfWeek.plusWeeks(1);
        for (Note note : notes) {
            if (note.getDateTime().toLocalDate().isAfter(startOfWeek.toLocalDate()) && note.getDateTime().toLocalDate().isBefore(endOfWeek.toLocalDate())) {
                result.add(note);
            }
        }
        return result;
//        return notes.stream()
//                .filter(note ->
//                        !note.getDateTime().isBefore(startOfWeek) &&
//                                !note.getDateTime().isAfter(endOfWeek))
//                .sorted(Comparator.comparing(Note::getDateTime))
//                .collect(Collectors.toList());
    }

    public void saveToFile(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Note note : notes) {
                writer.write(note.toString());
                writer.newLine();
            }
        }
    }

    public void loadFromFile(String fileName) throws IOException {
        notes.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(": ", 2); //размер массива не больше 2
                LocalDateTime dateTime = LocalDateTime.parse(parts[0]);
                String description = parts[1];
                notes.add(new Note(dateTime, description));
            }
        }
    }
}

