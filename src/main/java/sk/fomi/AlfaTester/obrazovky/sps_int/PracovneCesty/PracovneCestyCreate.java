package sk.fomi.AlfaTester.obrazovky.sps_int.PracovneCesty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import sk.fomi.AlfaTester.obrazovky.BaseObrazovka;

public class PracovneCestyCreate extends BaseObrazovka {
    private final String url = primaryUrl + "/pracovne-cesty/pracovne-cesty";

    public PracovneCestyCreate(WebDriver driver) {
        super(driver);
    }

    @Override
    public void test() throws InterruptedException {
        Thread.sleep(redirectWaitTimeout);
        localDriver.get(url);

        getElement(By.xpath("//*[@id=\"right\"]/div/app-entry" +
                "/div[3]/div/app-table/div[1]/div/div[2]/div/alf-button/button")
        ).click();

        (new Select(getElement(By.id("ucelCestyEnum$value"))))
                .selectByValue("3: KONFERENCIA");

        getElement(By.xpath("//*[@id=\"right\"]/div/app-create/div[3]/div[2]" +
                "/alf-datetime-picker/div/div/app-date-time-picker/div/input")
        ).sendKeys("10.08.2023 0:00:00");

        getElement(By.xpath("//*[@id=\"right\"]/div/app-create/div[3]/div[3]" +
                "/alf-datetime-picker/div/div/app-date-time-picker/div/input")
        ).sendKeys("12.08.2023 0:00:00");

        getElement(By.id("miestoKonania"))
                .sendKeys("Vieden");

        (new Select(getElement(By.id("statKonania"))))
                .selectByValue("139: 139");

        getElement(By.id("dopravaTam"))
                .click();

        getElement(By.id("informacieODoprave"))
                .sendKeys("Autobus");

        getElement(By.id("pouzivatelId-1displayName"))
                .sendKeys("meno_priezvisko");

        Actions action = new Actions(localDriver);
        WebElement submit = getElement(By.xpath("/html/body/app-root/div/div[2]/div/app-create/div[2]" +
                "/div/div[2]/div/div/alf-button[3]/button"));
        action.doubleClick(submit).build().perform();


        Thread.sleep(redirectWaitTimeout + 2000);
    }
}
