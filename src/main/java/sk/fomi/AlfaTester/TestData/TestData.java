package sk.fomi.AlfaTester.TestData;

import sk.fomi.AlfaTester.ObrazovkyEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class TestData {
    private final Random randomEngine = new Random();
    private HashMap<ObrazovkyEnum, ArrayList<String>> dataStruct;
    private static TestData instance;

    private TestData() {
        fillStructure();
    }

    private void fillStructure() {
        this.dataStruct = new HashMap<>();
        for (ObrazovkyEnum e : ObrazovkyEnum.values()) {
            dataStruct.put(e,new ArrayList<>());
        }
    }

    public static TestData getInstance() {
        return (instance == null) ? new TestData() : instance;
    }

    public ArrayList<String> generate(Sablona s) {
        return s.fillData(randomEngine);
    }
}
