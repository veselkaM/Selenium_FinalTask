package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    NavigationSteps navigation = new NavigationSteps();
    MarketSteps market = new MarketSteps();
    ElectroSteps electro = new ElectroSteps();
    ProductSteps product = new ProductSteps();
    AllFiltersSteps allFilters = new AllFiltersSteps();
    String itemOfSearch;


    @When("^выбран пункт меню \"(.+)\"$")
    public void selectMenuItem(String menuName) {
        navigation.selectMenuItem(menuName);
    }


    @When("^Выбран пункт меню Маркета \"(.+)\"$")
    public void selectMarketMenuItem(String menuName) {
        market.selectMarketMenuItem(menuName);
    }

    @When("^Выбран раздел \"(.+)\"$")
    public void selectElectroMenuItem(String menuName) {
        electro.selectElectroMenuItem(menuName);
    }

    @When("^Выполнен переход в расширенный поиск$")
    public void chooseAllFilters() {
        product.chooseAllFilters();
    }

    @When("^поле цена От заполняется значением \"(.+)\"$")
    public void fillField(String value) {
        allFilters.fillField(value);
    }

    @When("^выбран производитель \"(.+)\"$")
    public void selectMakerItems(String itemName) {
        allFilters.selectMakerItems(itemName);
    }

    @When("^Выполнено нажатие на Показать подходящие$")
    public void showResult() {
        allFilters.showResult();
    }

    @Then("^Элементов на странице \"(.+)\"$")
    public void checkCountElements(int expected) {
        product.checkCountElements(expected);
    }

    @When("^запомнен \"(.+)\"  элемен в списке$")
    public void getFirstItemName(int element) {
        itemOfSearch = product.getFirstItemName(element);
    }

    @When("^в поисковую строку введено запомненное значение$")
    public void stepEnterValueToSearchLine() {
        product.fillField(itemOfSearch);
    }

    @When("^Выполненo нажатие на поиск$")
    public void pushButtomFind() {
        product.pushButtomFind();
    }

    @When("^Выполненo нажатие на отображение списком$")
    public void pushButtomByList() {
        product.pushButtomByList();
    }

    @Then("^Наименование товара соответствует запомненному значению$")
    public void assertNameOfProduct() {
        product.assertNameOfProduct(itemOfSearch);
    }


}
