import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    WebDriver driver;

    public DoubleClick(WebDriver driver) {
        this.driver = driver;
    }
    public  void performDoubleClick(){
        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
        WebElement click=driver.findElement(By.id("clickable"));
        new Actions(driver).doubleClick(click).perform();
    }

}
