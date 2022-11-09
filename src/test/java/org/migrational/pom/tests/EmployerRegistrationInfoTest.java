package org.migrational.pom.tests;

import org.migrational.pom.base.BaseTest;
import org.migrational.pom.objects.RegisterEmployer;
import org.migrational.pom.pages.*;
import org.migrational.pom.utils.JacksonUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class EmployerRegistrationInfoTest extends BaseTest {



    @Test
    public void employerRegistrationInfoTest() throws InterruptedException, IOException {

        RegisterEmployer employerRegistrationInfo =
                JacksonUtils.deserializeJson("employerRegistrationInfo.json", RegisterEmployer.class);

        LandingPage landingPage = new LandingPage(driver).load();
        RegisterNewAccountPage registerNewAccountPage = landingPage.clickCreateAccountLink();
        registerNewAccountPage.clickEmployerButton();
        EmployerRegistrationInfoPage employerRegistrationInfoPage = registerNewAccountPage.clickCreateEmployerAccountButton();
        Assert.assertEquals(employerRegistrationInfoPage.getEmployerRegistrationInfoTitle(), "Register your account");
        employerRegistrationInfoPage.
                setEmployerRegistrationInfo(employerRegistrationInfo).
                clickTermsAndConditionsCheckBox();

        LoginPage loginPage = employerRegistrationInfoPage.clickSubmitCreateAccountButton();
        Assert.assertEquals
                (loginPage.getActivateYourAccountMessage(),
                        "To activate your account please click on the activation link sent to your email.");


    }


}
