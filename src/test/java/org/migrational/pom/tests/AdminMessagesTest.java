package org.migrational.pom.tests;

import org.migrational.pom.base.BaseTest;
import org.migrational.pom.pages.AdminDashboardPage;
import org.migrational.pom.pages.AdminLoginPage;
import org.migrational.pom.pages.AdminMessagesPage;
import org.migrational.pom.pages.AdminServiceProvidersPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminMessagesTest extends BaseTest {

    @Test
    public void adminMessagesTest(){

        AdminLoginPage adminLoginPage = new AdminLoginPage(driver).loadAdmin();
        adminLoginPage.
                enterEmail("contact@thebrightbox.com").
                enterPassword("22testingBOX!~").
                clickRememberMeCheckBox();

        AdminDashboardPage adminDashboardPage = adminLoginPage.clickLoginBtn();
        Assert.assertEquals(adminDashboardPage.getDashboardTitle(), "Dashboard");
        AdminMessagesPage adminMessagesPage = adminDashboardPage.navigateToAdminMessagesPage();


    }
}
