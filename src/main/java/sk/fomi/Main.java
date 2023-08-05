package sk.fomi;

import sk.fomi.AlfaTester.AlfaTester;

public class Main {

    public static void main(String[] args) {

        AlfaTester.testLogin();
        AlfaTester.testPracovneCestyCreate();
        for (int i = 0; i < 12; i++) {
            AlfaTester.testCislovaciPlanCreate();
        }
        AlfaTester.testFrekvencneListyCreate();
    }
}