package steps;

import pages.AllFiltersPage;
import ru.yandex.qatools.allure.annotations.Step;

public class AllFiltersSteps {


    @Step("поле цена От заполняется значением {0}")
    public static void fillField(String value) {
        AllFiltersPage allFiltersPage = new AllFiltersPage();
        allFiltersPage.type(allFiltersPage.priceFrom, value);
    }

    @Step("выбран производитель {0}")
    public void selectMakerItems(String itemName){
        new AllFiltersPage().selectMakerItems(itemName);
    }

    @Step("Выполнено нажатие на Показать подходящие")
    public void showResult() {
        new AllFiltersPage().showResultButtom.click();
    }
}
