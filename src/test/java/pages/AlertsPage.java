package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends CommonPage{


    @FindBy(id = "alertButton")
    private WebElement alertOkButtonElement;
    @FindBy(id = "timerAlertButton")
    private WebElement delayedAlertButtonElement;
    @FindBy(id = "confirmButton")
    private WebElement alertConfirmButtonElement;
    @FindBy(id = "promtButton")
    private WebElement alertPromptButtonElement;

    public AlertsPage(WebDriver driver) {
        super(driver);
    }
    public void interactWithSimpleAlert() {
        // Alert simplu: Doar Text si OK button
        elementsMethods.clickOnElements(alertOkButtonElement);
        alertMethods.interractWithAlertsOK();
    }
    public void interactWithDelayedAlert() {
        // Alert cu delay la afisare
        javaScriptMethods.scrollOnPage();
        elementsMethods.clickOnElements(delayedAlertButtonElement);
        alertMethods.interractWithDelayAlert();
    }
    public void interactWithConfirmAlert(boolean isConfirmed) {
        // Alert cu Confirm - OK/cancel
        elementsMethods.clickOnElements(alertConfirmButtonElement);
        if (isConfirmed) {
            alertMethods.interractWithAlertsOK();
        } else {
            alertMethods.interactWithAlertDismiss();
        }
    }
    public void interactWithPromptAlert(String inputText, boolean isConfirmed){
        // Alert cu Prompt Text
        elementsMethods.clickOnElements(alertPromptButtonElement);
        if (isConfirmed) {
            alertMethods.interactWithPromptAlertOK(inputText);
        } else {
            alertMethods.interactWithPromptAlertAndCancel(inputText);
        }
    }

}
