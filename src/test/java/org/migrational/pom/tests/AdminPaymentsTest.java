package org.migrational.pom.tests;

import org.migrational.pom.base.BaseTest;
import org.migrational.pom.pages.AdminDashboardPage;
import org.migrational.pom.pages.AdminInvoicesPage;
import org.migrational.pom.pages.AdminLoginPage;
import org.migrational.pom.pages.AdminPaymentsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminPaymentsTest extends BaseTest {

    @Test
    public void adminPaymentsTest(){

        AdminLoginPage adminLoginPage = new AdminLoginPage(driver).loadAdmin();
        adminLoginPage.
                enterEmail("contact@thebrightbox.com").
                enterPassword("22testingBOX!~").
                clickRememberMeCheckBox();

        AdminDashboardPage adminDashboardPage = adminLoginPage.clickLoginBtn();
        Assert.assertEquals(adminDashboardPage.getDashboardTitle(), "Dashboard");
        AdminPaymentsPage adminPaymentsPage = adminDashboardPage.navigateToAdminPaymentsPage();


    }
}
