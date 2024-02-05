package sk.fomi.AlfaTester.Obrazovky.sps_int.VerejneKonzultacie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sk.fomi.AlfaTester.TestData.RandomDataEngine;
import sk.fomi.AlfaTester.TestData.VerejneKonzultacie.NarodneKonzultacie.NarodneKonzultacieCreateData;
import sk.fomi.AlfaTester.Obrazovky.BaseObrazovka;

public class NarodneKonzultacieCreate extends BaseObrazovka {
    private final String url = primaryUrl + "/verejne-konzultacie/narodne-verejne-konzultacie";
    private NarodneKonzultacieCreateData dataset;

    public NarodneKonzultacieCreate(WebDriver driver) {
        super(driver);
        this.dataset = new NarodneKonzultacieCreateData();
    }


    @Override
    public void test() throws InterruptedException {
        Thread.sleep(redirectWaitTimeout);
        localDriver.get(url);

        getElement(By.xpath("//*[@id=\"right\"]/div/app-entry/div[2]" +
                "/div/div[2]/div/div/alf-button/button"))
                .click();

        getElement(By.xpath("/html/body/ngb-modal-window/div/div/app-create/alf-modal/div/div[2]" +
                "/div/div[1]/div[1]/alf-input-text/div/textarea"))
                .sendKeys(
                        RandomDataEngine.getInstance().useDataset(dataset).getString("nazov")
                );



        getElement(By.xpath("/html/body/ngb-modal-window/div/div" +
                "/app-create/alf-modal/div/div[3]/div/alf-button[2]/button"))
                .click();
        Thread.sleep(redirectWaitTimeout);
    }
}
