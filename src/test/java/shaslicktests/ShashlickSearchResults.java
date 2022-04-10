package shaslicktests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class ShashlickSearchResults extends TestBase {
    @Owner("Никита Шутков")
    @Severity(SeverityLevel.CRITICAL)
    @Description(
            "Проверка результатов поисковой выдачи"
    )
    @Feature("Поисковая строка")
    @CsvSource({
            "баранина, Мякоть баранины",
            "свиная, Свиная шея",
    })
    @ParameterizedTest(name = "showing pork and mutton in results of goods")
void searchResults(String testData, String expectedText) {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем главную страницу", () -> {
        open("https://shashlik.club");
        });
        step("Вбиваем в строку поиска установленные значения", () -> {
        $("#woocommerce-product-search-field-0").setValue(testData).pressEnter();
        });
        step("Проверяем, что в результатах поиска есть установленное значение", () -> {
        $(".content-area").shouldHave(text(expectedText));
        });
    }

    @ValueSource(strings = {"баранина", "свиная"})
    @ParameterizedTest(name = "showing pork and mutton in results")
    void shashlickSearchTest(String testData2) {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем главную страницу", () -> {
        open("https://shashlik.club");
        });
        step("Вбиваем в строку поиска установленные значения", () -> {
        $(".search-field").setValue(testData2).pressEnter();
        });
        step("Проверяем, что в результатах поиска есть установленные значения", () -> {
        $(".content-area").shouldHave(text(testData2));
        });
    }
}
