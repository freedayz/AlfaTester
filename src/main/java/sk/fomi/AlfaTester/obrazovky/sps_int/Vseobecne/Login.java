package sk.fomi.AlfaTester.obrazovky.sps_int.Vseobecne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sk.fomi.AlfaTester.obrazovky.BaseObrazovka;

public class Login extends BaseObrazovka {

    public Login(WebDriver driver) {
        super(driver);
    }

    @Override
    public void test() throws InterruptedException {
        localDriver.get(primaryUrl);

        getElement(By.id("username"))
                .sendKeys("juan.gonzales");

        getElement(By.id("password"))
                .sendKeys("spsext123");

        getElement(By.id("kc-login"))
                .submit();
    }
}
