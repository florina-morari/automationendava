package ShareData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class ShareData {
    private WebDriver driver;

    @BeforeMethod
    public void prepareBrowser(){
        //deschidem un browser de chrome
        driver = new ChromeDriver();
        //accesam o pagina web
        driver.get("https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //maximize browser
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void clearBrowser(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
