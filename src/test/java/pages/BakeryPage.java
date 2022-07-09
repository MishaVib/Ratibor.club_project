package pages;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class BakeryPage {
    // наличие всех кнопок добавить в корзнину на странице
    private ElementsCollection
            buttonAddToCart = $$x("//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart']");

    // наименование и стоимость товара
    private SelenideElement
            hachapuri = $x("//h2[contains(text(),'Хачапури по Аджарски')]"),
            priceHachapuri = $x("//bdi[contains(text(),'350.00')]"),
            hachapuriWithTwoEggs = $x("//h2[contains(text(),'Хачапури по Аджарски с двумя яйцами')]"),
            priceHachapuriWithTwoEggs = $x("//bdi[contains(text(),'470.00')]"),
            hachapuriImretinsky = $x("//h2[contains(text(),'Хачапури по Имеретински')]"),
            priceHachapuriImretinsky = $x("//bdi[contains(text(),'400.00')]"),
            hachapuriMegrelsky = $x("//h2[contains(text(),'Хачапури по Мегрельски')]"),
            priceHachapuriMegrelsky = $x("//bdi[contains(text(),'450.00')]");

    public BakeryPage bakeryButtonAddToCartCheck() {
        buttonAddToCart.shouldHave(size(4));

        return this;
    }

    public BakeryPage hachapuriCheck() {
        hachapuri.shouldBe(visible);
        priceHachapuri.shouldBe(visible);

        return this;
    }

    public BakeryPage hachapuriWithTwoEggsCheck() {
        hachapuriWithTwoEggs.shouldBe(visible);
        priceHachapuriWithTwoEggs.shouldBe(visible);

        return this;
    }

    public BakeryPage hachapuriImretinckyCheck() {
        hachapuriImretinsky.shouldBe(visible);
        priceHachapuriImretinsky.shouldBe(visible);

        return this;
    }

    public BakeryPage hachapuriMegrelskyCheck() {
        hachapuriMegrelsky.shouldBe(visible);
        priceHachapuriMegrelsky.shouldBe(visible);

        return this;
    }


}
