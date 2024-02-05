package sk.fomi.AlfaTester.Obrazovky.sps_int.PostovePodniky;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import sk.fomi.AlfaTester.Obrazovky.BaseObrazovka;

public class KonanieUdeleniePostovejLicencie extends BaseObrazovka {

    public KonanieUdeleniePostovejLicencie(WebDriver driver) {
        super(driver);
    }

    @Override
    public void test() throws InterruptedException {
        Thread.sleep(redirectWaitTimeout);

        getElement(By.xpath("/html/body/app-root/div[1]/spisova-sluzba-ml-header" +
                "/div/div/div/div[2]/div/div[1]/alf-button/button"))
                .click();

        Thread.sleep(1500);

        Select typKonania = new Select(getElement(By.id("stavKonaniaEnum")));
        typKonania.selectByValue("13: VYZVA_NA_PREDKLADANIE_ZIADOSTI_O_UDELENIE_PL");

        getElement(By.xpath("/html/body/ngb-modal-window/div/div/app-create" +
                "/alf-modal/div/div[3]/div/alf-button[2]/button"))
                .click();

        getElement(By.xpath("/html/body/ngb-modal-window/div/div/app-create/alf-modal/div" +
                "/div[2]/div/div/div[2]/app-vyber-subjektu-table" +
                "/app-vyber-subjektu-filter/alf-filter/div/div/div[1]" +
                "/div[2]/p/a"))
                .click();

        getElement(By.name("obchodnyNazov")).sendKeys("Identita");
        getElement(By.xpath("/html/body/ngb-modal-window/div/div/app-create" +
                "/alf-modal/div/div[2]/div/div/div[2]/app-vyber-subjektu-table" +
                "/app-vyber-subjektu-filter/alf-filter/div/div/div[2]" +
                "/div/alf-button/button"))
                .click();

        getElement(By.xpath("/html/body/ngb-modal-window/div/div" +
                "/app-create/alf-modal/div/div[2]/div/div/div[2]/app-vyber-subjektu-table" +
                "/div/alf-data-table/div/div[1]/table/tbody/tr/td[1]/div/alf-checkbox" +
                "/div/div/div/input"))
                .click();

        getElement(By.xpath("/html/body/ngb-modal-window/div/div" +
                "/app-create/alf-modal/div/div[3]/div/alf-button[2]/button"))
                .click();

        getElement(By.id("radio_1_")).click();
        getElement(By.id("spisNazov")).sendKeys("Ziadost o udelenie PL Identita");
        Select registraturnyPlan = new Select(getElement(By.id("registraturnyPlanEnum$key")));

        registraturnyPlan.selectByValue("3: CD");

        getElement(By.xpath("/html/body/ngb-modal-window/div/div/app-create" +
                "/alf-modal/div/div[3]/div/alf-button[2]/button"))
                .click();
    }
}
