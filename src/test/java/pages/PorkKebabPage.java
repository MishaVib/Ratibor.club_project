package pages;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class PorkKebabPage {
    ElementsCollection
            buttonsAddToCart = $$x("//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart']");

    SelenideElement
            itemPorkNeck = $x("//h2[contains(text(),'Свиная шея')]"),
            pricePorkNeck = $x("//bdi[contains(text(),'430.00')]"),
            itemPorkFlesh = $x("//h2[contains(text(),'Мякоть свинины')]"),
            pricePorkFlesh = $x("//bdi[contains(text(),'330.00')]"),
            itemPorkLoin = $x("//h2[contains(text(),'Свиная корейка')]"),
            pricePorkLoin = $("bdi", 2),
            itemPorkRibs = $x("//h2[contains(text(),'Свиные ребра')]"),
            pricePorkRibs = $x("//bdi[contains(text(),'440.00')]"),
            itemLulyaFromPork = $x("//h2[contains(text(),'Люля из свинины')]"),
            priceLulyaFromPork = $x("//bdi[contains(text(),'290.00')]"),
            itemAssortedPork = $x("//h2[contains(text(),'Ассорти свинины')]"),
            priceAssortedPork = $x("//bdi[contains(text(),'2,900.00')]");


    public PorkKebabPage checkButtonsAddToCart() {
        buttonsAddToCart.shouldHave(size(6));

        return this;
    }

    public PorkKebabPage checkPorkNeck() {
        itemPorkNeck.shouldBe(visible);
        pricePorkNeck.shouldBe(visible);

        return this;
    }

    public PorkKebabPage checkPorkFlesh() {
        itemPorkFlesh.shouldBe(visible);
        pricePorkFlesh.shouldBe(visible);

        return this;
    }

    public PorkKebabPage checkPorkLoin() {
        itemPorkLoin.shouldBe(visible);
        pricePorkLoin.shouldBe(visible);

        return this;
    }

    public PorkKebabPage checkPorkRibs() {
        itemPorkRibs.shouldBe(visible);
        pricePorkRibs.shouldBe(visible);

        return this;
    }

    public PorkKebabPage checkLulyaFromPork() {
        itemLulyaFromPork.shouldBe(visible);
        priceLulyaFromPork.shouldBe(visible);

        return this;
    }

    public PorkKebabPage checkAssortedPork() {
        itemAssortedPork.shouldBe(visible);
        priceAssortedPork.shouldBe(visible);

        return this;
    }
}