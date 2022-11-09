package org.migrational.pom.tests;

import org.migrational.pom.base.BaseTest;
import org.migrational.pom.pages.EmployerRegistrationInfoPage;
import org.migrational.pom.pages.LandingPage;
import org.migrational.pom.pages.RegisterNewAccountPage;
import org.migrational.pom.pages.CandidateRegistrationInfoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterNewAccountTest extends BaseTest {

    @Test
    public void registerCandidateAccountTest() throws InterruptedException {

        LandingPage landingPage = new LandingPage(driver).load();
        RegisterNewAccountPage registerNewAccountPage = landingPage.clickCreateAccountLink();
        registerNewAccountPage.clickCandidateButton();
        CandidateRegistrationInfoPage registrationInfoCandidatePage = registerNewAccountPage.clickCreateCandidateAccountButton();
        Assert.assertEquals(registrationInfoCandidatePage.getCandidateRegistrationInfoTitle(), "Register your account");
    }

    @Test
    public void registerEmployerAccountTest() throws InterruptedException {

        LandingPage landingPage = new LandingPage(driver).load();
        RegisterNewAccountPage registerNewAccountPage = landingPage.clickCreateAccountLink();
        registerNewAccountPage.clickEmployerButton();
        EmployerRegistrationInfoPage employerRegistrationInfoPage = registerNewAccountPage.clickCreateEmployerAccountButton();
        Assert.assertEquals(employerRegistrationInfoPage.getEmployerRegistrationInfoTitle(), "Register your account");

    }

}
