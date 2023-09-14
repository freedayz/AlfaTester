package sk.fomi.AlfaTester.Obrazovky;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.ArrayList;

public abstract class BaseObrazovka {
    public ArrayList<By> locatorList;
    public WebDriver localDriver;
    public final int redirectWaitTimeout = 2000;

    public final String primaryUrl = "https://test.alfabase.sk/sps_int";

    public BaseObrazovka(WebDriver driver) {
        this.locatorList = new ArrayList<>();
        this.localDriver = driver;
    }

    public abstract void test() throws InterruptedException;

    public WebElement fluentFindElement(By locator) {
        Wait<WebDriver> wait = new FluentWait<>(localDriver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        return wait.until(driver1 -> driver1.findElement(locator));
    }
}
