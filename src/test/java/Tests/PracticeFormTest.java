package Tests;

import ShareData.ShareData;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.HomePage;
import pages.PracticeFormPage;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormTest extends ShareData {

    public HomePage homePage;
    public CommonPage commonPage;
    public PracticeFormPage practiceFormPage;

    @Test
    public void automationMethod() {
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        practiceFormPage = new PracticeFormPage(getDriver());

        //declaram un element
        homePage.goToDesiredMenu("Forms");
        commonPage.goToDesiredSubMenu("Practice Form");
        practiceFormPage.completeFirstRegion("Lee","Jay-Wook","Lee.Jay-Wook@email.com","0741456788");
//
//
//        WebElement addFirstName = driver.findElement(By.id("firstName"));
//        elementMethods.fillElement(addFirstName, "Lee");
//
//        WebElement addLastName = driver.findElement(By.id("lastName"));
//        elementMethods.fillElement(addLastName, "Jay-Wook");
//
//        WebElement addEmail = driver.findElement(By.id("userEmail"));
//        elementMethods.fillElement(addEmail, "Lee.Jay-Wook@email.com");
//
//        WebElement addMobile = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
//        elementMethods.fillElement(addMobile, "0741456788");
//
//        WebElement addPicture = driver.findElement(By.id("uploadPicture"));
//        elementMethods.uploadPicture(addPicture);
//
        practiceFormPage.completeGender("Male");
//        WebElement maleElement = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
//        WebElement femaleElement = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
//        WebElement otherElement = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));
//        List<WebElement> genderElement = new ArrayList<>();
//        genderElement.add(maleElement);
//        genderElement.add(femaleElement);
//        genderElement.add(otherElement);
//        elementMethods.selectElementFromListByText(genderElement, "Female");
//
//          practiceFormPage.completeSubject("Social Studies");
          List<String> subject = new ArrayList<>();
          subject.add("Maths");
          subject.add("English");
          practiceFormPage.completeSubjectWithList(subject);

        List<String> hobbies = new ArrayList<>();
        hobbies.add("Sports");
        hobbies.add("Music");
        hobbies.add("Reading");
        practiceFormPage.completeHobbies(hobbies);



//        WebElement subjectsField = driver.findElement(By.id("subjectsInput"));
//        elementMethods.fillElement(subjectsField, "Social Studies");
//        elementMethods.enterValueForElement(subjectsField);
//
//        WebElement stateField = driver.findElement(By.id("react-select-3-input"));
//        javaScriptMethods.selectOrSubmit(stateField);
//        elementMethods.fillElement(stateField, "NCR");
//        elementMethods.enterValueForElement(stateField);
//
//
//        WebElement cityField = driver.findElement(By.id("react-select-4-input"));
//        javaScriptMethods.selectOrSubmit(cityField);
//        elementMethods.fillElement(cityField, "Delhi");
//        elementMethods.enterValueForElement(cityField);
//
//
//        WebElement submitElement = driver.findElement(By.id("submit"));
//        javaScriptMethods.selectOrSubmit(submitElement);
//

    }
}
