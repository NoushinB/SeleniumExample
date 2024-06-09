import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Datepicker {

    WebDriver driver;
    public  Datepicker(WebDriver driver){
        this.driver=driver;
    }
    public void performDatepicker(){
        driver.get("https://formy-project.herokuapp.com/datepicker");
        WebElement datefield=driver.findElement(By.id("datepicker"));
        datefield.sendKeys("06/09/2024");
        datefield.sendKeys(Keys.RETURN);
        driver.quit();
    }
}
