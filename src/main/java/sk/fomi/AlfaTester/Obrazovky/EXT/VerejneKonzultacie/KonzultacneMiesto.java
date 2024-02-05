package sk.fomi.AlfaTester.Obrazovky.EXT.VerejneKonzultacie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import sk.fomi.AlfaTester.Obrazovky.BaseObrazovka;

public class KonzultacneMiesto extends BaseObrazovka {

    private final String url = "https://dev.alfabase.sk/sps_ext/konzultacne-miesto";

    public KonzultacneMiesto(WebDriver driver) {
        super(driver);
    }

    @Override
    public void test() throws InterruptedException {
        Thread.sleep(redirectWaitTimeout);
        localDriver.get(url);

        getElement(By.xpath("//*[@id=\"container\"]/div/app-entry/div[2]/div/app-table" +
                "/div[2]/alf-data-table/div/div[1]/table/tbody/tr[1]/td[6]/span/alf-button/button"))
                .click();

        Thread.sleep(2500);

        Select odosielatelTyp = new Select(getElement(By.id("odosielatelTyp")));

        odosielatelTyp.selectByIndex(0);

        getElement(By.id("odosielatelEmail")).sendKeys("test@testing.com");
        getElement(By.xpath("/html/body/app-root/div/div/app-create-pripomienka" +
                "/div/div[6]/div[1]/alf-autocomplete/div/div" +
                "/alf-input-string/div/input")).sendKeys("Sloven");
        getElement(By.xpath("/html/body/app-root/div/div/app-create-pripomienka" +
                "/div/div[6]/div[1]/alf-autocomplete/div/ul/li[1]")).click();
        getElement(By.id("odosieltelKrajdisplayName")).sendKeys("Presovsky");
        getElement(By.id("odosieltelOkresdisplayName")).sendKeys("Snina");
        getElement(By.id("odosielatelObecdisplayName")).sendKeys("Snina");
        getElement(By.id("odosielatelUlicadisplayName")).sendKeys("Jesenskeho");
        getElement(By.id("odosielatelPsc")).sendKeys("06901");
        getElement(By.id("odosielatelSupisneCislo")).sendKeys("1692");
        getElement(By.id("predmet")).sendKeys("Test");
        getElement(By.id("text")).sendKeys("Test test test");


        getElement(By.xpath("/html/body/app-root/div/div/app-create-pripomienka" +
                "/div/div[13]/alf-button/button"))
                .click();

    }
}
