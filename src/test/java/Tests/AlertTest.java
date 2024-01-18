package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertTest {
    public WebDriver driver;

    @Test
    public void automationMethod() {
        //deschidem un browser de chrome
        driver = new ChromeDriver();
        //accesam o pagina web
        driver.get("https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //maximize browser
        driver.manage().window().maximize();
        WebElement elementsField = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)"); //x=0,y=400 (axa)
        elementsField.click();

        WebElement alertElement = driver.findElement(By.xpath("//span[text()='Alerts']"));
        alertElement.click();

        WebElement alertOKElement = driver.findElement(By.id("alertButton"));
        alertOKElement.click();

        Alert alertOK = driver.switchTo().alert();
        alertOK.accept();

        WebElement alertDelayElement = driver.findElement(By.id("timerAlertButton"));
        alertDelayElement.click();

        //definim un wait explicit ca sa astepte dupa alerta
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alertDelay = driver.switchTo().alert();
        alertDelay.accept();


        WebElement confirmElement = driver.findElement(By.id("confirmButton"));
       confirmElement.click();

        Alert alertConfirm = driver.switchTo().alert();
        alertConfirm.dismiss();

        WebElement alertPromtElement = driver.findElement(By.id("promtButton"));
        alertPromtElement.click();

        Alert alertPromt = driver.switchTo().alert();
        alertPromt.sendKeys("test");
        alertPromt.accept();




    }
}
