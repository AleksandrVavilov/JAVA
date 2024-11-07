package org.geekbrains.JAVA.lection.lec4.Ex002Phonebook.UI;

public class NewConsoleView extends ConsoleView {

    public NewConsoleView() {
        super();
    }

    @Override
    public void setDescription(String value) {
        super.setDescription(value);
        System.out.println();
    }

}
