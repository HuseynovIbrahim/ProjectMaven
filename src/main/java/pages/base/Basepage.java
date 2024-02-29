package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static comman.Config.EXPLICIT_WAIT;

public class Basepage {

    protected WebDriver driver;

    public Basepage (WebDriver driver) {
        this.driver = driver;
    }

    public void open(String url) {
        driver.get(url);
    }

    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver,EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
     return element;
    }

}
