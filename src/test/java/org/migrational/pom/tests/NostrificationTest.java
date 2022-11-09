package org.migrational.pom.tests;

import org.migrational.pom.base.BaseTest;
import org.migrational.pom.objects.LoginCandidate;
import org.migrational.pom.pages.*;
import org.migrational.pom.utils.JacksonUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class NostrificationTest extends BaseTest {

    @Test
    public void nostrificationTest() throws IOException{
        LoginCandidate loginCandidate =
                JacksonUtils.deserializeJson("loginCandidate.json", LoginCandidate.class);


        LandingPage landingPage = new LandingPage(driver).load();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        LoginPage loginPage = landingPage.clickLoginLink();
        Assert.assertEquals(loginPage.getLoginPageTitle(), "Login to your account");
        loginPage.
                setLoginCandidate(loginCandidate).
                clickRememberMeCheckBox().
                clickSubmitButton();
        PreScreeningPage preScreeningPage = new PreScreeningPage(driver);
        Assert.assertEquals(preScreeningPage.getPreScreeningWelcomeTitle(), "Welcome, SelenuimTest");

        js.executeScript("window.scrollBy(0,500)");
        NostrificationPage nostrificationPage = preScreeningPage.navigateToNostrificationStep();

        js.executeScript("window.scrollBy(0,-500)");
        nostrificationPage.
                getNostrificationStepTitle();
        Assert.assertEquals(nostrificationPage.getNostrificationStepTitle(), "Nostrification");

        nostrificationPage.
                clickStartedNostrificatioYesBtn().
                clickGatheringDocsCheckBox().
                clickStartedAndAwaitingCheckBox();

        js.executeScript("window.scrollBy(0,400)");
        nostrificationPage.
                selectDay("15").
                selectMonth("May").
                selectYear("1946").
                selectProvince("Bremen");

        js.executeScript("window.scrollBy(0,300)");
        nostrificationPage.
                clickSubmittedAndReceivedCheckBox().
                selectDay("15").
                selectMonth("May").
                selectYear("1946").
                selectProvince("Bremen").
                uploadNostrificationDocument(
                "C:/Users/USER/Documents/MigrationalPngs/NostrificationDocumentFile.png");

        js.executeScript("window.scrollBy(0,-500)");
        nostrificationPage.
                clickStartedNostrificationNoBtn();

        js.executeScript("window.scrollBy(0,-500)");
        nostrificationPage.
                clickNostrificationHelpYesBtn().
                clickNostrificationHelpNoBtn().
                clickSaveAndCloseBtn().
                clickConfirmBtn().
                clickOkBtn();

    }


}
