package pages.Eportal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.Basepage;

public class KommunalƏrizəSmoke extends Basepage {


    public KommunalƏrizəSmoke(WebDriver driver) {
        super(driver);
    }

    By input = By.cssSelector("#loginTabsAsan");
    By input2 = By.cssSelector(".form-control");
    By input3 = By.xpath("//*[@name = 'userId']");
    By input4 = By.xpath("//*[@name = 'mock']");
    By input5 = By.xpath("//*[@class = 'btn btn-primary']");
    By input6 = By.xpath("//div[@class = 'cursor-pointer company-item d-flex justify-content-between align-items-center']");
    By input7 = By.xpath("//a[@id = 'menuApplications']");
    By input8 = By.xpath("//a[@id = 'applicationsMainAllTypesLink']");
    By input9 = By.cssSelector("#applicationsMainAllTypesAppLink279");
    By input10 = By.xpath("//div[@class=' css-20t92s']");
    By input11 = By.xpath("//div[@class='custom-selectbox-item-option']");
    By input12 = By.xpath("//div[@class= 'custom-selectbox mt-0 w-100']");
    By input13 = By.xpath("//div[@class= 'typography size-md   ']");
    By input14 = By.xpath("//div[@class= ' css-l14y29-placeholder']");
    By input15 = By.xpath("//div[@class= 'custom-selectbox-item-option']");
    By input16 = By.xpath("//div[@class = 'required-front d-flex align-items-center col-6']");
    By input17 = By.xpath("//*[text()='\"AZƏRİŞIQ\" AÇIQ SƏHMDAR CƏMİYYƏTİ']");
    By input18 = By.xpath("//*[text()='Davam et']");
    By input19 = By.xpath("//*[text()='Yeni ərizə yarat']");
    By input20 = By.xpath("//*[@id ='applicationsCreateAppDraftListModalContinueBtn']");







    public KommunalƏrizəSmoke LoginOlmaq(){
        driver.findElement(input).click();
        driver.findElement(input2).sendKeys("512267982");
        driver.findElement(input3).sendKeys("300588");
        driver.findElement(input4).click();
        driver.findElement(input5).click();
        driver.findElement(input6).click();
        driver.findElement(input7).click();
        driver.findElement(input8).click();
        driver.findElement(input9).click();
        driver.findElement(input10).click();
        driver.findElement(input11).click();
        driver.findElement(input12).click();
        driver.findElement(input13).click();
        driver.findElement(input14).click();
        driver.findElement(input15).click();
        driver.findElement(input16).click();
        driver.findElement(input17).click();
        driver.findElement(input18).click();
        driver.findElement(input19).click();
        driver.findElement(input20).click();

        return this;
    }

}

