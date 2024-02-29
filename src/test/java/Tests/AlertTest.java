package Tests;

import ShareData.ShareData;
import org.testng.annotations.Test;
import pages.AlertsPage;
import pages.CommonPage;
import pages.HomePage;

public class AlertTest extends ShareData {

//    public ElementsMethods elementMethods;
//    public AlertMethods alertMethods;
//    public JavaScriptMethods javaScriptMethods;
    public HomePage homePage;
    public CommonPage commonPage;
    public AlertsPage alertsPage;

    @Test
    public void automationMethod() {

        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        alertsPage = new AlertsPage(getDriver());
//        alertsPage = new AlertsPage(driver);
        homePage.goToDesiredMenu("Alerts, Frame & Windows");
        commonPage.goToDesiredSubMenu("Alerts");

        // Alert simplu: Doar Text si OK button
//        WebElement alertOKElement = driver.findElement(By.id("alertButton"));
//        elementMethods.clickOnElements(alertOKElement);
//        alertMethods.interractWithAlertsOK();
        alertsPage.interactWithSimpleAlert();

        // Alert cu delay la afisare
//        WebElement alertDelayElement = driver.findElement(By.id("timerAlertButton"));
//        elementMethods.clickOnElements(alertDelayElement);
       //definim un wait explicit ca sa astepte dupa alerta
//        alertMethods.interractWithDelayAlert();
        alertsPage.interactWithDelayedAlert();

        // Alert cu Confirm - OK/cancel
//        WebElement confirmElement = driver.findElement(By.id("confirmButton"));
//        elementMethods.clickOnElements(confirmElement);
//        alertMethods.interactWithAlertDismiss();
        alertsPage.interactWithConfirmAlert(true);

        // Alert cu Prompt Text
//        WebElement alertPromtElement = driver.findElement(By.id("promtButton"));
//        elementMethods.clickOnElements(alertPromtElement);
//        alertMethods.interactWithPromptAlertOK("Test Alert Promt OK");
        alertsPage.interactWithPromptAlert("Test Alert Promt OK", true);
//        driver.quit();

    }
}
