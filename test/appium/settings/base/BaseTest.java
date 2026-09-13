package appium.settings.base;

import appium.settings.config.IosTestConfig;
import io.appium.java_client.ios.IOSDriver;
import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    protected IOSDriver driver;
    protected WebDriverWait wait;

    @BeforeClass
    public void startSession() throws MalformedURLException {
        driver = new IOSDriver(URI.create(IosTestConfig.APPIUM_SERVER_URL).toURL(), IosTestConfig.createOptions());
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterClass(alwaysRun = true)
    public void closeSession() {
        if (driver != null) {
            driver.quit();
        }
    }
}
