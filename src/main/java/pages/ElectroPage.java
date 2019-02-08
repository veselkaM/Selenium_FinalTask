package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class ElectroPage extends HalperBase {

    public ElectroPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class ='_2qvOOvezty _2x2zBaVN-3 _9qbcyI_fyS']")
    WebElement menuElectroItems;

    public void selectElectroMenuItem(String itemName) {
        menuElectroItems.findElement(By.xpath("//*[@class ='_2qvOOvezty _2x2zBaVN-3 _9qbcyI_fyS' and contains(text(), '" + itemName + "')]")).click();
    }
}
