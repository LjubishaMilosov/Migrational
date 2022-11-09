package org.migrational.pom.tests;

import org.migrational.pom.base.BaseTest;
import org.migrational.pom.objects.RegisterCandidate;
import org.migrational.pom.pages.LandingPage;
import org.migrational.pom.pages.LoginPage;
import org.migrational.pom.pages.RegisterNewAccountPage;
import org.migrational.pom.pages.CandidateRegistrationInfoPage;
import org.migrational.pom.utils.JacksonUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegisterCandidateTest extends BaseTest {



    @Test
    public void registrationInfoCandidateTest() throws InterruptedException, IOException {

        RegisterCandidate candidateRegistrationInfo =
                JacksonUtils.deserializeJson("candidateRegistrationInfo.json", RegisterCandidate.class);

        LandingPage landingPage = new LandingPage(driver).load();
        RegisterNewAccountPage registerNewAccountPage = landingPage.clickCreateAccountLink();
        registerNewAccountPage.clickCandidateButton();
        CandidateRegistrationInfoPage candidateRegistrationInfoPage = registerNewAccountPage.clickCreateCandidateAccountButton();
        Assert.assertEquals(candidateRegistrationInfoPage.getCandidateRegistrationInfoTitle(), "Register your account");
        candidateRegistrationInfoPage.
                setRegistrationInfoCandidate(candidateRegistrationInfo).
                clickTermsAndConditionsCheckBox();

        LoginPage loginPage = candidateRegistrationInfoPage.clickSubmitCreateAccountButton();
        Assert.assertEquals
                (loginPage.getActivateYourAccountMessage(),
                "To activate your account please click on the activation link sent to your email.");


    }


}
