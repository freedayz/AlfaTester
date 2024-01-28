package sk.fomi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sk.fomi.AlfaTester.AlfaTester;
import sk.fomi.AlfaTester.obrazovky.sps_ext.VerejneKonzultacie.KonzultacneMiesto;
import sk.fomi.AlfaTester.obrazovky.sps_int.VerejneKonzultacie.NarodneKonzultacieCreate;
import sk.fomi.AlfaTester.obrazovky.sps_int.VerejneKonzultacie.NarodneKonzultacieDokumenty;
import sk.fomi.AlfaTester.obrazovky.sps_int.VerejneKonzultacie.NarodneKonzultacieUpdate;
import sk.fomi.AlfaTester.obrazovky.sps_int.VerejneKonzultacie.NarodneKonzultacieZverejnit;
import sk.fomi.AlfaTester.obrazovky.sps_int.Vseobecne.Login;

public class Main {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        AlfaTester.getInstance()
                .test(new Login(driver))
                .test(new NarodneKonzultacieCreate(driver))
                .test(new NarodneKonzultacieDokumenty(driver))
                .test(new NarodneKonzultacieUpdate(driver))
                .test(new NarodneKonzultacieZverejnit(driver))
                .test(new sk.fomi.AlfaTester.obrazovky.sps_ext.Vseobecne.Login(driver))
                .test(new KonzultacneMiesto(driver));
    }
}