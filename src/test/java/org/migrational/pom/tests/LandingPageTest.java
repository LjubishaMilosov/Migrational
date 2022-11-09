package org.migrational.pom.tests;

import org.migrational.pom.base.BaseTest;
import org.migrational.pom.pages.LandingPage;
import org.migrational.pom.pages.LoginPage;
import org.migrational.pom.pages.RegisterNewAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingPageTest extends BaseTest {

    @Test
    public void landingPageTest() throws InterruptedException {

        LandingPage landingPage = new LandingPage(driver).load();
        Thread.sleep(2000);


    }
    @Test
    public void navigateFromLandingToLoginPageTest(){

        LandingPage landingPage = new LandingPage(driver).load();
        LoginPage loginPage = landingPage.clickLoginLink();
        Assert.assertEquals(loginPage.getLoginPageTitle(), "Login to your account");
    }
    @Test
    public void navigateFromLandingToRegisterNewAccountPageTest(){

        LandingPage landingPage = new LandingPage(driver).load();
        RegisterNewAccountPage registerNewAccountPage = landingPage.clickCreateAccountLink();
        Assert.assertEquals(registerNewAccountPage.getRegisterNewAccountPageTitle(), "Register a new account");
    }


}
