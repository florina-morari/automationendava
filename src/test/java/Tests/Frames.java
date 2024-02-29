package Tests;

import ShareData.ShareData;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.FramesPage;
import pages.HomePage;

public class Frames extends ShareData {
//    public WebDriver driver;
//    public ElementsMethods elementMethods;
//    public JavaScriptMethods javaScriptMethods;
    public HomePage homePage;
    public CommonPage commonPage;
    public FramesPage framesPage;

    @Test
    public void automationMethod() {
//        //deschidem un browser de chrome
//        driver = new ChromeDriver();
//        //accesam o pagina web
//        driver.get("https://demoqa.com/");
//        //maximize browser
//        driver.manage().window().maximize();
//        elementMethods = new ElementsMethods(driver);
//        javaScriptMethods = new JavaScriptMethods(driver);
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        framesPage = new FramesPage(getDriver());

        homePage.goToDesiredMenu("Alerts, Frame & Windows");
      //  ExtentUtility.attachLog(ExtentUtility.ReportStep);
        commonPage.goToDesiredSubMenu("Frames");
        framesPage.interactWithFrame1();
        framesPage.interactWithFrame2();

//        WebElement elementsField = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,400)"); //x=0,y=400 (axa)
////        elementsField.click();
//        WebElement frameElement = driver.findElement(By.xpath("//span[text()='Frames']"));
//        frameElement.click();


//        WebElement frameTextElement = driver.findElement(By.id("frame1"));
//        driver.switchTo().frame(frameTextElement);
//        WebElement sampleHeadingFrameElement = driver.findElement(By.id("sampleHeading"));
//        System.out.println("Textul din new frame este: " +sampleHeadingFrameElement.getText());
//        //ne ducem cu focusul pe pagina principala
//        driver.switchTo().defaultContent();
//
//
//        WebElement frame2TextElement = driver.findElement(By.id("frame2"));
//        driver.switchTo().frame(frame2TextElement);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(200,200)");


    }
    }
