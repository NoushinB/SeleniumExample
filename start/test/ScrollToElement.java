import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    private WebDriver driver;
    public ScrollToElement(WebDriver driver){
        this.driver=driver;
    }

    public void performScrollToElement(){
        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Noushin");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("07/06/2024");

        driver.quit();
    }
}
