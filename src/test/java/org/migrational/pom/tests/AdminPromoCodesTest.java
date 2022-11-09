package org.migrational.pom.tests;

import org.migrational.pom.base.BaseTest;
import org.migrational.pom.pages.AdminDashboardPage;
import org.migrational.pom.pages.AdminLoginPage;
import org.migrational.pom.pages.AdminPromoCodesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminPromoCodesTest extends BaseTest {

    @Test
    public void adminPromoCodesTest(){

        AdminLoginPage adminLoginPage = new AdminLoginPage(driver).loadAdmin();
        adminLoginPage.
                enterEmail("contact@thebrightbox.com").
                enterPassword("22testingBOX!~").
                clickRememberMeCheckBox();

        AdminDashboardPage adminDashboardPage = adminLoginPage.clickLoginBtn();
        Assert.assertEquals(adminDashboardPage.getDashboardTitle(), "Dashboard");
        AdminPromoCodesPage adminPromoCodesPage = adminDashboardPage.navigateToAdminPromoCodesPage();


    }
}
