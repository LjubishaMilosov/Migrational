package org.migrational.pom.tests;

import org.migrational.pom.base.BaseTest;
import org.migrational.pom.pages.AdminAdminsPage;
import org.migrational.pom.pages.AdminClientsPage;
import org.migrational.pom.pages.AdminDashboardPage;
import org.migrational.pom.pages.AdminLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminAdminsTest extends BaseTest {

    @Test
    public void adminAdminsTest(){

        AdminLoginPage adminLoginPage = new AdminLoginPage(driver).loadAdmin();
        adminLoginPage.
                enterEmail("contact@thebrightbox.com").
                enterPassword("22testingBOX!~").
                clickRememberMeCheckBox();

        AdminDashboardPage adminDashboardPage = adminLoginPage.clickLoginBtn();
        Assert.assertEquals(adminDashboardPage.getDashboardTitle(), "Dashboard");
        AdminAdminsPage adminAdminsPage = adminDashboardPage.navigateToAdminAdminsPage();


    }




    }
