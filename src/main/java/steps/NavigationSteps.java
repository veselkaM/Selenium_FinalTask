package steps;

import pages.NavigationHelper;
import ru.yandex.qatools.allure.annotations.Step;

public class NavigationSteps {

    @Step("выбран пункт меню {0}")
    public void selectMenuItem(String menuItem){
        new NavigationHelper().selectMenuItem(menuItem);
    }

}
