package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    // связано с поиском
    private SelenideElement
            input = $(".search-field"),
            searchNullResult = $("h1");

    // для перехода и категории товаров не в табе
    // и пикчи
    private SelenideElement
            linkToSoupPage = $(byText("Супы")),
            linkToBakeryPage = $(byText("Выпечка")),
            dishesOnGrill = $x("//a[normalize-space()='Блюда на Мангале']"),
            dishesOnGrillImage = $x("//img[@class='wp-image-180 lazyloaded']"),
            salads = $x("//a[normalize-space()='Салаты и Закуски']"),
            saladsImage = $x("//img[@class='wp-image-13248 lazyloaded']"),
            bakery = $x("//a[normalize-space()='Выпечка']"),
            bakeryImage = $(" img.wp-image-14463.alignright.lazyloaded"),
            ourPartner = $x("//a[normalize-space()='Наш Партнер ЦС Феникс']"),
            ourPartnerImage = $x("//img[@class='wp-image-14050 alignright lazyloaded']");

    // саджесты
    private SelenideElement
            suggestListLambKebab = $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/shashlyk-iz-baraniny/']"),
            dishesOnGrillSuggestList = $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/']"),
            suggestListAssortedKebab = $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/assorti-shashlyka/']"),
            suggestListPorkKebab = $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/shashlyk-iz-svininy/']"),
            suggestListBeefKebab = $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/shashlyk-iz-telyatiny/']"),
            suggestListChickenKebab = $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/shashlyk-iz-kuritsy/']"),
            suggestListFishKebab = $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/shashlyk-iz-ryby/']"),
            suggestListSideDishes = $x("//a[@href='https://shashlik.club/category/garniry/']");


    private SelenideElement
            telephone = $(".tphone"),
            header = $("#primary"),
            makeAnOrder = $(byText("Оформление заказа")),
            cart = $("i");


    public MainPage openMainPage() {
        open("https://shashlik.club/");

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
        dishesOnGrillImage.shouldBe(image);

        return this;
    }

    public MainPage saladsCheck() {
        salads.shouldBe(enabled);
        saladsImage.shouldBe(image);

        return this;
    }

    public MainPage bakeryCheck() {
        bakery.shouldBe(enabled);
        bakeryImage.shouldBe(image);

        return this;
    }

    public MainPage ourPartnerCheck() {
        ourPartner.shouldBe(enabled);
        ourPartnerImage.shouldBe(image);

        return this;
    }

    public MainPage clickLambKebabFromSuggestList() {
        suggestListLambKebab.click();

        return this;

    }

    public MainPage hoverLambKebabFromSuggestList() {
        dishesOnGrillSuggestList.hover();
        suggestListLambKebab.should(appear).shouldBe(enabled);

        return this;
    }

    public MainPage hoverAssortedKebabFromSuggestList() {
        dishesOnGrillSuggestList.hover();
        suggestListAssortedKebab.should(appear).shouldBe(enabled);

        return this;
    }

    public MainPage checkSuggestListIsHidden() {
        suggestListAssortedKebab.shouldNot(appear).shouldBe(hidden);
        suggestListLambKebab.shouldNot(appear).shouldBe(hidden);
        suggestListPorkKebab.shouldNot(appear).shouldBe(hidden);
        suggestListBeefKebab.shouldNot(appear).shouldBe(hidden);
        suggestListChickenKebab.shouldNot(appear).shouldBe(hidden);
        suggestListFishKebab.shouldNot(appear).shouldBe(hidden);
        suggestListSideDishes.shouldNot(appear).shouldBe(hidden);

        return this;
    }

    public MainPage checkSuggestListShouldAppear() {
        dishesOnGrillSuggestList.hover();
        suggestListAssortedKebab.should(appear).shouldBe(enabled);
        suggestListLambKebab.should(appear).shouldBe(enabled);
        suggestListPorkKebab.should(appear).shouldBe(enabled);
        suggestListBeefKebab.should(appear).shouldBe(enabled);
        suggestListChickenKebab.should(appear).shouldBe(enabled);
        suggestListFishKebab.should(appear).shouldBe(enabled);
        suggestListSideDishes.should(appear).shouldBe(enabled);

        return this;
    }

    public MainPage clickAssortedKebabFromSuggestList() {
        suggestListAssortedKebab.click();

        return this;
    }

    public MainPage clickPorkKebabFromSuggestList() {
        suggestListPorkKebab.click();

        return this;
    }

    public MainPage hoverPorkKebabFromSuggestList() {
        dishesOnGrillSuggestList.hover();
        suggestListPorkKebab.should(appear).shouldBe(enabled);

        return this;
    }

    public MainPage headerAndPhoneCheck() {
        header.shouldHave(text("Шашлык от кафе Ратибор"));
        telephone.shouldHave(text("+7 (930) 222 00 32"));

        return this;
    }

    public MainPage clickDishesOnGrill() {
        dishesOnGrillSuggestList.click();

        return this;
    }

    public MainPage clickMakeAnOrder() {
        makeAnOrder.click();

        return this;
    }

    public MainPage clickCart() {
        cart.shouldHave(cssClass("wpmenucart-icon-shopping-cart-0")).click();

        return this;
    }

}
