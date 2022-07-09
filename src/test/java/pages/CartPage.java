package pages;

import com.codeborne.selenide.Selenide;
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

        return this;
    }
}
