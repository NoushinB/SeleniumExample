import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {

    WebDriver driver;
    public ContextMenu(WebDriver driver){
        this.driver=driver;
    }

    public void testContextMenu() throws InterruptedException {



        driver.get("http://the-internet.herokuapp.com/context_menu");

        WebElement menuArea = driver.findElement(By.id("hot-spot"));
        Thread.sleep(10000);

        // Use Actions class to simulate right-click and keyboard actions
        Actions actions = new Actions(driver);
        actions.contextClick(menuArea)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .perform();
        Thread.sleep(10000);

        // Switch to alert and verify the text
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        assert alertText.equals("You selected a context menu");
        Thread.sleep(10000);

        // Close the browser (optional)
        driver.quit();
    }
}
