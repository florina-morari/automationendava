package Tests;

import ShareData.ShareData;
import org.testng.annotations.Test;
import pages.BrowserWindowsPage;
import pages.CommonPage;
import pages.HomePage;

public class BrowserWindowTab extends ShareData {

    public HomePage homePage;
    public CommonPage commonPage;
    public BrowserWindowsPage browserWindowsPage;

    @Test
    public void automationMethod() {


        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());

        homePage.goToDesiredMenu("Alerts, Frame & Windows");
        commonPage.goToDesiredSubMenu("Browser Windows");

        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        browserWindowsPage = new BrowserWindowsPage(getDriver());
        homePage.goToDesiredMenu("Alerts, Frame & Windows");
        commonPage.goToDesiredSubMenu("Browser Windows");
        // New Tab:
        browserWindowsPage.interactWithTheNewTab();

        // New Window:
        browserWindowsPage.interactWithTheNewWindow();

//        WebElement tabElement = driver.findElement(By.id("tabButton"));
//        tabElement.click();
//
//        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(tabList.get(1));
//
//        WebElement sampleHeadingElement = driver.findElement(By.id("sampleHeading"));
//        System.out.println("Textul din new tab este: " + sampleHeadingElement.getText());
//
//        driver.close();
//        driver.switchTo().window(tabList.get(0));
//        WebElement windowButtonElement = driver.findElement(By.id("windowButton"));
//        windowButtonElement.click();
//
//        List<String> windowList = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(windowList.get(1));
//
//        WebElement sampleHeadingWindowElement = driver.findElement(By.id("sampleHeading"));
//        System.out.println("Textul din new window este: " + sampleHeadingWindowElement.getText());
//
//        driver.close();
//        driver.switchTo().window(tabList.get(0));

    }
}
