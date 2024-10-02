package org.geekbrains.JAVA.lection.lec2;

import java.io.File;

public class DirWork {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir"); // получение пути корневой папки
        File dir = new File(pathProject); //создали объект с директорией
        // если объект представляет каталог
        if (dir.isDirectory()) {
            // получаем все вложенные объекты в каталоге
            for (File item : dir.listFiles()) {

                if (item.isDirectory()) { //если объекты это директории

                    System.out.println(item.getName() + "  \t folder"); //печатаем названия папок
                    for (File item1 : item.listFiles()) {
                        if (item1.isDirectory()) { //если объекты это директории
                            System.out.println("\t\t" + item1.getName() + "  \t folder"); //печатаем названия папок
                        } else {

                            System.out.println("\t\t" + item1.getName() + "\t file"); // печатаем названия файлов
                        }
                    }
                } else {
                    System.out.println(item.getName() + "\t file"); // печатаем названия файлов
                }

            }
        }

        // определяем объект для каталога
        File dir1 = new File(pathProject + "/newdir");
        System.out.println(dir1);
        boolean created = dir1.mkdir(); //mkdir создает только одну директорию, mkdirs может создать все недостающие по пути директории
        if (created)
            System.out.println(dir1.getAbsolutePath() + " Folder has been created");
        // переименуем каталог
        File newDir = new File(pathProject + "/newdir1");
        dir1.renameTo(newDir);
        // удалим каталог
        boolean deleted = newDir.delete();
        if (deleted)
            System.out.println("Folder has been deleted");
    }

}
