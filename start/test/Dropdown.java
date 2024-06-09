import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dropdown {
    WebDriver driver;
    public Dropdown(WebDriver driver){
        this.driver=driver;
    }
    public void performDropdown(){
        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropDownMenu=driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();
        WebElement autocompleteItem=driver.findElement(By.id("autocomplete"));
        autocompleteItem.click();
        driver.quit();

    }
}
