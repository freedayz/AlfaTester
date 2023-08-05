package sk.fomi.AlfaTester.Obrazovky.Vseobecne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sk.fomi.AlfaTester.Obrazovky.BaseObrazovka;

public class Login extends BaseObrazovka {
    private final String url = "https://dev.alfabase.sk/sps_int/";

    public Login(WebDriver driver) {
        super(driver);
    }

    @Override
    public void test() throws InterruptedException {
        localDriver.get(url);

        fluentFindElement(By.xpath("/html/body/app-root/spisova-sluzba-ml-header" +
                "/header/div/div[2]/div/div/div[3]/div/div/div/button")
        ).click();

        fluentFindElement(By.id("username"))
                .sendKeys("juan.gonzales");

        fluentFindElement(By.id("password"))
                .sendKeys("spsext123");

        fluentFindElement(By.id("kc-login"))
                .submit();
    }
}
