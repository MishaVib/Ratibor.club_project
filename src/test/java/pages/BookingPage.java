package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BookingPage {
    SelenideElement

            bookingTable = $(byText("Забронировать стол")),
            bookingHeader = $("h1"),
            bookingElementWithNumber = $("main p"),
            bookingFooter = $(".site-info"),
            bookingLink = $("a"),
            bookingLinkByText = $(byText("Оригинальные швейцарские часы"));

    public BookingPage openMainPage() {
        open("https://shashlik.club");

        return this;
    }

    public BookingPage buttonClick() {
        bookingTable.click();

        return this;
    }

    public BookingPage bookingHeaderCheck() {
        bookingHeader.shouldHave(text("Забронировать стол")).shouldBe(visible);

        return this;
    }

    public BookingPage textAboutBookingCheck() {
        bookingElementWithNumber.shouldHave(text("Забронировать стол можно по телефону"));

        return this;
    }

    public BookingPage phoneNumberCheck() {
        bookingLink.shouldHave(text("+7 (930) 222 00 32"));

        return this;
    }

    public BookingPage siteInfo() {
        bookingFooter.shouldHave(text(" Просто качественная доставка еды ©")).shouldBe(visible);

        return this;
    }

    public BookingPage linkInSiteInfoCheck() {
        bookingLinkByText.shouldBe(visible)
                .shouldHave(attributeMatching("href", "https://original-watches.ru/"));

        return this;
    }

    public BookingPage openBookingPage() {
        Selenide.open("https://shashlik.club/sample-page/");

        return this;

    }

    public BookingPage clickBySwissClock() {
        bookingLinkByText.click();

        return this;
    }

    public BookingPage swissHeaderCheck() {
        bookingHeader.shouldHave(exactText("Оригинальные Швейцарские часы"));

        return this;
    }


}
