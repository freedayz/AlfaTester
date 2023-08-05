package sk.fomi.AlfaTester.TestData;

import sk.fomi.AlfaTester.ObrazovkyEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class TestData {
    private final Random randomEngine = new Random();
    private static TestData instance;

    private TestData() {

    }

    public static TestData getInstance() {
        instance = (instance == null) ? new TestData() : instance;
        return instance;
    }

    public ArrayList<String> generate(Sablona s) {
        return s.fillData(randomEngine);
    }
}
