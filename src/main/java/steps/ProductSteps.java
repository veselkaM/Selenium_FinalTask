package steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.ProductPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.List;

public class ProductSteps {

    @Step("Выполнен переход в расширенный поиск")
    public void chooseAllFilters() {
        new ProductPage().allFilters.click();
    }

    @Step("Элементов на странице {0}")
    public void checkCountElements(int expected) {
        List<WebElement> items = new ProductPage().products;
        int actual = items.size();
        Assert.assertEquals("Число элементов не соответсвует ожиданию!", expected, actual);
    }

    @Step("запомнен {0} телевизор в списке")
    public String getFirstItemName(int element) {
        List<WebElement> items = new ProductPage().products;
        String firstName = items.get(element).getText();
        return firstName;
    }


    @Step("В поле поиска введено значение {0}")
    public static void fillField(String element) {
        ProductPage product = new ProductPage();
        product.type(product.search, element);
    }

    @Step("Выполненo нажатие на поиск")
    public void pushButtomFind() {
        new ProductPage().buttomFind.click();
    }

    @Step("Наименование товара соответствует запомненному значению")
    public void assertNameOfProduct(String element) {
        new ProductPage().nameOfProduct.getText().compareTo(element);
    }

    @Step("Выполненo нажатие на отображение списком")
    public void pushButtomByList() {
        new ProductPage().buttomByList.click();
    }

}
