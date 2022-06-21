package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PorkLoinPage {
    SelenideElement
    buttonAddToCart = $("[name=add-to-cart]"),
    buttonViewCart = $x("//a[@href='https://shashlik.club/cart/']");


    public PorkLoinPage clickButtonAddToCart() {
        buttonAddToCart.click();

        return this;
    }
    public PorkLoinPage clkickButtonViewCart() {
        buttonViewCart.click();

        return this;
    }
}
