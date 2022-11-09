package org.migrational.pom.tests;

import org.migrational.pom.base.BaseTest;
import org.migrational.pom.objects.LoginCandidate;
import org.migrational.pom.pages.*;
import org.migrational.pom.utils.JacksonUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class PersonalInformationTest extends BaseTest {

    @Test
    public void personalInformationTest() throws IOException {

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

        PersonalInformationPage personalInformationPage = preScreeningPage.navigateToPersonalInfoStep();
        Assert.assertEquals(personalInformationPage.getPersonalInformationTitle(), "Personal Information");

        Assert.assertEquals(personalInformationPage.selectCountryOfBirth(), "Macedonia");
        Assert.assertEquals(personalInformationPage.selectCityOfBirth(), "Probishtip");

        personalInformationPage.
                selectCurrentCountry("Slovenia");
        js.executeScript("window.scrollBy(0,500)");
        personalInformationPage.
                selectCurrentCity("Ljubljana");
        personalInformationPage.
                clickYesMarriedBtn().
                selectGender("3");
        js.executeScript("window.scrollBy(0,800)");
        personalInformationPage.
                uploadYourPhoto("C:/Users/USER/Documents/MigrationalPngs/ProfilePhoto.png").
                clickDeleteProfilePhoto().
                clickConfirmBtn().clickOkBtn().
                uploadYourCV("C:/Users/USER/Documents/MigrationalPngs/CVFile.png").
                clickDeleteCVFile().
                clickConfirmBtn().
                clickOkBtn().
                clickSaveAndCloseBtn().
                clickConfirmBtn().
                clickOkBtn();
        Assert.assertEquals(preScreeningPage.getPreScreeningWelcomeTitle(), "Welcome, SelenuimTest");


    }


}
