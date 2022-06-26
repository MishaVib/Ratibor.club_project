package shaslicktests;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.MainPage;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;


public class ShashlickSearchResults extends TestBase {

    MainPage mainPage = new MainPage();

    SelenideElement
    inputSearch = $("#woocommerce-product-search-field-0"),
    searchResults = $(".content-area");



    @Owner("Никита Шутков")
    @Severity(SeverityLevel.CRITICAL)
    @Description(
            "Проверка результатов поисковой выдачи при валидных значениях"
    )
    @Feature("Поисковая строка")
    @ParameterizedTest(name = "Результаты выдачи при валидных данных")
    @Tag("regress")
    @Tag("search")
    @CsvSource({
            "баранина, Мякоть баранины",
            "свиная, Свиная шея",
    })
    void searchResults(String testData, String expectedText) {
        step("Открываем главную страницу", () -> {

            mainPage.openMainPage();
        });
        step("Вбиваем в строку поиска установленные значения", () -> {

            inputSearch.shouldBe(empty).setValue(testData).pressEnter();
        });
        step("Проверяем, что в результатах поиска есть установленное значение", () -> {

            searchResults.shouldHave(text(expectedText));
        });
    }

    @Test
    @Tag("acceptance")
    @Tag("search")
    @Owner("Никита Шутков")
    @Severity(SeverityLevel.CRITICAL)
    @Description(
            "Результат поисковой выдачи без ввода данных"
    )
    @Feature("Поисковая строка")
    @DisplayName("Результат поисковой выдачи без введенных данных")
    void emptyValueInput() {
        mainPage
                .openMainPage()
                .setNullValueInSearchInput();

    }
}
