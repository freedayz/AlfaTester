package sk.fomi.AlfaTester.modely;

public class DateModel {
    private String datumOd;
    private String datumDo;

    public DateModel(String datumOd, String datumDo) {
        this.datumOd = datumOd;
        this.datumDo = datumDo;
    }
    public String getDatumOd() {
        return datumOd;
    }

    public String getDatumDo() {
        return datumDo;
    }
}
