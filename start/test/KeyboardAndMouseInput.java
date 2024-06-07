import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    private WebDriver driver;
    KeyboardAndMouseInput(WebDriver driver){
        this.driver=driver;
    }
    public  void performKeyboardAndMouseInput() {



        driver.get("https://formy-project.herokuapp.com/keypress");
        WebElement name=driver.findElement( By.id("name"));
        name.click();
        name.sendKeys("Noushin");
        WebElement button=driver.findElement(By.id("button"));
        button.click();

        driver.quit();
    }
}
