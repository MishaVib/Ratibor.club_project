package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    SelenideElement

            input = $(".search-field"),
            searchNullResult = $("h1");


    public MainPage openMainPage() {
        open("https://shashlik.club");

        return this;
    }

    public MainPage setNullValueInSearchInput() {
        input.shouldBe(empty).setValue("").pressEnter();
        searchNullResult.shouldHave(text("Результат поиска: “”")).shouldBe(visible);

        return this;
    }


}
