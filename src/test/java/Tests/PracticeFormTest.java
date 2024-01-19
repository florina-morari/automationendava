package Tests;

import HelperMethods.ElementsMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormTest {
    public WebDriver driver;
    public ElementsMethods elementMethods;

    @Test
    public void automationMethod() {
        //deschidem un browser de chrome
        driver = new ChromeDriver();
        //accesam o pagina web
        driver.get("https://demoqa.com/");
        //maximize browser
        driver.manage().window().maximize();
        elementMethods = new ElementsMethods(driver);
        //declaram un element
        WebElement elementsField = driver.findElement(By.xpath("//h5[text()='Forms']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)"); //x=0,y=400 (axa)
        elementMethods.clickOnElements(elementsField);

        WebElement elementsTable = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        elementMethods.clickOnElements(elementsTable);

        WebElement addFirstName = driver.findElement(By.id("firstName"));
        elementMethods.fillElement(addFirstName,"Lee");

        WebElement addLastName = driver.findElement(By.id("lastName"));
        elementMethods.fillElement(addLastName,  "Jay-Wook");

        WebElement addEmail = driver.findElement(By.id("userEmail"));
        elementMethods.fillElement(addEmail,"Lee.Jay-Wook@email.com");

        WebElement addMobile = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        elementMethods.fillElement(addMobile,"0741456788");

        WebElement addPicture = driver.findElement(By.id("uploadPicture"));
        elementMethods.uploadPicture(addPicture);


        WebElement maleElement = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        WebElement femaleElement = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement otherElement = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));
        List<WebElement> genderElement = new ArrayList<>();
        genderElement.add(maleElement);
        genderElement.add(femaleElement);
        genderElement.add(otherElement);
        elementMethods.selectElementFromListByText(genderElement,"Female");


//        WebElement subjectsField = driver.findElement(By.id("subjectsInput"));
//        String subjectsValue = "Social Studies";
//        subjectsField.sendKeys(subjectsValue);
//        subjectsField.sendKeys(Keys.ENTER);
//
//        WebElement stateField = driver.findElement(By.id("react-select-3-input"));
//        js.executeScript("arguments[0].click();", stateField);
//        stateField.sendKeys("NCR");
//        stateField.sendKeys(Keys.ENTER);
//
//        WebElement cityField = driver.findElement(By.id("react-select-4-input"));
//        js.executeScript("arguments[0].click();", cityField);
//        cityField.sendKeys("Delhi");
//        cityField.sendKeys(Keys.ENTER);
//
//        WebElement submitElement = driver.findElement(By.id("submit"));
//        js.executeScript("arguments[0].click();", submitElement);

//        Map<String, String> labelValue = new HashMap<>();
//        labelValue.put("Student Name", addFirstNameValue + " " + addLastNameValue);
//        labelValue.put("Student Email", addEmailValue);
//        labelValue.put("Gender ", Gender);
//        labelValue.put("Mobile ", addMobileValue);
//        labelValue.put("Date of Birth ", 	"16 January,2024");
//        labelValue.put("Subjects ", subjectsValue);
//        labelValue.put("Hobbies ", " ");
//        labelValue.put("Picture ", file.getAbsolutePath());
//        labelValue.put("Address ", " ");
//        labelValue.put("State and City ", stateField + " " + cityField);
//
//        List<WebElement> submittedPracticeFormElements = driver.findElements(By.xpath("//table[@class='table table-dark table-striped table-bordered table-hover']/tbody/tr"));
//        for(int i = 0; i < submittedPracticeFormElements.size() - 1; i++) {
//            String expectedTableValue = submittedPracticeFormElements.get(i).getText();
//
//            String key = labelValue.get(i);
//            String actualValue = labelValue.get(key);
//            Assert.assertTrue(expectedTableValue.contains(key));
//            Assert.assertTrue(expectedTableValue.contains(actualValue));
//
//        }

//
//        List<WebElement> submittedPracticeFormElements = driver.findElements(By.xpath("//table[@class='table table-dark table-striped table-bordered table-hover']/tbody/tr"));
//
//        for (int i = 0; i < submittedPracticeFormElements.size() - 1; i++) {
//            WebElement webElement = submittedPracticeFormElements.get(i);
//            String actualTableValue = webElement.getText();
//            System.out.println(actualTableValue);
//            Assert.assertTrue(actualTableValue.contains("Student Name " + addFirstNameValue + " " + addLastNameValue));
//            Assert.assertTrue(actualTableValue.contains("Student Email " + addEmailValue));
//            Assert.assertTrue(actualTableValue.contains("Gender " + Gender));
//            Assert.assertTrue(actualTableValue.contains("Mobile " + addMobileValue));
//            Assert.assertTrue(actualTableValue.contains("Date of Birth " + 	"16 January,2024"));
//            Assert.assertTrue(actualTableValue.contains("Subjects " + subjectsValue));
//            Assert.assertTrue(actualTableValue.contains("Hobbies " + " "));
//            Assert.assertTrue(actualTableValue.contains("Picture " + file.getAbsolutePath()));
//            Assert.assertTrue(actualTableValue.contains("Address " + " "));
//            Assert.assertTrue(actualTableValue.contains("State and City " + stateField + " " + cityField));
//        }


    }
}
