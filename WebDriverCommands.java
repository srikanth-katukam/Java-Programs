import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


/**
 * Created by Skatukam on 02/21/2018.
 */
public class WebDriverCommands {
    WebDriver driver = new FirefoxDriver();

    public void setDriver(WebDriver driver) {
        this.driver = driver;
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://google.com");
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();

        WebElement element=driver.findElement(By.id("id"));
        element.click();
        element.submit();//This is for forms
        element.getText();
        element.sendKeys("Sample Text");



    }
}
