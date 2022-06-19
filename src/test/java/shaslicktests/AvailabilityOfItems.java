package shaslicktests;


import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class AvailabilityOfItems extends TestBase {
    MainPage mainPage = new MainPage();
    SoupsPage soupsPage = new SoupsPage();
    BakeryPage bakeryPage = new BakeryPage();
    AssortedKebabPage assortedKebabPage = new AssortedKebabPage();
    LambKebabPage lambKebabPage = new LambKebabPage();

    @Owner("Никита Шутков")
    @Severity(SeverityLevel.NORMAL)
    @Description(
            "Проверка наличия товаров категории супы со стоимостью"
    )
    @Feature("Items")
    @Test
    @Tag("regress")
    @Tag("items")
    @DisplayName("Товары категории Суп")
    void borsh() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Переход в раздел Супы", () -> {
            mainPage.goToSoupsPage();
        });
        step("наличие кнопок Добавить в корзину у всех товаров категории Супы", () -> {
            soupsPage.buttonAdToCartCheck();
        });
        step("Наличие товара Борщ и его стоимости", () -> {
            soupsPage.BorschCheck();
        });
        step("Наличие товара Уха по-царски и его стоимости", () -> {
            soupsPage.soupFishCkeck();
        });
        step("Наличие товара Солянка и его стоимости", () -> {
            soupsPage.soupSolyankaCheck();
        });
        step("Наличие товара Суп куриный и его стоимости", () -> {
            soupsPage.soupChickenCheck();
        });
        step("Наличие товара Харчо и его стоимости", () -> {
            soupsPage.soupHarchoCheck();
        });
        step("Наличие товара Крем суп и его стоимости", () -> {
            soupsPage.creamSoupCheck();
        });
    }

    @Test
    @Tag("regress")
    @Tag("items")
    @DisplayName("Товары категории Выпечка")
    @Owner("Никита Шутков")
    @Description("Наличие товаров категории Выпечка с ценой")
    @Feature("Items")
    @Severity(SeverityLevel.NORMAL)
    void vypechka() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Переход в раздел Выпечка", () -> {
            mainPage.goToBakeryPage();
        });
        step("наличие кнопок Добавить в корзину у всех товаров категории Выпечка", () -> {
            bakeryPage.bakeryButtonAddToCartCheck();
        });
        step("Наличие товара Хачапури по Аджарски и его стоимости", () -> {
            bakeryPage.hachapuriCheck();
        });
        step("Наличие товара Хачапури по Аджарски с двумя яйцами его стоимости", () -> {
            bakeryPage.hachapuriWithTwoEggsCheck();
        });
        step("Наличие товара Хачапури по Имеретински и его стоимости", () -> {
            bakeryPage.hachapuriImretinckyCheck();
        });
        step("Наличие товара Хачапури по Мегрельски и его стоимости", () -> {
            bakeryPage.hachapuriMegrelskyCheck();
        });
    }

    @Test
    @Tag("regress")
    @Tag("items")
    @Owner("Никита Шутков")
    @Description("Содержимое саджест листа Блюда на мангале")
    @DisplayName("Саджест лист Блюда на мангале")
    @Feature("Items")
    @Severity(SeverityLevel.CRITICAL)
    void assortiment() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Саджест лист в верхнем меню скрыт до наведения курсора на Блюда на мангале", () -> {
            $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/assorti-shashlyka/']")
                    .shouldNot(appear).shouldBe(hidden);
            $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/shashlyk-iz-baraniny/']")
                    .shouldNot(appear).shouldBe(hidden);
            $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/shashlyk-iz-svininy/']")
                    .shouldNot(appear).shouldBe(hidden);
            $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/shashlyk-iz-telyatiny/']")
                    .shouldNot(appear).shouldBe(hidden);
            $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/shashlyk-iz-kuritsy/']")
                    .shouldNot(appear).shouldBe(hidden);
            $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/shashlyk-iz-ryby/']")
                    .shouldNot(appear).shouldBe(hidden);
            $x("//a[@href='https://shashlik.club/category/garniry/']")
                    .shouldNot(appear).shouldBe(hidden);
        });
        step("При наведении курсора на Блюда на мангале в верхнем меню саджест лист появляется", () -> {
            $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/']").hover();
            $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/assorti-shashlyka/']")
                    .should(appear).shouldBe(enabled);
            $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/shashlyk-iz-baraniny/']")
                    .should(appear).shouldBe(enabled);
            $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/shashlyk-iz-svininy/']")
                    .should(appear).shouldBe(enabled);
            $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/shashlyk-iz-telyatiny/']")
                    .should(appear).shouldBe(enabled);
            $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/shashlyk-iz-kuritsy/']")
                    .should(appear).shouldBe(enabled);
            $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/shashlyk-iz-ryby/']")
                    .should(appear).shouldBe(enabled);
            $x("//a[@href='https://shashlik.club/category/garniry/']")
                    .should(appear).shouldBe(enabled);
        });
    }

    @Test
    @Tag("regress")
    @Tag("items")
    @Owner("Никита Шутков")
    @Description("Наличие товаров категории Ассорти шашлыка с ценой")
    @DisplayName("Товары категории Ассорти шашлыка")
    @Feature("Items")
    @Severity(SeverityLevel.NORMAL)
    void assortiShashlick() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Навести курсор на Блюда на мангале для появления саджест листа", () -> {
            $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/']").hover();
            $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/assorti-shashlyka/']")
                    .should(appear).shouldBe(visible);
        });
        step("Клик на появившийся саджест Ассорти шашлыка", () -> {
            $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/assorti-shashlyka/']").click();
        });
        step("наличие кнопок Добавить в корзину у всех товаров категории Ассорти шашлыка", () -> {
            assortedKebabPage.assortedKebabButtonsAddToCartCheck();
        });
        step("Наличие товара Ассорти от шефа и его стоимости", () -> {
            assortedKebabPage.assortyFromTheChiefCheck();
        });
        step("Наличие товара Ассорти свинины и его стоимости", () -> {
            assortedKebabPage.assortedPorkCheck();
        });
        step("Наличие товара Ассорти куриное и его стоимости", () -> {
            assortedKebabPage.assortedChickenCheck();
        });
        step("Наличие товара Ассорти баранины и его стоимости", () -> {
            assortedKebabPage.assortedLambCheck();
        });
        step("Наличие товара Ассорти мякоти и его стоимости", () -> {
            assortedKebabPage.assortedFleshCheck();
        });
        step("Наличие товара Ассорти люля и его стоимости", () -> {
            assortedKebabPage.assortedLulaKebabCheck();
        });
    }

    @Test
    @Tag("regress")
    @Tag("items")
    @Owner("Никита Шутков")
    @Description("Наличие товаров категории Шашлык из баранины с ценой")
    @DisplayName("Товары категории Шашлык из баранины")
    @Feature("Items")
    @Severity(SeverityLevel.NORMAL)
    void shashlickIsBaraniny() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Навести курсор на Блюда на мангале для появления саджест листа", () -> {
            mainPage.hoverLambKebabFromSuggestList();
        });
        step("Клик на Шашлык из баранины из саджест листа для перехода на страницу", () -> {
            mainPage.clickLambKebabFromSuggestList();
        });
        step("наличие кнопок Добавить в корзину у всех товаров категории Шашлык из баранины", () -> {
            lambKebabPage.checkButtonsAddToCart();
        });
        step("Наличие товара Мякоть баранины и его стоимости", () -> {
           lambKebabPage.checkItemLambFlesh();
        });
        step("Наличие товара Каре ягненка и его стоимости", () -> {
            lambKebabPage.checkItemRackOfLamb();
        });
        step("Наличие товара Баранья корейка и его стоимости", () -> {
           lambKebabPage.checkItemLambLoin();
        });
        step("Наличие товара Шашлык из седла баранины и его стоимости", () -> {
            lambKebabPage.checkItemLambSaddleKebab();
        });
        step("Наличие товара Бараньи ребра и его стоимости", () -> {
           lambKebabPage.checkItemLambRibs();
        });
        step("Наличие товара Баранья печень с курдюком и его стоимости", () -> {
            lambKebabPage.checkItemLambLiver();
        });
        step("Наличие товара Люля из баранины и его стоимости", () -> {
            lambKebabPage.checkLulyaFromLamb();
        });
        step("Наличие товара Ассорти баранины и его стоимости", () -> {
            lambKebabPage.checkAssortedKebab();
        });
    }

    @Test
    @Tag("regress")
    @Tag("items")
    @Owner("Никита Шутков")
    @Description("Наличие товаров категории Шашлык из свинины с ценой")
    @DisplayName("Товары категории Шашлык из свинины")
    @Feature("Items")
    @Severity(SeverityLevel.NORMAL)
    void shashlickIsSvininy() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Навести курсор на Блюда на мангале для появления саджест листа", () -> {
            $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/']").hover();
            $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/shashlyk-iz-svininy/']")
                    .should(appear).shouldBe(enabled);
        });
        step("Клик на Шашлык из свинины из саджест листа", () -> {
            $x("//a[@href='https://shashlik.club/category/blyuda-na-mangale/shashlyk-iz-svininy/']")
                    .click();
        });
        step("Наличие товара Свиная шея и его стоимости", () -> {
            $x("//h2[contains(text(),'Свиная шея')]").shouldBe(visible);
            $x("//bdi[contains(text(),'430.00')]").shouldBe(visible);
        });
        step("Наличие товара Мякоть свинины и его стоимости", () -> {
            $x("//h2[contains(text(),'Мякоть свинины')]").shouldBe(visible);
            $x("//bdi[contains(text(),'330.00')]").shouldBe(visible);
        });
        step("Наличие товара Свиная корейка и его стоимости", () -> {
            $x("//h2[contains(text(),'Свиная корейка')]").shouldBe(visible);
            $("bdi", 2).shouldHave(exactText("430.00 Р")).shouldBe(visible);
        });
        step("Наличие товара Свиные ребра и его стоимости", () -> {
            $x("//h2[contains(text(),'Свиные ребра')]").shouldBe(visible);
            $x("//bdi[contains(text(),'440.00')]").shouldBe(visible);
        });
        step("Наличие товара Люля из свинины", () -> {
            $x("//h2[contains(text(),'Люля из свинины')]").shouldBe(visible);
            $x("//bdi[contains(text(),'290.00')]").shouldBe(visible);
        });
        step("Наличие товара Ассорти свинины и его стоимости", () -> {
            $x("//h2[contains(text(),'Ассорти свинины')]").shouldBe(visible);
            $x("//bdi[contains(text(),'2,900.00')]").shouldBe(visible);
        });
    }

    @Test
    @Tag("regress")
    @Tag("items")
    @Owner("Никита Шутков")
    @Description("Наличие категории товаров на главной странице не в табе")
    @DisplayName("Товары на главной странице сайта")
    @Feature("Items")
    @Severity(SeverityLevel.CRITICAL)
    void link_2() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Проверяем наличие категории Блюда на мангале", () -> {
            mainPage.dishesOnGrillCheck();
        });
        step("Проверяем наличие категории Салаты и закуски", () -> {
            mainPage.saladsCheck();
        });
        step("Проверяем наличие категории Выпечка", () -> {
            mainPage.bakeryCheck();
        });
        step("Проверяем наличие категории Наш Партнер ЦС Феникс", () -> {
            mainPage.ourPartnerCheck();
        });
    }
}

