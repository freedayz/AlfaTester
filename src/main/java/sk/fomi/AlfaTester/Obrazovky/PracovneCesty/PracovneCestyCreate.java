package sk.fomi.AlfaTester.Obrazovky.PracovneCesty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import sk.fomi.AlfaTester.Obrazovky.BaseObrazovka;

public class PracovneCestyCreate extends BaseObrazovka {
    private final String url = "https://dev.alfabase.sk/sps_int/pracovne-cesty/pracovne-cesty";

    public PracovneCestyCreate(WebDriver driver) {
        super(driver);
    }

    @Override
    public void test() throws InterruptedException {
        Thread.sleep(redirectWaitTimeout);
        localDriver.get(url);

        fluentFindElement(By.xpath("//*[@id=\"right\"]/div/app-entry" +
                "/div[3]/div/app-table/div[1]/div/div[2]/div/alf-button/button")
        ).click();

        (new Select(fluentFindElement(By.id("ucelCestyEnum$value"))))
                .selectByValue("3: KONFERENCIA");

        fluentFindElement(By.xpath("//*[@id=\"right\"]/div/app-create/div[3]/div[2]" +
                "/alf-datetime-picker/div/div/app-date-time-picker/div/input")
        ).sendKeys("10.08.2023 0:00:00");

        fluentFindElement(By.xpath("//*[@id=\"right\"]/div/app-create/div[3]/div[3]" +
                "/alf-datetime-picker/div/div/app-date-time-picker/div/input")
        ).sendKeys("12.08.2023 0:00:00");

        fluentFindElement(By.id("miestoKonania"))
                .sendKeys("Vieden");

        (new Select(fluentFindElement(By.id("statKonania"))))
                .selectByValue("139: 139");

        fluentFindElement(By.id("dopravaTam"))
                .click();

        fluentFindElement(By.id("informacieODoprave"))
                .sendKeys("Autobus");

        fluentFindElement(By.id("pouzivatelId-1displayName"))
                .sendKeys("meno_priezvisko");
    }
}
