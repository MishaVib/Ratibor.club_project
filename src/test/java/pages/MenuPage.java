package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class MenuPage {
    private SelenideElement
            header = $(byText("Доставка Шашлыка в Александрове"));

    private final String urlMenu = "https://shashlik.club/meny/";

    public MenuPage checkHeaderMenuPage() {
        webdriver().shouldHave(urlContaining(urlMenu));
        header.shouldBe(visible);

        return this;
    }
}
