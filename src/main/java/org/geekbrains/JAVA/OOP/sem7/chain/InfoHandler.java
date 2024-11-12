package org.geekbrains.JAVA.OOP.sem7.chain;

public class InfoHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("INFO")) {
            System.out.println("InfoHandler: Handling INFO request.");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}