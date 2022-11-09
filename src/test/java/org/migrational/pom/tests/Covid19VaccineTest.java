package org.migrational.pom.tests;

import org.migrational.pom.base.BaseTest;
import org.migrational.pom.objects.LoginCandidate;
import org.migrational.pom.pages.Covid19VaccinePage;
import org.migrational.pom.pages.LandingPage;
import org.migrational.pom.pages.LoginPage;
import org.migrational.pom.pages.PreScreeningPage;
import org.migrational.pom.utils.JacksonUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Covid19VaccineTest extends BaseTest {

    @Test
    public void covid19VaccineTest() throws InterruptedException, IOException {
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
        covid19VaccinePage.
                yesVaccinateButton().
                selectNumberOfVaccines("4");
        js.executeScript("window.scrollBy(0,800)");
        covid19VaccinePage.
                selectVaccineOne("janssen").
                selectVaccineTwo("spikevax_moderna").
                selectVaccineThree("vaxzevria_astrazeneca").
                selectVaccineFour("nuvaxovid").
               // deleteCovidCert().
                attachYourVaccinationCertificate
                        ("C:/Users/USER/Documents/MigrationalPngs/COVID19Certificate.png");

        // Without the thread.sleep , an error occur in uploading the covid file
       // Thread.sleep(5000);
        covid19VaccinePage.
                clickSaveAndCloseBtn().
                clickConfirmBtn().
                clickOkBtn();

    }




}
