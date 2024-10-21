package org.geekbrains.JAVA.OOP.sem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Dispensing_machine {
    private ArrayList<Product> products;

    public Dispensing_machine(ArrayList<Product> products) {
        this.products = products;
    }

    public void add_product(Product product) {
        this.products.add(product);
    }

    public void delete_product(String product_name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(product_name)) {
                products.remove(i);
                i--;
            }
        }
    }
    
}

