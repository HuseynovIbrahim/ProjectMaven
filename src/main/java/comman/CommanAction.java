package comman;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static comman.Config.IMPILICIT_WAIT;
import static comman.Config.PLATFORM_AND_BROWSER;

public class CommanAction {
    private  static WebDriver driver = null;

    private CommanAction() {
    }

    public static WebDriver createdriver() {
        if (driver == null){
            switch (PLATFORM_AND_BROWSER){
                case "win_chrome" :
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                default:
                    Assert.fail("Incorrect platform or browser name" + PLATFORM_AND_BROWSER);
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(IMPILICIT_WAIT, TimeUnit.SECONDS);
        }
        return driver;
    }
}
