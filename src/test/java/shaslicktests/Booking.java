package shaslicktests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Tag("regress")
public class Booking extends TestBase{
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
        step("Проверка текста в разделе бронирования стола", () -> {
        $(".site-main").shouldHave(Condition.text("Забронировать стол"));
        $(".site-main").shouldHave(Condition.text("Забронировать стол можно по телефону"));
        $x("//a[@href='tel:+79302220032']").shouldHave(Condition.text("+7 (930) 222 00 32"))
                .shouldBe(Condition.visible);
        $(".site-info").shouldHave(Condition.text(" Просто качественная доставка еды ©"))
                .shouldBe(Condition.visible);
        $x("//a[@href='https://original-watch.online/']").shouldHave(Condition.exactText("продать часы"))
                .shouldBe(Condition.visible);
        });
    }
}
