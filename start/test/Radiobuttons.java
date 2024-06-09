import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Radiobuttons {
    WebDriver driver;
    public Radiobuttons(WebDriver driver){
        this.driver=driver;
    }
    public void performRadiobuttons(){
        driver.get("https://formy-project.herokuapp.com/radiobutton");
        WebElement radioButton1=driver.findElement(By.id("radio-button-1"));
        radioButton1.click();

        WebElement radioButton2=driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton1.click();

        WebElement radioButton3=driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton1.click();

        driver.quit();

    }
}
