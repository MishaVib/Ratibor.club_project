package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class AssortedKebabPage {

    ElementsCollection
    assortedKebabButtonsAddToCart = $$x("//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart']");


    SelenideElement
    assortyFromTheChief = $x("//h2[contains(text(),'Ассорти От шефа')]"),
    priceAssortyFromTheChief = $x("//bdi[contains(text(),'5,200.00')]"),
    assortedPork = $x("//h2[contains(text(),'Ассорти свинины')]"),
    priceAssortedPork = $x("//bdi[contains(text(),'2,900.00')]"),
    assortedChicken = $x("//h2[contains(text(),'Ассорти куриное')]"),
    priceAssortedChicken = $x("//bdi[contains(text(),'2,550.00')]"),
    assortedLamb = $x("//h2[contains(text(),'Ассорти баранины')]"),
    priceAssortedLamb = $x("//bdi[contains(text(),'5,400.00')]"),
    assortedFlesh = $x("//h2[contains(text(),'Ассорти мякоти')]"),
    priceAssortedFlesh = $x("//bdi[contains(text(),'3,360.00')]"),
    assortedLulaKebab = $x("//h2[contains(text(),'Ассорти люля')]"),
    priceAssortedLulaKebab = $x("//bdi[contains(text(),'1,340.00')]");


    public AssortedKebabPage assortedKebabButtonsAddToCartCheck() {
        assortedKebabButtonsAddToCart.shouldHave(size(6));

        return this;
    }
    public AssortedKebabPage assortyFromTheChiefCheck() {
        assortyFromTheChief.shouldBe(visible);
        priceAssortyFromTheChief.shouldBe(visible);

        return this;
    }
    public AssortedKebabPage assortedPorkCheck() {
        assortedPork.shouldBe(visible);
        priceAssortedPork.shouldBe(visible);

        return this;
    }
    public AssortedKebabPage assortedChickenCheck() {
        assortedChicken.shouldBe(visible);
        priceAssortedChicken.shouldBe(visible);

        return this;
    }

    public AssortedKebabPage assortedLambCheck() {
        assortedLamb.shouldBe(visible);
        priceAssortedLamb.shouldBe(visible);

        return this;
    }
    public AssortedKebabPage assortedFleshCheck() {
        assortedFlesh.shouldBe(visible);
        priceAssortedFlesh.shouldBe(visible);

        return this;
    }
    public AssortedKebabPage assortedLulaKebabCheck() {
        assortedLulaKebab.shouldBe(visible);
        priceAssortedLulaKebab.shouldBe(visible);

        return this;
    }



}
