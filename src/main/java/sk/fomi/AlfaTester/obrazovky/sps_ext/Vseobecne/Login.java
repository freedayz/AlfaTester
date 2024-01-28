package sk.fomi.AlfaTester.obrazovky.sps_ext.Vseobecne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sk.fomi.AlfaTester.obrazovky.BaseObrazovka;

public class Login extends BaseObrazovka {

    private final String url = "https://dev.alfabase.sk/sps_ext/konzultacne-miesto";

    public Login(WebDriver driver) {
        super(driver);
    }

    @Override
    public void test() throws InterruptedException {
        localDriver.get(url);

        getElement(By.xpath("/html/body/app-root/spisova-sluzba-ml-header/header" +
                "/div/div[3]/div[1]/div/div[2]/div/div/div/button[1]"))
                .click();

        Thread.sleep(3500);

        getElement(By.id("username")).sendKeys("juan.gonzales");
        getElement(By.id("password")).sendKeys("spsext123");
        getElement(By.id("kc-login"))
                .submit();
    }
}
