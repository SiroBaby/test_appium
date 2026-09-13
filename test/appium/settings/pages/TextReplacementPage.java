package appium.settings.pages;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextReplacementPage extends BasePage {
    public TextReplacementPage(IOSDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean isDisplayed() {
        return isAccessibilityIdVisible("Text Replacement");
    }

    public KeyboardPage returnToKeyboard() {
        navigateBack();
        return new KeyboardPage(driver, wait);
    }
}
