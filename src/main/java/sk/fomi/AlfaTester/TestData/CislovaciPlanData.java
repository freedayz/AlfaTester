package sk.fomi.AlfaTester.TestData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

public class CislovaciPlanData implements Sablona {
    private final int dateMinRange = 1;
    private final int dateMaxRange = 30;

    @Override
    public ArrayList<String> fillData(Random randomEngine) {
        ArrayList<String> temp = new ArrayList<>();
        int dateTo = randomEngine.nextInt(dateMinRange+1,dateMaxRange);
        int dateFrom = randomEngine.nextInt(dateMinRange,dateTo);

        temp.add("test");
        temp.add(
                (LocalDate.parse(
                        LocalDate.now().toString())
                        .plusDays(dateFrom)).toString()
        );
        temp.add(
                (LocalDate.parse(
                        LocalDate.now().toString())
                        .plusDays(dateTo)).toString()
        );

        return temp;
    }
}
