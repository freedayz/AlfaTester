package sk.fomi.AlfaTester.Obrazovky.SpravaCisel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sk.fomi.AlfaTester.Obrazovky.BaseObrazovka;
import sk.fomi.AlfaTester.TestData.CislovaciPlanData;
import sk.fomi.AlfaTester.TestData.TestData;

import java.util.ArrayList;

public class CislovaciPlanCreate extends BaseObrazovka {
    private final String url = primaryUrl + "/sprava-cisel/cislovaci-plan";

    public CislovaciPlanCreate(WebDriver driver) {
        super(driver);
    }

    @Override
    public void test() throws InterruptedException {
        ArrayList<String> testData = TestData.getInstance().generate(
                new CislovaciPlanData()
        );

        Thread.sleep(redirectWaitTimeout);
        localDriver.get(url);

        fluentFindElement(
                By.xpath("//*[@id=\"right\"]/div/app-entry/div[3]" +
                "/div/app-table/div[1]/alf-button/button")
        ).click();

        fluentFindElement(
                By.xpath("/html/body/ngb-modal-window/div/div/app-create-modal/alf-modal" +
                        "/div/div[2]/div/form/div[1]/div/alf-input-string/div/input")
        ).sendKeys(testData.get(0));

        fluentFindElement(
                By.xpath("/html/body/ngb-modal-window/div/div/app-create-modal/alf-modal" +
                        "/div/div[2]/div/form/div[2]/div[1]/alf-datetime-picker/div/div" +
                        "/app-date-picker/div/input")
        ).sendKeys(testData.get(1));

        fluentFindElement(
                By.xpath("/html/body/ngb-modal-window/div/div/app-create-modal/alf-modal" +
                        "/div/div[2]/div/form/div[2]/div[2]/alf-datetime-picker" +
                        "/div/div/app-date-picker/div/input")
        ).sendKeys(testData.get(2));
    }
}
