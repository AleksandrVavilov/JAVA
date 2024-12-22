package org.geekbrains.exceptions.HW.HW1;

//Реализуйте метод convertAndSum, который принимает массив строк, каждая
//из которых должна быть преобразована в целое число. Метод возвращает
//сумму всех чисел. Если хотя бы одна строка не может быть преобразована в
//число, метод должен выбросить исключение NumberFormatException.
//        Дополнительно, если сумма чисел превышает 100, выбрасывайте
//ArithmeticException с сообщением "Превышен лимит суммы".

public class Task1 {
    public static void main(String[] args) {
        String[] str = {"10", "20", "75"};
        try {
            System.out.println(convertAndSum(str));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int convertAndSum(String[] strings) {
        int sum = 0;

        for (int i = 0; i < strings.length; i++) {
            try {
                sum += Integer.parseInt(strings[i]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Ошибка преобразования строки в число " + strings[i]);
            }
        }
        if (sum > 100) throw new ArithmeticException("Превышен лимит суммы больше 100, сумма равна " + sum);
        return sum;
    }
}
