package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    SelenideElement

            input = $(".search-field"),
            searchNullResult = $("h1"),
            linkToSoupPage = $(byText("Супы")),
            linkToBakeryPage = $(byText("Выпечка")),
            dishesOnGrill = $x("//a[normalize-space()='Блюда на Мангале']"),
            salads = $x("//a[normalize-space()='Салаты и Закуски']"),
            bakery = $x("//a[normalize-space()='Выпечка']"),
            ourPartner = $x("//a[normalize-space()='Наш Партнер ЦС Феникс']");




    public MainPage openMainPage() {
        open("https://shashlik.club");

        return this;
    }

    public MainPage setNullValueInSearchInput() {
        input.shouldBe(empty).setValue("").pressEnter();
        searchNullResult.shouldHave(text("Результат поиска: “”")).shouldBe(visible);

        return this;
    }

    public MainPage goToSoupsPage() {
        linkToSoupPage.click();

        return this;
    }

    public MainPage goToBakeryPage() {
        linkToBakeryPage.click();

        return this;
    }
    public MainPage dishesOnGrillCheck() {
        dishesOnGrill.shouldBe(enabled);

        return this;
    }

    public MainPage saladsCheck() {
        salads.shouldBe(enabled);

        return this;
    }
    public MainPage bakeryCheck() {
        bakery.shouldBe(enabled);

        return this;
    }
    public MainPage ourPartnerCheck() {
        ourPartner.shouldBe(enabled);

        return this;
    }


}
