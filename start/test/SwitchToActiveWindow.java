import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToActiveWindow {
    private WebDriver driver;
    public SwitchToActiveWindow(WebDriver driver){
        this.driver=driver;
    }
    public void performSwitchToActiveWindow (){
        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        String originalHandle = driver.getWindowHandle();

        for(String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }

        driver.switchTo().window(originalHandle);

        driver.quit();

    }
}
