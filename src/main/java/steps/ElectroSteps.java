package steps;

import pages.ElectroPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ElectroSteps {

    @Step("Выбран раздел {0}")
    public void selectElectroMenuItem(String menuItem){
        new ElectroPage().selectElectroMenuItem(menuItem);
    }
}
