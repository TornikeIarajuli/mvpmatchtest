package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageElements {
    protected WebDriver driver;

    protected By searchInput = By.id("edit-search-block-form--2");
    //Maybe not the most optimal option for locating
    protected By seachButton = By.cssSelector(".input-group-btn > button");
    protected By menuList = By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[2]/a");
    protected By seleniumJava = By.linkText("Selenium with Java");

}
