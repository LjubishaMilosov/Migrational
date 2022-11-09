package org.migrational.pom.tests;

import org.migrational.pom.base.BaseTest;
import org.migrational.pom.objects.LoginCandidate;
import org.migrational.pom.objects.LoginEmployer;
import org.migrational.pom.pages.EmployerSearchForCandidatesPage;
import org.migrational.pom.pages.LandingPage;
import org.migrational.pom.pages.LoginPage;
import org.migrational.pom.pages.PreScreeningPage;
import org.migrational.pom.utils.JacksonUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class EmployerLoginTest extends BaseTest {

    @Test public void employerLoginTest() throws IOException {

        LoginEmployer loginEmployer =
                JacksonUtils.deserializeJson("loginEmployer.json", LoginEmployer.class);

        LandingPage landingPage = new LandingPage(driver).load();
        LoginPage loginPage = landingPage.clickLoginLink();
        Assert.assertEquals(loginPage.getLoginPageTitle(), "Login to your account");

        loginPage.
                setEmployerLogin(loginEmployer).
                clickRememberMeCheckBox().clickSubmitButton();
        EmployerSearchForCandidatesPage employerSearchForCandidatesPage = new EmployerSearchForCandidatesPage(driver);
        Assert.assertEquals(employerSearchForCandidatesPage.getEmployerSearchForCandidatesPageTitle(), "Search for Candidates");



    }
}
