package tests.base;

import comman.CommanAction;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import pages.Eportal.KommunalƏrizəSmoke;
import pages.base.Basepage;

public class BaseTest {
    protected WebDriver driver = CommanAction.createdriver();
    protected Basepage basepage = new Basepage(driver);
    protected KommunalƏrizəSmoke eportalPage = new KommunalƏrizəSmoke(driver);



    }


