package sk.fomi.AlfaTester.Obrazovky.VerejneKonzultacie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sk.fomi.AlfaTester.Obrazovky.BaseObrazovka;

public class NarodneKonzultacieCreate extends BaseObrazovka {
    private final String url = primaryUrl + "/verejne-konzultacie/narodne-verejne-konzultacie";

    public NarodneKonzultacieCreate(WebDriver driver) {
        super(driver);
    }

    @Override
    public void test() throws InterruptedException {
        Thread.sleep(redirectWaitTimeout);
        localDriver.get(url);

        fluentFindElement(By.xpath("//*[@id=\"right\"]/div/app-entry/div[2]" +
                "/div/div[2]/div/div/alf-button/button"))
                .click();

        fluentFindElement(By.xpath("/html/body/ngb-modal-window/div/div/app-create" +
                "/alf-modal/div/div[2]/div/div[1]/div/alf-input-text/div/textarea"))
                .sendKeys("Test");

        fluentFindElement(By.xpath("/html/body/ngb-modal-window/div/div" +
                "/app-create/alf-modal/div/div[3]/div/alf-button[2]/button"))
                .click();
        Thread.sleep(redirectWaitTimeout);
    }

    private void testSubchild() throws InterruptedException {
        Thread.sleep(redirectWaitTimeout);

        fluentFindElement(By.xpath("//*[@id=\"right\"]/div/app-detail/div/div[1]" +
                "/div[3]/div/app-tabs/div/div/div/app-tab[1]/div/div/div[3]" +
                "/div/div/div/alf-button/button"))
                .click();

        fluentFindElement(By.xpath("/html/body/ngb-modal-window/div/div/app-create/alf-modal" +
                "/div/div[2]/div/div[1]/div/alf-input-text/div/textarea"))
                .sendKeys("Test");

        fluentFindElement(By.name("cisloKonaniaCircabc"))
                .sendKeys("123456");

        fluentFindElement(By.name("cisloKonaniaCloudEk"))
                .sendKeys("654321");

        Thread.sleep(redirectWaitTimeout);

        fluentFindElement(By.xpath("/html/body/ngb-modal-window/div/div" +
                "/app-create/alf-modal/div/div[3]/div/alf-button[2]/button"))
                .click();
        Thread.sleep(redirectWaitTimeout);

        localDriver.navigate().back();
    }

    public void subchildsCreate(int n) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            testSubchild();
        }
    }
}
