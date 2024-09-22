package org.geekbrains.HW;

/*Дана строка sql-запроса:

select * from students where "
Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже. Если значение null, то параметр не должен попадать в запрос.

Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:

String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами

Пример: Строка sql-запроса:

select * from students where
Параметры для фильтрации:

        {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Результат:

select * from students where name='Ivanov' and country='Russia' and city='Moscow'*/

public class HW4 {
    public static void main(String[] args) {
        // Напишите свое решение ниже
        String QUERY = "";
        String PARAMS = "";
        QUERY = "select * from students where ";
        PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        StringBuilder result = new StringBuilder();
        PARAMS = PARAMS.replaceAll("}", "")
                .replaceAll("\\{", "")
                .replaceAll("\"", "");
        String[] PARAMS1 = PARAMS.split(",");
        for (String entry : PARAMS1) { //cоздали строку entry для каждого из эл массива PARAMS1
            String[] param = entry.split(":"); //создали массив строк из вложенных строк в PARAMS1
            String name = param[0].trim(); //чистим от пробелов в начале и конце строки
            String value = param[1].trim();
            if (!value.equalsIgnoreCase("null")) { //если значение не равно null
                if (!result.toString().isEmpty()) //проверка на НЕ пустоту строки, изначально она пуста
                    result.append(" and ");
                result.append(name).append("='").append(value).append("'");
            }
        }
        result.insert(0, QUERY); //Добавили QUERY в начало строки
//        return result;
        System.out.println(result);
    }
}