package org.migrational.pom.tests;

import org.migrational.pom.base.BaseTest;
import org.migrational.pom.pages.AdminDashboardPage;
import org.migrational.pom.pages.AdminLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminDashboardTest extends BaseTest {


    @Test
    public void adminDashboardTest(){

        AdminLoginPage adminLoginPage = new AdminLoginPage(driver).loadAdmin();
        adminLoginPage.
                enterEmail("contact@thebrightbox.com").
                enterPassword("22testingBOX!~").
                clickRememberMeCheckBox();
        AdminDashboardPage adminDashboardPage = adminLoginPage.clickLoginBtn();
        Assert.assertEquals(adminDashboardPage.getDashboardTitle(), "Dashboard");
        adminDashboardPage.enterTextInSearchField("Ljubisha");
        adminDashboardPage.getDashboardCandidatesSubtitle();
        System.out.println(adminDashboardPage.getDashboardCandidatesSubtitle());
        String numberOfCandidatesDisplayedOnDashboard = adminDashboardPage.getNumberOfDashboardCandidatesDisplayed();
        System.out.println(numberOfCandidatesDisplayedOnDashboard);
    }




}
