package org.geekbrains.JAVA.lection.lec4.Calc;

public class Presenter {
    View view;
    Model model;

    public Presenter(View v, Model m) {
        this.view = v;
        this.model = m;
    }

    public void buttonClick() {
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Sum: ");
    }
}
