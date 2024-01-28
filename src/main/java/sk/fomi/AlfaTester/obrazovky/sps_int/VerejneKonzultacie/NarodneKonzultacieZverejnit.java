package sk.fomi.AlfaTester.obrazovky.sps_int.VerejneKonzultacie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sk.fomi.AlfaTester.obrazovky.BaseObrazovka;

public class NarodneKonzultacieZverejnit extends BaseObrazovka {

    public NarodneKonzultacieZverejnit(WebDriver driver) {
        super(driver);
    }

    @Override
    public void test() throws InterruptedException {
        Thread.sleep(redirectWaitTimeout);

        getElement(By.xpath("/html/body/app-root/div[2]/div[2]/div/app-detail/div" +
                "/div[1]/div[3]/div/alf-camunda-panel/div/div/div/div/alf-button"))
                .click();

        Thread.sleep(3500);

        getElement(By.xpath("/html/body/ngb-modal-window/div/div/alf-camunda-modal" +
                "/alf-user-task-generator/div/lib-zverejnit-konzultaciu/alf-modal" +
                "/div/div[3]/div/alf-button[3]/button"))
                .click();
    }
}
