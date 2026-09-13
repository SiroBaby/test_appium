package appium.settings.pages;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SettingsPage extends BasePage {
    private static final int MAX_BACK_NAVIGATION_STEPS = 5;

    public SettingsPage(IOSDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public SettingsPage returnToRoot() {
        for (int navigationStep = 0; navigationStep < MAX_BACK_NAVIGATION_STEPS; navigationStep++) {
            if (!isAccessibilityIdPresent(BACK_BUTTON_ACCESSIBILITY_ID)) {
                return this;
            }
            navigateBack();
        }
        throw new TimeoutException("Could not return to the Settings root screen.");
    }

    public boolean isDisplayed() {
        return isAccessibilityIdVisible("Settings");
    }

    public GeneralPage openGeneral() {
        tapByAccessibilityId("General");
        return new GeneralPage(driver, wait);
    }
}
