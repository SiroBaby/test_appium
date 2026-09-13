package appium.settings;

import appium.settings.base.BaseTest;
import appium.settings.pages.AboutPage;
import appium.settings.pages.GeneralPage;
import appium.settings.pages.IosVersionPage;
import appium.settings.pages.KeyboardPage;
import appium.settings.pages.SettingsPage;
import appium.settings.pages.TextReplacementPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IosSettingsSmokeTest extends BaseTest {
    @Test
    public void navigatesAcrossGeneralSettingsPages() {
        SettingsPage settingsPage = new SettingsPage(driver, wait);
        settingsPage.returnToRoot();
        Assert.assertTrue(settingsPage.isDisplayed(), "Expected the Settings root screen to be visible.");

        GeneralPage generalPage = settingsPage.openGeneral();
        Assert.assertTrue(generalPage.isDisplayed(), "Expected the General screen to be visible.");

        AboutPage aboutPage = generalPage.openAbout();
        Assert.assertTrue(aboutPage.isDisplayed(), "Expected the About screen to be visible.");
        Assert.assertTrue(aboutPage.isNameOptionVisible(), "Expected the Name option to be visible.");

        IosVersionPage iosVersionPage = aboutPage.openIosVersion();
        Assert.assertTrue(iosVersionPage.isDisplayed(), "Expected the iOS Version screen to be visible.");

        aboutPage = iosVersionPage.returnToAbout();
        Assert.assertTrue(aboutPage.isDisplayed(), "Expected to return to the About screen.");

        generalPage = aboutPage.returnToGeneral();
        Assert.assertTrue(generalPage.isDisplayed(), "Expected to return to the General screen.");

        KeyboardPage keyboardPage = generalPage.openKeyboardSettings();
        Assert.assertTrue(keyboardPage.isDisplayed(), "Expected the Keyboards screen to be visible.");

        TextReplacementPage textReplacementPage = keyboardPage.openTextReplacement();
        Assert.assertTrue(textReplacementPage.isDisplayed(), "Expected the Text Replacement screen to be visible.");

        keyboardPage = textReplacementPage.returnToKeyboard();
        Assert.assertTrue(keyboardPage.isDisplayed(), "Expected to return to the Keyboards screen.");

        generalPage = keyboardPage.returnToGeneral();
        Assert.assertTrue(generalPage.isDisplayed(), "Expected to return to General from Keyboards.");
    }
}
