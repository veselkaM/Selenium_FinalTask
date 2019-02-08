package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.List;

public class ProductPage extends HalperBase {

    public ProductPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class ='_28j8Lq95ZZ' and text() = 'Все фильтры']")
    public
    WebElement allFilters;

    @FindBy(xpath = "//div[@class='n-snippet-card2__title']/a")
    public
    List<WebElement> products;

    @FindBy(xpath = ".//*[@class='input__control']")
    public
    WebElement search;

    @FindBy(xpath = "//button[@type='submit']")
    public
    WebElement buttomFind;

    @FindBy(xpath = "/html/body")
    public
    WebElement nameOfProduct;


    @FindBy(xpath = "//*[@class='radio-button__radio radio-button__radio_side_right']")
    public
    WebElement buttomByList;


}
