package org.geekbrains.JAVA.HW.HW2;

public class Cleantext {
    public static void main(String[] args) {
        String text = "line1  \n  \nline2\n   \n  line3";
        System.out.println(cleantxt(text));
    }

    public static String cleantxt(String text) {
        String[] lines = text.split("\n");
        StringBuilder cleannedText = new StringBuilder();
        for (String line : lines) {
            line = line.trim();
            if (!line.trim().isEmpty()) {
                if (cleannedText.length() > 0) {
                    cleannedText.append("\n");
                }
                cleannedText.append(line);
            }

        }
        return cleannedText.toString();
    }
}
