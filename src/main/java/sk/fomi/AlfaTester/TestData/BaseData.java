package sk.fomi.AlfaTester.TestData;

import java.util.HashMap;

public abstract class BaseData {

    private HashMap<String,String[]> values;

    public BaseData() {
        this.values = new HashMap<>();
    }

    private HashMap<String,String[]> getValues() {
        return values;
    }

    public void appendValues(String datasetName, String[] objects) {
        values.put(datasetName, objects);
    }

    public String[] getDataset(String datasetKey) {
        return getValues().get(datasetKey);
    }
}
