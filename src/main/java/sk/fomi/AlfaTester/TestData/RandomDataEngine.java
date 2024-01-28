package sk.fomi.AlfaTester.TestData;

import sk.fomi.AlfaTester.modely.DateModel;

import java.time.LocalDate;
import java.util.Random;

public class RandomDataEngine {

    private Random randomEngine;
    private static RandomDataEngine instance;
    private BaseData dataset;

    private RandomDataEngine() {
        this.randomEngine = new Random();
    }

    public static RandomDataEngine getInstance() {
        if (instance == null) {
            instance = new RandomDataEngine();
        }

        return instance;
    }

    public RandomDataEngine useDataset(BaseData dataset) {
        this.dataset = dataset;

        return this;
    }

    public String getString(String fieldName) {
        String[] data = dataset.getDataset(fieldName);
        int randomPosition = randomEngine.nextInt(0,data.length);

        return data[randomPosition];
    }

    public DateModel getDate() {
        int dateTo = randomEngine.nextInt(2,30);
        int dateFrom = randomEngine.nextInt(1,dateTo);

        return new DateModel(
                (LocalDate.parse(
                                LocalDate.now().toString())
                        .plusDays(dateFrom)).toString()
                ,
                (LocalDate.parse(
                                LocalDate.now().toString())
                        .plusDays(dateTo)).toString()
        );
    }

}
