package Steps;

import Elements.MainPageElements;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MainPageSteps extends MainPageElements {
    public MainPageSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void fillInput(String searchword) {
        driver.findElement(searchInput).sendKeys(searchword);
    }

    public void clickSearch() {
        driver.findElement(seachButton).click();
    }

    public void testList() {
        driver.findElement(menuList).click();
    }

    public void verifySearch() {
        Assert.assertTrue(driver.getCurrentUrl().contains("Abracadabra"));
    }

    public void clickOnSeleniumJava() {
        driver.findElement(seleniumJava).click();
    }

    public void verifyClick() {
        driver.findElement(seleniumJava).getAttribute("class").contains("active");
    }

}
