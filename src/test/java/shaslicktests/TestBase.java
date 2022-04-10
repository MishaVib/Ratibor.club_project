package shaslicktests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Selenide.clearBrowserCookies();
        Configuration.baseUrl = "https://shashlik.club/";
        Configuration.browserSize = "1680x1050";
        SelenideLogger.addListener("allure", new AllureSelenide());

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;

        String login = System.getProperty("login");
        String password = System.getProperty("password");
        Configuration.remote = "https://" + login + ":" + password + "@" + System.getProperty("remoteBrowser");
    }

@AfterEach
void addAttachments() {
    AttachAllure.screenshotAs("Last screenshot");
    AttachAllure.pageSource();
    AttachAllure.browserConsoleLogs();
    AttachAllure.addVideo();
    Selenide.closeWebDriver();
}
}