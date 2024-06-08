import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExecuteJavascript {
    WebDriver driver;
    public  ExecuteJavascript(WebDriver driver){
        this.driver=driver;
    }
    public void performExecuteJavascript(){
        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        WebElement closeButton = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", closeButton);

        driver.quit();
    }
}
