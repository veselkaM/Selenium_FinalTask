package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MarketPage extends HalperBase {

    public MarketPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class ='n-w-tab__control-caption']")
    WebElement MarketMenuItems;

    public void selectMarketMenuItem(String itemName) {
        MarketMenuItems.findElement(By.xpath("//span[@class ='n-w-tab__control-caption' and text()='" + itemName + "']")).click();
    }
}

