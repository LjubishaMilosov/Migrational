package org.migrational.pom.tests;

import org.migrational.pom.base.BaseTest;
import org.migrational.pom.pages.AdminAdminsPage;
import org.migrational.pom.pages.AdminDashboardPage;
import org.migrational.pom.pages.AdminInvoicesPage;
import org.migrational.pom.pages.AdminLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminInvoicesTest extends BaseTest {

    @Test
    public void adminInvoicesTest(){

        AdminLoginPage adminLoginPage = new AdminLoginPage(driver).loadAdmin();
        adminLoginPage.
                enterEmail("contact@thebrightbox.com").
                enterPassword("22testingBOX!~").
                clickRememberMeCheckBox();

        AdminDashboardPage adminDashboardPage = adminLoginPage.clickLoginBtn();
        Assert.assertEquals(adminDashboardPage.getDashboardTitle(), "Dashboard");
        AdminInvoicesPage adminInvoicesPage = adminDashboardPage.navigateToAdminInvoicesPage();


    }
}
