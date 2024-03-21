package ShareData.browser;

import ConfigFile.ConfigFile;
import ConfigFile.ConfigNode.ConfigurationNode;
import ShareData.browser.Service.ChromeBrowserService;
import ShareData.browser.Service.EdgeBrowserService;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class BrowserFactory {
    public WebDriver getBrowserFactory(){
        String ciCd = System.getProperty("ciCd");
        String browser = System.getProperty("browser").toLowerCase(Locale.ROOT);
        System.out.println("Tipul de browser este: " + browser);

        ConfigurationNode configurationNode = ConfigFile.createConfigNode(ConfigurationNode.class);

        if(Boolean.parseBoolean(ciCd)){
            configurationNode.driverConfigNode.headless="--headless";
        }
        else{
            browser = configurationNode.driverConfigNode.localBrowser;
        }
        switch(browser){
            case BrowserType.BROWSER_CHROME:
                ChromeBrowserService chromeService = new ChromeBrowserService();
                chromeService.openBrowser(configurationNode.driverConfigNode);
                return chromeService.getDriver();
            case BrowserType.BROWSER_EDGE:
                EdgeBrowserService edgeService = new EdgeBrowserService();
                edgeService.openBrowser(configurationNode.driverConfigNode);
                return edgeService.getDriver();
        }
           return null;
    }
}
