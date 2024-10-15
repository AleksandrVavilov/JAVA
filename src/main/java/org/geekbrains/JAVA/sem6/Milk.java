package org.geekbrains.JAVA.sem6;

import java.time.LocalDateTime;

public class Milk extends Goods {
    public String color;

    public Milk(double price, String vendorCode, LocalDateTime creationDate, int guarantee, String color) {
        super(price, vendorCode, creationDate, guarantee);
        this.color = color;
    }
}

