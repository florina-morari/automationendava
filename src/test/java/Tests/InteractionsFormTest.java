package Tests;

import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.HomePage;

import java.util.List;

public class InteractionsFormTest extends ShareData {
//    public WebDriver driver;
//    public ElementsMethods elementMethods;
//    public JavaScriptMethods javaScriptMethods;
    public HomePage homePage;
    public CommonPage commonPage;


    @Test
    public void parcurgereListaMethod()  {
        //deschidem un browser de chrome
//        driver = new ChromeDriver();
//        //accesam o pagina web
//        driver.get("https://demoqa.com/");
//        //maximize browser
//        driver.manage().window().maximize();
//        elementMethods = new ElementsMethods(driver);
//        javaScriptMethods = new JavaScriptMethods(driver);
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());


        //declaram un element
        homePage.goToDesiredMenu("Interactions");
        commonPage.goToDesiredSubMenu("Sortable");

//        driver.manage().window().maximize();
        Actions actions= new Actions (getDriver());
        List<WebElement> list = getDriver().findElements(By.xpath("//div[@id='demo-tabpane-list']//div[@class='list-group-item list-group-item-action']"));
        for (int i=0; i<list.size()-1; i++){
            WebElement webElement = list.get(i);
            WebElement nextWebElement = list.get(i+1);
            System.out.println("Numarul elementului este " + webElement.getText());
            actions.clickAndHold(webElement)
                    .moveToElement(nextWebElement)
                    .release()
                    .build()
                    .perform();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}