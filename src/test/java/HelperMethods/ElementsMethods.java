package HelperMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;

public class ElementsMethods {
    WebDriver driver;
    Actions actions;

    public ElementsMethods(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    public void clickOnElements(WebElement element) {
        element.click();
    }

    public void fillElement(WebElement element, String value) {
        element.sendKeys(value);
    }

    public void uploadPicture(WebElement element) {
        File file = new File("src/test/resources/useforJavacourse.png");
        element.sendKeys(file.getAbsolutePath());
    }

    public void selectElementFromListByText(List<WebElement> elementsList, String value) {
        for (int i = 0; i < elementsList.size(); i++) {
            if (elementsList.get(i).getText().equals(value)) {
                clickOnElements(elementsList.get(i));
            }
        }

    }

    public void enterValueForElement(WebElement element) {
        element.sendKeys(Keys.ENTER);
    }


    public void fillActions(WebElement element, String value) {
        actions.sendKeys(value).perform();
        explicitElementVisibleWait(element);
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void explicitElementVisibleWait(WebElement element) {
        //definim un wait explicit ca sa astepte dupa alerta
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void fillMultipleValues(WebElement element, List<String> list) {
        for (String value : list) {
            element.sendKeys(value);
            element.sendKeys(Keys.ENTER);
        }
    }

    public void clickMultipleValues(List<WebElement> elements, List<String> list) {
        for (String value : list) {
            for (WebElement element : elements) {
                if (element.getText().equals(value)) {
                    element.click();
                }

            }
        }
    }
}
