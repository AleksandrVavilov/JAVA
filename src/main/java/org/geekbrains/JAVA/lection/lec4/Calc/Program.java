package org.geekbrains.JAVA.lection.lec4.Calc;

public class Program {
    public static void main(String[] args) {
        var m = new SumModel();
        var v = new View();
        Presenter p = new Presenter(v, m);
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
    }
}
