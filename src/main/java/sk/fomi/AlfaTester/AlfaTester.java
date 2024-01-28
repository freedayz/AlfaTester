package sk.fomi.AlfaTester;

import sk.fomi.AlfaTester.obrazovky.BaseObrazovka;

public class AlfaTester {

    private static AlfaTester instance;

    private AlfaTester() {}

    public static AlfaTester getInstance() {
        if (instance == null) {
            instance = new AlfaTester();
        }

        return instance;
    }

    public AlfaTester test(BaseObrazovka... objects) {
        try {
            for (BaseObrazovka o : objects) {
                o.test();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return this;
    }
}
