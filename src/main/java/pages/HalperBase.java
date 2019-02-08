package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;


public class HalperBase {

    public HalperBase() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }


    public void type(WebElement element, String text) {
        if (text != null) {
            String existingTest = element.getAttribute("value");
            if (!text.equals(existingTest)) {
                element.clear();
                element.sendKeys(text);
            }
        }
    }
}
