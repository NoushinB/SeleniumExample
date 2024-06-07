import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/96475/Downloads/chromedriver-win64/chromedriver.exe");

        WebDriver driver = new ChromeDriver();


       // KeyboardAndMouseInput keyboardAndMouseInput=  new KeyboardAndMouseInput(driver);
       // keyboardAndMouseInput.performKeyboardAndMouseInput();

        /*UsingAutocomplete usingAutocomplete=new UsingAutocomplete(driver);
        usingAutocomplete.performAutocomplete();*/

        ScrollToElement scrollToElement=new ScrollToElement(driver);
        scrollToElement.performScrollToElement();
    }
    }
