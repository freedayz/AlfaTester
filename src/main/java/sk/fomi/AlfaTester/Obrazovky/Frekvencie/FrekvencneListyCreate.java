package sk.fomi.AlfaTester.Obrazovky.Frekvencie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import sk.fomi.AlfaTester.Obrazovky.BaseObrazovka;

public class FrekvencneListyCreate extends BaseObrazovka {
    private final String url = primaryUrl + "/sprava-frekvencneho-spektra/databazy/databaza-frekvencnych-listov";

    public FrekvencneListyCreate(WebDriver driver) {
        super(driver);
    }

    @Override
    public void test() throws InterruptedException {
        Thread.sleep(redirectWaitTimeout);
        localDriver.get(url);

        fluentFindElement(By.xpath("//*[@id=\"right\"]/div/app-entry/div[2]" +
                "/div/div[2]/div/div/alf-button/button")
        ).click();

        fluentFindElement(By.id("nazovVysielaca")).sendKeys("Test");
        fluentFindElement(By.id("kota")).sendKeys("22");
        fluentFindElement(By.id("cisloFrekvencnehoListu")).sendKeys("224587");
        fluentFindElement(By.id("druhSposobCasVysielania")).sendKeys("Denny");
        fluentFindElement(By.id("lokalita")).sendKeys("Bratislava");
        fluentFindElement(By.id("frekvenciaHz")).sendKeys("35");
        fluentFindElement(By.id("maximalnyVyziarenyVykonDbw")).sendKeys("48");
        fluentFindElement(By.id("maximalnyVyziarenyVykonW")).sendKeys("8.5");
        fluentFindElement(By.id("nadmorskaVyska")).sendKeys("52.47");
        fluentFindElement(By.id("vyskaStreduAntenyNadTerenom")).sendKeys("8.4");
        fluentFindElement(By.id("zemepisneSuradniceN")).sendKeys("24.28");
        fluentFindElement(By.id("zemepisneSuradniceE")).sendKeys("87.42");

        (new Select(fluentFindElement(By.id("polarizacia$kodPolozky"))))
                .selectByValue("4: D");

        (new Select(fluentFindElement(By.id("frekvenciaJednotkaZobrazenia$kodPolozky"))))
                .selectByValue("2: MHz");
    }
}
