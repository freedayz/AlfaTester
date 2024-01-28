package sk.fomi.AlfaTester.obrazovky.sps_int.Frekvencie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import sk.fomi.AlfaTester.obrazovky.BaseObrazovka;

public class FrekvencneListyCreate extends BaseObrazovka {
    private final String url = primaryUrl + "/sprava-frekvencneho-spektra/databazy/databaza-frekvencnych-listov";

    public FrekvencneListyCreate(WebDriver driver) {
        super(driver);
    }

    @Override
    public void test() throws InterruptedException {
        Thread.sleep(redirectWaitTimeout);
        localDriver.get(url);

        getElement(By.xpath("//*[@id=\"right\"]/div/app-entry/div[2]" +
                "/div/div[2]/div/div/alf-button/button")
        ).click();

        getElement(By.id("nazovVysielaca")).sendKeys("Test");
        getElement(By.id("kota")).sendKeys("22");
        getElement(By.id("cisloFrekvencnehoListu")).sendKeys("224587");
        getElement(By.id("druhSposobCasVysielania")).sendKeys("Denny");
        getElement(By.id("lokalita")).sendKeys("Bratislava");
        getElement(By.id("frekvenciaHz")).sendKeys("35");
        getElement(By.id("maximalnyVyziarenyVykonDbw")).sendKeys("48");
        getElement(By.id("maximalnyVyziarenyVykonW")).sendKeys("8.5");
        getElement(By.id("nadmorskaVyska")).sendKeys("52.47");
        getElement(By.id("vyskaStreduAntenyNadTerenom")).sendKeys("8.4");
        getElement(By.id("zemepisneSuradniceN")).sendKeys("24.28");
        getElement(By.id("zemepisneSuradniceE")).sendKeys("87.42");

        (new Select(getElement(By.id("polarizacia$kodPolozky"))))
                .selectByValue("4: D");

        (new Select(getElement(By.id("frekvenciaJednotkaZobrazenia$kodPolozky"))))
                .selectByValue("2: MHz");
    }
}
