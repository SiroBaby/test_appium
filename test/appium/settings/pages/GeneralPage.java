package appium.settings.pages;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralPage extends BasePage {
    public GeneralPage(IOSDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean isDisplayed() {
        return isAccessibilityIdVisible("General");
    }

    public AboutPage openAbout() {
        tapByAccessibilityId("About");
        return new AboutPage(driver, wait);
    }

    public KeyboardPage openKeyboardSettings() {
        tapByAccessibilityId("Keyboard");
        return new KeyboardPage(driver, wait);
    }
}
