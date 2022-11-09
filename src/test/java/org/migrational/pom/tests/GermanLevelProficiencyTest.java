package org.migrational.pom.tests;

import org.migrational.pom.base.BaseTest;
import org.migrational.pom.objects.LoginCandidate;
import org.migrational.pom.pages.*;
import org.migrational.pom.utils.JacksonUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class GermanLevelProficiencyTest extends BaseTest {

    @Test
    public void germanLevelProficiencyTest() throws IOException {
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

        GermanLevelProficiencyPage germanLevelProficiencyPage = preScreeningPage.navigateToGermanLanguageStep();
        Assert.assertEquals(germanLevelProficiencyPage.getGermanLevelStepTitle(), "German language proficiency levels");

        germanLevelProficiencyPage.
                clickYesIKnowGermanBtn().
                selectLevelOfGermanKnowledge("4").
                clickOnUploadCEFRCheckBox().
                clickOnUploadCEFRCert("C:/Users/USER/Documents/MigrationalPngs/CEFRcertificate.png");
        js.executeScript("window.scrollBy(0,500)");

        germanLevelProficiencyPage.
                clickOnUploadTELCCheckBox().
                clickOnB2PflegeCheckBox().
                clickOnUploadTELCCert("C:/Users/USER/Documents/MigrationalPngs/TELCcertificate.png");
        germanLevelProficiencyPage.
                clickOnUploadOSDCheckBox().
                clickOnUploadOSDCert("C:/Users/USER/Documents/MigrationalPngs/ÖSDcertificate.png");
        js.executeScript("window.scrollBy(0,200)");

        germanLevelProficiencyPage.
                clickOnUploadECLCheckBox().
                clickOnUploadECLCert("C:/Users/USER/Documents/MigrationalPngs/ECLcertificate.png");
        js.executeScript("window.scrollBy(0,200)");
        germanLevelProficiencyPage.clickOnNoCertificateCheckBox();
        js.executeScript("window.scrollBy(0,400)");

        germanLevelProficiencyPage.
                clickNoRecommendCourseBtn().
                clickYesRecommendCourseBtn().
                clickYNoFinancialSupportBtn().
                clickYesFinancialSupportBtn().
                clickSaveAndCloseBtn().
                clickConfirmBtn().
                clickOkBtn();

    }







}
