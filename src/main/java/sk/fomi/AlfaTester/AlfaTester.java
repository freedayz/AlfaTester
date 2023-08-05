package sk.fomi.AlfaTester;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sk.fomi.AlfaTester.Obrazovky.SpravaCisel.CislovaciPlanCreate;
import sk.fomi.AlfaTester.Obrazovky.Frekvencie.FrekvencneListyCreate;
import sk.fomi.AlfaTester.Obrazovky.Vseobecne.Login;
import sk.fomi.AlfaTester.Obrazovky.PracovneCesty.PracovneCestyCreate;

public class AlfaTester {

    private static final WebDriver driver = new ChromeDriver();

    public static void testLogin() {
        try {
            (new Login(driver)).test();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void testPracovneCestyCreate() {
        try {
            (new PracovneCestyCreate(driver)).test();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void testCislovaciPlanCreate() {
        try {
            (new CislovaciPlanCreate(driver)).test();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void testFrekvencneListyCreate() {
        try {
            (new FrekvencneListyCreate(driver)).test();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
