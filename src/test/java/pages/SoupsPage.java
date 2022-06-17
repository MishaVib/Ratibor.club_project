package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SoupsPage {
    ElementsCollection
            buttonAddToCart = $$x("//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart']");

    SelenideElement
            soupBorsch = $x("//h2[contains(text(),'Борщ')]"),
            priceBorsch = $x("//bdi[contains(text(),'320.00')]"),
            soupFish = $x("//h2[contains(text(),'Уха по-царски')]"),
            priceSoupFish = $x("//bdi[contains(text(),'420.00')]"),
            soupSolyanka = $x("//h2[contains(text(),'Солянка')]"),
            priceSoupSolyanka = $x("//bdi[contains(text(),'400.00')]"),
            soupChicken = $x("//h2[contains(text(),'Суп куриный')]"),
            priceSoupChicken = $x("//bdi[contains(text(),'250.00')]"),
            soupHarcho = $x("//h2[contains(text(),'Харчо')]"),
            priceSoupHarcho = $("bdi", 4),
            creamSoup = $x("//h2[contains(text(),'Крем суп с шампиньонами')]"),
            priceCreamSoup = $x("//bdi[contains(text(),'360.00')]");

    public SoupsPage buttonAdToCartCheck() {
        buttonAddToCart.shouldHave(size(6));

        return this;
    }

    public SoupsPage BorschCheck() {
        soupBorsch.shouldBe(visible);
        priceBorsch.shouldBe(visible);

        return this;
    }

    public SoupsPage soupFishCkeck() {
        soupFish.shouldBe(visible);
        priceSoupFish.shouldBe(visible);

        return this;
    }

    public SoupsPage soupSolyankaCheck() {
        soupSolyanka.shouldBe(visible);
        priceSoupSolyanka.shouldBe(visible);

        return this;
    }

    public SoupsPage soupChickenCheck() {
        soupChicken.shouldBe(visible);
        priceSoupChicken.shouldBe(visible);

        return this;
    }

    public SoupsPage soupHarchoCheck() {
        soupHarcho.shouldBe(visible);
        priceSoupHarcho.shouldBe(visible);

        return this;
    }

    public SoupsPage creamSoupCheck() {
        creamSoup.shouldBe(visible);
        priceCreamSoup.shouldBe(visible);

        return this;
    }


}
