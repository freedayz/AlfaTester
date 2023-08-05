package sk.fomi.AlfaTester;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sk.fomi.AlfaTester.Obrazovky.Login;
import sk.fomi.AlfaTester.Obrazovky.VytvoreniePracovnejCesty;

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
            (new VytvoreniePracovnejCesty(driver)).test();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
