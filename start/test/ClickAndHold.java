import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
    WebDriver driver;
    public ClickAndHold(WebDriver driver){
        this.driver=driver;
    }
    public void PerformClickAndHold(){
        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
        WebElement clickable = driver.findElement(By.id("clickable"));
        new Actions(driver)
                .clickAndHold(clickable)
                .perform();

    }
}
