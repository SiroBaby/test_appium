package appium.settings.config;

import io.appium.java_client.ios.options.XCUITestOptions;
import java.time.Duration;

public final class IosTestConfig {
    public static final String APPIUM_SERVER_URL = "http://127.0.0.1:4723";

    private IosTestConfig() {
    }

    public static XCUITestOptions createOptions() {
        return new XCUITestOptions()
                .setAutomationName("XCUITest")
                .setDeviceName("iPhone 17 Pro")
                .setPlatformVersion("26.5")
                .setBundleId("com.apple.Preferences")
                .setNoReset(true)
                .setNewCommandTimeout(Duration.ofSeconds(60));
    }
}
