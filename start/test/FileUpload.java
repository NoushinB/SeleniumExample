import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUpload {
    WebDriver driver;
    public FileUpload(WebDriver driver){
        this.driver=driver;
    }
    public void performFileUpload(){
        driver.get("https://formy-project.herokuapp.com/fileupload");
        WebElement fileUploadField=driver.findElement(By.id("file-upload-field"));
        fileUploadField.sendKeys("file-to-upload.png");

        driver.quit();
    }
}
