package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends CommonPage{


    //identificam elementele web specifice pt aceasta pagina;
    @FindBy(xpath = "//h5")
    List<WebElement> elements;
    @FindBy(xpath = "//button[@aria-label ='Consent']//p[@class ='fc-button-label']")
//    @FindBy(xpath = "//p[text()='Consent']")
    WebElement consentElement;

    public HomePage(WebDriver driver) {
        super(driver);
    }


    // metode specifice pentru pagina;
    public void goToDesiredMenu(String menu){
        //elementsMethods.clickOnElements(consentElement);
        javaScriptMethods.scrollOnPage();
        elementsMethods.selectElementFromListByText(elements, menu);
    }


}
