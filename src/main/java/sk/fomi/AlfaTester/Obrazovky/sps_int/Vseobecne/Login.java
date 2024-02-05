package sk.fomi.AlfaTester.Obrazovky.sps_int.Vseobecne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sk.fomi.AlfaTester.Obrazovky.BaseObrazovka;

public class Login extends BaseObrazovka {
    private String username;
    private String password;

    public Login(WebDriver driver, String username, String password) {
        super(driver);
        this.username = username;
        this.password = password;
    }

    @Override
    public void test() throws InterruptedException {
        localDriver.get(primaryUrl);

        getElement(By.id("username"))
                .sendKeys(username);

        getElement(By.id("password"))
                .sendKeys(password);

        getElement(By.id("kc-login"))
                .submit();
    }
}
