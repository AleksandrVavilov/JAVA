package org.geekbrains.JAVA.lection.lec2;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileWork {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir"); // получение пути корневой папки
        System.out.println(pathProject);
        String pathFile = pathProject.concat("/file.txt"); //добавили к пути корневой папки имя и расширение файла
        String fileName = "file.txt";
        File f = new File(pathProject, fileName); // создали ОБЪЕКТ для файла
        System.out.println(f.getAbsolutePath()); //проверили абсолютный путь

        File myFile = new File(pathFile);
        System.out.println("File name: " + myFile.getName()); //получение имени файла
        System.out.println("Parent folder: " + myFile.getParent()); //получение родительской папки
        if (myFile.exists()) //проверка на существованеи файла
            System.out.println("File exists");
        else
            System.out.println("File not found");

        System.out.println("File size: " + myFile.length()); //проверка размера файла
        if (myFile.canRead()) //проверка на возможность чтения
            System.out.println("File can be read");
        else
            System.out.println("File can not be read");

        if (myFile.canWrite()) // проверка на возможность записи
            System.out.println("File can be written");
        else
            System.out.println("File can not be written");

        // создадим новый файл
        File newFile = new File(pathFile);
        try {
            boolean created = newFile.createNewFile(); //создание файла если получится - true
            if (created)
                System.out.println("File has been created");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(newFile.isHidden()); //проверка на скрытость
        System.out.println(newFile.length()); //длина в байтах
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        System.out.println(sdf.format(newFile.lastModified())); //время последнего изменения
        System.out.println(newFile.renameTo(newFile)); //переименование возвращает тру фолс

    }
}