package org.migrational.pom.tests;

import org.migrational.pom.base.BaseTest;
import org.migrational.pom.pages.AdminCandidatesPage;
import org.migrational.pom.pages.AdminDashboardPage;
import org.migrational.pom.pages.AdminLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminCandidatesTest extends BaseTest {
    @Test
    public void adminCandidatesTest() throws InterruptedException {

        AdminLoginPage adminLoginPage = new AdminLoginPage(driver).loadAdmin();
        adminLoginPage.
                enterEmail("contact@thebrightbox.com").
                enterPassword("22testingBOX!~").
                clickRememberMeCheckBox();
        AdminDashboardPage adminDashboardPage = adminLoginPage.clickLoginBtn();
        Assert.assertEquals(adminDashboardPage.getDashboardTitle(), "Dashboard");

        AdminCandidatesPage adminCandidatesPage = adminDashboardPage.navigateToAdminCandidates();
        Assert.assertEquals(adminCandidatesPage.getAdminCandidatesTitle(), "Candidates");
        adminCandidatesPage.
                selectByCandidatesStatus("LANGUAGETEST").
                selectByCandidatesPriority("3").
                selectCandidateMessages("Unread");
Thread.sleep(5000);


    }

}
