package sk.fomi.AlfaTester.Obrazovky.Vseobecne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sk.fomi.AlfaTester.Obrazovky.BaseObrazovka;

public class Login extends BaseObrazovka {

    public Login(WebDriver driver) {
        super(driver);
    }

    @Override
    public void test() throws InterruptedException {
        localDriver.get(primaryUrl);

        fluentFindElement(By.xpath("/html/body/app-root/div[1]" +
                "/spisova-sluzba-ml-header/div/div/div/div[2]/button")
        ).click();

        fluentFindElement(By.id("username"))
                .sendKeys("juan.gonzales");

        fluentFindElement(By.id("password"))
                .sendKeys("spsext123");

        fluentFindElement(By.id("kc-login"))
                .submit();
    }
}
