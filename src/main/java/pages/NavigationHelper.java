package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class NavigationHelper extends HalperBase {

    public NavigationHelper(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class = 'home-tabs stream-control dropdown2 dropdown2_switcher_elem i-bem home-tabs_js_inited']")
    WebElement menuItems;

    public void selectMenuItem(String itemName) {
        menuItems.findElement(By.xpath("//*[@class = 'home-link home-link_blue_yes home-tabs__link home-tabs__search' and text() = '" + itemName + "']")).click();
    }
}
