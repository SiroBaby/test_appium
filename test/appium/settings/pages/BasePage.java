package appium.settings.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected static final String BACK_BUTTON_ACCESSIBILITY_ID = "BackButton";
    protected final IOSDriver driver;
    protected final WebDriverWait wait;

    protected BasePage(IOSDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    protected void tapByAccessibilityId(String accessibilityId) {
        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId(accessibilityId)));
        element.click();
    }

    protected boolean isAccessibilityIdVisible(String accessibilityId) {
        By locator = AppiumBy.accessibilityId(accessibilityId);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
    }

    protected boolean isAccessibilityIdPresent(String accessibilityId) {
        return !driver.findElements(AppiumBy.accessibilityId(accessibilityId)).isEmpty();
    }

    protected void navigateBack() {
        tapByAccessibilityId(BACK_BUTTON_ACCESSIBILITY_ID);
    }
}
