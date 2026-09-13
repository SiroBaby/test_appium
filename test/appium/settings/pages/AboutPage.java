package appium.settings.pages;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutPage extends BasePage {
    public AboutPage(IOSDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean isDisplayed() {
        return isAccessibilityIdVisible("About");
    }

    public boolean isNameOptionVisible() {
        return isAccessibilityIdVisible("Name");
    }

    public IosVersionPage openIosVersion() {
        tapByAccessibilityId("iOS Version");
        return new IosVersionPage(driver, wait);
    }

    public GeneralPage returnToGeneral() {
        navigateBack();
        return new GeneralPage(driver, wait);
    }
}
