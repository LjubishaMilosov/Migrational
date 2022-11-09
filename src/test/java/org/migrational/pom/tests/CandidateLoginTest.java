package org.migrational.pom.tests;

import org.migrational.pom.base.BaseTest;
import org.migrational.pom.objects.LoginCandidate;
import org.migrational.pom.pages.PreScreeningPage;
import org.migrational.pom.pages.LandingPage;
import org.migrational.pom.pages.LoginPage;
import org.migrational.pom.utils.JacksonUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class CandidateLoginTest extends BaseTest {

    @Test
    public void candidateLoginTest() throws InterruptedException, IOException {

        LoginCandidate loginCandidate =
                JacksonUtils.deserializeJson("loginCandidate.json", LoginCandidate.class);

        LandingPage landingPage = new LandingPage(driver).load();
        LoginPage loginPage = landingPage.clickLoginLink();
        Assert.assertEquals(loginPage.getLoginPageTitle(), "Login to your account");
        //loginPage.assertLoginPageTitle();

        loginPage.
                setLoginCandidate(loginCandidate).
                clickRememberMeCheckBox().
                clickSubmitButton();
        PreScreeningPage preScreeningPage = new PreScreeningPage(driver);
        Assert.assertEquals(preScreeningPage.getPreScreeningWelcomeTitle(),
                "Welcome, SelenuimTest");
        //preScreeningPage.assertPreScreeningWelcomeTitle();

    }



}
