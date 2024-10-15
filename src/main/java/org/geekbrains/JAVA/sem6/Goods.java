package org.geekbrains.JAVA.sem6;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Goods {
    //поля класса
    protected double price;
    protected String vendorCode; //артикул
    protected LocalDateTime creationDate;
    protected int guarantee;
    private List<Integer> groups;

    public Goods(double price, String vendorCode, LocalDateTime creationDate, int guarantee) {
        this.price = price;
        this.vendorCode = vendorCode;
        this.creationDate = creationDate;
        this.guarantee = guarantee;
        this.groups = new ArrayList<>();
    }

    public List<Integer> getGroups() {
        return new ArrayList<>(groups);
    }

    public void addGroup(int group) {
        this.groups.add(group);
    }

    //поля класса еще называют состояние объекта
    //поведением объекта называют все его методы
//protected -все наследники видят, private - только внутри класса, public -везде, если не указывать то по умолчанию package-private(только внутри папки которой лежит)
    public String getGoodType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return getGoodType() + "{" +
                "price=" + price +
                ", vendorCode='" + vendorCode + '\'' +
                ", creationDate=" + creationDate +
                ", guarantee=" + guarantee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods good = (Goods) o;
        return Double.compare(price, good.price) == 0 && guarantee == good.guarantee && Objects.equals(vendorCode, good.vendorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, vendorCode, guarantee);
    }
}
