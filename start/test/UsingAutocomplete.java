import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UsingAutocomplete {
    private WebDriver driver;
    public UsingAutocomplete(WebDriver driver){
        this.driver=driver;
    }
    public void performAutocomplete() throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/autocomplete");

    WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        Thread.sleep(10000);

    WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();
}}
