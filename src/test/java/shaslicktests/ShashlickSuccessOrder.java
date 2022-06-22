package shaslicktests;

import io.qameta.allure.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

import static io.qameta.allure.Allure.step;

public class ShashlickSuccessOrder extends TestBase {
    MainPage mainPage = new MainPage();
    DishesOnGrillPage dishesOnGrillPage = new DishesOnGrillPage();
    PorkLoinPage porkLoinPage = new PorkLoinPage();
    CartPage cartPage = new CartPage();
    ClientFormPage clientFormPage = new ClientFormPage();


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
}

