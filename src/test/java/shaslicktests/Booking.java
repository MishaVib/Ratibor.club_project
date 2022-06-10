package shaslicktests;


import com.codeborne.selenide.Selenide;
import io.qameta.allure.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("regress")
public class Booking extends TestBase {
    @Test
    @Owner("Никита Шутков")
    @Severity(SeverityLevel.NORMAL)
    @Description(
            "Страница бронирования столика"
    )
    @Feature("Бронь")
    void bookingTable() {
        step("Открываем главную страницу", () -> {
            open("https://shashlik.club");
        });
        step("Клик на кнопку Забронировать стол", () -> {
            $(byText("Забронировать стол")).click();
        });
        step("Проверка элементов в разделе бронирования стола", () -> {
            $("h1").shouldHave(text("Забронировать стол")).shouldBe(visible);
            $("main p").shouldHave(text("Забронировать стол можно по телефону")).$("a")
                    .shouldHave(text("+7 (930) 222 00 32"));

            $(".site-info").shouldHave(text(" Просто качественная доставка еды ©")).shouldBe(visible)
                    .$("a").shouldHave(text("Оригинальные швейцарские часы")).shouldBe(visible)
                    .shouldHave(attributeMatching("href", "https://original-watches.ru/"));
        });
    }

    @Test
    @Owner("Никита Шутков")
    @Severity(SeverityLevel.MINOR)
    @Description(
            "Переход по ссылке на сайт Оригинальные Швейцарские часы"
    )
    @Feature("Ссылка")
    void deeplink() {
        step("Открыть страницу Забронировать стол", () -> {
            Selenide.open("https://shashlik.club/sample-page/");
        });
        step("Клик по ссылке", () -> {
            $(byText("Оригинальные швейцарские часы")).click();
        });
        step("Проверка, что открылся сайт", () -> {
            $("h1").shouldHave(exactText("Оригинальные Швейцарские часы"));
        });
    }
}

