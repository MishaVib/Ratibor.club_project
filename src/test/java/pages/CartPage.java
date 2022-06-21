package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    SelenideElement
            buttonPlus = $(byText("+"));

    public CartPage clickButtonPlus() {
        buttonPlus.doubleClick();

        return this;
    }
}
