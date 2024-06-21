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

       /* ScrollToElement scrollToElement=new ScrollToElement(driver);
        scrollToElement.performScrollToElement();*/

       /* SwitchToActiveWindow switchToActiveWindow=new SwitchToActiveWindow(driver);
        switchToActiveWindow.performSwitchToActiveWindow();*/

     /*   SwitchToAlert switchToAlert=new  SwitchToAlert(driver);
        switchToAlert.performSwitchToAlert();*/

        /*ExecuteJavascript executeJavascript=new ExecuteJavascript(driver);
        executeJavascript.performExecuteJavascript();*/

        /*DragAndDrop dragAndDrop=new DragAndDrop(driver);
        dragAndDrop.performDragAndDrop();*/

        /*Radiobuttons radiobuttons=new  Radiobuttons(driver);
        radiobuttons.performRadiobuttons();*/


        /*Datepicker datepicker=new Datepicker(driver);
        datepicker.performDatepicker();*/

        /*Dropdown dropdown=new Dropdown(driver);
        dropdown.performDropdown();*/

       /* FileUpload fileUpload=new FileUpload(driver);
        fileUpload.performFileUpload();*/

       /* Form form=new Form(driver);
        form.completeWebForm();*/

       /* ContextMenu contextMenu=new ContextMenu(driver);
        contextMenu.testContextMenu();*/

        /*ClickAndHold clickAndHold=new ClickAndHold(driver);
        clickAndHold.PerformClickAndHold();*/

      /*  DoubleClick doubleClick=new DoubleClick(driver);
        doubleClick.performDoubleClick();*/


        RightClick    rightClick=new RightClick(driver);
        rightClick.performRightClick();




    }
    }
