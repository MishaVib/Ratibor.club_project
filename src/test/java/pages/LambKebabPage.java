package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class LambKebabPage {
    ElementsCollection
            buttonsAddToCart = $$x("//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart']");

    SelenideElement
            itemLambFlesh = $x("//h2[contains(text(),'Мякоть баранины')]"),
            priceLambFlesh = $x("//bdi[contains(text(),'730.00')]"),
            itemRackOfLamb = $x("//h2[contains(text(),'Каре ягненка')]"),
            priceRackOfLamb = $x("//bdi[contains(text(),'1,000.00')]"),
            lambLoin = $x("//h2[contains(text(),'Баранья корейка')]"),
            priceLambLoin = $x("//bdi[contains(text(),'750.00')]"),
            lambSaddleKebab = $x("//h2[contains(text(),'Шашлык из седла баранины')]"),
            priceLambSaddleKebab = $x("//bdi[contains(text(),'650.00')]"),
            lambRibs = $x("//h2[contains(text(),'Бараньи ребра')]"),
            priceLambRibs = $x("//bdi[contains(text(),'500.00')]"),
            lambLiver = $x("//h2[contains(text(),'Баранья печень с курдюком')]"),
            priceLambLiver = $x("//bdi[contains(text(),'450.00')]"),
            lulyaFromLamb = $x("//h2[contains(text(),'Люля из баранины')]"),
            priceLulyaFromLamb = $x("//bdi[contains(text(),'400.00')]"),
            assortedLamb = $x("//h2[contains(text(),'Ассорти баранины')]"),
            priceAssortedLamb = $x("//bdi[contains(text(),'5,400.00')]");

    public LambKebabPage checkButtonsAddToCart() {
        buttonsAddToCart.shouldHave(size(8));

        return this;
    }
    public LambKebabPage checkItemLambFlesh() {
        itemLambFlesh.shouldBe(visible);
        priceLambFlesh.shouldBe(visible);

        return this;
    }
    public LambKebabPage checkItemRackOfLamb() {
        itemRackOfLamb.shouldBe(visible);
        priceRackOfLamb.shouldBe(visible);

        return this;
    }
    public LambKebabPage checkItemLambLoin() {
        lambLoin.shouldBe(visible);
        priceLambLoin.shouldBe(visible);

        return this;

    }
    public LambKebabPage checkItemLambSaddleKebab() {
        lambSaddleKebab.shouldBe(visible);
        priceLambSaddleKebab.shouldBe(visible);

        return this;
    }
    public LambKebabPage checkItemLambRibs() {
        lambRibs.shouldBe(visible);
        priceLambRibs.shouldBe(visible);

        return this;
    }
    public LambKebabPage checkItemLambLiver() {
        lambLiver.shouldBe(visible);
        priceLambLiver.shouldBe(visible);

        return this;
    }
    public LambKebabPage checkLulyaFromLamb() {
        lulyaFromLamb.shouldBe(visible);
        priceLulyaFromLamb.shouldBe(visible);

        return this;
    }
    public LambKebabPage checkAssortedKebab() {
        assortedLamb.shouldBe(visible);
        priceAssortedLamb.shouldBe(visible);

        return this;
    }








}
