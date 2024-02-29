import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://publicdevelop.e-taxes.gov.az/eportal/az/login");

        By input = By.cssSelector("#loginTabsAsan");

        WebElement element = driver.findElement(input);

        element.click();

        By input2 = By.cssSelector(".form-control");

        WebElement element2 = driver.findElement(input2);

        element2.sendKeys("512267982", Keys.ENTER);

        By input3 = By.xpath("//*[@name = 'userId']");

        WebElement elelement3 = driver.findElement(input3);

        elelement3.sendKeys("300588");

        By input4 = By.xpath("//*[@name = 'mock']");

        WebElement element4 = driver.findElement(input4);

        element4.click();

        By input5 = By.xpath("//*[@class = 'btn btn-primary']");

        WebElement element5 = driver.findElement(input5);

        element5.click();

        By input6 = By.xpath("//div[@class = 'cursor-pointer company-item d-flex justify-content-between align-items-center']");

        WebElement element6 = driver.findElement(input6);

        element6.click();

        By input7 = By.xpath("//a[@id = 'menuApplications']");

        WebElement element7 = driver.findElement(input7);

        element7.click();

        By input8 = By.xpath("//a[@id = 'applicationsMainAllTypesLink']");

        WebElement element8 = driver.findElement(input8);

        element8.click();

        By input9 = By.xpath("//div[@id = 'applicationsMainAllTypesAppLink270']");

        WebElement element9 = driver.findElement(input9);

        element9.click();

        By input10 = By.xpath("//*[@class = 'mt-3 radio-control']");

        WebElement element10 = driver.findElement(input10);

        element10.click();

        By input11 = By.cssSelector("#applicationsCreateAppDraftListModalContinueBtn");

        WebElement element11 = driver.findElement(input11);

        element11.click();









































    }
}
