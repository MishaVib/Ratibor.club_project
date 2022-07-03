package club.shashlick.ui_tests.tests;

import club.shashlick.ui_tests.drivers.BrowserDriver;
import com.codeborne.selenide.Selenide;
import config.Project;
import helpers.AllureAttachments;
import io.qameta.allure.junit5.AllureJunit5;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;

import static helpers.DriverUtils.getSessionId;


@ExtendWith({AllureJunit5.class})
public class TestBaseWeb extends TestBase {
    @BeforeAll
    public static void setup() {
        BrowserDriver.configure();
    }

    @AfterEach
    public void afterEach() {
        String sessionId = "";
        if (Project.isRemoteWebDriver()) {
            sessionId = getSessionId();
        }
        AllureAttachments.addScreenshotAs("Last screenshot");
        AllureAttachments.addPageSource();
        AllureAttachments.addBrowserConsoleLogs();

        Selenide.closeWebDriver();

        if (Project.isVideoOn()) {
            AllureAttachments.addVideoBrowser(sessionId);
        }
    }
}
