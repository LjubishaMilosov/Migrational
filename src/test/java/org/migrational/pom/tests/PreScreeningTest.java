package org.migrational.pom.tests;

import org.migrational.pom.base.BaseTest;
import org.migrational.pom.objects.LoginCandidate;
import org.migrational.pom.pages.*;
import org.migrational.pom.utils.JacksonUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class PreScreeningTest extends BaseTest {



    @Test
    public void preScreeningToCovidVaccineStepTest() throws IOException {

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
        Covid19VaccinePage covid19VaccinePage = preScreeningPage.navigateToCovidVaccineStep();

        Assert.assertEquals(covid19VaccinePage.getCovidVaccinePageTitle(), "Covid-19 vaccine");
    }
    @Test
    public void preScreeningToPersonalInfoStepTest() throws IOException {

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

    }
    @Test
    public void preScreeningToGermanLanguageStepTest() throws IOException {

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

    }
    @Test
    public void preScreeningToEducationStepTest() throws IOException {

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
        EducationQualificationPage educationQualificationPage = preScreeningPage.navigateToEducationQualificationStep();
        js.executeScript("window.scrollBy(0,-500)");

        Assert.assertEquals(educationQualificationPage.getEducationQualificationStepTitle(),
                "Education, qualifications and work experience");

    }
    @Test
    public void preScreeningToReasonsForApplyingStepTest() throws IOException {


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
        ReasonsForApplyingPage reasonsForApplyingPage = preScreeningPage.navigateToReasonsForApplyingStep();
        js.executeScript("window.scrollBy(0,-500)");

        Assert.assertEquals(reasonsForApplyingPage.getReasonsForApplyingStepTitle(), "Reasons for applying and expectations");

    }
    @Test
    public void preScreeningToNostrificationStepTest() throws IOException {
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
        nostrificationPage.getNostrificationStepTitle();
        Assert.assertEquals(nostrificationPage.getNostrificationStepTitle(), "Nostrification");
    }
    @Test
    public void preScreeningGetStartedBtnTest() throws IOException {

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
        //js.executeScript("window.scrollBy(0,500)");
        Covid19VaccinePage covid19VaccinePage = preScreeningPage.clickGetStatedToNavigateToCovidVaccineStep();
        Assert.assertEquals(covid19VaccinePage.getCovidVaccinePageTitle(), "Covid-19 vaccine");
    }




}
