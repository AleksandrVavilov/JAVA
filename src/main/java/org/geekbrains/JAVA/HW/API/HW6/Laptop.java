package org.geekbrains.JAVA.HW.API.HW6;

import org.geekbrains.JAVA.API.sem6.Goods;

import java.time.LocalDateTime;
import java.util.Objects;

public class Laptop extends Goods {
    public String color;
    public String os;
    public int capacityHDD;
    public int amountRAM;

    public String getColor() {
        return color;
    }

    public String getOs() {
        return os;
    }

    public int getCapacityHDD() {
        return capacityHDD;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public Laptop(double price, String vendorCode, LocalDateTime creationDate, int guarantee, String color, String os, int capacityHDD, int amountRAM) {
        super(price, vendorCode, creationDate, guarantee);
        this.color = color;
        this.os = os;
        this.capacityHDD = capacityHDD;
        this.amountRAM = amountRAM;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return capacityHDD == laptop.capacityHDD && amountRAM == laptop.amountRAM && Objects.equals(color, laptop.color) && Objects.equals(os, laptop.os);
    }

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() + "{" +
                "price=" + price + " RUB" + '\'' +
                ", color=" + color + '\'' +
                ", os='" + os + '\'' +
                ", capacityHDD=" + capacityHDD + " GB" +
                ", amountRAM=" + amountRAM + " GB" +
                ", guarantee=" + guarantee + " year" +
                '}';
    }
}
