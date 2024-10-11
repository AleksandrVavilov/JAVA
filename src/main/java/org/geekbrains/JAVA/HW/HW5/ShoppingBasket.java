package org.geekbrains.JAVA.HW.HW5;
/*
Подсчет продуктов в корзине
Создайте программу для учета продуктов в корзине. Программа должна
позволять добавлять, удалять, обновлять количество продуктов, а также
проверять наличие продуктов в корзине. Используйте HashMap для хранения
продуктов и их количества.
Методы:
● addProduct(String product, Integer quantity): Добавляет
продукт с указанным количеством в корзину. Если продукт уже есть,
увеличивает его количество.
● removeProduct(String product): Удаляет продукт из корзины. Если
продукт отсутствует, ничего не делает.
● updateQuantity(String product, Integer quantity): Обновляет
количество продукта в корзине. Если продукта нет, ничего не делает.
● checkProduct(String product): Проверяет, есть ли продукт в
корзине и возвращает его количество. Если продукта нет, возвращает 0.
● showBasket(): Выводит все продукты и их количество в корзине
 */

import java.util.HashMap;

public class ShoppingBasket {
    public void main(String[] args) {
        addProduct("fish", 2);
        addProduct("milk", 3);
        addProduct("apple", 5);
        addProduct("banana", 7);
        System.out.println(showBasket());
        addProduct("fish", 2);
        addProduct("pork", 8);
        System.out.println(showBasket());
        removeProduct("banana");
        removeProduct("banan");
        System.out.println(showBasket());
        updateQuantity("apple", 9);
        updateQuantity("banana", 9);
        System.out.println(showBasket());
        System.out.println(checkProduct("fish"));
        System.out.println(checkProduct("banana"));

    }

    private HashMap<String, Integer> basket = new HashMap<>();

    public void addProduct(String product, Integer quantity) {
        basket.computeIfPresent(product, (k, v) -> v + quantity);
        basket.putIfAbsent(product, quantity);

    }

    public void removeProduct(String product) {
        basket.remove(product);
    }

    public void updateQuantity(String product, Integer quantity) {
        basket.computeIfPresent(product, (k, v) -> quantity);
    }

    public Integer checkProduct(String product) {
        return basket.getOrDefault(product, 0);
    }

    public HashMap<String, Integer> showBasket() {
        return basket;
    }
}
