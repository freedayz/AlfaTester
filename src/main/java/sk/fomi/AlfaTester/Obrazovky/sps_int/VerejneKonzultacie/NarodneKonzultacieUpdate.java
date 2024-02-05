package sk.fomi.AlfaTester.Obrazovky.sps_int.VerejneKonzultacie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sk.fomi.AlfaTester.Obrazovky.BaseObrazovka;
import sk.fomi.AlfaTester.TestData.RandomDataEngine;

public class NarodneKonzultacieUpdate extends BaseObrazovka {

    public NarodneKonzultacieUpdate(WebDriver driver) {
        super(driver);
    }

    @Override
    public void test() throws InterruptedException {
        Thread.sleep(redirectWaitTimeout);

        getElement(By.xpath("/html/body/app-root/div[2]/div[2]/div" +
                "/app-detail/div/div[1]/div[3]/div/div[2]/alf-button/button"))
                .click();

        Thread.sleep(1500);

        getElement(By.xpath("/html/body/ngb-modal-window/div/div/app-edit/alf-modal" +
                "/div/div[2]/div/div[2]/div[2]/alf-datetime-picker/div/div/app-date-time-picker/div/input"))
                .sendKeys(RandomDataEngine.getInstance().getDate().getDatumOd());

        getElement(By.xpath("/html/body/ngb-modal-window/div/div/app-edit" +
                "/alf-modal/div/div[3]/div/alf-button[2]/button"))
                .click();
    }
}
