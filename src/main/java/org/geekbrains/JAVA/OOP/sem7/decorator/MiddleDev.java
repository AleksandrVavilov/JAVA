package org.geekbrains.JAVA.OOP.sem7.decorator;

public class MiddleDev extends DeveloperDecorator {
    public MiddleDev(Developer developer) {
        super(developer);
    }

    public void makeJob() {
        codeReview();
        super.makeJob();

    }

    void codeReview() {
        System.out.println("Делаю код ревью");
    }
}
