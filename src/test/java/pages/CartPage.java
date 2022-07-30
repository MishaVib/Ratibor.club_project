package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CartPage {

    // элементы для добавления товара в корзину
    private SelenideElement
            buttonPlus = $(byText("+")),
            buttonSetAnOrder = $x("//a[@href='https://shashlik.club/checkout/']"),
            radioButton = $(byText("Самовывоз")),
            confirmButton = $(byText("Подтвердить заказ"));

    private SelenideElement
            emptyCart = $("div.woocommerce p"),
            returnToShop = $(byText("Вернуться в магазин"));

    private final String urlMenu = "https://shashlik.club/meny/";

    public CartPage clickButtonPlus() {
        buttonPlus.doubleClick();

        return this;
    }

    public CartPage clickButtonSetAnOrder() {
        buttonSetAnOrder.click();

        return this;
    }

    public CartPage clickRadioButton() {
        radioButton.click();

        return this;
    }

    public CartPage clickConfirmButton() {
        confirmButton.click();
        sleep(3000);

        return this;
    }

    public CartPage checkCartEmprty() {
        emptyCart.shouldHave(Condition.text("Ваша корзина пока пуста.")).shouldBe(Condition.visible);
        returnToShop
                .shouldHave(Condition.attribute("href", urlMenu))
                .shouldBe(Condition.enabled);

        return this;
    }
}
