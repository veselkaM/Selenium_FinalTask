package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class AllFiltersPage extends HalperBase {

    public AllFiltersPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='glf-pricefrom-var']")
    public
    WebElement priceFrom;

    @FindBy(xpath = "//*[@class='checkbox__label']")
    WebElement makerItems;

    public void selectMakerItems(String itemName) {
        makerItems.findElement(By.xpath("//*[@class='checkbox__label' and text() = '" + itemName + "']")).click();
    }

    @FindBy(xpath = "//*[@class='button button_size_l button_theme_pseudo i-bem button_action_show-filtered n-filter-panel-extend__controll-button_size_big button_js_inited']")
    public
    WebElement showResultButtom;

}
