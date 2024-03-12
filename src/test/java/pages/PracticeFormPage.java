package pages;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormPage {
    WebDriver driver;
    ElementsMethods elementsMethods;
    JavaScriptMethods javaScriptMethods;

    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
        this.elementsMethods = new ElementsMethods(driver);
        this.javaScriptMethods = new JavaScriptMethods(driver);
        PageFactory.initElements(driver, this);
    }

    //identificam elementele web specifice pt aceasta pagina;
    @FindBy(id = "firstName")
    private WebElement firstNameElement;

    @FindBy(id = "lastName")
    private WebElement lastNameElement;

    @FindBy(id = "userEmail")
    private WebElement emailElement;

    @FindBy(css = "input[placeholder='Mobile Number']")
    private WebElement mobileNumberElement;

    @FindBy(id = "uploadPicture")
    private WebElement pictureElement;

    @FindBy(xpath = "//label[@for='gender-radio-1']")
    private WebElement genderMaleElement;
    @FindBy(xpath = "//label[@for='gender-radio-2']")
    private WebElement genderFemaleElement;
    @FindBy(xpath = "//label[@for='gender-radio-3']")
    private WebElement genderOtherElement;

    @FindBy(id = "react-select-3-input")
    private WebElement stateElement;

    @FindBy(id = "react-select-4-input")
    private WebElement cityElement;

    @FindBy(id = "subjectsInput")
    private WebElement subjectElement;
//    @FindBy(xpath = "//div[@id='subjectsContainer']")
//    WebElement subjectElement;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
    private WebElement sportHobby;
    @FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
    private WebElement readingHobby;
    @FindBy(xpath = "//label[@for='hobbies-checkbox-3']")
    private WebElement musicHobby;


    // metode specifice pentru pagina;
    public void completeFirstRegion(String firstName, String lastName, String email, String mobileNumber) {
        elementsMethods.fillElement(firstNameElement, firstName);
        elementsMethods.fillElement(lastNameElement, lastName);
        elementsMethods.fillElement(emailElement, email);
        elementsMethods.fillElement(mobileNumberElement, mobileNumber);
    }

    public void completeGender(String gender) {
        switch (gender) {
            case "Male":
                elementsMethods.clickOnElements(genderMaleElement);
                break;
            case "Female":
                elementsMethods.clickOnElements(genderFemaleElement);
                break;
            case "Other":
                elementsMethods.clickOnElements(genderOtherElement);
                break;
        }
    }

    public void completeSubject(String subject) {
        javaScriptMethods.scrollOnPage();
        elementsMethods.clickOnElements(subjectElement);
        elementsMethods.fillActions(subjectElement, subject);
    }

    public void completeSubjectWithList(List<String> list) {
        javaScriptMethods.scrollOnPage();
        elementsMethods.clickOnElements(subjectElement);
        elementsMethods.fillMultipleValues(subjectElement, list);

    }

    public void completeHobbies(List<String> hobbies){
        List<WebElement> hobbiesElement = new ArrayList<>();
        hobbiesElement.add(sportHobby);
        hobbiesElement.add(readingHobby);
        hobbiesElement.add(musicHobby);
        elementsMethods.clickMultipleValues(hobbiesElement, hobbies);
        javaScriptMethods.scrollOnPage();


    }
}
