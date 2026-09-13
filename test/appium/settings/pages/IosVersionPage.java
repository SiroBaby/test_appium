package appium.settings.pages;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IosVersionPage extends BasePage {
    public IosVersionPage(IOSDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean isDisplayed() {
        return isAccessibilityIdVisible("iOS Version");
    }

    public AboutPage returnToAbout() {
        navigateBack();
        return new AboutPage(driver, wait);
    }
}
