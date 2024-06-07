import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToAlert {
    private WebDriver driver;
  public   SwitchToAlert(WebDriver driver){
      this.driver=driver;
  }
  public  void  performSwitchToAlert() throws InterruptedException {
      driver.get("https://formy-project.herokuapp.com/switch-window");

      WebElement alertButton = driver.findElement(By.id("alert-button"));
      alertButton.click();
      Thread.sleep(10000);

      Alert alert = driver.switchTo().alert();
      alert.accept();

      driver.quit();
  }
}
