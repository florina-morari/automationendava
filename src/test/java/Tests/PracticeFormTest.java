package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class PracticeFormTest {
    public WebDriver driver;

    @Test
    public void automationMethod() {
        //deschidem un browser de chrome
        driver = new ChromeDriver();
        //accesam o pagina web
        driver.get("https://demoqa.com/");
        //maximize browser
        driver.manage().window().maximize();
        //declaram un element
        WebElement elementsField = driver.findElement(By.xpath("//h5[text()='Forms']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)"); //x=0,y=400 (axa)
        elementsField.click();

        WebElement elementsTable = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        elementsTable.click();


        WebElement addFirstName = driver.findElement(By.id("firstName"));
        String addFirstNameValue = "Lee";
        addFirstName.sendKeys(addFirstNameValue);


        WebElement addLastName = driver.findElement(By.id("lastName"));
        String addLastNameValue = "Jay-Wook";
        addLastName.sendKeys(addLastNameValue);

        WebElement addEmail = driver.findElement(By.id("userEmail"));
        String addEmailValue = "Lee.Jay-Wook@email.com";
        addEmail.sendKeys(addEmailValue);


        WebElement addMobile = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        String addMobileValue = "0741456788";
        addMobile.sendKeys(addMobileValue);


        WebElement addPicture = driver.findElement(By.id("uploadPicture"));
        File file = new File("src/test/resources/useforJavacourse.png");
        addPicture.sendKeys(file.getAbsolutePath());

        WebElement maleElement = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        WebElement femaleElement = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement otherElement = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));

        String Gender = "Other";
        if (maleElement.getText().equals(Gender)) {
            maleElement.click();
        } else if (femaleElement.getText().equals(Gender)) {
            femaleElement.click();
        } else if (otherElement.getText().equals(Gender)) {
            otherElement.click();
        }
        WebElement subjectsField = driver.findElement(By.id("subjectsInput"));
        String subjectsValue = "Social Studies";
        subjectsField.sendKeys(subjectsValue);
        subjectsField.sendKeys(Keys.ENTER);

        WebElement stateField = driver.findElement(By.id("react-select-3-input"));
        js.executeScript("arguments[0].click();", stateField);
        stateField.sendKeys("NCR");
        stateField.sendKeys(Keys.ENTER);

        WebElement cityField = driver.findElement(By.id("react-select-4-input"));
        js.executeScript("arguments[0].click();", cityField);
        cityField.sendKeys("Delhi");
        cityField.sendKeys(Keys.ENTER);

        WebElement submitElement = driver.findElement(By.id("submit"));
        js.executeScript("arguments[0].click();", submitElement);

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


        List<WebElement> submittedPracticeFormElements = driver.findElements(By.xpath("//table[@class='table table-dark table-striped table-bordered table-hover']/tbody/tr"));

        for (int i = 0; i < submittedPracticeFormElements.size() - 1; i++) {
            WebElement webElement = submittedPracticeFormElements.get(i);
            String actualTableValue = webElement.getText();
            System.out.println(actualTableValue);
            Assert.assertTrue(actualTableValue.contains("Student Name " + addFirstNameValue + " " + addLastNameValue));
            Assert.assertTrue(actualTableValue.contains("Student Email " + addEmailValue));
            Assert.assertTrue(actualTableValue.contains("Gender " + Gender));
            Assert.assertTrue(actualTableValue.contains("Mobile " + addMobileValue));
            Assert.assertTrue(actualTableValue.contains("Date of Birth " + 	"16 January,2024"));
            Assert.assertTrue(actualTableValue.contains("Subjects " + subjectsValue));
            Assert.assertTrue(actualTableValue.contains("Hobbies " + " "));
            Assert.assertTrue(actualTableValue.contains("Picture " + file.getAbsolutePath()));
            Assert.assertTrue(actualTableValue.contains("Address " + " "));
            Assert.assertTrue(actualTableValue.contains("State and City " + stateField + " " + cityField));
        }


    }
}
