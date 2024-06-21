import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static org.junit.Assert.assertEquals;

public class RightClick {
    WebDriver driver;
    public RightClick(WebDriver driver){
        this.driver=driver;
    }
    public  void performRightClick(){

        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
        WebElement clickable = driver.findElement(By.id("clickable"));
        new Actions(driver)
                .contextClick(clickable)
                .perform();

     assertEquals("context-clicked", driver.findElement(By.id("click-status")).getText());
    }
}
