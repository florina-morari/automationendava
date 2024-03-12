package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BrowserWindowsPage extends CommonPage {
    @FindBy(id="tabButton")
    public WebElement newTabButtonElement;
    @FindBy(id = "sampleHeading")
    public WebElement sampleHeadingFromNewTabElement;
    @FindBy(id = "windowButton")
    public WebElement newWindowButtonElement;
    @FindBy(id = "sampleHeading")
    public WebElement sampleHeadingFromNewWindowElement;
    public BrowserWindowsPage(WebDriver driver) {
        super(driver);
    }
    public void interactWithTheNewTab() {
        // New Tab:
        elementsMethods.clickOnElements(newTabButtonElement);

        windowsMethods.switchToOpenedTab();
        Assert.assertEquals(sampleHeadingFromNewTabElement.getText(), "This is a sample page");
        windowsMethods.closeTab();
        windowsMethods.switchToMainWindow();
    }
    public void interactWithTheNewWindow() {
        // New Window:
        elementsMethods.clickOnElements(newWindowButtonElement);
        windowsMethods.switchToOpenedWindow();
        Assert.assertEquals(sampleHeadingFromNewWindowElement.getText(), "This is a sample page");
        windowsMethods.closeWindow();
        windowsMethods.switchToMainWindow();
    }
}