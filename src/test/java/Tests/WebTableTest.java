package Tests;

import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.HomePage;

import java.util.List;

public class WebTableTest  extends ShareData {
//    public WebDriver driver;
//    public ElementsMethods elementMethods;
//    public JavaScriptMethods javaScriptMethods;
    public HomePage homePage;
    public CommonPage commonPage;

    @Test
    public void automationMethod() {
        //deschidem un browser de chrome
//        driver = new ChromeDriver();
//        //accesam o pagina web
//        driver.get("https://demoqa.com/");
//        //maximize browser
//        driver.manage().window().maximize();
//
//        elementMethods = new ElementsMethods(driver);
//        javaScriptMethods = new JavaScriptMethods(driver);
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());

        homePage.goToDesiredMenu("Elements");
        commonPage.goToDesiredSubMenu("Web Tables");
        //declaram un element

        List<WebElement> tableElements = getDriver().findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));
        Integer actualTableSize = tableElements.size();
        System.out.println("Size-ul este: " + actualTableSize);


        WebElement addNewEntry = getDriver().findElement(By.id("addNewRecordButton"));
        addNewEntry.click();

        WebElement addFirstName = getDriver().findElement(By.id("firstName"));
        String addFirstNameValue = "Lee";
        addFirstName.sendKeys(addFirstNameValue);

        WebElement addLastName = getDriver().findElement(By.id("lastName"));
        String addLastNameValue = "Jay-Wook";
        addLastName.sendKeys(addLastNameValue);

        WebElement addEmail = getDriver().findElement(By.id("userEmail"));
        String addEmailValue = "Lee.Jay-Wook@email.com";
        addEmail.sendKeys(addEmailValue);

        WebElement addAge = getDriver().findElement(By.id("age"));
        String addAgeValue = "32";
        addAge.sendKeys(addAgeValue);

        WebElement addSalary = getDriver().findElement(By.id("salary"));
        String addSalaryValue = "22000";
        addSalary.sendKeys(addSalaryValue);

        WebElement addDepartment = getDriver().findElement(By.id("department"));
        String addDepartmentValue = "IT";
        addDepartment.sendKeys(addDepartmentValue);

        WebElement submitNewEntry = getDriver().findElement(By.id("submit"));
        submitNewEntry.click();


        List<WebElement> expectedTableElements = getDriver().findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));

        Integer expectedTableSize = actualTableSize + 1;
        Assert.assertEquals(expectedTableElements.size(), expectedTableSize);
        String actualTableValue = expectedTableElements.get(3).getText();
        System.out.println("Elementul este " + actualTableValue);
        Assert.assertTrue(actualTableValue.contains(addFirstNameValue));
        Assert.assertTrue(actualTableValue.contains(addLastNameValue));
        Assert.assertTrue(actualTableValue.contains(addEmailValue));
        Assert.assertTrue(actualTableValue.contains(addAgeValue));
        Assert.assertTrue(actualTableValue.contains(addSalaryValue));
        Assert.assertTrue(actualTableValue.contains(addDepartmentValue));
    }
}
