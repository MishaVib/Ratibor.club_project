package shaslicktests;


import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.BookingPage;

import static io.qameta.allure.Allure.step;

@Tag("regress")
public class Booking extends TestBase {

    BookingPage bookingPage = new BookingPage();

    @Test
    @Tag("acceptance")
    @Tag("booking")
    @Owner("Никита Шутков")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Элементы страницы Забронировать стол")
    @Description(
            "Страница бронирования столика"
    )
    @Feature("Бронь")
    void bookingTable() {
        step("Открываем главную страницу", () -> {
            bookingPage.openMainPage();
        });
        step("Клик на кнопку Забронировать стол", () -> {
            bookingPage.buttonClick();
        });
        step("Проверка элементов в разделе бронирования стола", () -> {
            bookingPage
                    .bookingHeaderCheck()
                    .textAboutBookingCheck().phoneNumberCheck()
                    .siteInfo().linkInSiteInfoCheck();
        });
    }

    @Test
    @Owner("Никита Шутков")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Переход по ссылке")
    @Description(
            "Переход по ссылке на сайт Оригинальные Швейцарские часы"
    )
    @Feature("Ссылка")
    void deeplink() {
        step("Открыть страницу Забронировать стол", () -> {
            bookingPage.openBookingPage();

        });
        step("Клик по ссылке", () -> {
            bookingPage.clickBySwissClock();
        });
        step("Проверка, что открылся сайт", () -> {
            bookingPage.swissHeaderCheck();
        });
    }
}

