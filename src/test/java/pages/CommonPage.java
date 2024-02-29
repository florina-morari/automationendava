package pages;

import HelperMethods.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CommonPage {
    protected WebDriver driver;
    protected ElementsMethods elementsMethods;
    protected JavaScriptMethods javaScriptMethods;
    protected AlertMethods alertMethods;
    protected Actions actions;
    protected FramesMethods framesMethods;
   protected  WindowsMethods windowsMethods;

    public CommonPage(WebDriver driver) {
        this.driver = driver;
        this.elementsMethods = new ElementsMethods(driver);
        this.javaScriptMethods = new JavaScriptMethods(driver);
        this.alertMethods = new AlertMethods(driver);
        this.actions = new Actions(driver);
//        this.framesMethods = new FramesMethods(driver);
//        this.windowsMethods = new WindowsMethods(driver);
        PageFactory.initElements(driver, this);
    }

    //identificam elementele web specifice pt aceasta sub-pagini;
    @FindBy(xpath = "//span[@class='text']")
    List<WebElement> elements;



    // metode specifice pentru sub-pagina;
    public void goToDesiredSubMenu(String submenu){
        javaScriptMethods.scrollOnPage();
        elementsMethods.selectElementFromListByText(elements, submenu);
    }

}
