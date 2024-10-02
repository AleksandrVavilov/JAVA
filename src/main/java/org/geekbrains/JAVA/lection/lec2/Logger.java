package org.geekbrains.JAVA.lection.lec2;

import java.io.IOException;
import java.util.logging.*;

public class Logger {
    public static void main(String[] args) throws IOException {

        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Logger.class.getName()); //создали логер и указали клас для которого будем использвоать(в скобках)
        ConsoleHandler ch = new ConsoleHandler(); //консоль хэндлер - для записи в консоль
//        FileHandler fh = new FileHandler("log.txt"); //файл хэндлер для записи в файл
        logger.addHandler(ch);
//        logger.addHandler(fh); //Добавляем хэндлер к нашему логеру

        SimpleFormatter sFormat = new SimpleFormatter(); //указываем тип формата вывода сообщения
        //XMLFormatter xml = new XMLFormatter();
        ch.setFormatter(sFormat); // передаем как аргумент формата в консоль хэндлер
        //fh.setFormatter(xml);

        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");

    }
}


