package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DishesOnGrillPage {

    private SelenideElement
            itemPorkLoin = $x("//a[@href='https://shashlik.club/meny/blyuda-na-mangale/svinaya-koreyka/']");


    public DishesOnGrillPage clickPorkLoin() {

        itemPorkLoin.click();
        return this;
    }
}
