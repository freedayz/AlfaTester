package sk.fomi.AlfaTester.Obrazovky.sps_int.VerejneKonzultacie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import sk.fomi.AlfaTester.Obrazovky.BaseObrazovka;

public class NarodneKonzultacieDokumenty extends BaseObrazovka {

    public NarodneKonzultacieDokumenty(WebDriver driver) {
        super(driver);
    }

    @Override
    public void test() throws InterruptedException {
        Thread.sleep(redirectWaitTimeout);

        getElement(By.xpath("/html/body/app-root/div[2]/div[2]/div/app-detail" +
                "/div/div[1]/div[4]/div/app-tabs/div/div/ul/li[2]/a"))
                .click();

        Thread.sleep(2200);

        getElement(By.xpath("/html/body/app-root/div[2]/div[2]/div/app-detail" +
                "/div/div[1]/div[4]/div/app-tabs/div/div/div/app-tab[2]/" +
                "/app-dokumenty-konzultacie-table/div/div[1]/alf-button/button"))
                .click();

        Thread.sleep(1500);

        Select dokumentType = new Select(getElement(By.xpath("/html/body/ngb-modal-window" +
                "/div/div/app-create/alf-modal" +
                "/div/div[2]/div/div[1]/app-create-document-form" +
                "/div[2]/div[1]/alf-drop-down-list/div/div/select")));

        dokumentType.selectByIndex(1);

        getElement(By.id("druhDokumentuKonzultacie"))
                .click();

        getElement(By.id("zverejneny"))
                .click();

        getElement(By.xpath("/html/body/ngb-modal-window/div/div/app-create/alf-modal/div" +
                "/div[2]/div/div[1]/app-create-document-form/div[2]/div[4]/alf-input-file/div/input"))
                .sendKeys("C:\\Users\\Ondrej\\Desktop\\testFile.pdf");

        getElement(By.xpath("/html/body/ngb-modal-window/div/div/app-create" +
                "/alf-modal/div/div[2]/div/div[1]/app-create-document-form/div[2]/alf-button/button"))
                .click();

        dokumentType.selectByIndex(1);

        getElement(By.id("druhDokumentuKonzultacie"))
                .click();

        getElement(By.id("zverejneny"))
                .click();

        getElement(By.xpath("/html/body/ngb-modal-window/div/div/app-create/alf-modal/div" +
                "/div[2]/div/div[1]/app-create-document-form/div[2]/div[4]/alf-input-file/div/input"))
                .sendKeys("C:\\Users\\Ondrej\\Desktop\\testFile.pdf");

        getElement(By.xpath("/html/body/ngb-modal-window/div/div/app-create" +
                "/alf-modal/div/div[2]/div/div[1]/app-create-document-form/div[2]/alf-button/button"))
                .click();

        getElement(By.xpath("/html/body/ngb-modal-window/div/div/app-create" +
                "/alf-modal/div/div[3]/div/alf-button[2]/button"))
                .click();
    }
}
