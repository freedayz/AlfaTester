package sk.fomi;

import sk.fomi.AlfaTester.AlfaTester;

public class Main {

    public static final int waitTimeout = 6000;

    public static void main(String[] args) throws InterruptedException {

        AlfaTester.testLogin();
        AlfaTester.testPracovneCestyCreate();

    }
}