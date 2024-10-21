package org.geekbrains.JAVA.HW.API.HW5;
/*
Реализуйте программу для хранения и анализа историй посещений веб-сайтов.
Используйте Deque для хранения истории.
● visitSite(String site): Добавляет сайт в историю посещений.
● back(int steps): Возвращает название сайта, который был посещен
steps назад, или null, если таких шагов нет.
● getHistory(): Возвращает список сайтов в истории посещений, от
последнего посещенного к первому.
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    public void main(String[] args) {
        visitSite("www.leningrad");
        visitSite("www.ru");
        visitSite("www.leningrad");
        visitSite("www.ru");
        System.out.println(getHistory());
        System.out.println(back(2));

    }

    Deque<String> history = new ArrayDeque<>();

    public void visitSite(String site) {
        history.addFirst(site);
    }

    public String back(int steps) {
        if (steps >= history.size()) {
            return null;
        }
        return history.stream().skip(steps).findFirst().orElse(null); //создали поток из декью, пропустили в потоке количество шагов, вернули первый(после пропуска)
    }

    public Deque<String> getHistory() {
        return history;
    }
}

