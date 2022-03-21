import Steps.MainPageSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Mainpage{
    WebDriver driver;

    @BeforeTest
    public void setupChrome() {
        String driverPath = "src\\main\\resources\\chromedriver.exe";
        String URL = "https://www.seleniumeasy.com";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @Test
    public void checkInput() {
        MainPageSteps mainPageSteps = new MainPageSteps(driver);
        mainPageSteps.fillInput("Abracadabra");
        mainPageSteps.clickSearch();
        mainPageSteps.verifySearch();
    }

/*    Couldn't cause alert. If there was one I would simply create an
      Alert instance which would be equal to wait.until(ExpectedConditions.alertIsPresent())
      & after confirming any condition, for example some text, I would use accept() function
      to close this alert */

    @Test
    public void testListElements() throws InterruptedException {
        MainPageSteps mainPageSteps = new MainPageSteps(driver);
        mainPageSteps.testList();
        mainPageSteps.clickOnSeleniumJava();
        mainPageSteps.testList();
        mainPageSteps.verifyClick();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
