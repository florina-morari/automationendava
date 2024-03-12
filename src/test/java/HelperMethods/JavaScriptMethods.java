package HelperMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptMethods {
    WebDriver driver;
    JavascriptExecutor js;

    public JavaScriptMethods(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
    }


    public void scrollOnPage() {

        js.executeScript("window.scrollBy(0,400)"); //x=0,y=400 (axa)
    }

    public void selectOrSubmit(WebElement element) {

        js.executeScript("arguments[0].click();", element);
    }
}
