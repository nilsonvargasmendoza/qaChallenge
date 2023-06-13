package definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Hooks {
    public static WebDriver driver;
    public static WebDriverWait wait;


    public Hooks(WebDriver driver) {
        this.driver = driver;
    }

    @Before
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver,20,40);
    }

    public void enterText(By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }
    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public Boolean getTextCompare(By locator, String inputText) {
        return driver.findElement(locator).getText().trim().equalsIgnoreCase(inputText);
    }

     @After
    public static void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
    }

}
