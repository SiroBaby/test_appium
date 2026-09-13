package appium.settings.pages;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyboardPage extends BasePage {
    public KeyboardPage(IOSDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean isDisplayed() {
        return isAccessibilityIdVisible("Keyboards");
    }

    public TextReplacementPage openTextReplacement() {
        tapByAccessibilityId("Text Replacement");
        return new TextReplacementPage(driver, wait);
    }

    public GeneralPage returnToGeneral() {
        navigateBack();
        return new GeneralPage(driver, wait);
    }
}
