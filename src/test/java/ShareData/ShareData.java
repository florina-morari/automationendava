package ShareData;

import ShareData.browser.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ShareData {
    private WebDriver driver;

    @BeforeMethod
    public void prepareBrowser(){
        driver = new BrowserFactory().getBrowserFactory();

//        ConfigurationNode configurationNode = ConfigFile.createConfigNode(ConfigurationNode.class);
//        //deschidem un browser de chrome;
//
//        driver = new ChromeDriver();
//        //accesam o pagina web
//        driver.get(configurationNode.driverConfigNode.URL);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        //maximize browser
//        driver.manage().window().maximize();

    }
    @AfterMethod
    public void clearBrowser(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
