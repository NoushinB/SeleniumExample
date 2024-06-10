import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class UsingAutocomplete {
    private WebDriver driver;

    public UsingAutocomplete(WebDriver driver) {
        this.driver = driver;
    }

    public void performAutocomplete()  {
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        //Thread.sleep(10000);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();

        driver.quit();
    }
}
