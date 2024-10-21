package org.geekbrains.JAVA.OOP.sem1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class sem1 {
    public static void main(String[] args) {
        Product product = new Product("Бутылка", 110.5);
        Product product1 = new Product("Бутылка1", 110);
        Product product2 = new Product("Бутылка2", 1);

        ArrayList<Product> products = new ArrayList<>();
        Dispensing_machine machine = new Dispensing_machine(products);
        machine.add_product(product);
        machine.add_product(product1);
        machine.add_product(product2);
        System.out.println(products);
        machine.delete_product(product2.getName());
        System.out.println(products);
    }

}
