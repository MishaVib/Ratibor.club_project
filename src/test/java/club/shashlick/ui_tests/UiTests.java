package club.shashlick.ui_tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

import static io.qameta.allure.Allure.step;


public class UiTests extends TestBase {
    MainPage mainPage = new MainPage();
    SoupsPage soupsPage = new SoupsPage();
    BakeryPage bakeryPage = new BakeryPage();
    AssortedKebabPage assortedKebabPage = new AssortedKebabPage();
    LambKebabPage lambKebabPage = new LambKebabPage();
    PorkKebabPage porkKebabPage = new PorkKebabPage();
    BookingPage bookingPage = new BookingPage();
    DishesOnGrillPage dishesOnGrillPage = new DishesOnGrillPage();
    PorkLoinPage porkLoinPage = new PorkLoinPage();
    CartPage cartPage = new CartPage();
    ClientFormPage clientFormPage = new ClientFormPage();

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
            mainPage.checkSuggestListIsHidden();
        });
        step("При наведении курсора на Блюда на мангале в верхнем меню саджест лист появляется", () -> {
            mainPage.checkSuggestListShouldAppear();
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
            mainPage.hoverAssortedKebabFromSuggestList();
        });
        step("Клик на появившийся саджест Ассорти шашлыка", () -> {
            mainPage.clickAssortedKebabFromSuggestList();
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
            mainPage.hoverPorkKebabFromSuggestList();
        });
        step("Клик на Шашлык из свинины из саджест листа", () -> {
            mainPage.clickPorkKebabFromSuggestList();
        });
        step("наличие кнопок Добавить в корзину у всех товаров категории Шашлык из баранины", () -> {
            porkKebabPage.checkButtonsAddToCart();
        });
        step("Наличие товара Свиная шея и его стоимости", () -> {
            porkKebabPage.checkPorkNeck();
        });
        step("Наличие товара Мякоть свинины и его стоимости", () -> {
            porkKebabPage.checkPorkFlesh();
        });
        step("Наличие товара Свиная корейка и его стоимости", () -> {
            porkKebabPage.checkPorkLoin();
        });
        step("Наличие товара Свиные ребра и его стоимости", () -> {
            porkKebabPage.checkPorkRibs();
        });
        step("Наличие товара Люля из свинины", () -> {
            porkKebabPage.checkLulyaFromPork();
        });
        step("Наличие товара Ассорти свинины и его стоимости", () -> {
            porkKebabPage.checkAssortedPork();
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

    @Test
    @Tag("acceptance")
    @Tag("order")
    @Owner("Никита Шутков")
    @Severity(SeverityLevel.BLOCKER)
    @Description(
            "Проверка успешного создания заказа шашлыка"
    )
    @Feature("Оформление заказа")
    void successOrder() {
        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });
        step("Наличие номера телефона и заголовка", () -> {
            mainPage.headerAndPhoneCheck();
        });
        step("Переход в раздел блюда на мангале", () -> {
            mainPage.clickDishesOnGrill();
        });
        step("Переход в товар Свиная корейка и добавляем одну штуку в корзину", () -> {
            dishesOnGrillPage.clickPorkLoin();
            porkLoinPage.clickButtonAddToCart();
        });
        step("Переход в корзину и добавление товара кликом на плюсик", () -> {
            porkLoinPage.clkickButtonViewCart();
            cartPage.clickButtonPlus();
        });
        step("Переход в оформление заказа и ввод данных для получения заказа", () -> {
            cartPage.clickButtonSetAnOrder();
            clientFormPage.fillClientForm();
        });
        step("Выбор самовывоза и подтверждение заказа", () -> {
            cartPage
                    .clickRadioButton()
                    .clickConfirmButton();

        });
    }

    @Test
    @Tag("acceptance")
    @Tag("booking")
    @Owner("Никита Шутков")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Элементы страницы Забронировать стол")
    @Description(
            "Страница бронирования столика"
    )
    @Feature("Бронь")
    void bookingTable() {
        step("Открываем главную страницу", () -> {
            bookingPage.openMainPage();
        });
        step("Клик на кнопку Забронировать стол", () -> {
            bookingPage.buttonClick();
        });
        step("Проверка элементов в разделе бронирования стола", () -> {
            bookingPage
                    .bookingHeaderCheck()
                    .textAboutBookingCheck().phoneNumberCheck()
                    .siteInfo().linkInSiteInfoCheck();
        });
    }

    @Test
    @Owner("Никита Шутков")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Переход по ссылке")
    @Description(
            "Переход по ссылке на сайт Оригинальные Швейцарские часы"
    )
    @Feature("Ссылка")
    void deeplink() {
        step("Открыть страницу Забронировать стол", () -> {
            bookingPage.openBookingPage();

        });
        step("Клик по ссылке", () -> {
            bookingPage.clickBySwissClock();
        });
        step("Проверка, что открылся сайт", () -> {
            bookingPage.swissHeaderCheck();
        });
    }

    @Test
    @Tag("acceptance")
    @Tag("search")
    @Owner("Никита Шутков")
    @Severity(SeverityLevel.CRITICAL)
    @Description(
            "Результат поисковой выдачи без ввода данных"
    )
    @Feature("Поисковая строка")
    @DisplayName("Результат поисковой выдачи без введенных данных")
    void emptyValueInput() {
        mainPage
                .openMainPage()
                .setNullValueInSearchInput();

    }
}

