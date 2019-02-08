package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;


public class MarketSteps {

    @Step("Выбран пункт меню Маркета {0}")
    public void selectMarketMenuItem(String menuItem){
        new MarketPage().selectMarketMenuItem(menuItem);
    }


}
