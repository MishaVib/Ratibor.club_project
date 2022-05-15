package shaslicktests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.ProjectProvider;
import helpers.AllureAttach;
import helpers.DriverSettings;
import helpers.DriverUtils;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Selenide.clearBrowserCookies();
       // Configuration.baseUrl = "https://shashlik.club/";
        //Configuration.browserSize = "1920x1080";
        SelenideLogger.addListener("allure", new AllureSelenide());
        DriverSettings.configure();

       // DesiredCapabilities capabilities = new DesiredCapabilities();
       // capabilities.setCapability("enableVNC", true);
       // capabilities.setCapability("enableVideo", true);
       // Configuration.browserCapabilities = capabilities;

       // String login = System.getProperty("login");
       // String password = System.getProperty("password");
       // Configuration.remote = "https://" + login + ":" + password + "@" + System.getProperty("remoteBrowser");
    }

    @AfterEach
    public void afterTest() {

        String sessionId = DriverUtils.getSessionId();

        AllureAttach.addScreenshotAs("Last screenshot");
        AllureAttach.addPageSource();
        AllureAttach.addBrowserConsoleLogs();
        Selenide.closeWebDriver();

        if (ProjectProvider.isVideoOn()) {
            AllureAttach.addVideo(sessionId);
        }
    }
}
