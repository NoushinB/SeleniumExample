import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragAndDrop {
    WebDriver driver;
    public DragAndDrop(WebDriver driver){
        this.driver=driver;
    }
    public void performDragAndDrop (){
        driver.get("https://formy-project.herokuapp.com/dragdrop");
        WebElement image=driver.findElement(By.id("image"));
        WebElement box=driver.findElement(By.id("box"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(image,box).build().perform();
        driver.quit();
    }
}
